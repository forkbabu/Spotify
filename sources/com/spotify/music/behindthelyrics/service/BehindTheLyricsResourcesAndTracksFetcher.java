package com.spotify.music.behindthelyrics.service;

import android.content.Intent;
import androidx.core.app.s;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.instrumentation.performance.ColdStartTracker;
import dagger.android.a;

public class BehindTheLyricsResourcesAndTracksFetcher extends s {
    public static final /* synthetic */ int s = 0;
    f q;
    ColdStartTracker r;

    /* access modifiers changed from: protected */
    @Override // androidx.core.app.f
    public void d(Intent intent) {
        this.r.o(getClass().getSimpleName());
        Logger.g("Running BehindTheLyricsResourcesAndTracksFetcher.", new Object[0]);
        this.q.run();
    }

    @Override // androidx.core.app.s, androidx.core.app.f, android.app.Service
    public void onCreate() {
        a.b(this);
        super.onCreate();
    }
}
