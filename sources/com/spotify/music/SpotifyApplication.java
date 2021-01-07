package com.spotify.music;

import android.content.Context;
import android.os.SystemClock;
import androidx.multidex.MultiDex;
import com.google.android.exoplayer2.util.g;
import com.google.android.play.core.missingsplits.a;
import com.google.protobuf.u;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.instrumentation.performance.m;
import com.spotify.messages.AndroidLowMemory;
import com.spotify.music.libs.performance.tracking.s;
import com.spotify.remoteconfig.client.worker.b;
import dagger.android.c;

public class SpotifyApplication extends c implements b {
    wlf<ov9> b;
    wlf<y> c;
    wlf<e0e> f;
    gl0<u> n;
    s o;
    a p;
    private final m q = new m();
    private final aqe r = new aqe();

    @Override // com.spotify.remoteconfig.client.worker.b
    public e0e a() {
        Logger.g("Providing remote configuration.", new Object[0]);
        return this.f.get();
    }

    /* access modifiers changed from: protected */
    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        MultiDex.install(this);
        m mVar = this.q;
        this.r.getClass();
        mVar.b(SystemClock.elapsedRealtime());
    }

    /* access modifiers changed from: protected */
    @Override // dagger.android.c
    public dagger.android.b<? extends c> b() {
        return o03.vd().a(this);
    }

    public /* synthetic */ void d() {
        super.onCreate();
    }

    @Override // dagger.android.c, android.app.Application
    public void onCreate() {
        Logger.g("onCreate", new Object[0]);
        if (!this.p.a()) {
            m mVar = this.q;
            this.r.getClass();
            mVar.c(SystemClock.elapsedRealtime());
            g.r(new s(this));
            this.b.get().a();
            this.c.get().a(this.q);
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        Logger.g("onTrimMemory", new Object[0]);
        super.onTrimMemory(i);
        if (this.o.b(i)) {
            gl0<u> gl0 = this.n;
            AndroidLowMemory.b i2 = AndroidLowMemory.i();
            i2.m(i);
            gl0.c(i2.build());
        }
    }
}
