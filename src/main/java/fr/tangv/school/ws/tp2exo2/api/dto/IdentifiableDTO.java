package fr.tangv.school.ws.tp2exo2.api.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public abstract class IdentifiableDTO {

    @EqualsAndHashCode.Include
    private String id;

}
