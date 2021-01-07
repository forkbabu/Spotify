package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import com.spotify.music.container.app.foregroundstate.h;

/* renamed from: vl1  reason: default package */
public final class vl1 implements fjf<ul1> {
    private final wlf<Context> a;
    private final wlf<NotificationManager> b;
    private final wlf<h> c;

    public vl1(wlf<Context> wlf, wlf<NotificationManager> wlf2, wlf<h> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ul1(this.a.get(), this.b.get(), this.c.get());
    }
}
