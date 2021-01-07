package defpackage;

import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.searchview.assistedcuration.proto.Entity;
import defpackage.s81;
import defpackage.w81;
import defpackage.x81;
import java.util.Set;

/* renamed from: xva  reason: default package */
public class xva {
    private final Entity a;
    private final pwa<Entity> b;
    private final hsa<Entity> c;
    private final fwa d;
    private boolean e;
    private final wsa f;
    private final String g;
    private final isa h;
    private final uua i;
    private final Set<axa<Entity>> j;

    public xva(pwa<Entity> pwa, hsa<Entity> hsa, fwa fwa, isa isa, uua uua, Set<axa<Entity>> set, Entity entity, wsa wsa, String str) {
        this.b = pwa;
        this.c = hsa;
        this.d = fwa;
        this.a = entity;
        this.g = str;
        this.f = wsa;
        this.h = isa;
        this.i = uua;
        this.j = set;
    }

    public s81 a() {
        s81.a aVar;
        x81.a e2 = z81.e().g(this.a.l()).e(h71.a(this.a.o()));
        w81.a a2 = z81.h().a(this.a.m());
        if (this.e) {
            a2 = a2.d(this.b.a(this.a));
        }
        s81.a y = z81.c().s(pqa.b(Optional.of(this.g), this.f.b())).n(this.d.a(this.a.i())).t(z81.f().f(e2)).x(z81.g(this.a.o())).v(pqa.a(this.f)).y(a2);
        if (this.a.i() != Entity.EntityCase.TRACK) {
            aVar = y.d("secondary_icon", SpotifyIconV2.CHEVRON_RIGHT.name());
        } else {
            aVar = y.k("preview_id", this.a.n().m());
        }
        for (dsa dsa : this.c.a(this.a)) {
            aVar = dsa.a(aVar);
        }
        uua uua = this.i;
        Entity entity = this.a;
        uua.getClass();
        if (entity.i() == Entity.EntityCase.ARTIST) {
            aVar = this.h.a(aVar);
        }
        for (axa<Entity> axa : this.j) {
            aVar = axa.a(aVar, this.a);
        }
        return aVar.l();
    }

    public xva b(boolean z) {
        this.e = z;
        return this;
    }
}
