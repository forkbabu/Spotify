package defpackage;

import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import defpackage.uue;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.i;

/* renamed from: pye  reason: default package */
public final /* synthetic */ class pye implements l {
    public final /* synthetic */ d a;
    public final /* synthetic */ t0f b;

    public /* synthetic */ pye(d dVar, t0f t0f) {
        this.a = dVar;
        this.b = t0f;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        d dVar = this.a;
        t0f t0f = this.b;
        uue.t tVar = (uue.t) obj;
        return new i(dVar.a(c.e()).p(new jwe(t0f, tVar)).E(new txe(new ywe(t0f, tVar)))).N();
    }
}
