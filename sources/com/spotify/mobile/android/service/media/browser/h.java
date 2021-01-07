package com.spotify.mobile.android.service.media.browser;

import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.Show;

public final /* synthetic */ class h implements sg0 {
    public static final /* synthetic */ h a = new h();

    private /* synthetic */ h() {
    }

    @Override // defpackage.sg0
    public final Object apply(Object obj) {
        Episode episode = (Episode) obj;
        Show w = episode.w();
        if (w != null) {
            return w.h();
        }
        return episode.d();
    }
}
