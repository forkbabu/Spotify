package com.spotify.music.marquee.trigger;

import android.content.Context;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.rx.v;
import io.reactivex.s;
import io.reactivex.w;
import io.reactivex.y;

public final /* synthetic */ class g implements w {
    public final /* synthetic */ v a;
    public final /* synthetic */ y b;
    public final /* synthetic */ tjb c;
    public final /* synthetic */ Context d;

    public /* synthetic */ g(v vVar, y yVar, tjb tjb, Context context) {
        this.a = vVar;
        this.b = yVar;
        this.c = tjb;
        this.d = context;
    }

    @Override // io.reactivex.w
    public final io.reactivex.v apply(s sVar) {
        v vVar = this.a;
        y yVar = this.b;
        tjb tjb = this.c;
        Context context = this.d;
        io.reactivex.g<c> b2 = vVar.b();
        return sVar.a1(je.Z(b2, b2), b.a).Q(j.a).o0(yVar).W(new d(tjb, context), false, Integer.MAX_VALUE);
    }
}
