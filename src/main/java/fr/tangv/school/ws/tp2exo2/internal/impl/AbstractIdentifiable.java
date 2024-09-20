package fr.tangv.school.ws.tp2exo2.internal.impl;

import fr.tangv.school.ws.tp2exo2.internal.model.Identifiable;
import lombok.Data;

@Data
public class AbstractIdentifiable<T> implements Identifiable<T> {

    private T id;

}
