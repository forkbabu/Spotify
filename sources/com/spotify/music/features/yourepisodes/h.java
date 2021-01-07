package com.spotify.music.features.yourepisodes;

import android.net.Uri;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.viewuri.c;

public final class h implements fjf<c> {
    private final wlf<String> a;

    public h(wlf<String> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String str = this.a.get();
        kotlin.jvm.internal.h.e(str, "username");
        int i = l0.h;
        StringBuilder V0 = je.V0("spotify:user:");
        V0.append(Uri.encode(str));
        V0.append(':');
        V0.append("collection");
        V0.append(':');
        V0.append("your-episodes");
        String B = l0.z(V0.toString()).B();
        if (B == null) {
            B = "spotify:collection:your-episodes";
        }
        return c.a(B);
    }
}
