package com.spotify.music.genie;

import com.spotify.music.genie.Wish;
import io.reactivex.functions.l;
import io.reactivex.z;

public final /* synthetic */ class c implements l {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        mm9 mm9 = (mm9) obj;
        return z.z(new n(mm9.d(), mm9.c(), Wish.Action.PLAY_URI));
    }
}
