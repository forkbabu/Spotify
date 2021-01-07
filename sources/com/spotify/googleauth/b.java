package com.spotify.googleauth;

import android.content.Context;
import com.spotify.http.p;
import com.spotify.http.q;
import com.spotify.libs.connect.volume.c;

public final class b {
    public static q a(Context context) {
        return p.b(context, "http-cache");
    }

    public static q b(Context context) {
        return p.a(context, "picasso-cache");
    }

    public static /* synthetic */ void c(c cVar, float f, cmf cmf, int i, Object obj) {
        int i2 = i & 2;
        cVar.b(f, null);
    }
}
