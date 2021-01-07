package com.spotify.mobile.android.service.feature;

import android.content.Context;
import android.content.Intent;
import com.spotify.android.flags.b;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.rx.v;
import com.spotify.rxjava2.n;
import com.spotify.rxjava2.r;
import com.spotify.rxjava2.s;
import com.spotify.rxjava2.y;
import io.reactivex.BackpressureStrategy;
import io.reactivex.android.schedulers.a;
import io.reactivex.g;
import java.io.Serializable;
import java.util.List;

class t implements v {
    private final g<c> a;
    private final rg0<List<y>> b;

    t(Context context, FlagsManager flagsManager, q qVar, n nVar, s<c> sVar) {
        io.reactivex.s<R> sVar2;
        if (qVar.a()) {
            sVar2 = io.reactivex.s.i0(flagsManager);
        } else {
            sVar2 = nVar.a(new Intent(context.getApplicationContext(), FeatureService.class), t.class.getSimpleName()).I0(a.b()).j0(g.a);
        }
        r<c> a2 = sVar.a(t.class.getSimpleName(), sVar2.W(d.a, false, Integer.MAX_VALUE).v0(1).h1());
        this.a = io.reactivex.s.y(a2).Y0(BackpressureStrategy.BUFFER);
        this.b = new h(a2);
    }

    /* JADX DEBUG: Type inference failed for r3v2. Raw type applied. Possible types: io.reactivex.g<R>, io.reactivex.g<T extends java.io.Serializable> */
    @Override // com.spotify.mobile.android.rx.v
    public <T extends Serializable> g<T> a(b<T> bVar) {
        return (g<R>) this.a.O(new f(bVar)).s();
    }

    @Override // com.spotify.mobile.android.rx.v
    public g<c> b() {
        return this.a;
    }

    @Override // com.spotify.mobile.android.rx.v
    public List<y> unsubscribeAndReturnLeaks() {
        return this.b.call();
    }
}
