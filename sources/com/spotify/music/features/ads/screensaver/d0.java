package com.spotify.music.features.ads.screensaver;

import com.spotify.ads.uicomponents.secondaryintent.BookmarkAdButton;
import com.spotify.ads.uicomponents.secondaryintent.b;
import com.spotify.ads.uicomponents.secondaryintent.d;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.o0;
import com.spotify.music.C0707R;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.music.libs.viewuri.ViewUris;
import defpackage.bq3;
import defpackage.vp3;

public class d0 implements d.a, vp3.a, bq3.a {
    private final Ad a;
    private final ws3 b;
    private final vp3 c;
    private final bq3 d;
    private final b e;
    private d f;
    private final o0 g;

    public d0(Ad ad, vp3 vp3, bq3 bq3, ws3 ws3, b bVar, o0 o0Var) {
        this.a = ad;
        this.c = vp3;
        this.d = bq3;
        this.b = ws3;
        this.e = bVar;
        this.g = o0Var;
    }

    @Override // defpackage.bq3.a
    public void a() {
        this.f.setBookmarked(false);
        this.g.b(SpotifyIconV2.CHECK, this.e.g(), C0707R.id.screen_saver_bookmark_confirmation, 300);
    }

    @Override // com.spotify.ads.uicomponents.secondaryintent.d.a
    public void b() {
        if (((BookmarkAdButton) this.f).isActivated()) {
            this.d.a(this.a.id(), ViewUris.d1.toString(), this);
        } else {
            this.c.a(this.a.id(), ViewUris.d1.toString(), this);
        }
    }

    @Override // defpackage.vp3.a
    public void c() {
        this.f.setBookmarked(true);
        this.g.b(SpotifyIconV2.CHECK, this.e.e(), C0707R.id.screen_saver_bookmark_confirmation, 300);
    }

    public void d(d dVar) {
        this.f = dVar;
        dVar.setListener(this);
        boolean z = (this.b.a() || this.b.b()) && this.a.isBookmarkable();
        boolean isBookmarked = this.a.isBookmarked();
        this.f.setVisible(z);
        this.f.setBookmarked(isBookmarked);
    }
}
