package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.nowplaying.drivingmode.view.seekbar.e;
import com.spotify.nowplaying.ui.components.controls.seekbar.h;
import com.spotify.nowplaying.ui.components.overlay.OverlayHidingFrameLayout;
import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;
import io.reactivex.g;

/* renamed from: bvb  reason: default package */
public class bvb implements e.a {
    private final d a;
    private final g<PlayerState> b;
    private final g<dqd> c;
    private final h d;
    private final esb e;
    private final q f = new q();
    private boolean g;
    private double h = -1.0d;
    private String i;
    private e j;

    public bvb(d dVar, g<PlayerState> gVar, g<dqd> gVar2, esb esb, h hVar) {
        this.a = dVar;
        this.b = gVar;
        this.c = gVar2;
        this.d = hVar;
        this.e = esb;
    }

    public static void a(bvb bvb, dqd dqd) {
        if (!bvb.g) {
            bvb.j.setDuration((int) dqd.a());
            if (!bvb.e.a()) {
                ((OverlayHidingFrameLayout) bvb.j).a(true);
            }
            bvb.j.setPosition((int) dqd.b());
            bvb.j.setPositionText((int) dqd.b());
        }
    }

    public static void b(bvb bvb, PlayerState playerState) {
        bvb.getClass();
        bvb.i = playerState.track().get().uri();
        bvb.j.setSeekingEnabled(playerState.restrictions().disallowSeekingReasons().isEmpty());
        Optional<Double> playbackSpeed = playerState.playbackSpeed();
        Double valueOf = Double.valueOf(0.0d);
        if ((Math.abs(playbackSpeed.or(valueOf).doubleValue() - bvb.h) > 0.1d) || bvb.h < -0.1d) {
            if (playerState.playbackSpeed().or((Optional<Double>) valueOf).doubleValue() < 0.1d) {
                bvb.j.setAutoHide(false);
                ((OverlayHidingFrameLayout) bvb.j).a(true);
            } else {
                bvb.j.setAutoHide(true);
                ((OverlayHidingFrameLayout) bvb.j).a(true);
            }
        }
        bvb.h = playerState.playbackSpeed().or((Optional<Double>) valueOf).doubleValue();
    }

    public void c(int i2, boolean z) {
        this.g = z;
        if (!z) {
            this.d.q(this.i, i2);
            this.f.a(this.a.a(c.g((long) i2)).subscribe());
            return;
        }
        this.j.setPositionText(i2);
    }

    public void d(e eVar) {
        this.j = eVar;
        eVar.setListener(this);
        this.f.a(this.b.subscribe(new rub(this)));
        this.f.a(this.c.subscribe(new qub(this)));
    }

    public void e() {
        this.j.setListener(null);
        this.f.c();
    }
}
