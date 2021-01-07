package defpackage;

import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.rcs.model.GranularConfiguration;
import com.spotify.remoteconfig.client.cosmos.a;
import com.spotify.remoteconfig.client.cosmos.c;
import com.spotify.remoteconfig.client.logging.EventLogger;
import com.spotify.remoteconfig.client.model.resolve.AssignedPropertyValue;
import com.spotify.remoteconfig.client.model.resolve.FetchType;
import com.spotify.remoteconfig.client.network.b;
import com.spotify.remoteconfig.client.network.d;
import com.spotify.remoteconfig.client.network.i;
import com.spotify.remoteconfig.client.network.j;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: f0e  reason: default package */
final class f0e {
    private final c0e a;
    private final EventLogger b;
    private final k0e c;
    private final k0e d;
    private final k0e e;
    private final b f;
    private final b g;
    private final a h;
    private h0e i = new h0e(new b0e(this));

    f0e(c0e c0e, j jVar, EventLogger eventLogger, c cVar, k0e k0e, k0e k0e2, k0e k0e3) {
        this.a = c0e;
        this.b = eventLogger;
        this.c = k0e;
        this.d = k0e2;
        this.e = k0e3;
        com.spotify.remoteconfig.client.cosmos.b bVar = new com.spotify.remoteconfig.client.cosmos.b(cVar);
        this.h = bVar;
        this.f = new d(c0e, jVar, eventLogger, k0e, bVar);
        this.g = new i(c0e, jVar, eventLogger, new com.spotify.remoteconfig.client.network.a());
    }

    private d0e f() {
        d0e d2 = ((j0e) this.d).d();
        d0e d3 = ((j0e) this.c).d();
        if (!d2.h() || d3.h()) {
            return ((j0e) this.d).d();
        }
        return ((j0e) this.c).d();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        d0e d2 = ((j0e) this.c).d();
        ((j0e) this.d).f(d2);
        this.i.b();
        ((com.spotify.remoteconfig.client.logging.a) this.b).a(this.a, d2);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        ((j0e) this.c).a();
        ((j0e) this.d).a();
        this.i.b();
    }

    /* access modifiers changed from: package-private */
    public io.reactivex.a c() {
        return io.reactivex.a.u(new a0e(this)).d(((com.spotify.remoteconfig.client.cosmos.b) this.h).a());
    }

    /* access modifiers changed from: package-private */
    public io.reactivex.a d(FetchType fetchType) {
        return io.reactivex.a.y(Arrays.asList(this.f.b(fetchType), this.g.a(fetchType, (g0e) j(f(), ((j0e) this.e).d()).i(zzd.a))));
    }

    /* access modifiers changed from: package-private */
    public <T extends n0e> T e(o0e<T> o0e) {
        return (T) this.i.a().i(o0e);
    }

    /* access modifiers changed from: package-private */
    public c0e g() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public d0e h() {
        d0e f2 = f();
        ((j0e) this.d).f(f2);
        ((com.spotify.remoteconfig.client.logging.a) this.b).a(this.a, f2);
        return j(f2, ((j0e) this.e).d());
    }

    /* access modifiers changed from: package-private */
    public z<Boolean> i(byte[] bArr, boolean z) {
        z<Boolean> b2;
        z<Boolean> z2 = z.z(Boolean.FALSE);
        boolean isEmpty = ((j0e) this.e).d().c().d().isEmpty();
        if (bArr.length == 0 && isEmpty) {
            return z2;
        }
        try {
            d0e b3 = d0e.b(com.spotify.remoteconfig.client.model.resolve.a.b(GranularConfiguration.q(bArr)));
            ((j0e) this.c).f(b3);
            this.i.b();
            if (z) {
                b2 = z.z(Boolean.TRUE);
            } else {
                b2 = ((com.spotify.remoteconfig.client.cosmos.b) this.h).b(j(b3, ((j0e) this.e).d()));
            }
            return b2;
        } catch (InvalidProtocolBufferException e2) {
            trf.c(e2, "Invalid format of configuration.", new Object[0]);
            return z2;
        }
    }

    /* access modifiers changed from: package-private */
    public d0e j(d0e d0e, d0e d0e2) {
        Map<String, AssignedPropertyValue> f2 = d0e.f();
        Map<String, AssignedPropertyValue> f3 = d0e2.f();
        HashMap hashMap = new HashMap(f2);
        hashMap.putAll(f3);
        return d0e.b(com.spotify.remoteconfig.client.model.resolve.a.a(new ArrayList(hashMap.values())));
    }
}
