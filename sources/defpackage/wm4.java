package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.collect.Collections2;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.cosmos.android.ResolverCallbackReceiver;
import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.model.GaiaState;
import com.spotify.libs.connect.n;
import com.spotify.libs.connect.p;
import com.spotify.libs.connect.picker.view.m;
import com.spotify.music.libs.connect.g;
import defpackage.cs0;
import io.reactivex.BackpressureStrategy;
import io.reactivex.h;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.processors.BehaviorProcessor;
import io.reactivex.s;
import io.reactivex.x;
import io.reactivex.y;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: wm4  reason: default package */
public class wm4 implements ConnectManager {
    private final BehaviorProcessor<Boolean> A = BehaviorProcessor.r0();
    private final x<Float> B = new a();
    private final ConnectManager.b C = new b();
    private final Runnable D = new km4(this);
    private final Context a;
    private final Handler b;
    private final dca c;
    private final gs0 d;
    private final FireAndForgetResolver e;
    private io.reactivex.disposables.b f = EmptyDisposable.INSTANCE;
    private boolean g = true;
    private boolean h;
    private List<GaiaDevice> i = Collections.emptyList();
    private ConnectManager.ConnectState j = ConnectManager.ConnectState.UNKNOWN;
    private Optional<GaiaDevice> k = Optional.absent();
    private String l = "";
    private final Set<h<ConnectManager.ConnectManagerState>> m;
    private final wlf<p> n;
    s<GaiaState> o;
    s<GaiaState> p;
    private final String q;
    private final dv0 r;
    private final g s;
    private final n t;
    private final zr0 u;
    private final cs0 v;
    private ConnectManager.ConnectManagerState w;
    private final y x;
    private final s<Boolean> y;
    private final com.spotify.rxjava2.p z = new com.spotify.rxjava2.p();

