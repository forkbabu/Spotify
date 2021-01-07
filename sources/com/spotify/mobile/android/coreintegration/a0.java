package com.spotify.mobile.android.coreintegration;

import android.app.ActivityManager;
import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.connect.providers.t;
import com.spotify.mobile.android.service.o;
import com.spotify.rxjava2.p;
import io.reactivex.y;
import java.util.Iterator;

/* access modifiers changed from: package-private */
public class a0 {
    private final p a = new p();
    private final Context b;
    private final t c;
    private final y d;
    private final h2e e;
    private final o f;

    a0(Context context, t tVar, y yVar, h2e h2e, o oVar) {
        this.b = context.getApplicationContext();
        this.c = tVar;
        this.d = yVar;
        this.e = h2e;
        this.f = oVar;
    }

    public void a(Boolean bool) {
        boolean z;
        Logger.g("Playback started, explicitly starting service", new Object[0]);
        Iterator<ActivityManager.RunningServiceInfo> it = ((ActivityManager) this.b.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE).iterator();
        while (true) {
            if (it.hasNext()) {
                if ("com.spotify.mobile.android.service.SpotifyService".equals(it.next().service.getClassName())) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            h2e h2e = this.e;
            Context context = this.b;
            h2e.b(context, this.f.c(context, "com.spotify.mobile.android.service.action.START_SERVICE"), "MusicServiceStarter", new Object[0]);
        }
    }

    public void b() {
        this.a.b(this.c.a().Q(d.a).o0(this.d).subscribe(new p(this)));
    }

    public void c() {
        this.a.a();
    }
}
