package com.spotify.music.features.fullscreen.story;

import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.x;
import com.spotify.android.goldenpath.a;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.C0707R;
import com.spotify.music.sociallistening.participantlist.impl.m;

public class FullscreenStoryActivity extends ss2 {
    public static final /* synthetic */ int G = 0;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Fragment U = v0().U("fullscreen_story_fragment");
        if (!(U instanceof ws2) || !U.l3() || !((ws2) U).b()) {
            super.onBackPressed();
        }
    }

    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0707R.layout.activity_fullscreen_story);
        getWindow().addFlags(128);
        if (a.e(getResources()) <= Math.round((((float) Resources.getSystem().getDisplayMetrics().densityDpi) / 160.0f) * 24.0f)) {
            getWindow().getDecorView().setSystemUiVisibility(4);
        }
        if (bundle == null) {
            Bundle extras = getIntent().getExtras();
            FullscreenStoryFragment fullscreenStoryFragment = new FullscreenStoryFragment();
            fullscreenStoryFragment.r4(extras);
            m.d(fullscreenStoryFragment, bu9.k);
            x i = v0().i();
            i.q(C0707R.id.content, fullscreenStoryFragment, "fullscreen_story_fragment");
            i.i();
        }
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.FULLSCREEN_STORY, null);
    }
}
