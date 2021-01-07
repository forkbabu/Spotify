package com.spotify.mobile.android.converter;

import com.google.common.base.MoreObjects;
import com.spotify.music.features.ads.model.Ad;
import kotlin.jvm.internal.h;
import kotlin.text.e;

public final class a {
    public static final boolean a(String str) {
        Boolean bool = Boolean.FALSE;
        if (MoreObjects.isNullOrEmpty(str)) {
            h.d(bool, "FALSE");
            return false;
        } else if (e.f(str, "true", true) || h.a("1", str)) {
            h.d(Boolean.TRUE, "TRUE");
            return true;
        } else if (e.f(str, "false", true) || h.a(Ad.DEFAULT_SKIPPABLE_AD_DELAY, str)) {
            h.d(bool, "FALSE");
            return false;
        } else {
            h.c(str);
            throw new ConvertProductValueException(Boolean.class, str);
        }
    }
}
