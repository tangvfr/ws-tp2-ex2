package fr.tangv.school.ws.tp2exo2.internal.impl;

import fr.tangv.school.ws.tp2exo2.internal.model.Playlist;
import fr.tangv.school.ws.tp2exo2.internal.model.User;
import fr.tangv.school.ws.tp2exo2.internal.model.Video;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@ToString
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
public class IUser extends AbstractIdentifiable<String> implements User {

    @Getter
    private String password;
    private Collection<Video> ownVideos;
    private Collection<Playlist> ownPlaylists;

    public String getName() {
        return this.getId();
    }

    @Override
    public void addVideo(Video video) {
        this.ownVideos.add(video);
    }

    @Override
    public void addPlaylist(Playlist playlist) {
        this.ownPlaylists.add(playlist);
    }

    @Override
    public void removePlaylist(Playlist playlist) {
        this.ownPlaylists.remove(playlist);
    }

    @Override
    public Collection<Video> getOwnVideos() {
        return List.copyOf(this.ownVideos);
    }

    @Override
    public Collection<Playlist> getOwnPlaylists() {
        return List.copyOf(this.ownPlaylists);
    }

}
