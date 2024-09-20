package fr.tangv.school.ws.tp2exo2.internal.model;

import fr.tangv.school.ws.tp2exo2.commun.exception.BadLoginException;
import fr.tangv.school.ws.tp2exo2.commun.exception.IdentifiableNotFoundException;
import fr.tangv.school.ws.tp2exo2.commun.exception.IdentifierAlreadyUsedException;
import fr.tangv.school.ws.tp2exo2.commun.exception.NotOwnerException;

import java.util.Collection;

public interface Facade {

    //user
    User signUp(String name, String password) throws IdentifierAlreadyUsedException;
    User signIn(String name, String password) throws BadLoginException;

    //video
    Collection<Video> getAllVideos();
    Collection<Video> getOwnVideos(User login);
    Video addVideo(User login, String name, String description);
    Video getVideo(String videoId);

    //playlist
    Collection<Playlist> getAllPlaylists();
    Collection<Playlist> getOwnPlaylists(User login);
    Playlist addPlaylist(User login, String name);
    Playlist getPlaylist(String playlistId);
    void addVideoInPlaylist(User login, String playlistId, String videoId) throws IdentifiableNotFoundException, NotOwnerException;
    void removeVideoInPlaylist(User login, String playlistId, String videoId) throws IdentifiableNotFoundException, NotOwnerException;
    void removePlaylist(User login, String playlistId) throws IdentifiableNotFoundException, NotOwnerException;

}
