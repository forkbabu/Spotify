package defpackage;

import com.spotify.mobius.e0;
import defpackage.hee;
import defpackage.iee;

/* renamed from: ece  reason: default package */
public final /* synthetic */ class ece implements ti0 {
    public final /* synthetic */ kee a;

    public /* synthetic */ ece(kee kee) {
        this.a = kee;
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x002b: APUT  (r2v2 hee[]), (0 ??[int, short, byte, char]), (r0v2 hee) */
    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        hee hee;
        kee kee = this.a;
        iee.u uVar = (iee.u) obj;
        kee s = kee.s(kee.f().f(false));
        if (!kee.i()) {
            return e0.f(s);
        }
        hee[] heeArr = new hee[1];
        if (kee.g()) {
            hee = new hee.t();
        } else {
            hee = new hee.s();
        }
        heeArr[0] = hee;
        return e0.g(s, z42.l(heeArr));
    }
}
