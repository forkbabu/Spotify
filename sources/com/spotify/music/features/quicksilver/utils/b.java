package com.spotify.music.features.quicksilver.utils;

import com.spotify.music.features.quicksilver.utils.e;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.c;

public final /* synthetic */ class b implements c {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        return new u3(((u3) obj).b, new e.b((PlayerState) obj2, null));
    }
}
