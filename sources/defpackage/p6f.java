package defpackage;

import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import defpackage.p2f;
import io.reactivex.functions.l;

/* renamed from: p6f  reason: default package */
public final /* synthetic */ class p6f implements l {
    public final /* synthetic */ d a;
    public final /* synthetic */ a8f b;
    public final /* synthetic */ q7f c;

    public /* synthetic */ p6f(d dVar, a8f a8f, q7f q7f) {
        this.a = dVar;
        this.b = a8f;
        this.c = q7f;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        d dVar = this.a;
        a8f a8f = this.b;
        p2f.h hVar = (p2f.h) obj;
        return dVar.a(c.i()).p(new r5f(a8f, hVar)).E(new k4f(new n5f(a8f, hVar))).t(new m5f(this.c)).N();
    }
}
