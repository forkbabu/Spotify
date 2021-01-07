package defpackage;

import android.content.Context;
import com.spotify.libs.otp.ui.a0;

/* renamed from: cw5  reason: default package */
public final class cw5 implements fjf<a0> {
    private final wlf<Context> a;

    public cw5(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a0(this.a.get());
    }
}
