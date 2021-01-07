package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter;
import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import com.spotify.music.features.playlistentity.configuration.d;
import com.spotify.music.features.playlistentity.configuration.g;
import com.spotify.music.features.playlistentity.configuration.h;
import com.spotify.music.features.playlistentity.header.m0;
import com.spotify.music.features.playlistentity.header.x0;
import com.spotify.music.features.playlistentity.t;
import com.spotify.music.features.playlistentity.vanilla.footer.FooterConfiguration;
import com.spotify.remoteconfig.AndroidLibsPlaylistEntityModesVanillaProperties;
import defpackage.a07;
import defpackage.ep6;
import defpackage.gp6;
import defpackage.ip6;
import defpackage.j17;
import defpackage.kz6;
import defpackage.lp6;
import defpackage.np6;
import defpackage.nz6;
import defpackage.p07;
import defpackage.pp6;
import defpackage.qb6;
import defpackage.zt6;
import java.util.List;

/* renamed from: bz6  reason: default package */
public final class bz6 implements rp6 {
    private final qz6 a;
    private final nz6.a b;
    private final x0.a c;
    private final zt6.a d;
    private final ui6 e;
    private final kz6.c f;
    private final p07.b g;
    private final j17.b h;
    private final a07.b i;
    private final AndroidLibsPlaylistEntityModesVanillaProperties j;
    private final qb6.a k;

    public bz6(qz6 qz6, nz6.a aVar, x0.a aVar2, zt6.a aVar3, ui6 ui6, AndroidLibsPlaylistEntityModesVanillaProperties androidLibsPlaylistEntityModesVanillaProperties, qb6.a aVar4, kz6.c cVar, p07.b bVar, j17.b bVar2, a07.b bVar3) {
        this.a = qz6;
        this.b = aVar;
        this.c = aVar2;
        this.d = aVar3;
        this.e = ui6;
        this.j = androidLibsPlaylistEntityModesVanillaProperties;
        this.k = aVar4;
        this.f = cVar;
        this.g = bVar;
        this.h = bVar2;
        this.i = bVar3;
    }

    @Override // defpackage.pp6
    public Optional<pp6.b> a() {
        return Optional.of(new yy6(this));
    }

    @Override // defpackage.ep6
    public ep6.a b(AdditionalAdapter.Position position) {
        if (position == AdditionalAdapter.Position.AFTER_HEADER) {
            return new ep6.a.d(new xy6(this));
        }
        if (position == AdditionalAdapter.Position.AFTER_TRACK_LIST) {
            return new ep6.a.d(new vy6(this));
        }
        return ep6.a.b.a;
    }

    @Override // defpackage.np6
    public Optional<np6.b> c() {
        return Optional.of(new wy6(this));
    }

    @Override // defpackage.lp6
    public Optional<lp6.b> d() {
        return Optional.of(new uy6(this));
    }

    @Override // defpackage.gp6
    public Optional<gp6.a> e() {
        return Optional.of(new zy6(this));
    }

    @Override // defpackage.ip6
    public Optional<ip6.a> f() {
        qz6 qz6 = this.a;
        qz6.getClass();
        return Optional.of(new az6(qz6));
    }

    @Override // defpackage.zo6
    public Optional<a> g(LicenseLayout licenseLayout) {
        return Optional.of(d.c(licenseLayout) ? PageIdentifiers.PLAYLIST_ONDEMAND : PageIdentifiers.PLAYLIST);
    }

    @Override // defpackage.ip6
    public /* synthetic */ Optional h(LicenseLayout licenseLayout) {
        return hp6.b(this, licenseLayout);
    }

    public List i(ep6.b bVar) {
        LicenseLayout g2 = bVar.g();
        kz6 a2 = this.f.a(bVar.f());
        if (!d.b(g2) || g2 == LicenseLayout.PREVIEWS_WHEN_FREE) {
            a2.getClass();
            return ImmutableList.of(new kz6.a());
        } else if (g2 != LicenseLayout.SHUFFLE_WHEN_FREE) {
            return ImmutableList.of();
        } else {
            a2.getClass();
            return ImmutableList.of(new kz6.b());
        }
    }

    public /* synthetic */ List j(ep6.b bVar) {
        FooterConfiguration c2 = this.a.c(bVar.g());
        return ImmutableList.of((a07) this.g.a(c2), (a07) this.h.a(c2), this.i.a(c2));
    }

    public m0 k(lp6.a aVar) {
        if (this.j.c()) {
            qb6.a aVar2 = this.k;
            qz6 qz6 = this.a;
            h b2 = aVar.b();
            qz6.getClass();
            h.a e2 = b2.e();
            e2.b(true);
            return aVar2.a(e2.a(), Optional.absent());
        }
        x0.a aVar3 = this.c;
        qz6 qz62 = this.a;
        g e3 = aVar.e();
        qz62.getClass();
        g.a f2 = e3.f();
        f2.b(true);
        return aVar3.a(f2.a(), Optional.absent());
    }

    public /* synthetic */ uh6 l(np6.a aVar) {
        return this.e.a(aVar.d());
    }

    public /* synthetic */ t m(jp6 jp6) {
        return this.b.create();
    }

    public /* synthetic */ zt6 n(pp6.a aVar) {
        return this.d.b(aVar.a());
    }

    @Override // defpackage.qp6
    public String name() {
        return "vanilla";
    }
}
