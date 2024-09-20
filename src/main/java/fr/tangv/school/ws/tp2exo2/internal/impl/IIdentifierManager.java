package fr.tangv.school.ws.tp2exo2.internal.impl;

import fr.tangv.school.ws.tp2exo2.commun.exception.IdentifiableNotFoundException;
import fr.tangv.school.ws.tp2exo2.commun.exception.IdentifierAlreadyUsedException;
import fr.tangv.school.ws.tp2exo2.internal.model.Identifiable;
import fr.tangv.school.ws.tp2exo2.internal.model.IdentifierManager;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IIdentifierManager<K, V extends Identifiable<K>>  implements IdentifierManager<K, V> {

    private final Map<K, V> identifiables = new HashMap<>();

    @Override
    public V register(V identifiable) throws IdentifierAlreadyUsedException {
        K id = identifiable.getId();
        if (this.identifiables.containsKey(id))
            throw new IdentifierAlreadyUsedException("For id: " + id);

        this.identifiables.put(id, identifiable);
        return identifiable;
    }

    @Override
    public V get(K id) {
        return this.identifiables.get(id);
    }

    @Override
    public V unregister(K id) throws IdentifiableNotFoundException {
        V identifiable = this.identifiables.get(id);
        if (identifiable == null)
            throw new IdentifiableNotFoundException("For id: " + id);

        return identifiable;
    }

    @Override
    public Collection<V> getAll() {
        return List.copyOf(identifiables.values());
    }

}
