package fr.tangv.school.ws.tp2exo2.api.proxy;

import fr.tangv.school.ws.tp2exo2.api.dto.AuthDTO;
import fr.tangv.school.ws.tp2exo2.api.dto.PlaylistDTO;
import fr.tangv.school.ws.tp2exo2.api.dto.UserDTO;
import fr.tangv.school.ws.tp2exo2.api.dto.VideoDTO;
import fr.tangv.school.ws.tp2exo2.commun.exception.BadLoginException;
import fr.tangv.school.ws.tp2exo2.commun.exception.IdentifiableNotFoundException;
import fr.tangv.school.ws.tp2exo2.commun.exception.IdentifierAlreadyUsedException;
import fr.tangv.school.ws.tp2exo2.commun.exception.NotOwnerException;

import java.util.Collection;

public interface FacadeProxy {

    //user
    UserDTO signUp(String name, String password) throws IdentifierAlreadyUsedException;
    //not used directly
    //UserDTO/void signIn(String name, String password) throws BadLoginException;

    //Collection<VideoDTO> ou de playliste, juste les id ou tout (id plutto les location/uri dcp a la fin)

    //video
    Collection<VideoDTO> getAllVideos();
    Collection<VideoDTO> getOwnVideos(AuthDTO auth) throws BadLoginException;
    VideoDTO addVideo(AuthDTO auth, String name, String description) throws BadLoginException;
    VideoDTO getVideo(String videoId);

    //playlist
    Collection<PlaylistDTO> getAllPlaylists();
    Collection<PlaylistDTO> getOwnPlaylists(AuthDTO auth) throws BadLoginException;
    PlaylistDTO addPlaylist(AuthDTO auth, String name) throws BadLoginException;
    PlaylistDTO getPlaylist(String playlistId);
    void addVideoInPlaylist(AuthDTO auth, String playlistId, String videoId)
            throws IdentifiableNotFoundException, NotOwnerException, BadLoginException;
    void removeVideoInPlaylist(AuthDTO auth, String playlistId, String videoId)
            throws IdentifiableNotFoundException, NotOwnerException, BadLoginException;
    void removePlaylist(AuthDTO auth, String playlistId)
            throws IdentifiableNotFoundException, NotOwnerException, BadLoginException;

}
