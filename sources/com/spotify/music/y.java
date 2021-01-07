package com.spotify.music;

import android.app.Application;
import android.os.Handler;
import android.os.HandlerThread;
import com.spotify.core.http.HttpConnection;
import com.spotify.http.w;
import com.spotify.instrumentation.navigation.logger.NavigationLoggerApplicationInstaller;
import com.spotify.libs.instrumentation.performance.m;
import com.spotify.mobile.android.core.internal.HttpConnectionFactoryImpl;
import com.spotify.mobile.android.orbit.OrbitLibraryLoader;
import com.spotify.mobile.android.spotlets.uitooling.a;
import com.spotify.music.container.app.foregroundstate.AppUiForegroundState;
import com.spotify.music.internal.util.process.ProcessType;
import com.spotify.music.libs.facebook.q;

public final class y {
    private final Application a;
    private final zw1 b;
    private final gj9 c;
    private final NavigationLoggerApplicationInstaller d;
    private final q e;
    private final w f;
    private final w0 g;
    private final xhd h;
    private final ProcessType i;
    private final OrbitLibraryLoader j;
    private final AppUiForegroundState k;
    private final x70 l;
    private final b28 m;

    y(Application application, zw1 zw1, gj9 gj9, NavigationLoggerApplicationInstaller navigationLoggerApplicationInstaller, q qVar, w wVar, w0 w0Var, xhd xhd, ProcessType processType, OrbitLibraryLoader orbitLibraryLoader, a aVar, AppUiForegroundState appUiForegroundState, x70 x70, b28 b28) {
        this.a = application;
        this.b = zw1;
        this.c = gj9;
        this.d = navigationLoggerApplicationInstaller;
        this.e = qVar;
        this.f = wVar;
        this.g = w0Var;
        this.h = xhd;
        this.i = processType;
        this.j = orbitLibraryLoader;
        this.k = appUiForegroundState;
        this.l = x70;
        this.m = b28;
    }

    /* access modifiers changed from: package-private */
    public void a(m mVar) {
        Handler handler;
        this.g.c("dmi_initApplication");
        r50.a(this.a);
        ProcessType processType = this.i;
        ProcessType processType2 = ProcessType.MAIN;
        if (processType == processType2) {
            HandlerThread handlerThread = new HandlerThread("AppInitThread");
            handlerThread.start();
            handler = new Handler(handlerThread.getLooper());
        } else {
            handler = null;
        }
        this.g.b(this.a, mVar);
        if (handler != null) {
            handler.post(new b(this));
        }
        if (this.i == processType2) {
            this.j.startLibraryLoading(this.a, new OrbitLibraryLoader.LibraryLoader());
            HttpConnection.initialize(new HttpConnectionFactoryImpl(this.f.c()));
        }
        this.a.registerActivityLifecycleCallbacks(this.b);
        this.a.registerActivityLifecycleCallbacks(this.c);
        this.a.registerActivityLifecycleCallbacks(this.m);
        this.l.a(this.a.getApplicationContext());
        this.d.b(this.a);
        this.k.c();
        if (handler != null) {
            handler.post(new c(this));
        }
        this.g.a("dmi_initApplication");
    }

    public /* synthetic */ void b() {
        this.h.o(this.a);
    }

    public /* synthetic */ void c() {
        this.e.c(this.a);
    }
}
