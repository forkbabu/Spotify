package defpackage;

import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import defpackage.p2f;
import io.reactivex.functions.l;

/* renamed from: s5f  reason: default package */
public final /* synthetic */ class s5f implements l {
    public final /* synthetic */ d a;
    public final /* synthetic */ a8f b;
    public final /* synthetic */ q7f c;

    public /* synthetic */ s5f(d dVar, a8f a8f, q7f q7f) {
        this.a = dVar;
        this.b = a8f;
        this.c = q7f;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        d dVar = this.a;
        a8f a8f = this.b;
        p2f.v vVar = (p2f.v) obj;
        return dVar.a(c.e()).p(new n4f(a8f, vVar)).E(new k4f(new e3f(a8f, vVar))).t(new w6f(vVar, this.c)).N();
    }
}
