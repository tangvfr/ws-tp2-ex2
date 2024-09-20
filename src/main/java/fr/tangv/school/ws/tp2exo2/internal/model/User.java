package fr.tangv.school.ws.tp2exo2.internal.model;

import java.util.Collection;

public interface User extends Identifiable<String> {

    String getName();
    String getPassword();
    Collection<Video> getOwnVideos();
    void addVideo(Video video);
    Collection<Playlist> getOwnPlaylists();
    void addPlaylist(Playlist playlist);
    void removePlaylist(Playlist playlist);

}
