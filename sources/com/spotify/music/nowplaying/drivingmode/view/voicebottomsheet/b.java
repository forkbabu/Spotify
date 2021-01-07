package com.spotify.music.nowplaying.drivingmode.view.voicebottomsheet;

import com.spotify.music.nowplaying.drivingmode.loggers.d;
import com.spotify.music.nowplaying.drivingmode.view.DrivingModeVoiceFragment;
import com.spotify.music.nowplaying.drivingmode.view.voicebottomsheet.c;
import com.spotify.music.nowplaying.drivingmode.view.voiceview.f;

public class b implements c.a {
    private final d a;
    private c b;
    private com.spotify.music.nowplaying.drivingmode.view.voiceview.c c;
    private f d;

    public b(d dVar) {
        this.a = dVar;
    }

    public void a() {
        ((DrivingVoiceBottomSheetView) this.b).B();
    }

    public void b() {
        this.a.d();
        ((DrivingModeVoiceFragment) this.c).K4();
    }

    public void c() {
        ((DrivingModeVoiceFragment) this.c).K4();
    }

    public void d() {
        this.a.b();
        ((DrivingModeVoiceFragment) this.c).K4();
    }

    public void e(float f) {
        ((DrivingModeVoiceFragment) this.d).M4((f + 1.0f) * 0.5f);
    }

    public void f(c cVar, com.spotify.music.nowplaying.drivingmode.view.voiceview.c cVar2, f fVar) {
        this.b = cVar;
        this.c = cVar2;
        this.d = fVar;
        ((DrivingModeVoiceFragment) fVar).M4(0.0f);
    }
}
