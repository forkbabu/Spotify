package defpackage;

import com.spotify.mobius.e0;
import defpackage.n19;
import defpackage.o19;

/* renamed from: j19  reason: default package */
public final /* synthetic */ class j19 implements ti0 {
    public final /* synthetic */ q19 a;

    public /* synthetic */ j19(q19 q19) {
        this.a = q19;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        o19.i iVar = (o19.i) obj;
        if (this.a.a().orNull() == iVar.m()) {
            return e0.a(z42.l(new n19.i(iVar.n(), iVar.l())));
        }
        return e0.h();
    }
}
