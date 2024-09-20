package fr.tangv.school.ws.tp2exo2.internal.impl;

import fr.tangv.school.ws.tp2exo2.internal.model.Identifiable;

import java.util.UUID;

public class UUIDAutoIdentifierManager<V extends Identifiable<String>> extends AbstractAutoIdentifierManager<String, V> {

    @Override
    public String generateId(V identifiable) {
        return UUID.randomUUID().toString();
    }

}
