package com.spotify.music.features.playlistentity.header;

import android.content.Context;
import com.google.common.base.MoreObjects;
import com.spotify.libs.facepile.c;
import com.spotify.music.libs.podcast.download.f0;
import com.spotify.playlist.models.p;

/* access modifiers changed from: package-private */
public final class j0 {
    public static c a(Context context, p pVar) {
        String b = b(pVar);
        String c = pVar.c();
        if (MoreObjects.isNullOrEmpty(c)) {
            c = pVar.d();
        }
        return c.a(c, f0.a(b), iqa.a(context, b));
    }

    public static String b(p pVar) {
        if (pVar == null) {
            return "";
        }
        String a = pVar.a();
        return !MoreObjects.isNullOrEmpty(a) ? a : pVar.f();
    }
}
