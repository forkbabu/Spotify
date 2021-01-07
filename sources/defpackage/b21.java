package defpackage;

import com.spotify.mobius.e0;
import defpackage.p21;
import defpackage.q21;
import defpackage.r21;
import java.util.HashSet;

/* renamed from: b21  reason: default package */
public final /* synthetic */ class b21 implements ti0 {
    public final /* synthetic */ t21 a;

    public /* synthetic */ b21(t21 t21) {
        this.a = t21;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        t21 t21 = this.a;
        r21.f fVar = (r21.f) obj;
        HashSet hashSet = new HashSet();
        hashSet.add(new q21.b(fVar.j(), fVar.i()));
        return e0.g(t21.i(new p21.e(fVar.i())), hashSet);
    }
}
