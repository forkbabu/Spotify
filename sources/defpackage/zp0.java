package defpackage;

import com.spotify.mobius.e0;
import defpackage.eq0;
import defpackage.gq0;

/* renamed from: zp0  reason: default package */
public final /* synthetic */ class zp0 implements ti0 {
    public final /* synthetic */ hq0 a;

    public /* synthetic */ zp0(hq0 hq0) {
        this.a = hq0;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        return e0.f(this.a.g(new eq0.c()).h(String.format("Error fetching creative id: %s", ((gq0.d) obj).i())));
    }
}
