package defpackage;

import com.spotify.mobius.e0;
import defpackage.u4a;
import defpackage.v4a;
import defpackage.w4a;
import java.util.HashSet;

/* renamed from: r4a  reason: default package */
public final /* synthetic */ class r4a implements ti0 {
    public final /* synthetic */ w4a a;

    public /* synthetic */ r4a(w4a w4a) {
        this.a = w4a;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        w4a w4a = this.a;
        String d = ((v4a.b) obj).d();
        if (!w4a.a().contains(d)) {
            return e0.h();
        }
        HashSet hashSet = new HashSet(w4a.a().size() + 1);
        hashSet.addAll(w4a.a());
        hashSet.remove(d);
        w4a.a b = w4a.b();
        b.b(hashSet);
        w4a a2 = b.a();
        if (hashSet.isEmpty()) {
            return e0.g(a2, z42.l(new u4a.a(false)));
        }
        return e0.f(a2);
    }
}
