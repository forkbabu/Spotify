package com.spotify.music.nowplaying.drivingmode.presenter.pivot;

import com.spotify.music.nowplaying.drivingmode.view.pivot.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import java.util.concurrent.atomic.AtomicInteger;

public class l0 implements w<s81, l> {
    private final o0 a;

    public l0(o0 o0Var) {
        this.a = o0Var;
    }

    @Override // io.reactivex.w
    public v<l> apply(s<s81> sVar) {
        AtomicInteger atomicInteger = new AtomicInteger();
        s<R> w = sVar.Q(e.a).w(d.a);
        o0 o0Var = this.a;
        o0Var.getClass();
        return s.d1(w.W(new b(o0Var), false, Integer.MAX_VALUE), sVar, new f(atomicInteger));
    }
}
