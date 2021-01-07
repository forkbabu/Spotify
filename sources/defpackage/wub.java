package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.InterruptionUtil;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.music.nowplaying.drivingmode.view.ads.DrivingAdNowPlayingBar;
import com.spotify.music.nowplaying.drivingmode.view.ads.a;
import com.spotify.player.model.ContextTrack;
import com.spotify.rxjava2.p;
import io.reactivex.g;

/* renamed from: wub  reason: default package */
public class wub {
    private final g<ContextTrack> a;
    private final p b = new p();
    private boolean c;
    private a d;

    public wub(g<ContextTrack> gVar) {
        this.a = gVar;
    }

    private static boolean a(ContextTrack contextTrack) {
        return PlayerTrackUtil.isAd(ixd.b(contextTrack)) || InterruptionUtil.isInterruptionUri(contextTrack.uri());
    }

    public static void b(wub wub, ContextTrack contextTrack) {
        wub.getClass();
        if (a(contextTrack) && !wub.c) {
            wub.c = true;
            ((DrivingAdNowPlayingBar) wub.d).V();
        } else if (!a(contextTrack) && wub.c) {
            wub.c = false;
            ((DrivingAdNowPlayingBar) wub.d).G();
        }
    }

    public void c(a aVar) {
        this.d = aVar;
        this.b.b(this.a.subscribe(new nub(this)));
    }

    public void d() {
        this.b.a();
    }
}
