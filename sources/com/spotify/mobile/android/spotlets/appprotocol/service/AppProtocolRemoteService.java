package com.spotify.mobile.android.spotlets.appprotocol.service;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.common.collect.ImmutableMap;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.mobile.android.service.media.z1;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.appprotocol.b4;
import com.spotify.mobile.android.spotlets.appprotocol.d4;
import com.spotify.mobile.android.spotlets.appprotocol.e4;
import com.spotify.mobile.android.spotlets.appprotocol.i4;
import com.spotify.mobile.android.spotlets.appprotocol.image.c;
import com.spotify.mobile.android.spotlets.appprotocol.t3;
import com.spotify.mobile.android.spotlets.appprotocol.v3;
import com.spotify.mobile.android.spotlets.appprotocol.w3;
import com.spotify.mobile.android.spotlets.appprotocol.y3;
import com.spotify.mobile.android.spotlets.appprotocol.z3;
import com.spotify.mobile.android.sso.ClientIdentity;
import com.spotify.mobile.android.sso.m;
import com.spotify.mobile.android.util.t;
import com.spotify.music.C0707R;
import com.spotify.music.appprotocol.volume.k;
import com.spotify.music.builtinauth.authenticator.f0;
import com.spotify.music.builtinauth.authenticator.h0;
import com.spotify.music.json.e;
import com.spotify.music.podcast.speedcontrol.SpeedControlInteractor;
import com.spotify.player.model.PlayerState;
import dagger.android.g;
import io.reactivex.y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AppProtocolRemoteService extends g implements hg0<v1>, d4.a {
    private static final String J = AppProtocolRemoteService.class.getName();
    public static final /* synthetic */ int K = 0;
    cqe A;
    pea B;
    private final Messenger C = new Messenger(new b(this, null));
    private final Set<Message> D = new HashSet();
    private v1 E;
    private io.reactivex.disposables.b F;
    private ClientIdentity G;
    private final List<w3> H = new ArrayList();
    private Handler I;
    com.spotify.music.json.g a;
    ls1 b;
    z1 c;
    io.reactivex.g<PlayerState> f;
    m n;
    y o;
    y p;
    ul1 q;
    SpeedControlInteractor r;
    wlf<c> s;
    h2e t;
    k0 u;
    kd0 v;
    t w;
    f0 x;
    w y;
    io.reactivex.g<SessionState> z;

    private static class b extends Handler {
        private final WeakReference<AppProtocolRemoteService> a;

        b(AppProtocolRemoteService appProtocolRemoteService, a aVar) {
            this.a = new WeakReference<>(appProtocolRemoteService);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AppProtocolRemoteService appProtocolRemoteService = this.a.get();
            if (appProtocolRemoteService != null) {
                AppProtocolRemoteService.e(appProtocolRemoteService, message);
            }
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j) {
            if (Build.VERSION.SDK_INT >= 21) {
                message.arg1 = message.sendingUid;
            } else {
                message.arg1 = Binder.getCallingUid();
            }
            return super.sendMessageAtTime(message, j);
        }
    }

    static void e(AppProtocolRemoteService appProtocolRemoteService, Message message) {
        if (message.replyTo == null) {
            appProtocolRemoteService.stopSelf();
            Logger.d("No remote Messenger to reply to", new Object[0]);
        } else if (appProtocolRemoteService.E != null) {
            appProtocolRemoteService.f(message);
        } else {
            if (!appProtocolRemoteService.c.m()) {
                appProtocolRemoteService.c.i();
            }
            appProtocolRemoteService.D.add(Message.obtain(message));
        }
    }

    private void f(Message message) {
        b4 b4Var = new b4(message.replyTo);
        try {
            m mVar = this.n;
            int i = message.arg1;
            mVar.getClass();
            ClientIdentity b2 = ClientIdentity.b(this, i);
            this.q.g(J, getString(C0707R.string.app_remote_notification_is_connecting, new Object[]{g(this, b2)}));
            e b3 = this.a.b();
            b3.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            b3.e(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
            i4 i4Var = new i4(new pq1(b3.build()), b4Var, Executors.newSingleThreadExecutor(), this.p);
            e4 e4Var = new e4(this, this.b, this.E, new z3(com.spotify.music.appprotocol.api.b.b(2, 1, 4, 8)), this.s.get(), this.r, this.o, this.v, this.y, this.z, this.f, this.A, this.B);
            w3 w3Var = new w3((t3) i4Var, e4Var, (Map<String, h0>) ImmutableMap.of("appid", this.x), true, "app_to_app", "inter_app", this.u, b2);
            this.H.add(w3Var);
            this.G = b2;
            i4Var.t(new y3(new z(w3Var), new y(e4Var), new com.spotify.mobile.android.spotlets.appprotocol.util.b(w3Var), new v3(new o(e4Var))));
            i4Var.l("com.spotify.volume", new y3(new z(w3Var), k.a, new com.spotify.mobile.android.spotlets.appprotocol.util.b(w3Var), new k(this.E, this.z, new a(e4Var), this.B)));
            i4Var.u(new d4(w3Var, i4Var, this.u, this, this.w, this.A));
            b4Var.e(new h(this, w3Var));
            io.reactivex.disposables.b bVar = this.F;
            if (bVar != null) {
                bVar.dispose();
            }
            this.F = this.f.O(i.a).s().C(a0.a).E().I(5, TimeUnit.MINUTES).B(this.o).subscribe(new j(this), new g(this));
            b4Var.start();
            b4Var.d(true);
        } catch (ClientIdentity.ValidationException unused) {
            Logger.d("Cannot validate calling identity", new Object[0]);
            stopSelf();
            b4Var.d(false);
        }
    }

    private static String g(Context context, ClientIdentity clientIdentity) {
        ApplicationInfo applicationInfo;
        CharSequence charSequence;
        PackageManager packageManager = context.getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo(clientIdentity.f(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        if (applicationInfo != null) {
            charSequence = packageManager.getApplicationLabel(applicationInfo);
        } else {
            charSequence = context.getString(C0707R.string.app_remote_notification_is_connected_fallback);
        }
        return (String) charSequence;
    }

    private void p() {
        for (w3 w3Var : this.H) {
            if (w3Var.d() != 2) {
                w3Var.q();
            }
        }
        this.H.clear();
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.d4.a
    public void a(w3 w3Var) {
        this.I.post(new n(this, w3Var));
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.d4.a
    public void b(w3 w3Var, boolean z2) {
        this.I.post(new f(this, z2, w3Var));
    }

    public /* synthetic */ void h(w3 w3Var) {
        Logger.g("Remote client died. Stop the session", new Object[0]);
        this.I.post(new l(this, w3Var));
    }

    public /* synthetic */ void i(w3 w3Var) {
        this.H.remove(w3Var);
    }

    public void j(w3 w3Var) {
        if (w3Var.d() != 2) {
            w3Var.q();
        }
        this.H.remove(w3Var);
    }

    public /* synthetic */ void k(boolean z2, w3 w3Var) {
        ClientIdentity clientIdentity;
        if (!z2 || (clientIdentity = this.G) == null) {
            this.I.post(new m(this, w3Var));
        } else {
            this.q.g(J, getString(C0707R.string.app_remote_notification_is_connected, new Object[]{g(this, clientIdentity)}));
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.hg0
    public void l(v1 v1Var) {
        this.E = v1Var;
        for (Message message : this.D) {
            f(message);
            message.recycle();
        }
        this.D.clear();
    }

    public /* synthetic */ void m(w3 w3Var) {
        this.H.remove(w3Var);
    }

    public /* synthetic */ void n(Boolean bool) {
        this.q.f(this, J);
    }

    public /* synthetic */ void o(Throwable th) {
        this.q.f(this, J);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.C.getBinder();
    }

    @Override // dagger.android.g, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.q.e(this, J);
        this.I = new Handler();
        this.c.p(this);
        this.c.i();
    }

    @Override // android.app.Service
    public void onDestroy() {
        io.reactivex.disposables.b bVar = this.F;
        if (bVar != null) {
            bVar.dispose();
        }
        this.q.f(this, J);
        this.c.j();
        this.c.q(this);
        super.onDestroy();
    }

    @Override // defpackage.hg0
    public void onDisconnected() {
        p();
        this.E = null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        this.q.e(this, J);
        this.t.a(intent);
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        if ("android.intent.action.MAIN".equals(intent.getAction())) {
            p();
        }
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        stopSelf();
        return super.onUnbind(intent);
    }
}
