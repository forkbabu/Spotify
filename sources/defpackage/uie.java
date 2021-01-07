package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.mobius.e0;
import defpackage.tie;
import defpackage.wie;
import defpackage.xie;
import defpackage.yie;

/* renamed from: uie  reason: default package */
public final /* synthetic */ class uie implements ti0 {
    public final /* synthetic */ zie a;

    public /* synthetic */ uie(zie zie) {
        this.a = zie;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        zie zie = this.a;
        yie.a aVar = (yie.a) obj;
        wie d = aVar.d();
        d.getClass();
        MoreObjects.checkState(!(d instanceof wie.c));
        if (zie.b().equals(aVar.d())) {
            return e0.a(z42.l(new xie.a()));
        }
        wie d2 = aVar.d();
        tie.b bVar = (tie.b) zie.e();
        bVar.c(d2);
        return e0.g(bVar.a(), z42.l(new xie.a()));
    }
}
