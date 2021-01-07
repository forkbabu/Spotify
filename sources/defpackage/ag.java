package defpackage;

import android.os.Bundle;
import com.facebook.k;
import com.facebook.m;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: ag  reason: default package */
public final class ag implements Runnable {
    ag() {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!uf.c(this)) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("fields", "monitoring_config");
                m r = m.r(null, k.e(), null);
                r.D(true);
                r.C(bundle);
                JSONObject f = r.g().f();
                if (f != null) {
                    bg.b(f);
                }
            } catch (Throwable th) {
                uf.b(th, this);
            }
        }
    }
}
