package defpackage;

import com.spotify.mobius.e0;
import com.spotify.music.yourlibrary.interfaces.i;
import defpackage.n19;
import defpackage.o19;
import defpackage.q19;

/* renamed from: c19  reason: default package */
public final /* synthetic */ class c19 implements ti0 {
    public final /* synthetic */ q19 a;

    public /* synthetic */ c19(q19 q19) {
        this.a = q19;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        q19 q19 = this.a;
        int l = ((o19.j) obj).l();
        i g = q19.g();
        if (l == g.e()) {
            return e0.h();
        }
        i.a f = g.f();
        f.e(l);
        i a2 = f.a();
        q19.a e = q19.e();
        e.f(a2);
        return e0.g(e.a(), z42.l(new n19.e(a2)));
    }
}
