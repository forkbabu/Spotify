package com.spotify.music.features.yourlibraryx.effecthandlers;

import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.features.createplaylist.d;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.t;
import java.util.List;
import kotlin.jvm.internal.h;

public final class b {
    private final t a;
    private final d b;
    private final c c;

    public b(t tVar, d dVar, c cVar) {
        h.e(tVar, "navigator");
        h.e(dVar, "createPlaylistNavigator");
        h.e(cVar, "viewUri");
        this.a = tVar;
        this.b = dVar;
        this.c = cVar;
    }

    public final void a() {
        this.a.a();
    }

    public final void b() {
        d dVar = this.b;
        String cVar = this.c.toString();
        h.d(cVar, "viewUri.toString()");
        String cVar2 = this.c.toString();
        h.d(cVar2, "viewUri.toString()");
        dVar.c(null, cVar, cVar2);
    }

    public final void c(String str) {
        t tVar = this.a;
        s52 a2 = t52.a(LinkType.COLLECTION_SEARCH);
        h.c(a2);
        List<String> b2 = a2.b();
        h.d(b2, "SpotifyUris.getUri(LinkT…ECTION_SEARCH)!!.patterns");
        tVar.b((String) kotlin.collections.d.j(b2), str);
    }

    public final void d(String str) {
        this.a.b("spotify:internal:preferences", str);
    }

    public final void e(String str, String str2) {
        h.e(str, "uri");
        this.a.b(str, str2);
    }
}
