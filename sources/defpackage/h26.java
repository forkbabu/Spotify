package defpackage;

import com.google.common.base.Optional;
import com.spotify.instrumentation.a;
import com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter;
import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import defpackage.ep6;
import defpackage.ip6;
import defpackage.np6;

/* renamed from: h26  reason: default package */
public class h26 implements zo6 {
    private final ui6 a;
    private final f26 b;

    public h26(f26 f26, ui6 ui6) {
        this.b = f26;
        this.a = ui6;
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
        return Optional.of(new d26(this));
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
        return Optional.of(new c26(this));
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
        f26 f26 = this.b;
        f26.getClass();
        return new e26(f26);
    }

    public /* synthetic */ uh6 j(np6.a aVar) {
        return this.a.a(this.b.a(aVar.d()));
    }

    @Override // defpackage.qp6
    public String name() {
        return "editorial";
    }
}
