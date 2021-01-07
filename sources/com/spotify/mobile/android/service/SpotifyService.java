package com.spotify.mobile.android.service;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.w;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.libs.instrumentation.performance.ColdStartTracker;
import com.spotify.mobile.android.coreintegration.BackgroundFeaturesStatus;
import com.spotify.mobile.android.coreintegration.CoreIntegration;
import com.spotify.mobile.android.coreintegration.TaskRemovedStatus;
import com.spotify.mobile.android.coreintegration.k0;
import com.spotify.mobile.android.service.feature.q;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.video.v;
import com.spotify.music.C0707R;
import com.spotify.music.libs.mediasession.m0;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.h;

public class SpotifyService extends Service {
    public static final /* synthetic */ int U = 0;
    Lifecycle A;
    k0 B;
    m C;
    r D;
    boolean E;
    q F;
    Looper G;
    io.reactivex.subjects.a<BackgroundFeaturesStatus> H;
    io.reactivex.subjects.a<TaskRemovedStatus> I;
    private boolean J;
    private boolean K;
    private int L;
    private final io.reactivex.subjects.a<SpotifyServiceCommandHandlingStatus> M = io.reactivex.subjects.a.i1(SpotifyServiceCommandHandlingStatus.IDLE);
    private final m N = new m() {
        /* class com.spotify.mobile.android.service.SpotifyService.AnonymousClass1 */

        @w(Lifecycle.Event.ON_START)
        public void onStart() {
            SpotifyService.a(SpotifyService.this);
        }
    };
    private Optional<SessionState> O = Optional.absent();
    private final kb1 P;
    private final ib1 Q;
    private final jb1 R;
    private final lb1 S;
    private final hb1 T;
    private final AtomicReference<Intent> a = new AtomicReference<>();
    private final t b = new e(null);
    private io.reactivex.disposables.b c = EmptyDisposable.INSTANCE;
    a0 f;
    CoreIntegration n;
    m0 o;
    yn1 p;
    aw8 q;
    l2e r;
    wlf<com.spotify.player.controls.d> s;
    Map<String, SpotifyServiceIntentProcessor> t;
    i u;
    v v;
    h2e w;
    zw9 x;
    z y;
    ColdStartTracker z;

    class a implements kb1 {
        a() {
        }

        @Override // defpackage.kb1
        public void a() {
            Logger.b("ServiceActions.onServiceCreate", new Object[0]);
            SpotifyService.this.n();
        }

        @Override // defpackage.kb1
        public void b() {
            SpotifyService spotifyService = SpotifyService.this;
            if (!spotifyService.E) {
                spotifyService.l();
            }
        }
    }

    class b implements ib1 {
        b() {
        }

        @Override // defpackage.ib1
        public void a() {
            Logger.b("CoreActions.stopCore", new Object[0]);
            SpotifyService.e(SpotifyService.this);
        }

        @Override // defpackage.ib1
        public void b() {
            Logger.b("CoreActions.startCore", new Object[0]);
            SpotifyService spotifyService = SpotifyService.this;
            int i = SpotifyService.U;
            spotifyService.getClass();
        }
    }

    class c implements jb1 {
        c() {
        }

        @Override // defpackage.jb1
        public void a() {
            Logger.b("CorePluginActions.startCorePlugins", new Object[0]);
            SpotifyService.this.m();
        }

        @Override // defpackage.jb1
        public void b() {
            Logger.b("CorePluginActions.stopCorePlugins", new Object[0]);
            SpotifyService.this.o();
        }
    }

    class d implements lb1 {
        d() {
        }

        @Override // defpackage.lb1
        public void a() {
            Logger.b("SessionPluginActions.startSessionPlugins", new Object[0]);
            SpotifyService.f(SpotifyService.this);
            SpotifyService.g(SpotifyService.this);
            SpotifyService spotifyService = SpotifyService.this;
            spotifyService.getClass();
            Logger.g("performStartSessionPlugins", new Object[0]);
            spotifyService.z.p("pss_session_plugins");
            ColdStartTracker coldStartTracker = spotifyService.z;
            e eVar = new e(spotifyService);
            coldStartTracker.B("tdsss_plugins");
            eVar.run();
            coldStartTracker.e("tdsss_plugins");
        }

