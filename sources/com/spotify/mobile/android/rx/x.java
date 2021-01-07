package com.spotify.mobile.android.rx;

import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.cosmos.router.Request;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Locale;

public class x {
    private final FireAndForgetResolver a;

    public x(FireAndForgetResolver fireAndForgetResolver) {
        this.a = fireAndForgetResolver;
    }

    public void a(String str, String str2) {
        this.a.resolve(new Request(Request.PUT, String.format(Locale.US, "sp://product-state/v1/values/%s", str), Collections.emptyMap(), str2.getBytes(Charset.defaultCharset())));
    }
}
