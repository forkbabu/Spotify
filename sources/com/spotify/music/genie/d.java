package com.spotify.music.genie;

import com.spotify.music.genie.Wish;
import io.reactivex.functions.l;
import io.reactivex.z;

public final /* synthetic */ class d implements l {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        mm9 mm9 = (mm9) obj;
        return z.z(new n(mm9.d(), mm9.c(), Wish.Action.PLAY_URI));
    }
}
