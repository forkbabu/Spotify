package com.spotify.music.features.connect.cast.discovery;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.common.base.Optional;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.json.e;
import com.spotify.music.json.g;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

class c implements j {
    static final SpSharedPreferences.b<Object, JSONObject> c = SpSharedPreferences.b.e("device_discovery_configuration");
    private final ObjectMapper a;
    protected SpSharedPreferences<Object> b;

    c(SpSharedPreferences<Object> spSharedPreferences, g gVar) {
        this.b = spSharedPreferences;
        e b2 = gVar.b();
        b2.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        b2.e(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        this.a = b2.build();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a() {
        /*
            r5 = this;
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r0 = r5.b
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, org.json.JSONObject> r1 = com.spotify.music.features.connect.cast.discovery.c.c
            boolean r0 = r0.a(r1)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0037
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r0 = r5.b     // Catch:{ IOException | JSONException -> 0x0033 }
            org.json.JSONObject r0 = r0.h(r1)     // Catch:{ IOException | JSONException -> 0x0033 }
            com.fasterxml.jackson.databind.ObjectMapper r1 = r5.a     // Catch:{ IOException | JSONException -> 0x0033 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException | JSONException -> 0x0033 }
            java.lang.Class<com.spotify.music.features.connect.cast.discovery.DiscoveryConfiguration> r4 = com.spotify.music.features.connect.cast.discovery.DiscoveryConfiguration.class
            java.lang.Object r0 = r1.readValue(r0, r4)     // Catch:{ IOException | JSONException -> 0x0033 }
            com.spotify.music.features.connect.cast.discovery.DiscoveryConfiguration r0 = (com.spotify.music.features.connect.cast.discovery.DiscoveryConfiguration) r0     // Catch:{ IOException | JSONException -> 0x0033 }
            java.util.List<com.spotify.music.features.connect.cast.i> r1 = r0.mAppIds     // Catch:{ IOException | JSONException -> 0x0033 }
            boolean r1 = r1.isEmpty()     // Catch:{ IOException | JSONException -> 0x0033 }
            if (r1 == 0) goto L_0x0031
            java.util.List<com.spotify.music.features.connect.cast.discovery.DiscoveryConfiguration$FeatureFlagOverrideValue> r0 = r0.mDiscoverySupport     // Catch:{ IOException | JSONException -> 0x0033 }
            boolean r0 = r0.isEmpty()     // Catch:{ IOException | JSONException -> 0x0033 }
            if (r0 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r0 = 0
            goto L_0x0034
        L_0x0033:
            r0 = 1
        L_0x0034:
            if (r0 != 0) goto L_0x0037
            r2 = 1
        L_0x0037:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.connect.cast.discovery.c.a():boolean");
    }

    public Optional<DiscoveryConfiguration> b() {
        SpSharedPreferences<Object> spSharedPreferences = this.b;
        SpSharedPreferences.b<Object, JSONObject> bVar = c;
        if (spSharedPreferences.a(bVar)) {
            try {
                DiscoveryConfiguration discoveryConfiguration = (DiscoveryConfiguration) this.a.readValue(this.b.h(bVar).toString(), DiscoveryConfiguration.class);
                if (!discoveryConfiguration.c()) {
                    return Optional.of(discoveryConfiguration);
                }
                SpSharedPreferences.a<Object> b2 = this.b.b();
                b2.h(bVar);
                b2.i();
                return Optional.absent();
            } catch (IOException | JSONException unused) {
                SpSharedPreferences.a<Object> b3 = this.b.b();
                b3.h(c);
                b3.i();
            }
        }
        return Optional.absent();
    }
}
