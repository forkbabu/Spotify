package defpackage;

import com.google.common.base.Optional;
import com.spotify.instrumentation.a;
import com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter;
import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import com.spotify.music.features.playlistentity.header.m0;
import com.spotify.music.features.playlistentity.header.x0;
import com.spotify.remoteconfig.o9;
import defpackage.ep6;
import defpackage.ip6;
import defpackage.lp6;
import defpackage.np6;
import defpackage.qb6;

/* renamed from: kj4  reason: default package */
public class kj4 implements zo6 {
    private final uj4 a;
    private final qb6.a b;
    private final x0.a c;
    private final o9 d;
    private final gj4 e;
    private final ij4 f;

    public kj4(uj4 uj4, gj4 gj4, qb6.a aVar, x0.a aVar2, o9 o9Var, ij4 ij4) {
        this.e = gj4;
        this.a = uj4;
        this.b = aVar;
        this.c = aVar2;
        this.d = o9Var;
        this.f = ij4;
    }

    @Override // defpackage.pp6
    public /* synthetic */ Optional a() {
        return op6.a(this);
    }

    @Override // defpackage.ep6
    public /* synthetic */ ep6.a b(AdditionalAdapter.Position position) {
        return dp6.a(this, position);
    }

    @Override // defpackage.np6
    public Optional<np6.b> c() {
        return Optional.of(new cj4(this));
    }

    @Override // defpackage.lp6
    public Optional<lp6.b> d() {
        return Optional.of(new bj4(this));
    }

    @Override // defpackage.gp6
    public /* synthetic */ Optional e() {
        return fp6.a(this);
    }

    @Override // defpackage.ip6
    public Optional<ip6.a> f() {
        return Optional.of(new aj4(this));
    }

    @Override // defpackage.zo6
    public Optional<a> g(LicenseLayout licenseLayout) {
        return Optional.absent();
    }

    @Override // defpackage.ip6
    public /* synthetic */ Optional h(LicenseLayout licenseLayout) {
        return hp6.b(this, licenseLayout);
    }

    public xo6 i(LicenseLayout licenseLayout) {
        gj4 gj4 = this.e;
        gj4.getClass();
        return new fj4(gj4);
    }

    public /* synthetic */ m0 j(lp6.a aVar) {
        if (this.d.b()) {
            return this.b.a(aVar.b(), Optional.of(this.f));
        }
        return this.c.a(aVar.e(), Optional.of(this.f));
    }

    public /* synthetic */ uh6 k(np6.a aVar) {
        return this.a.a(aVar.d());
    }

    @Override // defpackage.qp6
    public String name() {
        return "charts";
    }
}
