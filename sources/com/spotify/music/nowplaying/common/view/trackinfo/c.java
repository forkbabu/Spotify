package com.spotify.music.nowplaying.common.view.trackinfo;

import com.google.common.base.MoreObjects;
import com.spotify.music.navigation.t;
import com.spotify.music.nowplaying.common.view.trackinfo.e;
import com.spotify.player.model.ContextTrack;
import com.spotify.rxjava2.p;
import io.reactivex.g;

public class c implements e.a {
    private final t a;
    private final frd b;
    private final g<ContextTrack> c;
    private final p d = new p();
    private String e;
    private String f;
    private e g;

    public c(g<ContextTrack> gVar, t tVar, frd frd) {
        this.a = tVar;
        this.c = gVar;
        this.b = frd;
    }

    public static void a(c cVar, ContextTrack contextTrack) {
        String str;
        cVar.getClass();
        String str2 = contextTrack.metadata().get("title");
        String a2 = kxd.i(contextTrack) ? contextTrack.metadata().get("album_title") : kxd.a(contextTrack);
        e eVar = cVar.g;
        if (MoreObjects.isNullOrEmpty(str2)) {
            str2 = "";
        }
        eVar.setTitle(str2);
        e eVar2 = cVar.g;
        if (MoreObjects.isNullOrEmpty(a2)) {
            a2 = "";
        }
        eVar2.setSubtitle(a2);
        cVar.e = kxd.i(contextTrack) ? contextTrack.uri() : contextTrack.metadata().get("album_uri");
        if (kxd.i(contextTrack)) {
            str = contextTrack.metadata().get("album_uri");
        } else {
            str = contextTrack.metadata().get("artist_uri");
        }
        cVar.f = str;
    }

    public void b() {
        if (!MoreObjects.isNullOrEmpty(this.f)) {
            this.b.d(this.f);
            t tVar = this.a;
            String str = this.f;
            str.getClass();
            tVar.d(str);
        }
    }

    public void c() {
        if (!MoreObjects.isNullOrEmpty(this.e)) {
            this.b.l(this.e);
            t tVar = this.a;
            String str = this.e;
            str.getClass();
            tVar.d(str);
        }
    }

    public void d(e eVar) {
        eVar.getClass();
        this.g = eVar;
        eVar.setListener(this);
        this.d.b(this.c.subscribe(new b(this)));
    }

    public void e() {
        this.g.setListener(null);
        this.d.a();
    }
}
