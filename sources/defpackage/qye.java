package defpackage;

import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import defpackage.uue;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.i;

/* renamed from: qye  reason: default package */
public final /* synthetic */ class qye implements l {
    public final /* synthetic */ d a;
    public final /* synthetic */ t0f b;

    public /* synthetic */ qye(d dVar, t0f t0f) {
        this.a = dVar;
        this.b = t0f;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        d dVar = this.a;
        t0f t0f = this.b;
        uue.g gVar = (uue.g) obj;
        return new i(dVar.a(c.i()).p(new iwe(t0f, gVar)).E(new txe(new yve(t0f, gVar)))).N();
    }
}
