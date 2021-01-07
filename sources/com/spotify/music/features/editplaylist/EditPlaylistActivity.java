package com.spotify.music.features.editplaylist;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.n;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.t0;
import com.spotify.pageloader.w0;
import com.spotify.playlist.models.k;
import com.spotify.remoteconfig.q5;

public class EditPlaylistActivity extends ss2 implements mfd, tx4, c.a {
    public static final /* synthetic */ int O = 0;
    n G;
    zac H;
    jy4 I;
    t0<k> J;
    q5 K;
    w0 L;
    private String M;
    private PageLoaderView<k> N;

    @Override // defpackage.tx4
    public String a() {
        return this.M;
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.PLAYLIST_EDIT;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.I0.b(this.M);
    }

    @Override // defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.I.a(i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.I.b();
    }

    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (bundle != null) {
            this.M = bundle.getString("playlist_uri");
        } else {
            this.M = getIntent().getStringExtra("playlist_uri");
        }
        super.onCreate(bundle);
        this.I.g(bundle);
        PageLoaderView.a b = this.H.b(getViewUri(), u0());
        jy4 jy4 = this.I;
        jy4.getClass();
        b.e(new a(jy4));
        if (this.K.c()) {
            b.i(new b(this));
        }
        PageLoaderView<k> a = b.a(this);
        this.N = a;
        setContentView(a);
    }

    @Override // androidx.fragment.app.c, android.app.Activity, androidx.core.app.a.b
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.I.c(i, strArr, iArr);
    }

    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("playlist_uri", this.M);
        this.I.e(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStart() {
        super.onStart();
        this.N.j0(this.G, this.J);
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
        return ij9.b(PageIdentifiers.PLAYLIST_EDIT, getViewUri().toString());
    }
}
