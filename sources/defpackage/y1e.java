package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.common.base.Optional;
import defpackage.t50;
import io.reactivex.t;

/* access modifiers changed from: package-private */
/* renamed from: y1e  reason: default package */
public class y1e extends t50.a {
    final /* synthetic */ u50 a;
    final /* synthetic */ t b;
    final /* synthetic */ z1e c;

    y1e(z1e z1e, u50 u50, t tVar) {
        this.c = z1e;
        this.a = u50;
        this.b = tVar;
    }

    @Override // defpackage.t50
    public void i2(int i, boolean z, Bundle bundle) {
        Optional optional;
        try {
            if (this.c.c.isPresent()) {
                this.a.m2((String) this.c.c.get());
            }
        } catch (RemoteException unused) {
        }
        if (!this.b.d()) {
            if (!bundle.containsKey("id_token") || !bundle.containsKey("authcode") || !bundle.containsKey("api_server_url") || !bundle.containsKey("auth_server_url")) {
                optional = Optional.absent();
            } else {
                optional = Optional.of(new u1e(bundle.getString("id_token"), bundle.getString("authcode"), bundle.getString("api_server_url"), bundle.getString("auth_server_url")));
            }
            if (!z || !optional.isPresent()) {
                this.b.f(new Exception("Failed to fetch id token"));
                return;
            }
            this.b.onNext(optional.get());
            this.b.onComplete();
        }
    }
}
