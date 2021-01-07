package com.spotify.music.promodisclosure.impl;

import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.g;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import defpackage.ij9;
import kotlin.jvm.internal.h;

public final class PromoDisclosureActivity extends g implements ij9.b, c.a {
    @Override // androidx.appcompat.app.g
    public boolean M0() {
        finish();
        return true;
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, C0707R.anim.promo_disclosure_exit);
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        c cVar = ViewUris.J2;
        h.d(cVar, "ViewUris.PROMO_DISCLOSURE");
        return cVar;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        overridePendingTransition(C0707R.anim.promo_disclosure_enter, 0);
        super.onCreate(bundle);
        setContentView(C0707R.layout.activity_promo_disclosure);
        ActionBar I0 = I0();
        if (I0 != null) {
            I0.j(false);
            I0.i(true);
            I0.l(new SpotifyIconDrawable(this, SpotifyIconV2.X, (float) nud.g(24.0f, getResources())));
        }
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        ij9 b = ij9.b(PageIdentifiers.PROMODISCLOSURE, getViewUri().toString());
        h.d(b, "PageViewObservable.creat…SURE, viewUri.toString())");
        return b;
    }
}
