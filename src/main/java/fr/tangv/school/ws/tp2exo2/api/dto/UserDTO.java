package fr.tangv.school.ws.tp2exo2.api.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Collection;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class UserDTO {

    @EqualsAndHashCode.Include
    private String name;
    private Collection<String> ownVideos;
    private Collection<String> ownPlaylists;

}
