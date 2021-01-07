package com.spotify.music.features.spoton.exceptions;

public class SpotOnLoggedOutException extends Exception {
    private static final long serialVersionUID = 3762912670010483683L;

    public SpotOnLoggedOutException() {
        super("User is not logged in");
    }
}
