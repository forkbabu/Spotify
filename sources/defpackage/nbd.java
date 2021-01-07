package defpackage;

import com.spotify.mobius.e0;
import defpackage.rbd;
import defpackage.sbd;
import defpackage.tbd;

/* renamed from: nbd  reason: default package */
public final /* synthetic */ class nbd implements ti0 {
    public final /* synthetic */ tbd a;

    public /* synthetic */ nbd(tbd tbd) {
        this.a = tbd;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        sbd.a aVar = (sbd.a) obj;
        tbd.a e = this.a.e();
        e.b(true);
        return e0.g(e.a(), z42.l(new rbd.i()));
    }
}
