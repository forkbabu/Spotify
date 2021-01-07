package defpackage;

import android.os.Bundle;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.navigation.t;
import com.spotify.playlist.models.e;
import defpackage.gb7;
import kotlin.jvm.internal.h;

/* renamed from: eb7  reason: default package */
public final class eb7 implements gb7.a {
    private final t a;

    public eb7(t tVar) {
        h.e(tVar, "navigator");
        this.a = tVar;
    }

    @Override // defpackage.gb7.a
    public void a(e.b bVar) {
        h.e(bVar, "transcriptItem");
        String d = bVar.d();
        h.e(d, "transcriptUri");
        StringBuilder sb = new StringBuilder();
        sb.append("spotify:internal:transcript:episode:");
        l0 z = l0.z(d);
        h.d(z, "SpotifyLink.of(transcriptUri)");
        sb.append(z.k());
        String sb2 = sb.toString();
        h.e(bVar, "transcriptItem");
        Bundle bundle = new Bundle();
        bundle.putString("TRANSCRIPT_URI", bVar.d());
        bundle.putString("LANGUAGE", bVar.c());
        bundle.putBoolean("CURATED", bVar.b());
        bundle.putString("CDN_URL", bVar.a());
        this.a.f(sb2, bundle);
    }
}
