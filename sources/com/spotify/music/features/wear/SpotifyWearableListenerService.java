package com.spotify.music.features.wear;

import android.content.Intent;
import com.google.android.gms.wearable.f;
import com.google.android.gms.wearable.g;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.media.h2;
import com.spotify.mobile.android.service.media.u2;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.mobile.android.service.media.z1;
import defpackage.yda;
import io.reactivex.a0;
import io.reactivex.c0;
import io.reactivex.d0;
import io.reactivex.functions.l;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.completable.CompletableDoFinally;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.y;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.j;

public final class SpotifyWearableListenerService extends g {
    private static final String y;
    private static final yda z;
    public ul1 q;
    public h2e r;
    public z1 s;
    public y t;
    public y u;
    private a v;
    private io.reactivex.disposables.b w;
    private final z<v1> x;

    /* access modifiers changed from: private */
    public final class a implements hg0<v1> {
        private final a0<v1> a;
        final /* synthetic */ SpotifyWearableListenerService b;

        public a(SpotifyWearableListenerService spotifyWearableListenerService, a0<v1> a0Var) {
            h.e(a0Var, "emitter");
            this.b = spotifyWearableListenerService;
            this.a = a0Var;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.hg0
        public void l(v1 v1Var) {
            v1 v1Var2 = v1Var;
            h.e(v1Var2, "serviceInterface");
            this.a.onSuccess(v1Var2);
        }

        @Override // defpackage.hg0
        public void onDisconnected() {
            this.b.stopSelf();
        }
    }

    static final class b<T> implements c0<v1> {
        final /* synthetic */ SpotifyWearableListenerService a;

        b(SpotifyWearableListenerService spotifyWearableListenerService) {
            this.a = spotifyWearableListenerService;
        }

        @Override // io.reactivex.c0
        public final void subscribe(a0<v1> a0Var) {
            h.e(a0Var, "emitter");
            SpotifyWearableListenerService spotifyWearableListenerService = this.a;
            spotifyWearableListenerService.v = new a(spotifyWearableListenerService, a0Var);
            SpotifyWearableListenerService spotifyWearableListenerService2 = this.a;
            z1 z1Var = spotifyWearableListenerService2.s;
            if (z1Var != null) {
                z1Var.p(spotifyWearableListenerService2.v);
                z1 z1Var2 = this.a.s;
                if (z1Var2 != null) {
                    z1Var2.i();
                } else {
                    h.k("externalIntegrationServiceClient");
                    throw null;
                }
            } else {
                h.k("externalIntegrationServiceClient");
                throw null;
            }
        }
    }

    static final class c<T, R> implements l<v1, d0<? extends zwd>> {
        final /* synthetic */ SpotifyWearableListenerService a;
        final /* synthetic */ String b;

        c(SpotifyWearableListenerService spotifyWearableListenerService, String str) {
            this.a = spotifyWearableListenerService;
            this.b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d0<? extends zwd> apply(v1 v1Var) {
            v1 v1Var2 = v1Var;
            h.e(v1Var2, "it");
            u2 u2Var = (u2) v1Var2.Z1(SpotifyWearableListenerService.z);
            u2Var.d();
            z<zwd> l = v1Var2.Z2().p(h2.c(this.b).b()).l(new a(u2Var));
            y yVar = this.a.t;
            if (yVar != null) {
                return l.B(yVar);
            }
            h.k("ioScheduler");
            throw null;
        }
    }

    static final class d implements io.reactivex.functions.a {
        final /* synthetic */ SpotifyWearableListenerService a;

        d(SpotifyWearableListenerService spotifyWearableListenerService) {
            this.a = spotifyWearableListenerService;
        }

        @Override // io.reactivex.functions.a
        public final void run() {
            this.a.stopSelf();
        }
    }

    static {
        String d2 = ((kotlin.jvm.internal.d) j.b(SpotifyWearableListenerService.class)).d();
        h.c(d2);
        y = d2;
        yda.b bVar = new yda.b("AndroidWear");
        bVar.l("wearable");
        bVar.q("wear_data_layer");
        z = bVar.k();
    }

    public SpotifyWearableListenerService() {
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        h.d(emptyDisposable, "Disposables.disposed()");
        this.w = emptyDisposable;
        z<v1> g = z.g(new b(this));
        h.d(g, "Single\n        .create {…lient.connect()\n        }");
        this.x = g;
    }

    @Override // com.google.android.gms.wearable.g
    public void l(f fVar) {
        byte[] I1;
        String valueOf = String.valueOf((fVar == null || (I1 = ((gw) fVar).I1()) == null) ? null : new String(I1, kotlin.text.a.a));
        boolean z2 = true;
        Logger.b("Got message: %s", valueOf);
        if (valueOf.length() <= 0) {
            z2 = false;
        }
        if (z2) {
            h2e h2e = this.r;
            if (h2e != null) {
                h.e(this, "context");
                h2e.b(this, new Intent(this, SpotifyWearableListenerService.class), y, new Object[0]);
                if (!this.w.d()) {
                    this.w.dispose();
                }
                i iVar = new i(this.x.s(new c(this, valueOf)));
                TimeUnit timeUnit = TimeUnit.MINUTES;
                y yVar = this.t;
                if (yVar != null) {
                    io.reactivex.a J = iVar.J(1, timeUnit, yVar);
                    y yVar2 = this.u;
                    if (yVar2 != null) {
                        io.reactivex.disposables.b subscribe = new CompletableDoFinally(J.G(yVar2), new d(this)).subscribe();
                        h.d(subscribe, "eisBinderSingle.flatMap …            }.subscribe()");
                        this.w = subscribe;
                        return;
                    }
                    h.k("mainScheduler");
                    throw null;
                }
                h.k("ioScheduler");
                throw null;
            }
            h.k("serviceStarter");
            throw null;
        }
    }

    @Override // com.google.android.gms.wearable.g, android.app.Service
    public void onCreate() {
        dagger.android.a.b(this);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        ul1 ul1 = this.q;
        if (ul1 != null) {
            ul1.f(this, y);
            z1 z1Var = this.s;
            if (z1Var != null) {
                z1Var.q(this.v);
                z1 z1Var2 = this.s;
                if (z1Var2 != null) {
                    if (z1Var2.l()) {
                        z1 z1Var3 = this.s;
                        if (z1Var3 != null) {
                            z1Var3.j();
                        } else {
                            h.k("externalIntegrationServiceClient");
                            throw null;
                        }
                    }
                    this.w.dispose();
                    return;
                }
                h.k("externalIntegrationServiceClient");
                throw null;
            }
            h.k("externalIntegrationServiceClient");
            throw null;
        }
        h.k("serviceForegroundManager");
        throw null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        h.e(intent, "intent");
        ul1 ul1 = this.q;
        if (ul1 != null) {
            String str = y;
            if (!ul1.c(str)) {
                ul1 ul12 = this.q;
                if (ul12 != null) {
                    ul12.e(this, str);
                } else {
                    h.k("serviceForegroundManager");
                    throw null;
                }
            }
            h2e h2e = this.r;
            if (h2e != null) {
                h2e.a(intent);
                return 2;
            }
            h.k("serviceStarter");
            throw null;
        }
        h.k("serviceForegroundManager");
        throw null;
    }
}
