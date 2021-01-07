package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.network.HttpMethod;
import com.google.firebase.crashlytics.internal.network.b;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;

public abstract class a {
    private static final Pattern e = Pattern.compile("http(s?)://[^\\/]+", 2);
    private final String a;
    private final b b;
    private final HttpMethod c;
    private final String d;

    public a(String str, String str2, b bVar, HttpMethod httpMethod) {
        if (str2 == null) {
            throw new IllegalArgumentException("url must not be null.");
        } else if (bVar != null) {
            this.d = str;
            this.a = !CommonUtils.s(str) ? e.matcher(str2).replaceFirst(str) : str2;
            this.b = bVar;
            this.c = httpMethod;
        } else {
            throw new IllegalArgumentException("requestFactory must not be null.");
        }
    }

    /* access modifiers changed from: protected */
    public com.google.firebase.crashlytics.internal.network.a b() {
        return c(Collections.emptyMap());
    }

    /* access modifiers changed from: protected */
    public com.google.firebase.crashlytics.internal.network.a c(Map<String, String> map) {
        b bVar = this.b;
        HttpMethod httpMethod = this.c;
        String str = this.a;
        bVar.getClass();
        com.google.firebase.crashlytics.internal.network.a aVar = new com.google.firebase.crashlytics.internal.network.a(httpMethod, str, map);
        aVar.b("User-Agent", "Crashlytics Android SDK/17.2.1");
        aVar.b("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
        return aVar;
    }

    /* access modifiers changed from: protected */
    public String d() {
        return this.a;
    }
}
