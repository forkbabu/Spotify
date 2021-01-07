package com.spotify.music.features.nowplayingbar.view.carousel;

import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import com.spotify.music.features.nowplayingbar.view.TrackInfoView;

public class NowPlayingBarTrackViewHolder extends e<ou5> {
    private final TrackInfoView C;
    private TrackDisplayMode D = TrackDisplayMode.TWO_LINE_METADATA;

    /* access modifiers changed from: package-private */
    public enum TrackDisplayMode {
        ONE_LINE_METADATA,
        TWO_LINE_METADATA
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    NowPlayingBarTrackViewHolder(android.view.ViewGroup r2) {
        /*
            r1 = this;
            r0 = 2131624677(0x7f0e02e5, float:1.887654E38)
            android.view.View r2 = com.spotify.mobile.android.spotlets.common.recyclerview.e.j0(r0, r2)
            r1.<init>(r2)
            com.spotify.music.features.nowplayingbar.view.carousel.NowPlayingBarTrackViewHolder$TrackDisplayMode r0 = com.spotify.music.features.nowplayingbar.view.carousel.NowPlayingBarTrackViewHolder.TrackDisplayMode.TWO_LINE_METADATA
            r1.D = r0
            r0 = 2131431772(0x7f0b115c, float:1.8485283E38)
            android.view.View r2 = r2.findViewById(r0)
            com.spotify.music.features.nowplayingbar.view.TrackInfoView r2 = (com.spotify.music.features.nowplayingbar.view.TrackInfoView) r2
            r1.C = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.nowplayingbar.view.carousel.NowPlayingBarTrackViewHolder.<init>(android.view.ViewGroup):void");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e
    public /* bridge */ /* synthetic */ void h0(ou5 ou5, int i) {
        u0(ou5);
    }

    public void u0(ou5 ou5) {
        int ordinal = this.D.ordinal();
        if (ordinal == 0) {
            this.C.setTrackInfoOneLine(e.b(this.a.getContext(), ou5).toString());
        } else if (ordinal == 1) {
            this.C.a(ou5.h(this.C.getResources()), MoreObjects.nullToEmpty(ou5.f(this.C.getResources())));
        }
    }

    public void v0(TrackDisplayMode trackDisplayMode) {
        this.D = trackDisplayMode;
    }
}
