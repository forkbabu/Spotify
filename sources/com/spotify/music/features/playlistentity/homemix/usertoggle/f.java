package com.spotify.music.features.playlistentity.homemix.usertoggle;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class f implements g {
    public static final /* synthetic */ f a = new f();

    private /* synthetic */ f() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        xe6 xe6 = (xe6) obj;
        int i = k.l;
        if (xe6.f() || xe6.h()) {
            Logger.d(xe6.toString(), new Object[0]);
        }
    }
}
