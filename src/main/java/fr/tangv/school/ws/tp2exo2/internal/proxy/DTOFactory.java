package fr.tangv.school.ws.tp2exo2.internal.proxy;

import fr.tangv.school.ws.tp2exo2.api.dto.PlaylistDTO;
import fr.tangv.school.ws.tp2exo2.api.dto.UserDTO;
import fr.tangv.school.ws.tp2exo2.api.dto.VideoDTO;
import fr.tangv.school.ws.tp2exo2.internal.model.Identifiable;
import fr.tangv.school.ws.tp2exo2.internal.model.Playlist;
import fr.tangv.school.ws.tp2exo2.internal.model.User;
import fr.tangv.school.ws.tp2exo2.internal.model.Video;

import java.util.Collection;
import java.util.function.Function;

public class DTOFactory {

    public static <T, R> Collection<R> createCollection(Collection<T> collection, Function<T, R> adapter) {
        return collection.stream().map(adapter).toList();
    }

    public static UserDTO createUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setName(user.getName());
        userDTO.setOwnVideos(createCollection(user.getOwnVideos(), Identifiable::getId));
        userDTO.setOwnPlaylists(createCollection(user.getOwnPlaylists(), Identifiable::getId));
        return userDTO;
    }

    public static VideoDTO createVideoDTO(Video video) {
        VideoDTO videoDTO = new VideoDTO();
        videoDTO.setId(video.getId());
        videoDTO.setName(video.getName());
        videoDTO.setDescription(video.getDescription());
        return videoDTO;
    }

    public static Collection<VideoDTO> createVideoDTOs(Collection<Video> videos) {
        return createCollection(videos, DTOFactory::createVideoDTO);
    }

    public static PlaylistDTO createPlaylistDTO(Playlist playlist) {
        PlaylistDTO playlistDTO = new PlaylistDTO();
        playlistDTO.setId(playlist.getId());
        playlistDTO.setName(playlist.getName());
        playlistDTO.setVideos(createCollection(playlist.getVideos(), Identifiable::getId));
        return playlistDTO;
    }

    public static Collection<PlaylistDTO> createPlaylistDTOs(Collection<Playlist> playlists) {
        return createCollection(playlists, DTOFactory::createPlaylistDTO);
    }

}