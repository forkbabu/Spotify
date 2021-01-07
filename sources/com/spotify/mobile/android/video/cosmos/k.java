package com.spotify.mobile.android.video.cosmos;

import com.jakewharton.rxrelay2.PublishRelay;
import com.spotify.mobile.android.video.cosmos.VideoPlayerAdvanceReason;
import com.spotify.mobile.android.video.model.PlayerError;
import com.spotify.mobile.android.video.model.PlayerState;
import io.reactivex.a;
import io.reactivex.disposables.b;
import io.reactivex.internal.operators.observable.z;

public class k {
    public static final VideoPlayerAdvanceReason d = new VideoPlayerAdvanceReason(VideoPlayerAdvanceReason.Reason.FINISHED, null);
    public static final VideoPlayerAdvanceReason e;
    public static final VideoPlayerAdvanceReason f;
    private final PublishRelay<a> a = PublishRelay.g1();
    private final m b;
    private b c;

    static {
        VideoPlayerAdvanceReason.Reason reason = VideoPlayerAdvanceReason.Reason.UNPLAYABLE;
        e = new VideoPlayerAdvanceReason(reason, VideoPlayerAdvanceReason.UnplayableReason.APP_IN_BACKGROUND);
        new VideoPlayerAdvanceReason(reason, VideoPlayerAdvanceReason.UnplayableReason.DRIVER_DISTRACTED);
        new VideoPlayerAdvanceReason(reason, VideoPlayerAdvanceReason.UnplayableReason.MISSING_MANIFEST_ID);
        new VideoPlayerAdvanceReason(reason, VideoPlayerAdvanceReason.UnplayableReason.NOT_AVAILABLE_OFFLINE);
        f = new VideoPlayerAdvanceReason(reason, VideoPlayerAdvanceReason.UnplayableReason.NOT_AVAILABLE);
    }

    public k(m mVar) {
        this.b = mVar;
    }

    public void a() {
        b bVar = this.c;
        if (bVar != null && !bVar.d()) {
            this.c.dispose();
        }
    }

    public void b(VideoPlayerAdvanceReason videoPlayerAdvanceReason) {
        this.a.accept(this.b.c(videoPlayerAdvanceReason));
    }

    public void c(PlayerError playerError) {
        this.a.accept(this.b.b(playerError));
    }

    public void d(PlayerState playerState) {
        this.a.accept(this.b.d(playerState));
    }

    public void e() {
        b bVar = this.c;
        if (bVar == null || bVar.d()) {
            this.c = new z(this.a.U(h.a, 1)).q(e.a).subscribe(new f(this), g.a);
        }
    }
}
