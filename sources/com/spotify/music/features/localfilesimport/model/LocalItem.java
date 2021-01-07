package com.spotify.music.features.localfilesimport.model;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.List;

public interface LocalItem {

    public enum ImageType {
        NONE,
        SQUARE,
        ROUND
    }

    Drawable getImagePlaceholder(Context context);

    ImageType getImageType();

    String getImageUri();

    String getSubtitle(Context context);

    String getTitle();

    String getUri();

    boolean isExplicit();

    List<String> trackIds();
}
