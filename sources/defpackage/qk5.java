package defpackage;

import com.spotify.ubi.specification.factories.g1;

/* renamed from: qk5  reason: default package */
public class qk5 implements a71 {
    private final hha a;
    private final p71 b;
    private final ere c;

    public qk5(hha hha, p71 p71, ere ere) {
        hha.getClass();
        this.a = hha;
        p71.getClass();
        this.b = p71;
        ere.getClass();
        this.c = ere;
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        s81 d = n61.d();
        this.b.a("spotify:internal:home_taste_onboarding_header", d, "notNow", null);
        this.c.a(new g1(d.logging().string("ui:source")).b(d.id(), 0).b().b().a());
        this.a.k(true);
    }
}
