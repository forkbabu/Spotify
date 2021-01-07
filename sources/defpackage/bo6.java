package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.playlist.models.l;
import io.reactivex.a;
import io.reactivex.d0;
import io.reactivex.e;
import io.reactivex.internal.operators.completable.b;
import io.reactivex.y;
import io.reactivex.z;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: bo6  reason: default package */
public final class bo6 implements ao6 {
    private final nsb a;
    private final vq6 b;
    private final eo6 c;
    private final y d;
    private final oo6 e;

    bo6(nsb nsb, vq6 vq6, eo6 eo6, y yVar, oo6 oo6) {
        this.a = nsb;
        this.b = vq6;
        this.c = eo6;
        this.d = yVar;
        this.e = oo6;
    }

    @Override // defpackage.ao6
    public z<Optional<Integer>> a(List<l> list, boolean z, boolean z2, boolean z3) {
        return z.h(new hn6(this, list, z, z2, z3));
    }

    public d0 b(List list, boolean z, boolean z2, boolean z3) {
        a aVar;
        if (!this.b.A1() || list.isEmpty()) {
            return z.z(Optional.absent());
        }
        Optional<String> r2 = this.b.r2();
        boolean z4 = false;
        if (r2.isPresent()) {
            String str = r2.get();
            for (int i = 0; i < list.size(); i++) {
                l lVar = (l) list.get(i);
                if (lVar.getUri().equals(str)) {
                    this.b.M(true);
                    String f = lVar.f();
                    LinkType q = l0.z(str).q();
                    boolean z5 = q == LinkType.SHOW_EPISODE;
                    boolean z6 = q == LinkType.TRACK && z;
                    if (z5 && z2) {
                        z4 = true;
                    }
                    if (z6 || z4) {
                        aVar = this.e.f(str).T().t(new kn6(this, f, this.c.a(str, i), z5, z3));
                    } else {
                        aVar = b.a;
                    }
                    return aVar.P(Optional.of(Integer.valueOf(i)));
                }
            }
        }
        this.b.M(false);
        return this.e.c().T().s(new in6(this, this.c.b()));
    }

    public /* synthetic */ d0 c(String str, Boolean bool) {
        if (!bool.booleanValue()) {
            return this.e.j(str).P(Optional.absent());
        }
        return z.z(Optional.absent());
    }

    public /* synthetic */ e d(boolean z, boolean z2) {
        if (z && z2) {
            this.a.a();
        }
        return b.a;
    }

    public /* synthetic */ e e(String str, String str2, boolean z, boolean z2, Boolean bool) {
        if (!bool.booleanValue()) {
            return this.e.l(str, str2).A(this.d).d(a.n(new jn6(this, z, z2)));
        }
        return b.a;
    }
}