        @Override // defpackage.lb1
        public void b() {
            Logger.b("SessionPluginActions.stopSessionPlugins", new Object[0]);
            SpotifyService spotifyService = SpotifyService.this;
            int i = SpotifyService.U;
            spotifyService.getClass();
            Logger.g("performStopSessionPlugins", new Object[0]);
            for (com.spotify.mobile.android.service.plugininterfaces.d dVar : spotifyService.v.a()) {
                dVar.g();
            }
            SpotifyService spotifyService2 = SpotifyService.this;
            spotifyService2.getClass();
            Logger.g("stopSessionDependentInfrastructure", new Object[0]);
            spotifyService2.o.stop();
        }
    }

    private class e implements t {
        e(AnonymousClass1 r2) {
        }

        @Override // com.spotify.mobile.android.service.t
        public void a() {
            SpotifyService spotifyService = SpotifyService.this;
            int i = SpotifyService.U;
            spotifyService.getClass();
            Logger.g("handleLogout", new Object[0]);
            for (com.spotify.mobile.android.service.plugininterfaces.c cVar : spotifyService.D.a()) {
                ColdStartTracker coldStartTracker = spotifyService.z;
                cVar.getClass();
                String str = "dssfc_" + cVar.name().toLowerCase(Locale.US);
                coldStartTracker.B(str);
                cVar.b();
                coldStartTracker.e(str);
            }
            SpotifyService.this.O = Optional.absent();
            SpotifyService.this.T.e();
        }

        @Override // com.spotify.mobile.android.service.t
        public void b(SessionState sessionState) {
            SpotifyService.this.z.p("pss_session_loggedin");
            SpotifyService.this.O = Optional.of(sessionState);
            SpotifyService.this.T.d();
        }
    }

    public SpotifyService() {
        a aVar = new a();
        this.P = aVar;
        b bVar = new b();
        this.Q = bVar;
        c cVar = new c();
        this.R = cVar;
        d dVar = new d();
        this.S = dVar;
        this.T = new hb1(aVar, bVar, cVar, dVar);
    }

    static void a(SpotifyService spotifyService) {
        if (!spotifyService.T.c()) {
            spotifyService.T.h();
        }
    }

    static void e(SpotifyService spotifyService) {
        spotifyService.getClass();
        Logger.g("performStopCore", new Object[0]);
        if (spotifyService.E) {
            spotifyService.l();
        }
        spotifyService.stopSelf();
        spotifyService.x.w(false);
    }

    static void f(SpotifyService spotifyService) {
        if (spotifyService.O.isPresent()) {
            Logger.g("startSessionDependentInfrastructure", new Object[0]);
            spotifyService.B.b(spotifyService.O.get());
            spotifyService.o.i(spotifyService.s.get());
        }
    }

    static void g(SpotifyService spotifyService) {
        Intent andSet = spotifyService.a.getAndSet(null);
        if (andSet != null) {
            Logger.l("Resubmitting %s", andSet);
            h.e(andSet, "intent");
            if (andSet.getBooleanExtra("needs_foreground_start", false)) {
                spotifyService.w.b(spotifyService, andSet, "SpotifyService", new Object[0]);
            } else {
                spotifyService.startService(andSet);
            }
        }
    }

