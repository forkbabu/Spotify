package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.common.base.Optional;
import io.reactivex.s;
import io.reactivex.t;

/* renamed from: z1e  reason: default package */
public class z1e {
    private static final String[] d = {"auth_server_url", "api_server_url"};
    private final Context a;
    private final w1e b;
    private Optional<String> c = Optional.absent();

    public z1e(w1e w1e, Context context) {
        this.b = w1e;
        this.a = context;
    }

    public s<b2e> b() {
        s<R> W = this.b.a(this.a).W(new r1e(this), false, Integer.MAX_VALUE);
        w1e w1e = this.b;
        w1e.getClass();
        return W.O(new t1e(w1e));
    }

    public void c(u50 u50, t tVar) {
        try {
            this.c = Optional.of(u50.L2("q3voa1im9e", "foo", this.a.getPackageName(), new y1e(this, u50, tVar)));
            Bundle bundle = new Bundle();
            bundle.putStringArray("additional", d);
            bundle.putString("scope", "openid");
            if (!(this.c.isPresent() ? u50.d3(100, this.c.get(), bundle) : false)) {
                tVar.f(new Exception("Request auth code failed!"));
            }
        } catch (RemoteException unused) {
            tVar.f(new Exception("Failure with Service binding"));
        }
    }
}
