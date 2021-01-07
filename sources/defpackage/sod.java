package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: sod  reason: default package */
public class sod {
    private final SpSharedPreferences<Object> a;
    private final cqe b;

    public sod(SpSharedPreferences<Object> spSharedPreferences, cqe cqe) {
        this.a = spSharedPreferences;
        this.b = cqe;
    }

    public Optional<String> a(SpSharedPreferences.b<Object, JSONObject> bVar, String str) {
        if (!this.a.a(bVar)) {
            return Optional.absent();
        }
        try {
            JSONObject h = this.a.h(bVar);
            String string = h.getString("id");
            if (string != null) {
                if (string.equals(str)) {
                    if (this.b.d() < h.getLong("timestamp_ms") + h.getLong("ttl")) {
                        return Optional.fromNullable(h.getString("wrapped_value"));
                    }
                    this.a.b().h(bVar);
                    return Optional.absent();
                }
            }
            return Optional.absent();
        } catch (JSONException unused) {
            Logger.b("Unable to read value for key: %s", bVar.a());
        }
    }

    public void b(SpSharedPreferences.b<Object, JSONObject> bVar) {
        if (this.a.a(bVar)) {
            SpSharedPreferences.a<Object> b2 = this.a.b();
            b2.h(bVar);
            b2.i();
        }
    }

    public void c(SpSharedPreferences.b<Object, JSONObject> bVar, String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wrapped_value", str);
            jSONObject.put("timestamp_ms", this.b.d());
            jSONObject.put("ttl", j);
            jSONObject.put("id", str2);
            SpSharedPreferences.a<Object> b2 = this.a.b();
            b2.d(bVar, jSONObject);
            b2.i();
        } catch (JSONException unused) {
            Logger.b("Unable to write value for key: %s", bVar.a());
        }
    }
}
