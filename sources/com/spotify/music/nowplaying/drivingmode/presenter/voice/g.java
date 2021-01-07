package com.spotify.music.nowplaying.drivingmode.presenter.voice;

import com.spotify.music.connection.g;
import com.spotify.music.nowplaying.drivingmode.loggers.d;
import com.spotify.music.nowplaying.drivingmode.view.DrivingModeFragment;
import com.spotify.music.nowplaying.drivingmode.view.showvoiceviewbutton.DrivingShowVoiceViewButton;
import com.spotify.music.nowplaying.drivingmode.view.showvoiceviewbutton.DrivingShowVoiceViewButtonViewBinder;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;

public class g implements DrivingShowVoiceViewButtonViewBinder.a {
    private final h a;
    private final d b;
    private final s<com.spotify.music.connection.g> c;
    private com.spotify.music.nowplaying.drivingmode.view.voiceview.d d;
    private DrivingShowVoiceViewButtonViewBinder[] e;
    private b f = EmptyDisposable.INSTANCE;

    public g(h hVar, d dVar, s<com.spotify.music.connection.g> sVar) {
        this.a = hVar;
        this.b = dVar;
        this.c = sVar;
    }

    public static void a(g gVar, com.spotify.music.connection.g gVar2) {
        DrivingShowVoiceViewButtonViewBinder[] drivingShowVoiceViewButtonViewBinderArr = gVar.e;
        for (DrivingShowVoiceViewButtonViewBinder drivingShowVoiceViewButtonViewBinder : drivingShowVoiceViewButtonViewBinderArr) {
            if (drivingShowVoiceViewButtonViewBinder != null) {
                gVar2.getClass();
                drivingShowVoiceViewButtonViewBinder.setMicButtonEnabled(gVar2 instanceof g.c);
            }
        }
    }

    public void b(DrivingShowVoiceViewButtonViewBinder.Type type) {
        int ordinal = type.ordinal();
        if (ordinal == 1) {
            this.b.f();
        } else if (ordinal == 2) {
            this.b.a();
        }
        ((DrivingModeFragment) this.d).N4();
    }

    public void c(com.spotify.music.nowplaying.drivingmode.view.voiceview.d dVar, DrivingShowVoiceViewButtonViewBinder... drivingShowVoiceViewButtonViewBinderArr) {
        this.d = dVar;
        this.e = drivingShowVoiceViewButtonViewBinderArr;
        this.f = this.c.subscribe(new a(this));
        for (DrivingShowVoiceViewButtonViewBinder drivingShowVoiceViewButtonViewBinder : drivingShowVoiceViewButtonViewBinderArr) {
            if (drivingShowVoiceViewButtonViewBinder != null) {
                drivingShowVoiceViewButtonViewBinder.setListener(this);
                if (this.a.a()) {
                    ((DrivingShowVoiceViewButton) drivingShowVoiceViewButtonViewBinder).setVisibility(0);
                } else {
                    ((DrivingShowVoiceViewButton) drivingShowVoiceViewButtonViewBinder).setVisibility(8);
                }
            }
        }
    }

    public void d() {
        this.f.dispose();
    }
}
