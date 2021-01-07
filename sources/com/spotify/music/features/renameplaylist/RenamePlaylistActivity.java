package com.spotify.music.features.renameplaylist;

import android.os.Bundle;
import androidx.lifecycle.n;
import com.google.common.base.MoreObjects;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.t0;

public class RenamePlaylistActivity extends ss2 implements mfd, c.a, m48, n48 {
    public static final /* synthetic */ int M = 0;
    private String G;
    private PageLoaderView<String> H;
    n I;
    t0<String> J;
    zac K;
    v48 L;

    @Override // defpackage.m48
    public String O() {
        String stringExtra = getIntent().getStringExtra("playlist_name");
        return !MoreObjects.isNullOrEmpty(stringExtra) ? stringExtra : "";
    }

    @Override // defpackage.n48
    public String a() {
        return this.G;
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.PLAYLIST_RENAME;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.L0;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.L.a();
        super.onBackPressed();
    }

    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (bundle != null) {
            this.G = bundle.getString("playlist_uri");
        } else {
            this.G = getIntent().getStringExtra("playlist_uri");
        }
        super.onCreate(bundle);
        if (MoreObjects.isNullOrEmpty(this.G)) {
            Assertion.p("No playlist uri provided. Did you use createIntent()?");
        }
        this.L.c(bundle);
        PageLoaderView.a b = this.K.b(ViewUris.L0, u0());
        b.e(new a(this));
        PageLoaderView<String> a = b.a(this);
        this.H = a;
        setContentView(a);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("playlist_uri", this.G);
        this.L.b(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStart() {
        super.onStart();
        this.H.j0(this.I, this.J);
        this.J.start();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStop() {
        super.onStop();
        this.J.stop();
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.PLAYLIST_RENAME, ViewUris.L0.toString());
    }
}
