package com.spotify.music.features.playlistentity.homemix;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;
import com.spotify.music.features.playlistentity.header.m0;
import defpackage.ep6;
import defpackage.ip6;
import defpackage.lp6;
import defpackage.np6;
import defpackage.pp6;
import defpackage.zt6;

public class s implements zo6 {
    private final fe6 a;
    private final xb6 b;
    private final dd6 c;
    private final zt6.b.a d;
    private final ImmutableList<gu6> e;

    public s(fe6 fe6, xb6 xb6, dd6 dd6, ImmutableList<gu6> immutableList, zt6.b.a aVar) {
        this.a = fe6;
        this.b = xb6;
        this.c = dd6;
        this.d = aVar;
        this.e = immutableList;
    }

    @Override // defpackage.pp6
    public Optional<pp6.b> a() {
        return Optional.of(new g(this));
    }

    @Override // defpackage.ep6
    public /* synthetic */ ep6.a b(AdditionalAdapter.Position position) {
        return dp6.a(this, position);
    }

    @Override // defpackage.np6
    public Optional<np6.b> c() {
        return Optional.of(new f(this));
    }

    @Override // defpackage.lp6
    public Optional<lp6.b> d() {
        return Optional.of(new e(this));
    }

    @Override // defpackage.gp6
    public /* synthetic */ Optional e() {
        return fp6.a(this);
    }

    @Override // defpackage.ip6
    public Optional<ip6.a> f() {
        return Optional.of(new h(this));
    }

    @Override // defpackage.zo6
    public Optional<a> g(LicenseLayout licenseLayout) {
        return Optional.of(PageIdentifiers.HOMEMIX_ENTITY);
    }

    @Override // defpackage.ip6
    public /* synthetic */ Optional h(LicenseLayout licenseLayout) {
        return hp6.b(this, licenseLayout);
    }

    public /* synthetic */ xo6 i(LicenseLayout licenseLayout) {
        return this.b.a();
    }

    public /* synthetic */ m0 j(lp6.a aVar) {
        return this.c.b(aVar.e());
    }

    public uh6 k(np6.a aVar) {
        fe6 fe6 = this.a;
        xb6 xb6 = this.b;
        ItemListConfiguration d2 = aVar.d();
        xb6.getClass();
        ItemListConfiguration.a t = d2.t();
        t.l(false);
        t.q(false);
        t.h(ItemListConfiguration.LongClickAction.SHOW_CONTEXT_MENU);
        t.k(true);
        return fe6.b(t.d());
    }

    public zt6 l(pp6.a aVar) {
        zt6.b create = this.d.create();
        xb6 xb6 = this.b;
        ToolbarConfiguration a2 = aVar.a();
        xb6.getClass();
        ToolbarConfiguration.a l = a2.l();
        l.h(true);
        l.f(ToolbarConfiguration.FollowOption.LIKE);
        l.c(false);
        l.e(false);
        l.b(false);
        return create.a(l.a(), j.a, i.a, new k(this));
    }

    public /* synthetic */ ImmutableList m(ImmutableList immutableList) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        builder.addAll((Iterable) this.e);
        builder.addAll((Iterable) immutableList);
        return builder.build();
    }

    @Override // defpackage.qp6
    public String name() {
        return "Home Mix";
    }
}
