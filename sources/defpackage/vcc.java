package defpackage;

import com.spotify.mobius.e0;
import defpackage.bdc;
import defpackage.ddc;

/* renamed from: vcc  reason: default package */
public final /* synthetic */ class vcc implements ti0 {
    public final /* synthetic */ ddc a;

    public /* synthetic */ vcc(ddc ddc) {
        this.a = ddc;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        ddc.a d = this.a.d();
        d.a(((bdc.d) obj).k());
        return e0.f(d.b());
    }
}
