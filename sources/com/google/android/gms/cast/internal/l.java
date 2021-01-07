package com.google.android.gms.cast.internal;

import com.adjust.sdk.Constants;
import com.google.android.gms.common.api.a;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;

public final class l {
    public static final a.g<d0> a = new a.g<>();
    public static final a.g<k0> b = new a.g<>();

    static {
        try {
            Charset.forName(Constants.ENCODING);
        } catch (IllegalCharsetNameException | UnsupportedCharsetException unused) {
        }
        a.h("com.google.cast.multizone");
    }
}
