package fr.tangv.school.ws.tp2exo2.api.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
public class VideoDTO extends IdentifiableDTO {

    private String name;
    private String description;

}
