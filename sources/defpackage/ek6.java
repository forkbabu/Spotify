package defpackage;

import com.google.common.base.Optional;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter;
import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;
import defpackage.ep6;
import defpackage.ip6;
import defpackage.pp6;
import defpackage.zt6;

/* renamed from: ek6  reason: default package */
public class ek6 implements zo6 {
    private final ck6 a;
    private final zt6.a b;

    public ek6(ck6 ck6, zt6.a aVar) {
        this.a = ck6;
        this.b = aVar;
    }

    @Override // defpackage.pp6
    public Optional<pp6.b> a() {
        return Optional.of(new zj6(this));
    }

    @Override // defpackage.ep6
    public /* synthetic */ ep6.a b(AdditionalAdapter.Position position) {
        return dp6.a(this, position);
    }

    @Override // defpackage.np6
    public /* synthetic */ Optional c() {
        return mp6.a(this);
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
    public Optional<ip6.a> f() {
        return Optional.of(new ak6(this));
    }

    @Override // defpackage.zo6
    public Optional<a> g(LicenseLayout licenseLayout) {
        return Optional.of(PageIdentifiers.OFFLINE_MIX_ENTITY);
    }

    @Override // defpackage.ip6
    public /* synthetic */ Optional h(LicenseLayout licenseLayout) {
        return hp6.b(this, licenseLayout);
    }

    public xo6 i(LicenseLayout licenseLayout) {
        ck6 ck6 = this.a;
        ck6.getClass();
        return new bk6(ck6);
    }

    public zt6 j(pp6.a aVar) {
        zt6.a aVar2 = this.b;
        ck6 ck6 = this.a;
        ToolbarConfiguration a2 = aVar.a();
        ck6.getClass();
        ToolbarConfiguration.a l = a2.l();
        l.c(true);
        return aVar2.b(l.a());
    }

    @Override // defpackage.qp6
    public String name() {
        return "Offline Mix";
    }
}
