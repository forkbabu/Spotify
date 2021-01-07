package com.spotify.music.nowplaying.drivingmode.view.pivot;

import com.google.common.collect.ImmutableList;
import com.spotify.music.nowplaying.drivingmode.view.pivot.i;

public abstract class n {

    public interface a {
        a a(int i);

        a b(ImmutableList<l> immutableList);

        n build();
    }

    public static a a() {
        return new i.b();
    }

    public abstract ImmutableList<l> b();

    public abstract int c();
}
