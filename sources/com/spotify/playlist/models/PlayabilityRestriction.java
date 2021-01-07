package com.spotify.playlist.models;

public enum PlayabilityRestriction {
    UNKNOWN,
    NO_RESTRICTION,
    EXPLICIT_CONTENT,
    AGE_RESTRICTED,
    NOT_IN_CATALOGUE,
    NOT_AVAILABLE_OFFLINE
}
