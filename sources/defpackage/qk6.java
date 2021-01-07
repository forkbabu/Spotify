package defpackage;

import com.google.common.base.Optional;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;
import com.spotify.music.features.playlistentity.header.m0;
import defpackage.ep6;
import defpackage.ip6;
import defpackage.km6;
import defpackage.lp6;
import defpackage.np6;
import defpackage.pp6;
import defpackage.rl6;
import defpackage.zt6;

/* renamed from: qk6  reason: default package */
public class qk6 implements zo6 {
    private final ok6 a;
    private final zt6.a b;
    private final km6.a c;
    private final rl6.a d;

    public qk6(ok6 ok6, zt6.a aVar, km6.a aVar2, rl6.a aVar3) {
        this.a = ok6;
        this.b = aVar;
        this.c = aVar2;
        this.d = aVar3;
    }

    @Override // defpackage.pp6
    public Optional<pp6.b> a() {
        return Optional.of(new jk6(this));
    }

    @Override // defpackage.ep6
    public /* synthetic */ ep6.a b(AdditionalAdapter.Position position) {
        return dp6.a(this, position);
    }

    @Override // defpackage.np6
    public Optional<np6.b> c() {
        return Optional.of(new mk6(this));
    }

    @Override // defpackage.lp6
    public Optional<lp6.b> d() {
        return Optional.of(new kk6(this));
    }

    @Override // defpackage.gp6
    public /* synthetic */ Optional e() {
        return fp6.a(this);
    }

    @Override // defpackage.ip6
    public Optional<ip6.a> f() {
        return Optional.of(new lk6(this));
    }

    @Override // defpackage.zo6
    public Optional<a> g(LicenseLayout licenseLayout) {
        return Optional.of(PageIdentifiers.OFFLINE_USER_MIX_ENTITY);
    }

    @Override // defpackage.ip6
    public Optional<LicenseLayout> h(LicenseLayout licenseLayout) {
        if (licenseLayout == LicenseLayout.SHUFFLE_WHEN_FREE) {
            return Optional.of(LicenseLayout.PREVIEWS_WHEN_FREE);
        }
        return Optional.absent();
    }

    public xo6 i(LicenseLayout licenseLayout) {
        ok6 ok6 = this.a;
        ok6.getClass();
        return new nk6(ok6);
    }

    public /* synthetic */ m0 j(lp6.a aVar) {
        return this.d.a(aVar.e());
    }

    public uh6 k(np6.a aVar) {
        km6.a aVar2 = this.c;
        ok6 ok6 = this.a;
        ItemListConfiguration d2 = aVar.d();
        ok6.getClass();
        ItemListConfiguration.a t = d2.t();
        t.m(false);
        return aVar2.a(t.d());
    }

    public zt6 l(pp6.a aVar) {
        zt6.a aVar2 = this.b;
        ok6 ok6 = this.a;
        ToolbarConfiguration a2 = aVar.a();
        ok6.getClass();
        ToolbarConfiguration.a l = a2.l();
        l.c(false);
        l.f(ToolbarConfiguration.FollowOption.NONE);
        l.h(false);
        return aVar2.b(l.a());
    }

    @Override // defpackage.qp6
    public String name() {
        return "Offline User Mix";
    }
}
