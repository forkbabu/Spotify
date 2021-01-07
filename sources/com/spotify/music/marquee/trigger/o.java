package com.spotify.music.marquee.trigger;

import com.spotify.music.connection.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

public final /* synthetic */ class o implements w {
    public final /* synthetic */ l a;
    public final /* synthetic */ bjb b;
    public final /* synthetic */ zr3 c;

    public /* synthetic */ o(l lVar, bjb bjb, zr3 zr3) {
        this.a = lVar;
        this.b = bjb;
        this.c = zr3;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.a1(this.a.b(), a0.a).Q(i.a).J0(new h(this.b, this.c)).j0(f.a);
    }
}