    private void h(String str) {
        Logger.d("SpotifyService dying in panic, reason : %s", str);
        Assertion.g(str);
        stopSelf();
        this.x.w(false);
        Process.killProcess(Process.myPid());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void l() {
        this.A.c(this.N);
        this.x.u();
        this.o.d();
        if (this.K) {
            boolean z2 = !this.n.r();
            this.J = z2;
            if (z2) {
                h("Orbit service unable to stop");
            }
        }
        if (!ig0.b()) {
            Looper looper = this.G;
            if (Build.VERSION.SDK_INT >= 18) {
                looper.quitSafely();
            } else {
                looper.quit();
            }
        }
        this.C.b();
    }

    private void p(Runnable runnable) {
        v vVar = new v(new h(runnable));
        v.b d2 = vVar.d();
        this.q.c(vVar);
        d2.a();
    }

    public void i() {
        Logger.b("dispatchShutdownConditionsMet() invoked.", new Object[0]);
        hb1 hb1 = this.T;
        hb1.getClass();
        p(new b(hb1));
    }

    public s<SpotifyServiceCommandHandlingStatus> j() {
        return this.M;
    }

    public /* synthetic */ void k() {
        this.T.a();
        this.H.onNext(BackgroundFeaturesStatus.NOT_RUNNING);
        Logger.g("Service has been destroyed", new Object[0]);
    }

    public void m() {
        Logger.g("performStartCorePlugins", new Object[0]);
        this.z.p("pss_core_plugins");
        ColdStartTracker coldStartTracker = this.z;
        d dVar = new d(this);
        coldStartTracker.B("tdssc_plugins");
        dVar.run();
        coldStartTracker.e("tdssc_plugins");
        this.c = this.p.a().subscribe(new u(this.b));
    }

    public void n() {
        this.C.a();
        this.C.c();
        if (this.K) {
            boolean p2 = this.n.p();
            this.J = p2;
            if (p2) {
                Logger.g("Service fully started", new Object[0]);
            } else {
                h("Orbit service unable to start");
            }
        }
    }

    public void o() {
        Logger.g("performStopCorePlugins", new Object[0]);
        for (com.spotify.mobile.android.service.plugininterfaces.b bVar : this.u.a()) {
            bVar.c();
        }
        Logger.g("performStopCorePlugins: Stopping services", new Object[0]);
        this.c.dispose();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Logger.g("onBind called with intent: %s", intent);
        this.T.h();
        this.L++;
        this.x.v(true);
        if (intent == null || !Cosmos.ACTION_COSMOS_PROXY.equals(intent.getAction())) {
            return this.f;
        }
        if (this.K) {
            return this.n.j();
        }
        throw new IllegalStateException("Use RxCoreIntegration instead to get the router, instead of binding to SpotifyService");
    }

    @Override // android.app.Service
    public void onCreate() {
        Logger.g("Creating service", new Object[0]);
        long t2 = ColdStartTracker.t();
        dagger.android.a.b(this);
        this.K = !this.F.a();
        this.H.onNext(BackgroundFeaturesStatus.RUNNING);
        this.I.onNext(TaskRemovedStatus.NOT_REMOVED);
        this.z.p("pss_create_after_injection");
        this.z.r("dss_OnCreateInjection", ColdStartTracker.t() - t2);
        this.y.getClass();
        super.onCreate();
        setTheme(C0707R.style.res_2132083497_theme_glue);
        this.A.a(this.N);
    }

    @Override // android.app.Service
    public void onDestroy() {
        Logger.g("Destroying service", new Object[0]);
        this.y.getClass();
        p(new f(this));
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        super.onRebind(intent);
        Logger.g("onRebind called with intent: %s", intent);
        this.L++;
        this.x.v(true);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        Logger.g("onStartCommand called with intent: %s", intent);
        this.a.getAndSet(null);
        this.T.h();
        this.x.w(true);
        if (intent == null) {
            return 2;
        }
        this.r.a(intent);
        this.w.a(intent);
        if (this.K && !this.J) {
            Logger.d("Core not started - ignoring command", new Object[0]);
            return 2;
        } else if (intent.getAction() == null) {
            return 2;
        } else {
            String action = intent.getAction();
            this.M.onNext(SpotifyServiceCommandHandlingStatus.HANDLING);
            Logger.g("Processing intent %s", intent);
            SpotifyServiceIntentProcessor spotifyServiceIntentProcessor = this.t.get(action);
            if (spotifyServiceIntentProcessor != null) {
                l2e l2e = this.r;
                l2e.getClass();
                SpotifyServiceIntentProcessor.Result b2 = spotifyServiceIntentProcessor.b(this.O.isPresent(), intent, new c(l2e));
                Logger.l("Result for processing %s", b2);
                if (b2 == SpotifyServiceIntentProcessor.Result.NOT_PROCESSED) {
                    Logger.g("Intent processing did not complete, retaining intent %s until onLogin is done.", intent);
                    this.a.set(intent);
                }
            } else {
                Assertion.h("Handling unexpected intent", action);
            }
            this.M.onNext(SpotifyServiceCommandHandlingStatus.IDLE);
            return 2;
        }
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        Logger.g("Shutting down client since the task was removed!", new Object[0]);
        Logger.b("dispatchShutdownConditionsMet() invoked.", new Object[0]);
        hb1 hb1 = this.T;
        hb1.getClass();
        p(new b(hb1));
        this.I.onNext(TaskRemovedStatus.REMOVED);
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        Logger.g("Last bind of \"%s\" disconnected!", intent.getAction());
        int i = this.L - 1;
        this.L = i;
        if (i == 0) {
            Logger.g("All bindings are disconnected!", new Object[0]);
            this.x.v(false);
        }
        return true;
    }
}
