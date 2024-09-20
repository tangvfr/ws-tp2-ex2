package fr.tangv.school.ws.tp2exo2.internal.model;

import fr.tangv.school.ws.tp2exo2.commun.exception.IdentifiableNotFoundException;
import fr.tangv.school.ws.tp2exo2.commun.exception.IdentifierAlreadyUsedException;

import java.util.Collection;

/**
 * Permet la gestion d'identifiable (Register, Get, Unregister)
 * @param <K> type d'identifiant de l'identifiable
 * @param <V> type de l'identifiable
 */
public interface IdentifierManager<K, V extends Identifiable<K>> {

    V register(V identifiable) throws IdentifierAlreadyUsedException;
    V get(K id);
    V unregister(K id) throws IdentifiableNotFoundException;
    Collection<V> getAll();

}
