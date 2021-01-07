package com.spotify.music.features.profile.saveprofile.effecthandlers;

import com.spotify.music.features.profile.saveprofile.domain.n;
import com.spotify.music.features.profile.saveprofile.domain.o;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.observable.e0;
import io.reactivex.s;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class c implements l {
    public final /* synthetic */ y a;

    public /* synthetic */ c(y yVar) {
        this.a = yVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        y yVar = this.a;
        if (((n.a) obj).a()) {
            return s.i0(new o.b(true)).C(3000, TimeUnit.MILLISECONDS, yVar).G0(new o.b(false));
        }
        return e0.a;
    }
}
