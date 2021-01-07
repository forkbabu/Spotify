package com.spotify.music.features.playlistwebview;

import com.comscore.util.crashreport.CrashReportManager;
import java.util.concurrent.Callable;

public final /* synthetic */ class a implements Callable {
    public final /* synthetic */ PlaylistWebViewFragment a;

    public /* synthetic */ a(PlaylistWebViewFragment playlistWebViewFragment) {
        this.a = playlistWebViewFragment;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.x0.a(CrashReportManager.TIME_WINDOW);
    }
}
