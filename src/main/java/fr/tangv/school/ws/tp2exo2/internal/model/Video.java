package fr.tangv.school.ws.tp2exo2.internal.model;

public interface Video extends IdentifiableWithOwner<String> {

    String getName();
    void setName(String name);
    String getDescription();
    void setDescription(String description);

}
