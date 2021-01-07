package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.v;

/* renamed from: jid  reason: default package */
public final class jid implements fjf<hid> {
    private final wlf<Context> a;
    private final wlf<v> b;

    public jid(wlf<Context> wlf, wlf<v> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hid(this.a.get(), this.b.get());
    }
}
