package com.spotify.mobile.android.share.menu.preview.destinations;

import kotlin.jvm.internal.h;

public final class c {
    private final String a;

    public c(String str) {
        h.e(str, "shareLogId");
        this.a = str;
    }

    public final com.spotify.music.libs.viewuri.c a() {
        StringBuilder V0 = je.V0("spotify:share:preview-menu:");
        V0.append(this.a.length() == 0 ? "unknown-share-log-id" : this.a);
        com.spotify.music.libs.viewuri.c a2 = com.spotify.music.libs.viewuri.c.a(V0.toString());
        h.d(a2, "ViewUri.create(\"$SHARE_P…{validatedShareLogId()}\")");
        return a2;
    }
}
