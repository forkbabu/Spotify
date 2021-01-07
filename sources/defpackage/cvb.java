package defpackage;

import com.spotify.music.nowplaying.drivingmode.loggers.c;
import com.spotify.music.nowplaying.drivingmode.view.DrivingModeFragment;
import com.spotify.music.nowplaying.drivingmode.view.verticalsplitlayout.VerticalSplitLayout;
import com.spotify.music.nowplaying.drivingmode.view.verticalsplitlayout.d;
import com.spotify.music.nowplaying.drivingmode.view.verticalsplitlayout.e;

/* renamed from: cvb  reason: default package */
public class cvb {
    private final c a;
    private e b;
    private d c;
    private boolean d;

    public cvb(c cVar) {
        this.a = cVar;
    }

    public void a(float f, boolean z) {
        d dVar = this.c;
        if (dVar != null) {
            ((DrivingModeFragment) dVar).L4(f, false);
            if (f != 1.0f) {
                return;
            }
            if (z) {
                this.a.a();
            } else {
                this.a.c();
            }
        }
    }

    public void b(float f, boolean z) {
        d dVar = this.c;
        if (dVar != null) {
            ((DrivingModeFragment) dVar).L4(f, true);
            if (f != 1.0f) {
                return;
            }
            if (z) {
                this.a.d();
            } else if (this.d) {
                this.d = false;
            } else {
                this.a.f();
            }
        }
    }

    public void c(e eVar, d dVar) {
        this.b = eVar;
        this.c = dVar;
    }

    public void d() {
        this.b = null;
        this.c = null;
    }

    public void e() {
        e eVar = this.b;
        if (eVar != null) {
            ((VerticalSplitLayout) eVar).t();
        }
    }

    public void f(boolean z) {
        e eVar = this.b;
        if (eVar != null) {
            ((VerticalSplitLayout) eVar).u();
            if (z) {
                this.d = true;
                this.a.e();
            }
        }
    }
}
