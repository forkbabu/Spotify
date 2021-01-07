package defpackage;

import com.spotify.libs.search.history.f;
import com.spotify.libs.search.history.i;
import defpackage.xya;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: i0b  reason: default package */
public class i0b implements w<xya.c, zya> {
    private final i a;

    public i0b(i iVar) {
        this.a = iVar;
    }

    public v a(xya.c cVar) {
        s sVar;
        if (this.a.e()) {
            sVar = s.i0(((f) this.a.d()).e());
        } else {
            sVar = new io.reactivex.internal.operators.observable.v(((f) this.a.d()).d());
        }
        return sVar.j0(nza.a).r0(oza.a);
    }

    @Override // io.reactivex.w
    public v<zya> apply(s<xya.c> sVar) {
        return sVar.W(new mza(this), false, Integer.MAX_VALUE);
    }
}
