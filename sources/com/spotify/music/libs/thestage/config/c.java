package com.spotify.music.libs.thestage.config;

import android.os.Parcelable;

public abstract class c implements Parcelable {
    public static c a(TheStageUri theStageUri) {
        return new b(theStageUri);
    }

    public abstract TheStageUri b();
}
