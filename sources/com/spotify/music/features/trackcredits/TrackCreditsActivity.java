package com.spotify.music.features.trackcredits;

import android.os.Bundle;
import com.spotify.instrumentation.PageIdentifiers;

public class TrackCreditsActivity extends ss2 {
    f G;

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        h hVar = new h(getLayoutInflater(), this.G);
        setContentView(hVar.b());
        this.G.g(hVar);
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.TRACK_CREDITS_CREDITS, null);
    }
}
