package defpackage;

import android.os.Build;
import android.os.Bundle;
import com.facebook.appevents.internal.d;
import com.facebook.internal.b;
import com.facebook.internal.f0;
import com.facebook.k;
import com.facebook.m;
import com.spotify.music.features.ads.model.Ad;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: xe  reason: default package */
public final class xe implements Runnable {
    final /* synthetic */ String a;

    xe(String str) {
        this.a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str = Ad.DEFAULT_SKIPPABLE_AD_DELAY;
        if (!uf.c(this)) {
            try {
                boolean z = true;
                m s = m.s(null, String.format(Locale.US, "%s/app_indexing_session", this.a), null, null);
                Bundle n = s.n();
                if (n == null) {
                    n = new Bundle();
                }
                b e = b.e(k.d());
                JSONArray jSONArray = new JSONArray();
                String str2 = Build.MODEL;
                if (str2 == null) {
                    str2 = "";
                }
                jSONArray.put(str2);
                if (e == null || e.b() == null) {
                    jSONArray.put("");
                } else {
                    jSONArray.put(e.b());
                }
                jSONArray.put(str);
                if (d.c()) {
                    str = "1";
                }
                jSONArray.put(str);
                Locale m = f0.m();
                jSONArray.put(m.getLanguage() + "_" + m.getCountry());
                String jSONArray2 = jSONArray.toString();
                n.putString("device_session_id", we.i());
                n.putString("extinfo", jSONArray2);
                s.C(n);
                JSONObject f = s.g().f();
                if (f == null || !f.optBoolean("is_app_indexing_enabled", false)) {
                    z = false;
                }
                we.c(Boolean.valueOf(z));
                if (!we.b().booleanValue()) {
                    we.d(null);
                } else if (we.e() != null) {
                    we.e().i();
                }
                we.f(Boolean.FALSE);
            } catch (Throwable th) {
                uf.b(th, this);
            }
        }
    }
}
