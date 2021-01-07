package com.spotify.music.features.connect.cast;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.e;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.j;
import com.google.android.gms.cast.framework.media.h;
import com.google.android.gms.common.api.Status;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.model.Tech;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.d0;
import com.spotify.music.features.connect.cast.discovery.DiscoveredDevice;
import com.spotify.music.features.connect.cast.o;
import com.spotify.rxjava2.p;
import defpackage.n6;
import io.reactivex.y;
import java.io.IOException;

public class r {
    private static final String n = d0.c("8593116e1f761e31036d1032483410380b78096c186e0374546c1d670e38177415374875173640340c675f394a745c6507325c75406f047159680a741467027a466f1930196c0a68126f0b324c3107620a6d406919645532", "7a6d646e6d767031396d6832653473386a787a6c6c6e3974376c7267633839746637387578363434656739393374726564323475326f6b7134686f747767637a356f6d30376c7968776f6832393175626f6d6e696f646432");
    public static final /* synthetic */ int o = 0;
    com.google.android.gms.cast.framework.a a;
    private final Context b;
    private final l c;
    private final ss0 d;
    private DiscoveredDevice e;
    private b f;
    c g;
    private a h;
    h i;
    private final com.spotify.libs.connect.providers.h j;
    private final p k = new p();
    private final y l;
    private j<c> m;

    /* access modifiers changed from: private */
    public class a implements e.d {
        a(q qVar) {
        }

        @Override // com.google.android.gms.cast.e.d
        public void a(CastDevice castDevice, String str, String str2) {
            b bVar = r.this.f;
            String I1 = castDevice.I1();
            o.a aVar = (o.a) bVar;
            if (o.r(o.this) != null) {
                o.r(o.this).c(I1, str2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public interface b {
    }

    public r(Context context, l lVar, com.spotify.libs.connect.providers.h hVar, ss0 ss0, y yVar) {
        context.getClass();
        this.b = context;
        this.c = lVar;
        this.j = hVar;
        this.d = ss0;
        this.l = yVar;
    }

    static void c(r rVar, c cVar) {
        rVar.g = cVar;
        Logger.g("Cast Application connected", new Object[0]);
        if (rVar.i()) {
            h p = rVar.g.p();
            rVar.i = p;
            if (p != null) {
                rVar.h = new a(null);
                try {
                    rVar.g.u(p.j(), rVar.i);
                    c cVar2 = rVar.g;
                    rVar.h.getClass();
                    cVar2.u(n, rVar.h);
                    b bVar = rVar.f;
                    DiscoveredDevice discoveredDevice = rVar.e;
                    o.a aVar = (o.a) bVar;
                    aVar.getClass();
                    if (discoveredDevice != null) {
                        n6.f f2 = o.s(o.this).f(discoveredDevice.getDeviceId());
                        if (f2 != null) {
                            discoveredDevice = o.s(o.this).h(f2);
                        }
                        if (o.r(o.this) != null) {
                            o.r(o.this).b(discoveredDevice);
                        }
                    }
                } catch (IOException e2) {
                    Logger.d("Error creating channels: %s", e2);
                    ((o.a) rVar.f).b(rVar.e);
                }
            }
        }
    }

    static void e(r rVar) {
        rVar.getClass();
        Logger.g("Cast Application disconnected", new Object[0]);
        rVar.h(true);
    }

    private void h(boolean z) {
        Logger.b("CR - disconnectDevice and disassemble everything (isCastConnected(): %b)", Boolean.valueOf(i()));
        try {
            c cVar = this.g;
            if (cVar != null) {
                if (this.h != null) {
                    cVar.s(n);
                }
                h hVar = this.i;
                if (hVar != null) {
                    this.g.s(hVar.j());
                }
            }
        } catch (IOException e2) {
            Logger.d("Error destroying channels: %s", e2);
        }
        this.h = null;
        if (i()) {
            h hVar2 = this.i;
            if (hVar2 != null) {
                hVar2.B();
                this.i = null;
                com.google.android.gms.cast.framework.a aVar = this.a;
                if (aVar != null) {
                    aVar.c().c(z);
                }
            } else {
                throw new AssertionError();
            }
        }
        DiscoveredDevice discoveredDevice = this.e;
        if (discoveredDevice != null) {
            o.a aVar2 = (o.a) this.f;
            if (o.r(o.this) != null) {
                o.r(o.this).e(discoveredDevice);
            }
            o.s(o.this).m(discoveredDevice.getDeviceId());
        }
        this.g = null;
        this.e = null;
    }

    public void g(CastDevice castDevice) {
        Logger.b("CR - connectDevice (%s - %s), available GP: %b", castDevice.q2(), castDevice.Q1(), Boolean.valueOf(this.d.b()));
        this.e = j.a(castDevice);
    }

    /* access modifiers changed from: protected */
    public boolean i() {
        c cVar = this.g;
        return cVar != null && cVar.c();
    }

    /* access modifiers changed from: protected */
    public boolean j(String str) {
        DiscoveredDevice discoveredDevice;
        c cVar = this.g;
        return (cVar != null && cVar.d()) || ((discoveredDevice = this.e) != null && discoveredDevice.getDeviceId().equals(str) && i());
    }

    public /* synthetic */ void k(Status status) {
        if (!status.r2()) {
            Logger.d("Sending message failed", new Object[0]);
            ((o.a) this.f).a();
        }
    }

    public void l(Optional optional) {
        CastDevice o2;
        if (!optional.isPresent()) {
            Logger.b("No active device", new Object[0]);
            h(false);
            return;
        }
        GaiaDevice gaiaDevice = (GaiaDevice) optional.get();
        if (this.g != null && !Tech.isCast(gaiaDevice) && (o2 = this.g.o()) != null && !TextUtils.equals(gaiaDevice.getName(), o2.Q1())) {
            h(true);
            Logger.g("Cast device not active anymore", new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    public void m(String str) {
        a aVar;
        if (!i() || (aVar = this.h) == null) {
            Logger.d("No api or no channel", new Object[0]);
            ((o.a) this.f).a();
            return;
        }
        try {
            c cVar = this.g;
            aVar.getClass();
            cVar.t(n, str).e(new c(this));
        } catch (Exception e2) {
            Logger.e(e2, "Exception while sending message", new Object[0]);
            ((o.a) this.f).a();
        }
    }

    public void n(b bVar) {
        this.f = bVar;
    }

    public void o() {
        if (!this.d.b()) {
            try {
                Logger.b("CR - Cast was initialized", new Object[0]);
                com.google.android.gms.cast.framework.a e2 = com.google.android.gms.cast.framework.a.e(this.b);
                this.a = e2;
                this.g = e2.c().d();
                this.a.a(b.a);
                this.m = new q(this);
                this.a.c().b(this.m, c.class);
            } catch (RuntimeException e3) {
                Logger.d("CR - Cast failed, a runtime exception occurred", new Object[0]);
                Assertion.w("CastContext failed with a RT exception", e3);
                this.a = null;
                this.g = null;
            } catch (Exception | LinkageError e4) {
                Logger.d("CR - Cast failed and we handled it", new Object[0]);
                Assertion.w("CastContext couldn't be acquired", e4);
                this.a = null;
                this.g = null;
            }
        }
        this.k.b(this.j.a().o0(this.l).subscribe(new d(this)));
    }

    public void p() {
        this.k.a();
    }
}
