package defpackage;

import android.util.Log;
import com.facebook.LoggingBehavior;
import com.facebook.a;
import com.facebook.internal.f0;
import com.facebook.internal.y;
import com.facebook.k;
import com.facebook.m;
import com.facebook.q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: df  reason: default package */
class df implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ cf b;

    df(cf cfVar, String str) {
        this.b = cfVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        m h;
        if (!uf.c(this)) {
            try {
                String I = f0.I(this.a);
                a e = a.e();
                if ((I == null || !I.equals(cf.f(this.b))) && (h = cf.h(this.a, e, k.e(), "app_indexing")) != null) {
                    q g = h.g();
                    try {
                        JSONObject f = g.f();
                        if (f != null) {
                            if ("true".equals(f.optString("success"))) {
                                LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                                cf.c();
                                int i = y.e;
                                k.v(loggingBehavior);
                                cf.g(this.b, I);
                            }
                            if (f.has("is_app_indexing_enabled")) {
                                we.n(Boolean.valueOf(f.getBoolean("is_app_indexing_enabled")));
                                return;
                            }
                            return;
                        }
                        String c = cf.c();
                        Log.e(c, "Error sending UI component tree to Facebook: " + g.e());
                    } catch (JSONException e2) {
                        Log.e(cf.c(), "Error decoding server response.", e2);
                    }
                }
            } catch (Throwable th) {
                uf.b(th, this);
            }
        }
    }
}
