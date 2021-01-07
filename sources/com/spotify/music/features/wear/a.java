package com.spotify.music.features.wear;

import com.spotify.mobile.android.service.media.t2;
import com.spotify.mobile.android.service.media.u2;
import kotlin.jvm.internal.h;

final class a implements io.reactivex.functions.a {
    final /* synthetic */ t2 a;

    a(t2 t2Var) {
        this.a = t2Var;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        t2 t2Var = this.a;
        h.d(t2Var, "session");
        if (((u2) t2Var).c()) {
            ((u2) this.a).a();
        }
    }
}
