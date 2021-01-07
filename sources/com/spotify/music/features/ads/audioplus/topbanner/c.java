package com.spotify.music.features.ads.audioplus.topbanner;

import com.spotify.ads.uicomponents.secondaryintent.BookmarkAdButton;
import com.spotify.ads.uicomponents.secondaryintent.d;
import com.spotify.ads.uicomponents.secondaryintent.e;
import com.spotify.music.libs.viewuri.ViewUris;
import defpackage.bq3;
import defpackage.vp3;

public class c implements d.a, vp3.a, bq3.a {
    private final com.spotify.music.features.ads.audioplus.d a;
    private final ws3 b;
    private final vp3 c;
    private final bq3 d;
    private final e e;
    private d f;

    public c(com.spotify.music.features.ads.audioplus.d dVar, vp3 vp3, bq3 bq3, ws3 ws3, e eVar) {
        this.a = dVar;
        this.c = vp3;
        this.d = bq3;
        this.b = ws3;
        this.e = eVar;
    }

    @Override // defpackage.bq3.a
    public void a() {
        this.f.setBookmarked(false);
        this.e.a();
    }

    @Override // com.spotify.ads.uicomponents.secondaryintent.d.a
    public void b() {
        if (((BookmarkAdButton) this.f).isActivated()) {
            this.d.a(this.a.e(), ViewUris.h1.toString(), this);
        } else {
            this.c.a(this.a.e(), ViewUris.h1.toString(), this);
        }
    }

    @Override // defpackage.vp3.a
    public void c() {
        this.f.setBookmarked(true);
        this.e.b();
    }

    public void d(d dVar) {
        this.f = dVar;
        dVar.setListener(this);
        boolean z = this.b.a() && this.a.g();
        boolean h = this.a.h();
        this.f.setVisible(z);
        this.f.setBookmarked(h);
    }
}
