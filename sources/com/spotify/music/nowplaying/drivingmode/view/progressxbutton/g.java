package com.spotify.music.nowplaying.drivingmode.view.progressxbutton;

import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.music.nowplaying.drivingmode.loggers.d;
import com.spotify.music.nowplaying.drivingmode.presenter.voice.DrivingVoiceState;
import com.spotify.music.nowplaying.drivingmode.view.progressxbutton.h;
import com.spotify.music.nowplaying.drivingmode.view.voicebottomsheet.DrivingVoiceBottomSheetView;
import com.spotify.music.nowplaying.drivingmode.view.voicebottomsheet.c;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;
import io.reactivex.y;

public class g implements h.a {
    private final e a;
    private final io.reactivex.g<PlayerState> b;
    private final wlf<Player> c;
    private final y d;
    private final d e;
    private final q f = new q();
    private c g;
    private h h;
    private DrivingVoiceState i;
    private boolean j;
    private boolean k;

    public g(y yVar, e eVar, io.reactivex.g<PlayerState> gVar, wlf<Player> wlf, d dVar) {
        this.d = yVar;
        this.a = eVar;
        this.b = gVar;
        this.c = wlf;
        this.e = dVar;
    }

    public static void a(g gVar, int i2) {
        if (i2 == 360) {
            ((DrivingVoiceBottomSheetView) gVar.g).C();
            gVar.f.c();
            return;
        }
        ((DrivingProgressXButton) gVar.h).c(i2);
    }

    public static void b(g gVar, PlayerState playerState) {
        if (gVar.k && !playerState.isPaused()) {
            DrivingVoiceState drivingVoiceState = gVar.i;
            if (drivingVoiceState == DrivingVoiceState.SUCCESS || (drivingVoiceState == DrivingVoiceState.ERROR && gVar.j)) {
                gVar.g();
                gVar.k = false;
            }
        }
    }

    public void c() {
        this.e.g();
        ((DrivingVoiceBottomSheetView) this.g).C();
        this.f.c();
    }

    public void d(h hVar, c cVar) {
        this.h = hVar;
        this.g = cVar;
        hVar.setListener(this);
        this.f.a(this.b.subscribe(new d(this)));
        LegacyPlayerState lastPlayerState = this.c.get().getLastPlayerState();
        this.j = lastPlayerState != null && !lastPlayerState.isPaused();
    }

    public void e() {
        this.f.c();
    }

    public void f(DrivingVoiceState drivingVoiceState) {
        this.i = drivingVoiceState;
        if (drivingVoiceState == DrivingVoiceState.LISTENING) {
            this.f.c();
            ((DrivingProgressXButton) this.h).setProgressDrawable(null);
        } else if (drivingVoiceState != DrivingVoiceState.ERROR || this.j) {
            this.k = true;
        } else {
            g();
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        this.f.c();
        this.f.a(this.a.a().o0(this.d).subscribe(new c(this)));
    }
}
