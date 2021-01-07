package com.spotify.music.features.go.service;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import com.google.common.base.MoreObjects;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.C0707R;
import com.spotify.music.features.go.connection.ConnectionState;
import com.spotify.music.features.go.connection.a;
import com.spotify.remoteconfig.x6;
import dagger.android.g;
import io.reactivex.disposables.b;
import java.util.List;

public class GoBluetoothService extends g {
    private static final String q = GoBluetoothService.class.getName();
    public static final /* synthetic */ int r = 0;
    ul1 a;
    h2e b;
    x6 c;
    zd5 f;
    ld5 n;
    private boolean o;
    private b p;

    public static void e(GoBluetoothService goBluetoothService, a aVar) {
        String str;
        List<a> c2 = goBluetoothService.n.c();
        Context applicationContext = goBluetoothService.getApplicationContext();
        Uri uri = bf5.a;
        StringBuilder sb = new StringBuilder(0);
        for (a aVar2 : c2) {
            String b2 = aVar2.a().b();
            if (MoreObjects.isNullOrEmpty(b2)) {
                b2 = applicationContext.getString(C0707R.string.app_remote_notification_is_connected_fallback);
            }
            int ordinal = aVar2.c().ordinal();
            if (ordinal == 1) {
                str = applicationContext.getString(C0707R.string.app_remote_notification_is_connecting, b2);
            } else if (ordinal != 2) {
                str = "";
            } else {
                str = applicationContext.getString(C0707R.string.app_remote_notification_is_connected, b2);
            }
            if (sb.length() > 0 && !str.isEmpty()) {
                sb.append(", ");
            }
            sb.append(str);
        }
        goBluetoothService.a.g(q, sb.toString());
        if (aVar.c() == ConnectionState.DISCONNECTED) {
            goBluetoothService.f();
        }
    }

    private void f() {
        if (this.n.f()) {
            stopSelf();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // dagger.android.g, android.app.Service
    public void onCreate() {
        super.onCreate();
        Logger.g("Go: Service created", new Object[0]);
        if (!this.c.e()) {
            Logger.g("Go: Feature disabled", new Object[0]);
            this.o = true;
        } else if (!this.f.c()) {
            Logger.g("Go: BT not supported", new Object[0]);
            this.o = true;
        } else {
            this.p = this.n.b().N(new a(this)).subscribe();
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.n.d();
        b bVar = this.p;
        if (bVar != null) {
            bVar.dispose();
        }
        this.a.f(this, q);
        super.onDestroy();
        Logger.g("Go: Service destroyed", new Object[0]);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        ul1 ul1 = this.a;
        String str = q;
        if (!ul1.c(str)) {
            this.a.e(this, str);
        }
        this.b.a(intent);
        if (this.o) {
            stopSelf();
            return 2;
        } else if (intent == null) {
            Logger.d("Go: null intent received", new Object[0]);
            f();
            return 2;
        } else {
            ae5 a2 = this.f.a(intent.getStringExtra("address"));
            if (a2 == null) {
                Logger.d("Go: null device received", new Object[0]);
                f();
                return 2;
            }
            if (intent.getBooleanExtra("connected", false)) {
                this.n.e(a2);
            } else {
                this.n.a(a2);
            }
            return 2;
        }
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        if ("android.intent.action.MAIN".equals(intent.getAction())) {
            this.n.d();
        }
    }
}
