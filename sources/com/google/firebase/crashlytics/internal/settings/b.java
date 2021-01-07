package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.w0;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class b implements f {
    b() {
    }

    static t00 b(w0 w0Var) {
        JSONObject jSONObject = new JSONObject();
        return new u00(c(w0Var, 3600, jSONObject), null, new s00(jSONObject.optInt("max_custom_exception_events", 8), 4), new r00(jSONObject.optBoolean("collect_reports", true)), 0, 3600);
    }

    private static long c(w0 w0Var, long j, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        w0Var.getClass();
        return (j * 1000) + System.currentTimeMillis();
    }

    @Override // com.google.firebase.crashlytics.internal.settings.f
    public u00 a(w0 w0Var, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        JSONObject jSONObject2 = jSONObject.getJSONObject("app");
        return new u00(c(w0Var, (long) optInt2, jSONObject), new q00(jSONObject2.getString("status"), jSONObject2.getString("url"), jSONObject2.getString("reports_url"), jSONObject2.getString("ndk_reports_url"), jSONObject2.optBoolean("update_required", false)), new s00(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8), 4), new r00(jSONObject.getJSONObject("features").optBoolean("collect_reports", true)), optInt, optInt2);
    }
}
