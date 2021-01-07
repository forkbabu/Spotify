package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import com.facebook.appevents.codeless.internal.c;
import com.facebook.internal.f0;
import com.facebook.k;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: jf  reason: default package */
final class jf {
    private static final Map<String, String> a = new HashMap();
    private static SharedPreferences b;
    private static final AtomicBoolean c = new AtomicBoolean(false);

    jf() {
    }

    static void a(String str, String str2) {
        if (!uf.c(jf.class)) {
            try {
                if (!c.get()) {
                    c();
                }
                Map<String, String> map = a;
                map.put(str, str2);
                b.edit().putString("SUGGESTED_EVENTS_HISTORY", f0.H(map)).apply();
            } catch (Throwable th) {
                uf.b(th, jf.class);
            }
        }
    }

    static String b(View view, String str) {
        if (uf.c(jf.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", str);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = c.i(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            return f0.S(jSONObject.toString());
        } catch (Throwable th) {
            uf.b(th, jf.class);
            return null;
        }
    }

    private static void c() {
        if (!uf.c(jf.class)) {
            try {
                AtomicBoolean atomicBoolean = c;
                if (!atomicBoolean.get()) {
                    SharedPreferences sharedPreferences = k.d().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
                    b = sharedPreferences;
                    a.putAll(f0.a(sharedPreferences.getString("SUGGESTED_EVENTS_HISTORY", "")));
                    atomicBoolean.set(true);
                }
            } catch (Throwable th) {
                uf.b(th, jf.class);
            }
        }
    }

    static String d(String str) {
        if (uf.c(jf.class)) {
            return null;
        }
        try {
            Map<String, String> map = a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            return null;
        } catch (Throwable th) {
            uf.b(th, jf.class);
            return null;
        }
    }
}
