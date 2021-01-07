package com.spotify.music.alarmlauncher;

import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.o;
import com.spotify.music.C0707R;
import dagger.android.g;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.z;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class SpotifyServiceLauncherService extends g {
    public h2e a;
    public o b;
    public xd2 c;
    public l2e f;
    public cqe n;
    public h o;
    private b p;

    static final class a<T> implements io.reactivex.functions.g<f> {
        final /* synthetic */ SpotifyServiceLauncherService a;

        a(SpotifyServiceLauncherService spotifyServiceLauncherService) {
            this.a = spotifyServiceLauncherService;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(f fVar) {
            this.a.f();
        }
    }

    public SpotifyServiceLauncherService() {
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        h.d(emptyDisposable, "Disposables.disposed()");
        this.p = emptyDisposable;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void f() {
        l2e l2e = this.f;
        if (l2e != null) {
            l2e.b(C0707R.id.prepare_alarm_notification_id);
            this.p.dispose();
            stopSelf();
            return;
        }
        h.k("foregroundNotifier");
        throw null;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        h.e(intent, "intent");
        l2e l2e = this.f;
        if (l2e != null) {
            xd2 xd2 = this.c;
            if (xd2 != null) {
                l2e.e(C0707R.id.prepare_alarm_notification_id, xd2.a());
                long longExtra = intent.getLongExtra("com.spotify.music.EXTRA_SCHEDULED_LAUNCH", -1);
                h2e h2e = this.a;
                if (h2e != null) {
                    h.e(this, "context");
                    Intent intent2 = new Intent(this, SpotifyServiceLauncherService.class);
                    intent2.putExtra("com.spotify.music.EXTRA_SCHEDULED_LAUNCH", longExtra);
                    h2e.a(intent2);
                    if (longExtra > 0) {
                        cqe cqe = this.n;
                        if (cqe != null) {
                            long d = longExtra - cqe.d();
                            Logger.b("Scheduling SpotifyService launch in %d seconds", Long.valueOf(d / 1000));
                            new Handler(Looper.getMainLooper()).postDelayed(new f(this), d);
                            h hVar = this.o;
                            if (hVar != null) {
                                z g = z.g(new g(hVar));
                                h.d(g, "Single.create { newEmitt…mitter = newEmitter\n    }");
                                b subscribe = g.subscribe(new a(this));
                                h.d(subscribe, "spotifyServiceMonitorPlu… { stop() }\n            )");
                                this.p = subscribe;
                                return 2;
                            }
                            h.k("spotifyServiceMonitorPlugin");
                            throw null;
                        }
                        h.k("clock");
                        throw null;
                    }
                    f();
                    return 2;
                }
                h.k("serviceStarter");
                throw null;
            }
            h.k("notificationFactory");
            throw null;
        }
        h.k("foregroundNotifier");
        throw null;
    }
}
