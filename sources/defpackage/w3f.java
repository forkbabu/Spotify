package defpackage;

import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import defpackage.p2f;
import io.reactivex.functions.l;

/* renamed from: w3f  reason: default package */
public final /* synthetic */ class w3f implements l {
    public final /* synthetic */ d a;
    public final /* synthetic */ q7f b;

    public /* synthetic */ w3f(d dVar, q7f q7f) {
        this.a = dVar;
        this.b = q7f;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        p2f.c0 c0Var = (p2f.c0) obj;
        return this.a.a(c.c()).E(p5f.a).t(new t6f(this.b)).N();
    }
}
