package com.spotify.music.features.reportexplicit;

import com.spotify.android.paste.graphics.SpotifyIconV2;

public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ ReportTrackExplicitService a;
    public final /* synthetic */ SpotifyIconV2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ c(ReportTrackExplicitService reportTrackExplicitService, SpotifyIconV2 spotifyIconV2, int i) {
        this.a = reportTrackExplicitService;
        this.b = spotifyIconV2;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ReportTrackExplicitService reportTrackExplicitService = this.a;
        reportTrackExplicitService.c.a(this.b, this.c, 0);
    }
}
