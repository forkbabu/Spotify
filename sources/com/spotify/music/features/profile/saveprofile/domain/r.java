package com.spotify.music.features.profile.saveprofile.domain;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.spotify.music.features.profile.saveprofile.domain.a;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class r implements Parcelable {
    public static final r a;

    public static abstract class a {
        public abstract r a();

        public abstract a b(float f);

        public abstract a c(SaveProfileState saveProfileState);
    }

    static {
        a.C0253a aVar = new a.C0253a();
        aVar.c(SaveProfileState.IDLE);
        aVar.b(0.0f);
        a = aVar.a();
    }

    public static a a() {
        return new a.C0253a();
    }

    public abstract float b();

    public abstract SaveProfileState c();
}
