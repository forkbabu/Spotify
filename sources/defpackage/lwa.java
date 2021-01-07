package defpackage;

import android.app.Activity;
import android.content.Context;
import com.spotify.music.C0707R;
import com.spotify.searchview.proto.Entity;
import defpackage.s81;
import defpackage.w81;
import defpackage.x81;
import java.util.Set;

/* renamed from: lwa  reason: default package */
public class lwa {
    private final pwa<Entity> a;
    private final awa b;
    private final gwa c;
    private final Set<axa<Entity>> d;
    private final hsa<Entity> e;
    private final Entity f;
    private final wsa g;
    private final Context h;
    private boolean i;
    private boolean j;

    public lwa(pwa<Entity> pwa, awa awa, gwa gwa, Set<axa<Entity>> set, hsa<Entity> hsa, Activity activity, Entity entity, wsa wsa) {
        this.a = pwa;
        this.b = awa;
        this.c = gwa;
        this.d = set;
        this.e = hsa;
        this.f = entity;
        this.g = wsa;
        this.h = activity;
    }

    public s81 a() {
        x81.a e2 = z81.e().g(this.f.n()).e(this.b.a(this.f));
        w81.a a2 = z81.h().a(this.f.o());
        s81.a d2 = z81.c().s(pqa.b(this.g.d(), this.g.b())).n(this.c.a(this.f)).t(z81.f().f(e2)).x(z81.g(this.f.r())).v(pqa.a(this.g)).d("accessoryContentDesc", this.h.getString(C0707R.string.search_result_row_context_menu));
        if (this.j) {
            a2 = a2.d(this.a.a(this.f));
        }
        s81.a y = d2.y(a2);
        if (this.i) {
            y = y.d("secondary_icon", "chevron_right");
        }
        for (axa<Entity> axa : this.d) {
            y = axa.a(y, this.f);
        }
        for (dsa dsa : this.e.a(this.f)) {
            y = dsa.a(y);
        }
        return y.l();
    }

    public lwa b(boolean z) {
        this.i = z;
        return this;
    }

    public lwa c(boolean z) {
        this.j = z;
        return this;
    }
}
