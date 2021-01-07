package defpackage;

import com.google.common.base.Optional;
import com.spotify.instrumentation.a;
import com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;
import com.spotify.music.features.playlistentity.header.m0;
import defpackage.ep6;
import defpackage.ip6;
import defpackage.ja6;
import defpackage.lp6;
import defpackage.np6;
import defpackage.pp6;
import defpackage.zt6;

/* renamed from: s36  reason: default package */
public final class s36 implements zo6 {
    private final x36 a;
    private final zt6.a b;
    private final ja6.a c;
    private final ei6 d;

    public s36(x36 x36, zt6.a aVar, ja6.a aVar2, ei6 ei6) {
        this.a = x36;
        this.b = aVar;
        this.c = aVar2;
        this.d = ei6;
    }

    @Override // defpackage.pp6
    public Optional<pp6.b> a() {
        return Optional.of(new p36(this));
    }

    @Override // defpackage.ep6
    public /* synthetic */ ep6.a b(AdditionalAdapter.Position position) {
        return dp6.a(this, position);
    }

    @Override // defpackage.np6
    public Optional<np6.b> c() {
        return Optional.of(new o36(this));
    }

    @Override // defpackage.lp6
    public Optional<lp6.b> d() {
        return Optional.of(new q36(this));
    }

    @Override // defpackage.gp6
    public /* synthetic */ Optional e() {
        return fp6.a(this);
    }

    @Override // defpackage.ip6
    public Optional<ip6.a> f() {
        return Optional.of(new r36(this));
    }

    @Override // defpackage.zo6
    public Optional<a> g(LicenseLayout licenseLayout) {
        return Optional.absent();
    }

    @Override // defpackage.ip6
    public /* synthetic */ Optional h(LicenseLayout licenseLayout) {
        return hp6.b(this, licenseLayout);
    }

    public /* synthetic */ xo6 i(LicenseLayout licenseLayout) {
        return this.a.a();
    }

    public /* synthetic */ m0 j(lp6.a aVar) {
        return this.c.a(aVar.c());
    }

    public uh6 k(np6.a aVar) {
        ei6 ei6 = this.d;
        x36 x36 = this.a;
        ItemListConfiguration d2 = aVar.d();
        x36.getClass();
        ItemListConfiguration.a t = d2.t();
        t.i(true);
        t.f(true);
        t.p(false);
        return ei6.a(t.d());
    }

    public zt6 l(pp6.a aVar) {
        zt6.a aVar2 = this.b;
        x36 x36 = this.a;
        ToolbarConfiguration a2 = aVar.a();
        x36.getClass();
        ToolbarConfiguration.a l = a2.l();
        l.e(false);
        return aVar2.b(l.a());
    }

    @Override // defpackage.qp6
    public String name() {
        return "car-mix";
    }
}
