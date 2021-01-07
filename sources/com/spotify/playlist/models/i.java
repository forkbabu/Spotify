package com.spotify.playlist.models;

import java.util.List;

public interface i<T> {
    List<T> getItems();

    int getUnfilteredLength();

    int getUnrangedLength();

    boolean isLoading();
}
