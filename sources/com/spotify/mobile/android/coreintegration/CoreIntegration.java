package com.spotify.mobile.android.coreintegration;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.w;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.core.orbit.OrbitServiceInterface;
import com.spotify.core.orbit.OrbitServiceObserver;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.cosmos.router.internal.RemoteNativeRxRouter;
import com.spotify.localization.SpotifyLocale;
import com.spotify.mobile.android.cosmos.router.QueuingRemoteNativeRouter;
import com.spotify.mobile.android.service.o;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import com.spotify.music.storage.j;
import com.spotify.rxjava2.p;
import io.reactivex.y;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CoreIntegration {
    private final Context a;
    private final y b;
    private final t c;
    private final y d;
    private final wj7 e;
    private final o f;
    private final j g;
    private final StateRestoreFileDeleter h;
    private final f0 i;
    private final l01 j;
    private final qw9 k;
    private final d0 l;
    private final Lifecycle m;
    private final zw9 n;
    private OrbitServiceInterface o;
    private final CountDownLatch p = new CountDownLatch(1);
    private final CountDownLatch q = new CountDownLatch(1);
    private final Object r = new Object();
    private final p s = new p();
    private RxRouter t;
    private QueuingRemoteNativeRouter u;
    private CoreState v = CoreState.STOPPED;
    private final m w = new m() {
        /* class com.spotify.mobile.android.coreintegration.CoreIntegration.AnonymousClass1 */

        @w(Lifecycle.Event.ON_START)
        public void onStart() {
            CoreIntegration.a(CoreIntegration.this);
        }
    };
    private final OrbitServiceObserver x = new a();

    /* access modifiers changed from: private */
    public enum CoreState {
        STARTING,
        STARTED,
        FAILED_TO_START,
        STOPPING,
        STOPPED,
        FAILED_TO_STOP
    }

    class a extends OrbitServiceObserver {
        a() {
        }

        @Override // com.spotify.core.orbit.OrbitServiceObserver
        public void onIncognitoModeDisabledByTimer() {
            Logger.b("onIncognitoModeDisabledByTimer()", new Object[0]);
            CoreIntegration.this.e.a(CoreIntegration.this.f.d(CoreIntegration.this.a));
        }

        @Override // com.spotify.core.orbit.OrbitServiceObserver
        public void onOrbitStarted() {
            Logger.g("Orbit started", new Object[0]);
            CoreIntegration.this.o(CoreState.STARTED);
            CoreIntegration.this.p.countDown();
        }

        @Override // com.spotify.core.orbit.OrbitServiceObserver
        public void onOrbitStartupFailed(int i) {
            Logger.g("onOrbitStartupFailed: %d", Integer.valueOf(i));
            CoreIntegration.this.d.b(i);
            Assertion.g("Orbit failed to start. Error: " + i);
            CoreIntegration.this.o(CoreState.FAILED_TO_START);
            CoreIntegration.this.p.countDown();
        }

        @Override // com.spotify.core.orbit.OrbitServiceObserver
        public void onOrbitStopped() {
            Logger.g("Orbit stopped", new Object[0]);
            CoreIntegration.this.o(CoreState.STOPPED);
            CoreIntegration.this.q.countDown();
        }
    }

    CoreIntegration(Context context, y yVar, t tVar, y yVar2, wj7 wj7, o oVar, j jVar, StateRestoreFileDeleter stateRestoreFileDeleter, f0 f0Var, l01 l01, qw9 qw9, d0 d0Var, Lifecycle lifecycle, zw9 zw9) {
        this.a = context.getApplicationContext();
        this.b = yVar;
        this.c = tVar;
        this.d = yVar2;
        this.e = wj7;
        this.f = oVar;
        this.g = jVar;
        this.h = stateRestoreFileDeleter;
        this.i = f0Var;
        this.j = l01;
        this.k = qw9;
        this.l = d0Var;
        this.m = lifecycle;
        this.n = zw9;
    }

    static void a(CoreIntegration coreIntegration) {
        OrbitServiceInterface i2 = coreIntegration.i();
        if (i2.isCreated()) {
            Logger.b("Refreshing orbit, due to app foreground.", new Object[0]);
            i2.tryReconnectNow(false);
        }
    }

    private synchronized OrbitServiceInterface i() {
        OrbitServiceInterface orbitServiceInterface;
        orbitServiceInterface = this.o;
        if (orbitServiceInterface == null) {
            throw new IllegalStateException("OrbitService unavailable.");
        }
        return orbitServiceInterface;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void o(CoreState coreState) {
        this.v = coreState;
        this.n.p(coreState.name().toLowerCase(Locale.US));
    }

    private void q(QueuingRemoteNativeRouter queuingRemoteNativeRouter) {
        OrbitServiceInterface i2 = i();
        j jVar = this.g;
        jVar.getClass();
        String g2 = jVar.g();
        String f2 = jVar.f();
        this.h.a(g2);
        i2.setObserver(this.x);
        Logger.g("Starting Orbit", new Object[0]);
        Logger.g("Cache path: %s\nSettings path: %s", f2, g2);
        Logger.g("Core hash: %s", "2660b5d2e541ae6eb6d94b9a89d778243916b82f");
        String d2 = SpotifyLocale.d(this.a);
        DebugFlag debugFlag = DebugFlag.NATIVE_WAIT_FOR_DEBUGGER;
        i2.start(f2, g2, d2, false, false, queuingRemoteNativeRouter.getNativeRouter());
        RemoteNativeRxRouter remoteNativeRxRouter = new RemoteNativeRxRouter(queuingRemoteNativeRouter);
        this.t = remoteNativeRxRouter;
        this.s.b(this.j.a(remoteNativeRxRouter));
    }

    public QueuingRemoteNativeRouter j() {
        return this.u;
    }

    public /* synthetic */ void k() {
        CoreState coreState = CoreState.FAILED_TO_START;
        try {
            if (!this.p.await(10, TimeUnit.SECONDS)) {
                Logger.n("Orbit failed to signal startup after 10s.", new Object[0]);
                o(coreState);
            }
        } catch (InterruptedException unused) {
            o(coreState);
            Logger.n("Orbit start-up latch was interrupted.", new Object[0]);
        }
    }

    public /* synthetic */ void l() {
        this.m.a(this.w);
    }

    public /* synthetic */ void m() {
        this.m.c(this.w);
    }

    public void n() {
        this.s.a();
        this.t = null;
        Logger.g("Stopping orbit...", new Object[0]);
        i().stop();
        CoreState coreState = CoreState.FAILED_TO_STOP;
        try {
            if (!this.q.await(10, TimeUnit.SECONDS)) {
                Logger.n("Orbit failed to signal stop after 10s.", new Object[0]);
                o(coreState);
            }
        } catch (InterruptedException unused) {
            o(coreState);
            Logger.n("Orbit stop latch was interrupted.", new Object[0]);
        }
    }

    public synchronized boolean p() {
        CoreState coreState = CoreState.FAILED_TO_START;
        synchronized (this) {
            Optional<OrbitServiceInterface> a2 = this.l.a();
            if (a2.isPresent()) {
                this.o = a2.get();
                o(CoreState.STARTING);
                this.i.getClass();
                QueuingRemoteNativeRouter queuingRemoteNativeRouter = new QueuingRemoteNativeRouter();
                this.u = queuingRemoteNativeRouter;
                q(queuingRemoteNativeRouter);
                this.k.b(new m(this));
                CoreState coreState2 = this.v;
                if (coreState2 == CoreState.STARTED) {
                    queuingRemoteNativeRouter.onNativeRouterInitialized();
                    this.c.e(i());
                    this.b.b(new n(this));
                    return true;
                } else if (coreState2 == coreState) {
                    return false;
                } else {
                    throw new IllegalStateException("In a weird state while trying to start core: " + this.v.name());
                }
            } else {
                Logger.g("Unable to start core, as Orbit can not be loaded.", new Object[0]);
                o(coreState);
                return false;
            }
        }
    }

    public synchronized boolean r() {
        if (this.v != CoreState.STARTED) {
            Logger.g("Tried stopping core when its not started", new Object[0]);
            return false;
        }
        o(CoreState.STOPPING);
        this.b.b(new l(this));
        this.c.f();
        this.k.c(new o(this), 15000);
        CoreState coreState = this.v;
        if (coreState == CoreState.STOPPED) {
            synchronized (this.r) {
                QueuingRemoteNativeRouter queuingRemoteNativeRouter = this.u;
                if (queuingRemoteNativeRouter != null) {
                    queuingRemoteNativeRouter.destroy();
                    this.u = null;
                }
            }
            if (!ig0.b()) {
                i().destroy();
                Logger.g("Orbit has been shut down", new Object[0]);
            }
            return true;
        } else if (coreState == CoreState.FAILED_TO_STOP) {
            return false;
        } else {
            throw new IllegalStateException("In a weird state while trying to stop core: " + this.v.name());
        }
    }
}
