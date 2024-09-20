package fr.tangv.school.ws.tp2exo2.api.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Collection;

@Data
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
public class PlaylistDTO extends IdentifiableDTO {

    private String name;
    private Collection<String> videos;

}
