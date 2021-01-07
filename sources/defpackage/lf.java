package defpackage;

import android.app.Activity;
import com.facebook.appevents.internal.a;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.n;
import com.facebook.k;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: lf  reason: default package */
public final class lf {
    private static final AtomicBoolean a = new AtomicBoolean(false);
    private static final Set<String> b = new HashSet();
    private static final Set<String> c = new HashSet();

    public static synchronized void a() {
        synchronized (lf.class) {
            if (!uf.c(lf.class)) {
                try {
                    AtomicBoolean atomicBoolean = a;
                    if (!atomicBoolean.get()) {
                        atomicBoolean.set(true);
                        b();
                    }
                } catch (Throwable th) {
                    uf.b(th, lf.class);
                }
            }
        }
    }

    private static void b() {
        String o;
        File h;
        if (!uf.c(lf.class)) {
            try {
                n n = FetchedAppSettingsManager.n(k.e(), false);
                if (!(n == null || (o = n.o()) == null)) {
                    JSONObject jSONObject = new JSONObject(o);
                    if (jSONObject.has("production_events")) {
                        JSONArray jSONArray = jSONObject.getJSONArray("production_events");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            b.add(jSONArray.getString(i));
                        }
                    }
                    if (jSONObject.has("eligible_for_prediction_events")) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("eligible_for_prediction_events");
                        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                            c.add(jSONArray2.getString(i2));
                        }
                    }
                    if ((!b.isEmpty() || !c.isEmpty()) && (h = ModelManager.h(ModelManager.Task.MTML_APP_EVENT_PREDICTION)) != null) {
                        C0706if.d(h);
                        Activity n2 = a.n();
                        if (n2 != null) {
                            e(n2);
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                uf.b(th, lf.class);
            }
        }
    }

    static boolean c(String str) {
        if (uf.c(lf.class)) {
            return false;
        }
        try {
            return c.contains(str);
        } catch (Throwable th) {
            uf.b(th, lf.class);
            return false;
        }
    }

    static boolean d(String str) {
        if (uf.c(lf.class)) {
            return false;
        }
        try {
            return b.contains(str);
        } catch (Throwable th) {
            uf.b(th, lf.class);
            return false;
        }
    }

    public static void e(Activity activity) {
        if (!uf.c(lf.class)) {
            try {
                if (!a.get() || !C0706if.e() || (b.isEmpty() && c.isEmpty())) {
                    mf.d(activity);
                } else {
                    mf.c(activity);
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                uf.b(th, lf.class);
            }
        }
    }
}
