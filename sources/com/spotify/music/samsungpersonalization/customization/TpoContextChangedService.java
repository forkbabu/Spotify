package com.spotify.music.samsungpersonalization.customization;

import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;
import androidx.core.app.k;
import com.spotify.music.C0707R;
import dagger.android.g;
import io.reactivex.disposables.a;
import io.reactivex.y;
import io.reactivex.z;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

public final class TpoContextChangedService extends g {
    public static final /* synthetic */ int p = 0;
    public l a;
    public h2e b;
    public l2e c;
    public y f;
    public y n;
    private final a o = new a();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        h.e(intent, "intent");
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        l2e l2e = this.c;
        if (l2e != null) {
            l2e.b(C0707R.id.foreground_notification_id);
            this.o.dispose();
            return;
        }
        h.k("foregroundNotifier");
        throw null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        l2e l2e = this.c;
        if (l2e != null) {
            k kVar = new k(this, "spotify_updates_channel");
            kVar.i(getString(C0707R.string.tpo_context_updating_notification_title));
            kVar.z(C0707R.drawable.icn_notification);
            Notification a2 = kVar.a();
            h.d(a2, "builder.build()");
            l2e.e(C0707R.id.foreground_notification_id, a2);
            h2e h2e = this.b;
            if (h2e != null) {
                h2e.a(intent);
                a aVar = this.o;
                l lVar = this.a;
                if (lVar != null) {
                    z<List<m60>> b2 = ((m) lVar).b();
                    y yVar = this.n;
                    if (yVar != null) {
                        z<List<m60>> H = b2.H(yVar);
                        y yVar2 = this.f;
                        if (yVar2 != null) {
                            aVar.b(H.B(yVar2).I(10, TimeUnit.SECONDS).k(new i(this)).subscribe(new j(this), k.a));
                            return 2;
                        }
                        h.k("mainScheduler");
                        throw null;
                    }
                    h.k("ioScheduler");
                    throw null;
                }
                h.k("tpoContextFetcher");
                throw null;
            }
            h.k("serviceStarter");
            throw null;
        }
        h.k("foregroundNotifier");
        throw null;
    }
}
