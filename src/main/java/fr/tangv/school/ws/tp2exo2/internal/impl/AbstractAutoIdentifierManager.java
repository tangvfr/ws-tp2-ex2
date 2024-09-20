package fr.tangv.school.ws.tp2exo2.internal.impl;

import fr.tangv.school.ws.tp2exo2.commun.exception.IdentifierAlreadyUsedException;
import fr.tangv.school.ws.tp2exo2.internal.model.Identifiable;

public abstract class AbstractAutoIdentifierManager<K, V extends Identifiable<K>> extends IIdentifierManager<K, V> {

    @Override
    public V register(V identifiable) throws IdentifierAlreadyUsedException {
        identifiable.setId(this.generateId(identifiable));
        return super.register(identifiable);
    }

    public abstract K generateId(V identifiable);

}