    /* renamed from: wm4$a */
    class a implements x<Float> {
        a() {
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            if (!wm4.this.v.g() || wm4.this.v.b() == null) {
                Logger.c(th, "Error while listening to remote volume", new Object[0]);
            } else {
                wm4.this.v.b().onError(th);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.x
        public void onNext(Float f) {
            Float f2 = f;
            if (wm4.this.v.g()) {
                wm4.u(wm4.this, f2.floatValue(), 90);
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(io.reactivex.disposables.b bVar) {
        }
    }

    /* renamed from: wm4$b */
    class b implements ConnectManager.b {
        b() {
        }

        @Override // com.spotify.libs.connect.ConnectManager.b
        public void a() {
            wm4.v(wm4.this, new String[]{"all"});
        }

        @Override // com.spotify.libs.connect.ConnectManager.b
        public void b() {
            wm4.v(wm4.this, new String[]{"restart"});
        }

        @Override // com.spotify.libs.connect.ConnectManager.b
        public void c() {
            Logger.b("CMC - disconnectCurrentDevice", new Object[0]);
        }
    }

    public wm4(Application application, Handler handler, gs0 gs0, FireAndForgetResolver fireAndForgetResolver, wlf<p> wlf, dca dca, String str, g gVar, n nVar, zr0 zr0, cs0 cs0, y yVar, s<Boolean> sVar) {
        Context applicationContext = application.getApplicationContext();
        applicationContext.getClass();
        this.a = applicationContext;
        handler.getClass();
        this.b = handler;
        this.d = gs0;
        this.e = fireAndForgetResolver;
        dca.getClass();
        this.c = dca;
        str.getClass();
        this.q = str;
        wlf.getClass();
        this.n = wlf;
        this.m = new LinkedHashSet(5);
        ConnectManager.ConnectManagerState connectManagerState = ConnectManager.ConnectManagerState.NOT_STARTED;
        this.w = connectManagerState;
        this.s = gVar;
        this.t = nVar;
        this.u = zr0;
        this.v = cs0;
        this.x = yVar;
        this.y = sVar;
        this.r = new dv0();
        F(connectManagerState);
    }

    public static void D(wm4 wm4, GaiaState gaiaState) {
        Optional<GaiaDevice> absent;
        wm4.getClass();
        List<GaiaDevice> devices = gaiaState.getDevices();
        Iterator<GaiaDevice> it = devices.iterator();
        while (true) {
            if (!it.hasNext()) {
                absent = Optional.absent();
                break;
            }
            GaiaDevice next = it.next();
            if (next.isActive()) {
                absent = Optional.of(next);
                break;
            }
        }
        wm4.k = absent;
        wm4.i = Collections.unmodifiableList(devices);
        boolean isActiveOnSameDevice = gaiaState.isActiveOnSameDevice();
        wm4.h = isActiveOnSameDevice;
        wm4.A.onNext(Boolean.valueOf(isActiveOnSameDevice));
        wm4.j = w(devices);
        boolean booleanValue = wm4.k.transform(bm4.a).or((Optional<V>) ((V) Boolean.FALSE)).booleanValue();
        if (booleanValue != wm4.g) {
            wm4.g = booleanValue;
            Intent intent = new Intent("com.spotify.mobile.android.service.broadcast.connect.SELF_ACTIVE_CHANGED");
            intent.putExtra("is_active", wm4.g);
            Context context = wm4.a;
            context.sendBroadcast(intent, wm4.q + ".permission.INTERNAL_BROADCAST");
        }
        Locale locale = Locale.ENGLISH;
        kca.d(String.format(locale, "DevicesCount:%d", Integer.valueOf(devices.size())), String.format(locale, "ActiveDeviceId:%s, ActiveDeviceName: %s", wm4.k.transform(sm4.a).or((Optional<V>) "No active device"), wm4.k.transform(rm4.a).or((Optional<V>) "No active device")));
    }

    /* access modifiers changed from: private */
    public void E() {
        h<Float> b2 = this.v.b();
        if (b2 != null) {
            b2.onNext(Float.valueOf(this.v.h()));
        }
        for (cs0.b bVar : this.v.f()) {
            bVar.a(this.v.h());
        }
    }

    private void F(ConnectManager.ConnectManagerState connectManagerState) {
        this.w = connectManagerState;
        for (h<ConnectManager.ConnectManagerState> hVar : this.m) {
            hVar.onNext(this.w);
        }
    }

    private void G() {
        if (this.v.a() != null) {
            this.v.a().e();
        }
        this.v.c(null);
    }

    static void u(wm4 wm4, float f2, Integer num) {
        wm4.v.j(f2);
        if (num == null) {
            wm4.E();
            return;
        }
        wm4.b.removeCallbacks(wm4.D);
        wm4.b.postDelayed(wm4.D, (long) num.intValue());
    }

    static void v(wm4 wm4, String[] strArr) {
        wm4.getClass();
        String join = Joiner.on("\n").join(strArr);
        wm4.e.detached(wm4.d.c(join), ResolverCallbackReceiver.forAny(wm4.b, new jm4(strArr), new dm4(strArr)));
    }

    private static ConnectManager.ConnectState w(List<GaiaDevice> list) {
        if (list == null || list.isEmpty()) {
            return ConnectManager.ConnectState.UNKNOWN;
        }
        boolean z2 = true;
        if (list.size() <= 1) {
            z2 = false;
        }
        if (!z2) {
            return ConnectManager.ConnectState.NORMAL;
        }
        GaiaDevice gaiaDevice = null;
        GaiaDevice gaiaDevice2 = null;
        for (GaiaDevice gaiaDevice3 : list) {
            if (gaiaDevice3.isActive() && !gaiaDevice3.isSelf()) {
                gaiaDevice = gaiaDevice3;
            } else if (gaiaDevice3.isBeingActivated()) {
                gaiaDevice2 = gaiaDevice3;
            }
        }
        if (gaiaDevice2 != null) {
            return ConnectManager.ConnectState.CONNECTING;
        }
        if (gaiaDevice != null) {
            return ConnectManager.ConnectState.ACTIVE;
        }
        return ConnectManager.ConnectState.DETECTED;
    }

    private s<GaiaState> x() {
        if (this.c.b()) {
            if (this.o == null) {
                this.o = this.r.b("Gaia State (local devices only)", this.d.e().v0(1).h1());
            }
            return this.o;
        }
        if (this.p == null) {
            this.p = this.r.b("Gaia State", this.d.d().v0(1).h1());
        }
        return this.p;
    }

    public /* synthetic */ void A(h hVar) {
        this.m.remove(hVar);
    }

    public void C(Boolean bool) {
        if (bool.booleanValue()) {
            kca.d(new String[0]);
            for (ConnectManager.b bVar : this.t.a()) {
                bVar.b();
            }
        }
    }

    @Override // com.spotify.libs.connect.ConnectManager, com.spotify.libs.connect.t
    public void a() {
        kca.d(new String[0]);
        for (ConnectManager.b bVar : this.t.a()) {
            bVar.a();
        }
    }

    @Override // com.spotify.libs.connect.k
    public boolean b() {
        return this.w == ConnectManager.ConnectManagerState.STARTED;
    }

    @Override // com.spotify.libs.connect.t
    public void c(String str) {
        this.u.c(str);
    }

    @Override // com.spotify.libs.connect.t
    public void d() {
        this.u.c("local_device");
    }

    @Override // com.spotify.libs.connect.j
    public boolean e() {
        return this.g;
    }

    @Override // com.spotify.libs.connect.j
    public s<ConnectManager.ConnectManagerState> f() {
        return new v(io.reactivex.g.p(new fm4(this), BackpressureStrategy.BUFFER));
    }

    @Override // com.spotify.libs.connect.j
    public io.reactivex.g<Boolean> g() {
        return this.A.s();
    }

    @Override // com.spotify.libs.connect.j
    public s<ConnectManager.ConnectState> h(String str) {
        return this.r.b(str, m(str).j0(new em4(this)));
    }

    @Override // com.spotify.libs.connect.j
    public GaiaDevice i(String str) {
        return (GaiaDevice) Collections2.find(this.i, new im4(str), null);
    }

    @Override // com.spotify.libs.connect.j
    public s<Optional<GaiaDevice>> j(String str) {
        return this.r.b(str, m(str).j0(new rs0()));
    }

    @Override // com.spotify.libs.connect.j
    public void k(ConnectManager.b bVar) {
        this.t.a().remove(bVar);
    }

    @Override // com.spotify.libs.connect.j
    public void l(ConnectManager.b bVar) {
        this.t.a().add(bVar);
    }

    @Override // com.spotify.libs.connect.j
    public s<List<GaiaDevice>> m(String str) {
        return this.r.b(str, x().j0(lm4.a));
    }

    @Override // com.spotify.libs.connect.ConnectManager
    public void n(ConnectManager.a aVar) {
    }

    @Override // com.spotify.libs.connect.j
    public GaiaDevice o() {
        return this.k.orNull();
    }

    @Override // com.spotify.libs.connect.j
    public s<GaiaDevice> p(String str) {
        return this.r.b(str, m(str).j0(new qs0()).Q(cm4.a).j0(am4.a).G(new os0()));
    }

    @Override // com.spotify.libs.connect.j
    public boolean q() {
        return this.h;
    }

    @Override // com.spotify.libs.connect.t
    public ConnectManager.ConnectState r() {
        return this.j;
    }

    @Override // com.spotify.libs.connect.k
    public List<com.spotify.rxjava2.y> s() {
        return this.r.c();
    }

    @Override // com.spotify.libs.connect.k
    public void start() {
        kca.d(new String[0]);
        this.c.start();
        F(ConnectManager.ConnectManagerState.STARTED);
        this.o = null;
        this.p = null;
        this.f.dispose();
        this.f = x().o0(this.x).subscribe(new mm4(this));
        this.z.b(this.y.o0(this.x).subscribe(new hm4(this)));
        if (this.v.a() != null) {
            G();
        }
        this.v.c(this.n.get());
        this.v.a().getClass();
        this.v.a().c(this.B, p("ConnectVolume"), this.k.orNull());
        this.t.a().add(this.C);
        if (!this.l.isEmpty()) {
            this.u.c(this.l);
        }
        g gVar = this.s;
        zr0 zr0 = this.u;
        zr0.getClass();
        gVar.b(new tm4(zr0));
        this.s.c(p("BackgroundAttacher"));
    }

    @Override // com.spotify.libs.connect.k
    public void stop() {
        kca.d(new String[0]);
        this.c.stop();
        F(ConnectManager.ConnectManagerState.STOPPED);
        G();
        h<Float> b2 = this.v.b();
        if (b2 != null) {
            b2.onComplete();
        }
        this.f.dispose();
        this.z.a();
        this.s.d();
        this.g = true;
        this.t.a().remove(this.C);
        this.l = "";
        m.a();
    }

    public /* synthetic */ ConnectManager.ConnectState y(List list) {
        ConnectManager.ConnectState w2 = w(list);
        this.j = w2;
        return w2;
    }

    public /* synthetic */ void z(h hVar) {
        this.m.add(hVar);
        hVar.onNext(this.w);
        hVar.e(new gm4(this, hVar));
    }
}
