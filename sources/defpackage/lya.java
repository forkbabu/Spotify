package defpackage;

import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobius.e0;
import defpackage.dza;
import defpackage.xya;
import defpackage.zya;

/* renamed from: lya  reason: default package */
public final /* synthetic */ class lya implements ti0 {
    public final /* synthetic */ bza a;
    public final /* synthetic */ zya b;

    public /* synthetic */ lya(bza bza, zya zya) {
        this.a = bza;
        this.b = zya;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        xya xya;
        bza bza = this.a;
        zya zya = this.b;
        zya.f fVar = (zya.f) obj;
        zya.getClass();
        zya.f fVar2 = (zya.f) zya;
        if (fVar2.l().d().isEmpty()) {
            return e0.h();
        }
        eza l = fVar2.l();
        String d = l.d();
        dza e = bza.e();
        e.getClass();
        if (!(e instanceof dza.a) && l0.b(d, LinkType.TRACK)) {
            xya = new xya.h(d, bza.a().b());
        } else {
            xya = new xya.e(d);
        }
        return (e0) bza.e().b(sya.a, new qya(l, xya), new pya(d), new rya(xya));
    }
}
