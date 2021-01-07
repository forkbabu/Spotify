package defpackage;

import com.spotify.mobius.e0;
import com.spotify.music.yourlibrary.interfaces.i;
import defpackage.n19;
import defpackage.o19;
import defpackage.q19;

/* renamed from: h19  reason: default package */
public final /* synthetic */ class h19 implements ti0 {
    public final /* synthetic */ q19 a;

    public /* synthetic */ h19(q19 q19) {
        this.a = q19;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        q19 q19 = this.a;
        o19.a aVar = (o19.a) obj;
        i g = q19.g();
        if (g.a() == aVar.l()) {
            return e0.h();
        }
        int l = aVar.l();
        i.a f = g.f();
        f.b(l);
        i a2 = f.a();
        q19.a e = q19.e();
        e.f(a2);
        return e0.g(e.a(), z42.l(new n19.e(a2)));
    }
}
