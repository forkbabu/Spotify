package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.w0;
import java.util.Locale;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class g implements f {
    g() {
    }

    @Override // com.google.firebase.crashlytics.internal.settings.f
    public u00 a(w0 w0Var, JSONObject jSONObject) {
        String str;
        long j;
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        JSONObject jSONObject2 = jSONObject.getJSONObject("fabric");
        JSONObject jSONObject3 = jSONObject.getJSONObject("app");
        String string = jSONObject3.getString("status");
        boolean equals = "new".equals(string);
        String string2 = jSONObject2.getString("bundle_id");
        String string3 = jSONObject2.getString("org_id");
        if (equals) {
            str = "https://update.crashlytics.com/spi/v1/platforms/android/apps";
        } else {
            str = String.format(Locale.US, "https://update.crashlytics.com/spi/v1/platforms/android/apps/%s", string2);
        }
        Locale locale = Locale.US;
        q00 q00 = new q00(string, str, String.format(locale, "https://reports.crashlytics.com/spi/v1/platforms/android/apps/%s/reports", string2), String.format(locale, "https://reports.crashlytics.com/sdk-api/v1/platforms/android/apps/%s/minidumps", string2), string2, string3, jSONObject3.optBoolean("update_required", false), jSONObject3.optInt("report_upload_variant", 0), jSONObject3.optInt("native_report_upload_variant", 0));
        s00 s00 = new s00(8, 4);
        r00 r00 = new r00(jSONObject.getJSONObject("features").optBoolean("collect_reports", true));
        long j2 = (long) optInt2;
        if (jSONObject.has("expires_at")) {
            j = jSONObject.optLong("expires_at");
        } else {
            w0Var.getClass();
            j = (j2 * 1000) + System.currentTimeMillis();
        }
        return new u00(j, q00, s00, r00, optInt, optInt2);
    }
}
