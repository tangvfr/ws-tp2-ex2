package fr.tangv.school.ws.tp2exo2.internal.model;

import java.util.List;

public interface Playlist extends IdentifiableWithOwner<String> {

    String getName();
    void setName(String name);
    List<Video> getVideos();
    Video removeVideo(String videoId);
    void addVideo(Video video);

}
