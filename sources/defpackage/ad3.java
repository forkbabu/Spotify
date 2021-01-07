package defpackage;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.o;
import com.spotify.mobile.android.util.Assertion;
import java.security.cert.CertificateException;

/* renamed from: ad3  reason: default package */
public final class ad3 implements fjf<mf0> {
    private final wlf<Context> a;
    private final wlf<o> b;

    public ad3(wlf<Context> wlf, wlf<o> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        try {
            return new of0(this.a.get(), this.b.get());
        } catch (CertificateException e) {
            Logger.e(e, "Cannot init a WebsiteAutologinUtility, falling back to default utility that does nothing", new Object[0]);
            Assertion.i("Cannot init a WebsiteAutologinUtility, falling back to default utility that does nothing", e);
            return new zc3();
        }
    }
}
