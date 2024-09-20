package fr.tangv.school.ws.tp2exo2.internal.model;

public interface IdentifiableWithOwner<T> extends Identifiable<T> {

    User getOwner();

}
