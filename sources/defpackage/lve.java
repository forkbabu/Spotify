package defpackage;

import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import defpackage.uue;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.i;

/* renamed from: lve  reason: default package */
public final /* synthetic */ class lve implements l {
    public final /* synthetic */ d a;
    public final /* synthetic */ t0f b;

    public /* synthetic */ lve(d dVar, t0f t0f) {
        this.a = dVar;
        this.b = t0f;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        d dVar = this.a;
        t0f t0f = this.b;
        uue.p pVar = (uue.p) obj;
        return new i(dVar.a(c.k()).p(new nye(t0f, pVar)).E(new txe(new gwe(t0f, pVar)))).N();
    }
}
