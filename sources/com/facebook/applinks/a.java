package com.facebook.applinks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.k;
import org.json.JSONException;
import org.json.JSONObject;

public class a {
    private Uri a;

    private a() {
    }

    public static a a(Intent intent) {
        String string;
        String string2;
        if (uf.c(a.class) || intent == null) {
            return null;
        }
        try {
            Bundle bundleExtra = intent.getBundleExtra("al_applink_data");
            if (bundleExtra == null) {
                return null;
            }
            a aVar = new a();
            Uri data = intent.getData();
            aVar.a = data;
            if (!uf.c(a.class) && data != null) {
                try {
                    String queryParameter = data.getQueryParameter("al_applink_data");
                    if (queryParameter != null) {
                        try {
                            new JSONObject(queryParameter);
                        } catch (JSONException unused) {
                        }
                    }
                } catch (Throwable th) {
                    uf.b(th, a.class);
                }
            }
            if (aVar.a == null && (string2 = bundleExtra.getString("target_url")) != null) {
                aVar.a = Uri.parse(string2);
            }
            Bundle bundle = bundleExtra.getBundle("referer_data");
            if (bundle != null) {
                bundle.getString("fb_ref");
            }
            Bundle bundle2 = bundleExtra.getBundle("extras");
            if (!(bundle2 == null || (string = bundle2.getString("deeplink_context")) == null)) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    if (jSONObject.has("promo_code")) {
                        jSONObject.getString("promo_code");
                    }
                } catch (JSONException unused2) {
                    boolean z = k.n;
                }
            }
            return aVar;
        } catch (Throwable th2) {
            uf.b(th2, a.class);
            return null;
        }
    }
}
