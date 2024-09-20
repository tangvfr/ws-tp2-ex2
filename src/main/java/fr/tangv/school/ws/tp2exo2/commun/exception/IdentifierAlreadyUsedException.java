package fr.tangv.school.ws.tp2exo2.commun.exception;

public class IdentifierAlreadyUsedException extends RuntimeException {
    public IdentifierAlreadyUsedException(String message) {
        super(message);
    }
}
