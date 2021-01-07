package com.spotify.music.features.addtoplaylist;

import android.os.Bundle;
import androidx.lifecycle.n;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.t0;
import com.spotify.pageloader.w0;
import com.spotify.playlist.models.f;
import com.spotify.remoteconfig.a5;
import io.reactivex.s;
import java.util.ArrayList;
import java.util.List;

public class AddToPlaylistActivity extends ss2 implements mfd, c.a, fi3, di3, ei3 {
    public static final /* synthetic */ int R = 0;
    n G;
    zac H;
    bk3 I;
    t0<s<f>> J;
    a5 K;
    w0 L;
    private String M;
    private String N;
    private String O;
    private ArrayList<String> P;
    private PageLoaderView<s<f>> Q;

    @Override // defpackage.fi3
    public String d() {
        String str = this.N;
        return str != null ? str : "";
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.PLAYLIST_ADDTOPLAYLIST;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.T0;
    }

    @Override // defpackage.di3
    public String i() {
        return this.M;
    }

    @Override // defpackage.ei3
    public List<String> l() {
        return this.P;
    }

    @Override // defpackage.fi3
    public String m() {
        String str = this.O;
        return str != null ? str : "";
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!this.I.a()) {
            super.onBackPressed();
        }
    }

    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (bundle != null) {
            this.M = bundle.getString("folder_uri");
            this.P = bundle.getStringArrayList("item_uris");
            this.N = bundle.getString("source_view_uri");
            this.O = bundle.getString("source_context_uri");
        } else {
            this.M = getIntent().getStringExtra("folder_uri");
            this.P = getIntent().getStringArrayListExtra("item_uris");
            this.N = getIntent().getStringExtra("source_view_uri");
            this.O = getIntent().getStringExtra("source_context_uri");
        }
        super.onCreate(bundle);
        this.I.c(bundle);
        PageLoaderView.a b = this.H.b(ViewUris.T0, u0());
        b.e(new b(this));
        if (this.K.c()) {
            b.i(new a(this));
        }
        PageLoaderView<s<f>> a = b.a(this);
        this.Q = a;
        setContentView(a);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.I.b(bundle);
        bundle.putString("folder_uri", this.M);
        bundle.putStringArrayList("item_uris", this.P);
        bundle.putString("source_view_uri", this.N);
        bundle.putString("source_context_uri", this.O);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStart() {
        super.onStart();
        this.Q.j0(this.G, this.J);
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
        return ij9.b(PageIdentifiers.PLAYLIST_ADDTOPLAYLIST, ViewUris.T0.toString());
    }
}
