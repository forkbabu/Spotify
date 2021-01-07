package defpackage;

import com.spotify.mobius.e0;
import com.spotify.music.yourlibrary.interfaces.i;
import defpackage.n19;
import defpackage.o19;
import defpackage.q19;

/* renamed from: k19  reason: default package */
public final /* synthetic */ class k19 implements ti0 {
    public final /* synthetic */ q19 a;

    public /* synthetic */ k19(q19 q19) {
        this.a = q19;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        q19 q19 = this.a;
        o19.g gVar = (o19.g) obj;
        if (!q19.a().isPresent() || q19.a().get() != gVar.l()) {
            return e0.h();
        }
        boolean m = gVar.m();
        i.a f = q19.g().f();
        f.c(m);
        i a2 = f.a();
        q19.a e = q19.e();
        e.f(a2);
        return e0.g(e.a(), z42.l(new n19.g(m)));
    }
}
