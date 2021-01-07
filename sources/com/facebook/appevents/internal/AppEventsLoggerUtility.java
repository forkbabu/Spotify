package com.facebook.appevents.internal;

import android.content.Context;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.l;
import com.facebook.internal.b;
import com.facebook.internal.f0;
import com.facebook.internal.y;
import com.facebook.k;
import com.spotify.music.features.ads.model.Ad;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public class AppEventsLoggerUtility {
    private static final Map<GraphAPIActivityType, String> a = new HashMap<GraphAPIActivityType, String>() {
        /* class com.facebook.appevents.internal.AppEventsLoggerUtility.AnonymousClass1 */

        {
            put(GraphAPIActivityType.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL");
            put(GraphAPIActivityType.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS");
        }
    };

    public enum GraphAPIActivityType {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    public static JSONObject a(GraphAPIActivityType graphAPIActivityType, b bVar, String str, boolean z, Context context) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", a.get(graphAPIActivityType));
        String d = AppEventsLogger.d();
        if (d != null) {
            jSONObject.put("app_user_id", d);
        }
        jSONObject.put("anon_id", str);
        jSONObject.put("application_tracking_enabled", !z);
        jSONObject.put("advertiser_id_collection_enabled", k.c());
        if (bVar != null) {
            if (bVar.d() != null) {
                jSONObject.put("attribution", bVar.d());
            }
            if (bVar.b() != null) {
                jSONObject.put(Ad.METADATA_ADVERTISER_ID, bVar.b());
                jSONObject.put("advertiser_tracking_enabled", !bVar.f());
            }
            if (!bVar.f()) {
                String d2 = l.d();
                if (!d2.isEmpty()) {
                    jSONObject.put("ud", d2);
                }
            }
            if (bVar.c() != null) {
                jSONObject.put("installer_package", bVar.c());
            }
        }
        try {
            f0.Q(jSONObject, context);
        } catch (Exception e) {
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            e.toString();
            int i = y.e;
            k.v(loggingBehavior);
        }
        JSONObject n = f0.n();
        if (n != null) {
            Iterator<String> keys = n.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, n.get(next));
            }
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
