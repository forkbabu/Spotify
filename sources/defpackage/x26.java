package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import defpackage.ep6;
import defpackage.np6;
import defpackage.pp6;
import defpackage.zt6;

/* renamed from: x26  reason: default package */
public class x26 implements zo6 {
    private final ImmutableList<gu6> a;
    private final zt6.b.a b;
    private final ui6 c;

    public x26(ImmutableList<gu6> immutableList, zt6.b.a aVar, ui6 ui6) {
        this.a = immutableList;
        this.b = aVar;
        this.c = ui6;
    }

    @Override // defpackage.pp6
    public Optional<pp6.b> a() {
        return Optional.of(new t26(this));
    }

    @Override // defpackage.ep6
    public /* synthetic */ ep6.a b(AdditionalAdapter.Position position) {
        return dp6.a(this, position);
    }

    @Override // defpackage.np6
    public Optional<np6.b> c() {
        return Optional.of(new v26(this));
    }

    @Override // defpackage.lp6
    public /* synthetic */ Optional d() {
        return kp6.a(this);
    }

    @Override // defpackage.gp6
    public /* synthetic */ Optional e() {
        return fp6.a(this);
    }

    @Override // defpackage.ip6
    public /* synthetic */ Optional f() {
        return hp6.a(this);
    }

    @Override // defpackage.zo6
    public Optional<a> g(LicenseLayout licenseLayout) {
        return Optional.of(PageIdentifiers.BLEND_ENTITY);
    }

    @Override // defpackage.ip6
    public /* synthetic */ Optional h(LicenseLayout licenseLayout) {
        return hp6.b(this, licenseLayout);
    }

    public /* synthetic */ uh6 i(np6.a aVar) {
        ui6 ui6 = this.c;
        ItemListConfiguration.a t = aVar.d().t();
        t.a(ItemListConfiguration.AddedByAttribution.AS_FACE_ALWAYS);
        return ui6.a(t.d());
    }

    public zt6 j(pp6.a aVar) {
        return this.b.create().a(aVar.a(), w26.a, u26.a, new s26(this));
    }

    public /* synthetic */ ImmutableList k(ImmutableList immutableList) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        builder.addAll((Iterable) this.a);
        builder.addAll((Iterable) immutableList);
        return builder.build();
    }

    @Override // defpackage.qp6
    public String name() {
        return "Blend";
    }
}
