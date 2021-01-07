package com.facebook.appevents;

import android.os.Build;
import android.os.Bundle;
import com.adjust.sdk.Constants;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.internal.d;
import com.facebook.internal.y;
import com.facebook.k;
import com.spotify.music.features.ads.model.Ad;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONObject;

public class AppEvent implements Serializable {
    private static final HashSet<String> a = new HashSet<>();
    private static final long serialVersionUID = 1;
    private final String checksum;
    private final boolean inBackground;
    private final boolean isImplicit;
    private final JSONObject jsonObject;
    private final String name;

    static class SerializationProxyV1 implements Serializable {
        private static final long serialVersionUID = -2488473066578201069L;
        private final boolean inBackground;
        private final boolean isImplicit;
        private final String jsonString;

        private Object readResolve() {
            return new AppEvent(this.jsonString, this.isImplicit, this.inBackground, null, null);
        }
    }

    static class SerializationProxyV2 implements Serializable {
        private static final long serialVersionUID = 20160803001L;
        private final String checksum;
        private final boolean inBackground;
        private final boolean isImplicit;
        private final String jsonString;

        SerializationProxyV2(String str, boolean z, boolean z2, String str2, a aVar) {
            this.jsonString = str;
            this.isImplicit = z;
            this.inBackground = z2;
            this.checksum = str2;
        }

        private Object readResolve() {
            return new AppEvent(this.jsonString, this.isImplicit, this.inBackground, this.checksum, null);
        }
    }

    public AppEvent(String str, String str2, Double d, Bundle bundle, boolean z, boolean z2, UUID uuid) {
        this.isImplicit = z;
        this.inBackground = z2;
        this.name = str2;
        g(str2);
        JSONObject jSONObject = new JSONObject();
        String d2 = hf.d(str2);
        jSONObject.put("_eventName", d2);
        jSONObject.put("_eventName_md5", f(d2));
        jSONObject.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            HashMap hashMap = new HashMap();
            for (String str3 : bundle.keySet()) {
                g(str3);
                Object obj = bundle.get(str3);
                if ((obj instanceof String) || (obj instanceof Number)) {
                    hashMap.put(str3, obj.toString());
                } else {
                    throw new FacebookException(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", obj, str3));
                }
            }
            gf.b(hashMap);
            hf.e(hashMap, this.name);
            ff.c(hashMap, this.name);
            for (String str4 : hashMap.keySet()) {
                jSONObject.put(str4, hashMap.get(str4));
            }
        }
        if (d != null) {
            jSONObject.put("_valueToSum", d.doubleValue());
        }
        if (this.inBackground) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.isImplicit) {
            jSONObject.put("_implicitlyLogged", "1");
        } else {
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            jSONObject.toString();
            int i = y.e;
            k.v(loggingBehavior);
        }
        this.jsonObject = jSONObject;
        this.checksum = a();
    }

    private String a() {
        if (Build.VERSION.SDK_INT > 19) {
            return f(this.jsonObject.toString());
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = this.jsonObject.keys();
        while (keys.hasNext()) {
            arrayList.add(keys.next());
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            sb.append(str);
            sb.append(" = ");
            sb.append(this.jsonObject.optString(str));
            sb.append('\n');
        }
        return f(sb.toString());
    }

    private static String f(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(Constants.MD5);
            byte[] bytes = str.getBytes(Constants.ENCODING);
            instance.update(bytes, 0, bytes.length);
            return d.a(instance.digest());
        } catch (NoSuchAlgorithmException unused) {
            boolean z = k.n;
            return Ad.DEFAULT_SKIPPABLE_AD_DELAY;
        } catch (UnsupportedEncodingException unused2) {
            boolean z2 = k.n;
            return "1";
        }
    }

    private static void g(String str) {
        boolean contains;
        if (str == null || str.length() == 0 || str.length() > 40) {
            if (str == null) {
                str = "<None Provided>";
            }
            throw new FacebookException(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", str, 40));
        }
        HashSet<String> hashSet = a;
        synchronized (hashSet) {
            contains = hashSet.contains(str);
        }
        if (contains) {
            return;
        }
        if (str.matches("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$")) {
            synchronized (hashSet) {
                hashSet.add(str);
            }
            return;
        }
        throw new FacebookException(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", str));
    }

    private Object writeReplace() {
        return new SerializationProxyV2(this.jsonObject.toString(), this.isImplicit, this.inBackground, this.checksum, null);
    }

    public boolean b() {
        return this.isImplicit;
    }

    public JSONObject c() {
        return this.jsonObject;
    }

    public String d() {
        return this.name;
    }

    public boolean e() {
        if (this.checksum == null) {
            return true;
        }
        return a().equals(this.checksum);
    }

    @Override // java.lang.Object
    public String toString() {
        return String.format("\"%s\", implicit: %b, json: %s", this.jsonObject.optString("_eventName"), Boolean.valueOf(this.isImplicit), this.jsonObject.toString());
    }

    AppEvent(String str, boolean z, boolean z2, String str2, a aVar) {
        JSONObject jSONObject = new JSONObject(str);
        this.jsonObject = jSONObject;
        this.isImplicit = z;
        this.name = jSONObject.optString("_eventName");
        this.checksum = str2;
        this.inBackground = z2;
    }
}
