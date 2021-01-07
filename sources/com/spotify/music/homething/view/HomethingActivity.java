package com.spotify.music.homething.view;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.components.toolbar.c;
import com.spotify.android.glue.components.toolbar.e;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarManager;
import com.spotify.android.paste.app.d;
import com.spotify.music.C0707R;

public class HomethingActivity extends ss2 {
    public static final /* synthetic */ int I = 0;
    qs9 G;
    private final cj9 H = new cj9(this);

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.G.b();
    }

    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0707R.layout.activity_homething);
        ViewGroup viewGroup = (ViewGroup) findViewById(C0707R.id.toolbar_wrapper);
        c c = l70.c(this, viewGroup);
        if (getIntent().getAction().equals("com.spotify.music.features.homething.OPEN_SETTINGS")) {
            ((e) c).setTitle(getString(C0707R.string.homething_settings));
        } else {
            ((e) c).setTitle(getString(C0707R.string.add_spotify_device));
        }
        e eVar = (e) c;
        d.d(eVar.getView(), this);
        viewGroup.addView(eVar.getView());
        ToolbarManager toolbarManager = new ToolbarManager(this, c, new a(this));
        toolbarManager.h(true);
        toolbarManager.g(true);
        this.G.a(getIntent().getAction());
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.c(this.H);
    }

    @Override // androidx.fragment.app.c
    public void x0(Fragment fragment) {
        this.H.e(fragment);
    }
}
