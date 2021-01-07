package defpackage;

import com.google.common.base.Optional;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import com.spotify.music.features.playlistentity.configuration.g;
import com.spotify.music.features.playlistentity.header.m0;
import com.spotify.music.features.playlistentity.story.header.f0;
import com.spotify.music.features.playlistentity.story.header.h0;
import com.spotify.music.features.playlistentity.story.header.p0;
import defpackage.ep6;
import defpackage.ip6;
import defpackage.lp6;
import defpackage.np6;

/* renamed from: bt6  reason: default package */
public final class bt6 implements zo6 {
    private final kt6 a;
    private final p0.a b;
    private final ei6 c;
    private final wlf<h0> d;
    private final String e;

    public bt6(kt6 kt6, p0.a aVar, ei6 ei6, wlf<h0> wlf, String str) {
        this.a = kt6;
        this.b = aVar;
        this.c = ei6;
        this.d = wlf;
        this.e = str;
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
        return Optional.of(new zs6(this));
    }

    @Override // defpackage.lp6
    public Optional<lp6.b> d() {
        return Optional.of(new at6(this));
    }

    @Override // defpackage.gp6
    public /* synthetic */ Optional e() {
        return fp6.a(this);
    }

    @Override // defpackage.ip6
    public Optional<ip6.a> f() {
        return Optional.of(new ys6(this));
    }

    @Override // defpackage.zo6
    public Optional<a> g(LicenseLayout licenseLayout) {
        return Optional.of(PageIdentifiers.PLAYLIST_STORY);
    }

    @Override // defpackage.ip6
    public /* synthetic */ Optional h(LicenseLayout licenseLayout) {
        return hp6.b(this, licenseLayout);
    }

    public /* synthetic */ xo6 i(LicenseLayout licenseLayout) {
        return this.a.a(licenseLayout);
    }

    public m0 j(lp6.a aVar) {
        this.d.get().d(this.e);
        p0.a aVar2 = this.b;
        kt6 kt6 = this.a;
        g e2 = aVar.e();
        kt6.getClass();
        f0.a a2 = f0.a();
        a2.f(e2.d());
        a2.a(false);
        a2.g(e2.c());
        a2.b(e2.g());
        a2.d(e2.b().d());
        a2.e(!e2.b().c());
        a2.c(e2.b());
        return aVar2.a(a2.build());
    }

    public uh6 k(np6.a aVar) {
        ei6 ei6 = this.c;
        kt6 kt6 = this.a;
        ItemListConfiguration d2 = aVar.d();
        kt6.getClass();
        ItemListConfiguration.a t = d2.t();
        t.i(false);
        t.f(true);
        t.p(false);
        return ei6.a(t.d());
    }

    @Override // defpackage.qp6
    public String name() {
        return "playlist story";
    }
}
