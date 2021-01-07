package defpackage;

import com.spotify.mobius.e0;
import defpackage.rbd;
import defpackage.sbd;
import defpackage.tbd;

/* renamed from: hbd  reason: default package */
public final /* synthetic */ class hbd implements ti0 {
    public final /* synthetic */ tbd a;

    public /* synthetic */ hbd(tbd tbd) {
        this.a = tbd;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        sbd.b bVar = (sbd.b) obj;
        tbd.a e = this.a.e();
        e.c(true);
        return e0.g(e.a(), z42.l(new rbd.j()));
    }
}
