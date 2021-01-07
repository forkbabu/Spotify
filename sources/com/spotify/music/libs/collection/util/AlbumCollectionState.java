package com.spotify.music.libs.collection.util;

public enum AlbumCollectionState {
    YES,
    PARTIALLY,
    NO;

    public static AlbumCollectionState d(int i, boolean z) {
        if (i > 0) {
            return z ? YES : PARTIALLY;
        }
        return NO;
    }
}
