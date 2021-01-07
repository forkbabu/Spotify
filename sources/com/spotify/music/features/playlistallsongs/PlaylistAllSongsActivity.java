package com.spotify.music.features.playlistallsongs;

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
import com.spotify.remoteconfig.g6;
import defpackage.ifd;
import io.reactivex.s;

public class PlaylistAllSongsActivity extends ss2 implements mfd, ifd.b, c.a, s16 {
    public static final /* synthetic */ int P = 0;
    private String G;
    private c H = new c(false, false, null, false, null);
    private PageLoaderView<s<k16>> I;
    n J;
    zac K;
    y16 L;
    t0<s<k16>> M;
    g6 N;
    w0 O;

    @Override // defpackage.s16
    public String a() {
        return this.G;
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.PLAYLIST_ALLSONGS;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.J0.b(this.G);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.L.a();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (bundle != null) {
            this.G = bundle.getString("playlist_uri");
            this.H = (c) bundle.getParcelable("include_episodes");
        } else {
            Intent intent = getIntent();
            this.G = intent.getStringExtra("playlist_uri");
            this.H = (c) intent.getParcelableExtra("include_episodes");
        }
        super.onCreate(bundle);
        this.L.c(bundle);
        PageLoaderView.a b = this.K.b(getViewUri(), u0());
        y16 y16 = this.L;
        y16.getClass();
        b.e(new b(y16));
        if (this.N.a()) {
            b.i(new a(this));
        }
        PageLoaderView<s<k16>> a = b.a(this);
        this.I = a;
        setContentView(a);
    }

    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("playlist_uri", this.G);
        bundle.putParcelable("include_episodes", this.H);
        this.L.b(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStart() {
        super.onStart();
        this.I.j0(this.J, this.M);
        this.M.start();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStop() {
        super.onStop();
        this.M.stop();
    }

    @Override // defpackage.s16
    public c s() {
        return this.H;
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.PLAYLIST_ALLSONGS, getViewUri().toString());
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.O0;
    }
}
