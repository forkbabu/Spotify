package com.spotify.mobile.android.util;

import android.content.ContentResolver;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.features.ads.model.Ad;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.UUID;

public class v {
    private static final SpSharedPreferences.b<Object, String> e = SpSharedPreferences.b.c("installation_id");
    private static final Object f = new Object();
    private String a;
    private final ContentResolver b;
    private final SpSharedPreferences<Object> c;
    private String d;

    public v(ContentResolver contentResolver, SpSharedPreferences<Object> spSharedPreferences) {
        contentResolver.getClass();
        this.b = contentResolver;
        spSharedPreferences.getClass();
        this.c = spSharedPreferences;
    }

    public void a() {
        this.a = null;
    }

    public String b() {
        String string = Settings.Secure.getString(this.b, "android_id");
        return (string == null || string.isEmpty()) ? Ad.DEFAULT_SKIPPABLE_AD_DELAY : string;
    }

    public String c() {
        synchronized (f) {
            String str = this.d;
            if (str != null) {
                return str;
            }
            SpSharedPreferences<Object> spSharedPreferences = this.c;
            SpSharedPreferences.b<Object, String> bVar = e;
            String n = spSharedPreferences.n(bVar, "");
            this.d = n;
            if (TextUtils.isEmpty(n)) {
                String bigInteger = new BigInteger(130, new SecureRandom()).toString(32);
                SpSharedPreferences.a<Object> b2 = this.c.b();
                b2.f(bVar, bigInteger);
                b2.i();
                this.d = bigInteger;
            }
            return this.d;
        }
    }

    public String d() {
        if (MoreObjects.isNullOrEmpty(this.a)) {
            this.a = UUID.randomUUID().toString();
        }
        return this.a;
    }
}
