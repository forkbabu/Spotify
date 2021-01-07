package defpackage;

import com.spotify.music.nowplaying.drivingmode.loggers.DrivingContextMenuInteractionLoggerImpl;
import com.spotify.music.nowplaying.drivingmode.loggers.a;
import defpackage.pvb;

/* renamed from: yub  reason: default package */
public class yub implements pvb.a {
    private final k5a a;
    private final htb b;
    private final a c;
    private pvb d;

    public yub(k5a k5a, htb htb, DrivingContextMenuInteractionLoggerImpl drivingContextMenuInteractionLoggerImpl) {
        this.a = k5a;
        this.b = htb;
        this.c = drivingContextMenuInteractionLoggerImpl;
    }

    public void a() {
        this.d.cancel();
        ((DrivingContextMenuInteractionLoggerImpl) this.c).c();
    }

    public void b() {
        this.a.d();
        this.b.a();
        ((DrivingContextMenuInteractionLoggerImpl) this.c).a();
    }

    public void c(boolean z) {
        if (!z) {
            ((DrivingContextMenuInteractionLoggerImpl) this.c).b();
        }
    }

    public void d(pvb pvb) {
        pvb.getClass();
        this.d = pvb;
        ((nvb) pvb).c(this);
    }
}
