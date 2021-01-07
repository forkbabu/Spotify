package com.spotify.music.features.playlistentity.vanilla.footer;

public interface FooterConfiguration {

    public enum Type {
        NONE,
        PLEX,
        MLT,
        AC
    }

    boolean a();

    Type b(boolean z);
}
