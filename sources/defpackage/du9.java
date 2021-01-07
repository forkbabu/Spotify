package defpackage;

import com.spotify.mobile.android.util.t;
import defpackage.cu9;
import kotlin.jvm.internal.h;

/* renamed from: du9  reason: default package */
public final class du9 implements fjf<String> {
    private final wlf<t> a;

    public du9(wlf<t> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        t tVar = this.a.get();
        cu9.a aVar = cu9.a;
        h.e(tVar, "clientInfo");
        String y = tVar.y();
        h.d(y, "clientInfo.packageName");
        return y;
    }
}
