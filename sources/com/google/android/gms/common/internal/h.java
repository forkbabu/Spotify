package com.google.android.gms.common.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.exoplayer2.util.g;

public final class h {
    public h(@RecentlyNonNull String str) {
        g.k(str, "log tag cannot be null");
        Object[] objArr = {str, 23};
        if (!(str.length() <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
    }
}
