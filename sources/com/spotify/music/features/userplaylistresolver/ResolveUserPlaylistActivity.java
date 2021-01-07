package com.spotify.music.features.userplaylistresolver;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.music.C0707R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;

public class ResolveUserPlaylistActivity extends ss2 implements mfd, c.a {
    public static final /* synthetic */ int J = 0;
    private LoadingView G;
    private String H;
    e I;

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.USERPLAYLISTRESOLVER;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.G2;
    }

    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (bundle != null) {
            this.H = bundle.getString("source_link");
        } else {
            this.H = getIntent().getStringExtra("source_link");
        }
        super.onCreate(bundle);
        setContentView(C0707R.layout.resolve_user_playlist_activity);
        LoadingView l = LoadingView.l(getLayoutInflater());
        this.G = l;
        ((FrameLayout) findViewById(C0707R.id.container)).addView(l);
        ((FrameLayout.LayoutParams) this.G.getLayoutParams()).gravity = 17;
        this.G.r();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("source_link", this.H);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStart() {
        super.onStart();
        this.G.r();
        this.I.c(this.H);
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.USERPLAYLISTRESOLVER, ViewUris.G2.toString());
    }
}
