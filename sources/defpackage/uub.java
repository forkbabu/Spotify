package defpackage;

import com.spotify.mobile.android.observablestates.docking.a;
import com.spotify.mobile.android.observablestates.docking.e;
import com.spotify.music.nowplaying.drivingmode.view.DrivingModeFragment;
import com.spotify.music.nowplaying.drivingmode.view.f;
import com.spotify.remoteconfig.AndroidLibsNowplayingDrivingProperties;
import com.spotify.rxjava2.p;
import io.reactivex.s;

/* renamed from: uub  reason: default package */
public class uub {
    private final e a;
    private final AndroidLibsNowplayingDrivingProperties b;
    private final p c = new p();
    private f d;

    public uub(e eVar, AndroidLibsNowplayingDrivingProperties androidLibsNowplayingDrivingProperties) {
        this.a = eVar;
        this.b = androidLibsNowplayingDrivingProperties;
    }

    public void a(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        int ordinal = this.b.a().ordinal();
        if (ordinal != 1) {
            booleanValue = ordinal == 2;
        }
        if (booleanValue) {
            ((DrivingModeFragment) this.d).O4(true);
        } else {
            ((DrivingModeFragment) this.d).O4(false);
        }
    }

    public void b(f fVar) {
        this.d = fVar;
        p pVar = this.c;
        e eVar = this.a;
        eVar.getClass();
        pVar.b(s.y(new a(eVar)).subscribe(new iub(this), jub.a));
    }

    public void c() {
        ((DrivingModeFragment) this.d).O4(false);
        this.c.a();
    }
}
