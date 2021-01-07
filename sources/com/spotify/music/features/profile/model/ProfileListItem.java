package com.spotify.music.features.profile.model;

import android.os.Parcelable;
import com.spotify.music.features.profile.model.b;

public abstract class ProfileListItem implements Parcelable {

    public enum Type {
        PROFILE,
        ARTIST,
        TOP_ARTIST,
        PLAYLIST,
        UNKNOWN
    }

    public static abstract class a {
        public abstract ProfileListItem a();

        public abstract a b(ct7 ct7);

        public abstract a c(String str);

        public abstract a d(String str);

        public abstract a e(String str);

        public abstract a f(Type type);

        public abstract a g(String str);
    }

    public static a a() {
        return new b.C0251b();
    }

    public abstract ct7 b();

    public abstract String c();

    public abstract String e();

    public abstract String f();

    public abstract a g();

    public abstract Type h();

    public abstract String i();
}
