package com.spotify.music.features.connect.discovery;

import android.content.Context;
import android.widget.Toast;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.j;
import com.spotify.libs.connect.model.DeviceState;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.model.Message;
import com.spotify.libs.connect.t;
import com.spotify.music.C0707R;
import com.spotify.music.connection.g;
import com.spotify.music.features.connect.cast.discovery.DiscoveredDevice;
import com.spotify.music.features.connect.cast.discovery.DiscoveryConfiguration;
import com.spotify.music.features.connect.cast.discovery.DiscoveryEvent;
import com.spotify.music.features.connect.cast.discovery.b;
import com.spotify.music.features.connect.cast.discovery.e;
import com.spotify.music.features.connect.cast.discovery.h;
import com.spotify.music.features.connect.cast.v;
import com.spotify.music.libs.mediasession.m0;
import com.spotify.rxjava2.q;
import io.reactivex.s;
import io.reactivex.y;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class g implements ConnectManager.a, ConnectManager.b {
    private final Context a;
    private final t b;
    private final m0 c;
    private final Set<d> d;
    private final ImmutableSet<h> e;
    private final s<com.spotify.music.connection.g> f;
    private final yl4 g;
    private final DiscoveryConfiguration h;
    private final y i;
    private final io.reactivex.g<com.spotify.android.flags.c> j;
    private final an4 k;
    private final com.spotify.music.features.connect.cast.discovery.b l;
    private final or0 m;
    private final j n;
    private final q o;
    private boolean p;
    private boolean q;
    private boolean r;
    private GaiaDevice s;
    private DiscoveredDevice t;
    private final com.spotify.music.features.connect.cast.discovery.d u = new a();
    private final b.a v = new b();
    private final v w = new c();

    class a implements com.spotify.music.features.connect.cast.discovery.d {
        a() {
        }

        @Override // com.spotify.music.features.connect.cast.discovery.d
        public void a(String str) {
            h t = g.this.t(str);
            if (t != null) {
                t.n(true);
            }
        }

        @Override // com.spotify.music.features.connect.cast.discovery.d
        public void b(String str, String str2, String str3, String str4, String str5) {
            h t = g.this.t(str);
            if (t == null) {
                return;
            }
            if (!t.c(str)) {
                g.this.q = true;
                t.k(str, g.this.w);
            } else if (g.e(g.this)) {
                t.m(g.this.g.a(str2, str3, str4, str5));
            }
        }
    }

    class b implements b.a {
        b() {
        }

        @Override // com.spotify.music.features.connect.cast.discovery.b.a
        public void a(String str) {
            UnmodifiableIterator it = g.this.e.iterator();
            while (it.hasNext()) {
                ((h) it.next()).m(str);
            }
        }

        @Override // com.spotify.music.features.connect.cast.discovery.b.a
        public void b(String str) {
            UnmodifiableIterator it = g.this.e.iterator();
            while (it.hasNext()) {
                g.this.q = true;
                ((h) it.next()).k(str, g.this.w);
            }
        }

        @Override // com.spotify.music.features.connect.cast.discovery.b.a
        public void c(String str) {
            UnmodifiableIterator it = g.this.e.iterator();
            while (it.hasNext()) {
                ((h) it.next()).n(true);
            }
        }
    }

    class c implements v {
        c() {
        }

        @Override // com.spotify.music.features.connect.cast.v
        public void a(DiscoveredDevice discoveredDevice) {
            g.n(g.this, null);
            if (!g.this.m.a() && discoveredDevice != null) {
                discoveredDevice.setStatus(DiscoveredDevice.DEVICE_FAILURE_STATUS_LOGIN_FAILED);
                g.this.k.c(discoveredDevice);
            }
        }

        @Override // com.spotify.music.features.connect.cast.v
        public void b(DiscoveredDevice discoveredDevice) {
            g.n(g.this, discoveredDevice);
            g.this.c.c();
            if (g.this.m.a()) {
                g.this.l.e(discoveredDevice, new a(this, discoveredDevice));
                return;
            }
            h t = g.this.t(discoveredDevice.getDeviceId());
            if (t != null) {
                t.m(g.this.g.b(discoveredDevice));
            }
        }

        @Override // com.spotify.music.features.connect.cast.v
        public void c(String str, String str2) {
            Message d = g.this.g.d(str2);
            if (g.this.m.a()) {
                g.this.l.a(d);
                return;
            }
            int ordinal = d.type.ordinal();
            if (ordinal == 1) {
                DiscoveredDevice discoveredDevice = (DiscoveredDevice) g.this.g.e(d.payload, DiscoveredDevice.class);
                if (discoveredDevice != null) {
                    discoveredDevice.setStatus(DiscoveredDevice.DEVICE_FAILURE_STATUS_INVALID_PUBLIC_KEY);
                } else {
                    discoveredDevice = DiscoveredDevice.errorStatusDevice(str, DiscoveredDevice.DEVICE_FAILURE_STATUS_BAD_REQUEST);
                }
                g.this.k.c(discoveredDevice);
            } else if (ordinal == 3) {
                g.h(g.this, str);
            } else if (ordinal != 4) {
                Logger.b("Received unknown message from the Receiver app: %s", str2);
            } else {
                DiscoveredDevice discoveredDevice2 = (DiscoveredDevice) g.this.g.e(d.payload, DiscoveredDevice.class);
                if (discoveredDevice2 == null) {
                    discoveredDevice2 = DiscoveredDevice.errorStatusDevice(str, DiscoveredDevice.DEVICE_FAILURE_STATUS_BAD_REQUEST);
                }
                g.i(g.this, discoveredDevice2.getErrorCode());
                g.this.k.c(discoveredDevice2);
            }
        }

        @Override // com.spotify.music.features.connect.cast.v
        public void d() {
        }

        @Override // com.spotify.music.features.connect.cast.v
        public void e(DiscoveredDevice discoveredDevice) {
            g.n(g.this, null);
            g.this.c.a();
            if (discoveredDevice != null && g.e(g.this)) {
                discoveredDevice.setStatus(DiscoveredDevice.DEVICE_FAILURE_STATUS_LOGIN_FAILED);
                discoveredDevice.setTokenType("");
                if (g.this.m.a()) {
                    g.this.l.f(discoveredDevice);
                } else {
                    g.this.k.b(discoveredDevice);
                }
            }
            g.this.b.a();
        }
    }

    public interface d {
        void a(boolean z);
    }

    public g(Context context, t tVar, m0 m0Var, ImmutableSet<h> immutableSet, e eVar, io.reactivex.g<com.spotify.android.flags.c> gVar, an4 an4, com.spotify.music.features.connect.cast.discovery.b bVar, or0 or0, y yVar, s<com.spotify.music.connection.g> sVar, j jVar, yl4 yl4) {
        this.a = context;
        this.b = tVar;
        this.c = m0Var;
        this.e = immutableSet;
        this.f = sVar;
        this.g = yl4;
        this.d = new CopyOnWriteArraySet();
        this.h = eVar.a();
        this.j = gVar;
        this.k = an4;
        this.l = bVar;
        this.m = or0;
        this.i = yVar;
        this.n = jVar;
        this.o = new q();
    }

    private void D() {
        UnmodifiableIterator<h> it = this.e.iterator();
        while (it.hasNext()) {
            E(it.next());
        }
    }

    private static void E(h hVar) {
        if (!hVar.b() && hVar.h()) {
            hVar.i();
        }
    }

    private void G() {
        UnmodifiableIterator<h> it = this.e.iterator();
        while (it.hasNext()) {
            H(it.next());
        }
    }

    private static void H(h hVar) {
        if (hVar.b()) {
            hVar.d();
        }
    }

    static boolean e(g gVar) {
        DiscoveredDevice discoveredDevice;
        GaiaDevice gaiaDevice = gVar.s;
        return gaiaDevice == null || (discoveredDevice = gVar.t) == null || !u(discoveredDevice, gaiaDevice) || gVar.s.getState() != DeviceState.GaiaDeviceState.LOGGED_IN;
    }

    static void h(g gVar, String str) {
        h t2;
        DiscoveredDevice discoveredDevice = gVar.t;
        if (discoveredDevice != null && discoveredDevice.getDeviceId().equals(str) && gVar.b.r() != ConnectManager.ConnectState.CONNECTING && (t2 = gVar.t(str)) != null && t2.l(str)) {
            gVar.b.c(str);
        }
    }

    static void i(g gVar, int i2) {
        gVar.getClass();
        if (i2 == 9) {
            Toast.makeText(gVar.a, (int) C0707R.string.connect_cast_device_premium_only, 1).show();
        }
    }

    static void n(g gVar, DiscoveredDevice discoveredDevice) {
        if (gVar.t != discoveredDevice) {
            gVar.t = discoveredDevice;
            gVar.x();
        }
        gVar.q = false;
    }

    private void s(String str, String str2) {
        h t2;
        GaiaDevice gaiaDevice = this.s;
        if (gaiaDevice != null && !this.q && gaiaDevice.getCosmosIdentifier().equals(str) && (t2 = t(str)) != null && !t2.c(str)) {
            t2.g(str, this.w);
            Logger.b("Reconnecting to %s", str2);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private h t(String str) {
        UnmodifiableIterator<h> it = this.e.iterator();
        while (it.hasNext()) {
            h next = it.next();
            if (next.j(str)) {
                return next;
            }
        }
        return null;
    }

    private static boolean u(DiscoveredDevice discoveredDevice, GaiaDevice gaiaDevice) {
        return discoveredDevice.getDeviceId() != null && gaiaDevice.getCosmosIdentifier().equals(discoveredDevice.getDeviceId());
    }

    private void x() {
        for (d dVar : this.d) {
            if (dVar != null) {
                dVar.a(this.t != null);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void A(com.spotify.android.flags.c cVar) {
        if (this.p) {
            UnmodifiableIterator<h> it = this.e.iterator();
            while (it.hasNext()) {
                h next = it.next();
                if (next.h()) {
                    E(next);
                } else if (next.b()) {
                    next.d();
                }
            }
        }
    }

    public void B(d dVar) {
        this.d.remove(dVar);
    }

    public void C() {
        if (!this.p) {
            this.p = true;
            this.o.a(this.j.Q(this.i).subscribe(new e(this)));
            this.o.a(this.f.o0(this.i).subscribe(new c(this)));
            this.o.a(this.n.p(g.class.getSimpleName()).o0(this.i).subscribe(new d(this)));
            if (this.m.a()) {
                this.l.g(this.v);
            } else {
                this.k.e(this.u);
            }
            UnmodifiableIterator<h> it = this.e.iterator();
            while (it.hasNext()) {
                h next = it.next();
                next.start();
                this.o.a(next.f().o0(this.i).subscribe(new b(this)));
            }
            D();
            x();
        }
    }

    public void F() {
        this.p = false;
        G();
        this.o.c();
        this.k.d();
        this.l.d();
        UnmodifiableIterator<h> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().stop();
        }
    }

    @Override // com.spotify.libs.connect.ConnectManager.b
    public void a() {
        if (this.p) {
            UnmodifiableIterator<h> it = this.e.iterator();
            while (it.hasNext()) {
                h next = it.next();
                if (next.b()) {
                    next.a();
                }
            }
        }
    }

    @Override // com.spotify.libs.connect.ConnectManager.b
    public void b() {
        a();
    }

    @Override // com.spotify.libs.connect.ConnectManager.b
    public void c() {
        h t2;
        GaiaDevice gaiaDevice = this.s;
        if (gaiaDevice != null && (t2 = t(gaiaDevice.getCosmosIdentifier())) != null) {
            t2.n(true);
        }
    }

    public void r(d dVar) {
        this.d.add(dVar);
    }

    public /* synthetic */ void v(DiscoveryEvent discoveryEvent) {
        DiscoveredDevice discoveredDevice = discoveryEvent.b;
        if (discoveryEvent.a == DiscoveryEvent.EventType.DISCOVER) {
            if (this.m.a()) {
                this.l.f(discoveredDevice);
                return;
            }
            this.k.b(discoveredDevice);
            s(discoveredDevice.getDeviceId(), discoveredDevice.getRemoteName());
        } else if (this.m.a()) {
            this.l.c(discoveredDevice);
        } else {
            this.k.a(discoveredDevice);
        }
    }

    public void w(com.spotify.music.connection.g gVar) {
        gVar.getClass();
        boolean z = gVar instanceof g.b;
        if (z != this.r) {
            if (z) {
                G();
            } else {
                D();
            }
        }
        this.r = z;
    }

    /* access modifiers changed from: package-private */
    public void y(GaiaDevice gaiaDevice) {
        this.s = gaiaDevice;
        if (this.p && !this.m.a()) {
            DiscoveredDevice discoveredDevice = this.t;
            if (discoveredDevice == null || u(discoveredDevice, this.s)) {
                s(this.s.getCosmosIdentifier(), this.s.getName());
            }
        }
    }

    public void z() {
        if (this.p) {
            UnmodifiableIterator<h> it = this.e.iterator();
            while (it.hasNext()) {
                h next = it.next();
                if (next.h()) {
                    E(next);
                } else if (next.b()) {
                    next.d();
                }
            }
            UnmodifiableIterator<h> it2 = this.e.iterator();
            while (it2.hasNext()) {
                it2.next().e(this.h.a().a());
            }
        }
    }
}
