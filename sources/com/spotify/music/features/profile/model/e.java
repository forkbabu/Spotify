package com.spotify.music.features.profile.model;

import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.profile.model.a;

public abstract class e implements Parcelable {
    public static final e a;

    public static abstract class a {
        public abstract e a();

        public abstract a b(ImmutableList<ProfileListItem> immutableList);

        public abstract a c(LoadingState loadingState);
    }

    public static class b {
    }

    static {
        a.b bVar = new a.b();
        bVar.c(LoadingState.NOT_LOADED);
        bVar.b(ImmutableList.of());
        a = bVar.a();
    }

    public static a a() {
        return new a.b();
    }

    public abstract ImmutableList<ProfileListItem> b();

    public abstract LoadingState c();

    public abstract a e();
}
