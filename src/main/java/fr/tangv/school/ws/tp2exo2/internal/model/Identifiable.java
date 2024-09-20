package fr.tangv.school.ws.tp2exo2.internal.model;

/**
 * Représente un objet identifiable par un identifiant
 * @param <T> le type de l'identifiant
 */
public interface Identifiable<T> {
    T getId();
    void setId(T id);
}
