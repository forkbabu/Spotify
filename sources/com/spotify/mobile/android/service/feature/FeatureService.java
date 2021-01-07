package com.spotify.mobile.android.service.feature;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.CosmosServiceIntentBuilder;
import com.spotify.libs.instrumentation.performance.ColdStartTracker;
import dagger.android.g;

@Deprecated
public class FeatureService extends g {
    ColdStartTracker a;
    fg0 b;
    CosmosServiceIntentBuilder c;
    FlagsManager f;
    private final IBinder n = new b();
    private final ServiceConnection o = new a(this);

    class a implements ServiceConnection {
        a(FeatureService featureService) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Logger.g("FeatureService bound to SpotifyService now, just to enforce destroy order", new Object[0]);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Logger.g("FeatureService now disconnected from SpotifyService, SpotifyService could be destroyed now", new Object[0]);
        }
    }

    public class b extends Binder {
        public b() {
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Logger.g("onBind", new Object[0]);
        return this.n;
    }

    @Override // dagger.android.g, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.a.p("pfs_create_after_injection");
        Logger.l("onCreate()", new Object[0]);
        this.b.a(this.c.createCosmosServiceIntent(this).setAction("com.spotify.mobile.service.action.FEATURE_SERVICE_LOCK"), this.o, "FeatureServiceLock");
    }

    @Override // android.app.Service
    public void onDestroy() {
        Logger.l("onDestroy()", new Object[0]);
        this.b.c(this.o, "FeatureServiceLock");
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        Logger.g("onUnbind", new Object[0]);
        return super.onUnbind(intent);
    }
}
