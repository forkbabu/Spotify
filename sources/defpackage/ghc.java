package defpackage;

import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.t;
import com.spotify.music.podcastentityrow.d;
import com.spotify.music.podcastentityrow.g;
import com.spotify.music.podcastentityrow.j;
import com.spotify.music.podcastentityrow.playback.b;
import kotlin.jvm.internal.h;

/* renamed from: ghc  reason: default package */
public final class ghc implements jhc, g {
    private final b a;
    private final t b;
    private final qsc c;
    private final chc d;
    private final d e;
    private final j f;
    private final tsc g;
    private final c h;

    public ghc(b bVar, t tVar, qsc qsc, chc chc, d dVar, j jVar, tsc tsc, c cVar) {
        h.e(bVar, "playButtonClickListener");
        h.e(tVar, "navigator");
        h.e(qsc, "downloadListener");
        h.e(chc, "contextmenuListener");
        h.e(dVar, "addToListenLaterClickListener");
        h.e(jVar, "markAsPlayedClickListener");
        h.e(tsc, "episodeRowLogger");
        h.e(cVar, "viewUri");
        this.a = bVar;
        this.b = tVar;
        this.c = qsc;
        this.d = chc;
        this.e = dVar;
        this.f = jVar;
        this.g = tsc;
        this.h = cVar;
    }

    @Override // defpackage.jhc
    public void a(bhc bhc) {
        h.e(bhc, "model");
        this.g.g(bhc.a(), "", bhc.b(), bhc.c());
        d dVar = this.e;
        String a2 = bhc.a();
        boolean c2 = bhc.c();
        String cVar = this.h.toString();
        h.d(cVar, "viewUri.toString()");
        dVar.b(a2, c2, cVar);
    }

    @Override // defpackage.jhc
    public void b(nhc nhc) {
        h.e(nhc, "model");
        i(new dhc(nhc.b(), nhc.c(), nhc.a(), nhc.d(), nhc.e()));
    }

    @Override // defpackage.jhc
    public void c(lhc lhc) {
        h.e(lhc, "model");
        this.a.a(new b.a(this, lhc.a(), lhc.d(), lhc.c(), "", lhc.b()));
    }

    @Override // defpackage.jhc
    public void d(ihc ihc) {
        h.e(ihc, "model");
        this.c.a(ihc.a(), ihc.c(), "", ihc.b());
    }

    @Override // com.spotify.music.podcastentityrow.g
    public String e(String str, String str2, int i) {
        h.e(str, "episodeUri");
        h.e(str2, "section");
        String b2 = this.g.b(str, str2, i);
        h.d(b2, "episodeRowLogger.logPlay…isodeUri, section, index)");
        return b2;
    }

    @Override // defpackage.jhc
    public void f(mhc mhc) {
        h.e(mhc, "model");
        this.b.d(mhc.a());
        this.g.e(mhc.a(), "", mhc.b());
    }

    @Override // defpackage.jhc
    public void g(khc khc) {
        h.e(khc, "model");
        this.g.a(khc.a(), "", khc.b());
        this.f.a(khc.a(), "", khc.b());
    }

    @Override // com.spotify.music.podcastentityrow.g
    public String h(String str, String str2, int i) {
        h.e(str, "episodeUri");
        h.e(str2, "section");
        String c2 = this.g.c(str, str2, i);
        h.d(c2, "episodeRowLogger.logPaus…isodeUri, section, index)");
        return c2;
    }

    @Override // defpackage.jhc
    public void i(dhc dhc) {
        h.e(dhc, "model");
        this.d.a(new msc(dhc.b(), dhc.c(), "", dhc.a(), dhc.d(), dhc.e()));
    }
}
