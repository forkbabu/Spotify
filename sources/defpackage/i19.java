package defpackage;

import com.spotify.mobius.e0;
import defpackage.n19;
import defpackage.o19;

/* renamed from: i19  reason: default package */
public final /* synthetic */ class i19 implements ti0 {
    public final /* synthetic */ q19 a;

    public /* synthetic */ i19(q19 q19) {
        this.a = q19;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        q19 q19 = this.a;
        o19.c cVar = (o19.c) obj;
        if (!q19.a().isPresent() || q19.a().get() != cVar.l()) {
            return e0.a(z42.l(new n19.a(cVar.l(), cVar.m(), false)));
        }
        return e0.h();
    }
}
