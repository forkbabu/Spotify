package defpackage;

import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import defpackage.p2f;
import io.reactivex.functions.l;

/* renamed from: h6f  reason: default package */
public final /* synthetic */ class h6f implements l {
    public final /* synthetic */ d a;
    public final /* synthetic */ a8f b;
    public final /* synthetic */ q7f c;

    public /* synthetic */ h6f(d dVar, a8f a8f, q7f q7f) {
        this.a = dVar;
        this.b = a8f;
        this.c = q7f;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        d dVar = this.a;
        a8f a8f = this.b;
        p2f.q qVar = (p2f.q) obj;
        return dVar.a(c.k()).p(new i3f(a8f, qVar)).E(new k4f(new x5f(a8f, qVar))).t(new g3f(this.c)).N();
    }
}
