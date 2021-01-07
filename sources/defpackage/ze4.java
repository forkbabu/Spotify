package defpackage;

import com.spotify.remoteconfig.i5;
import io.reactivex.g;
import io.reactivex.k;

/* renamed from: ze4  reason: default package */
public class ze4 implements k<b91, b91> {
    private final boolean a;

    public ze4(i5 i5Var) {
        this.a = i5Var.c();
    }

    /* Return type fixed from 'tpf' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.reactivex.g] */
    @Override // io.reactivex.k
    public tpf<b91> a(g<b91> gVar) {
        return gVar.O(new vc4(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if ((r4.custom().get("backgroundColor") != null) != false) goto L_0x0020;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.s81 b(defpackage.s81 r4) {
        /*
            r3 = this;
            java.lang.String r0 = "find:categoryCard"
            boolean r0 = defpackage.je.B(r4, r0)
            r1 = 1
            if (r0 == 0) goto L_0x001f
            boolean r0 = r3.a
            if (r0 != 0) goto L_0x0020
            p81 r0 = r4.custom()
            java.lang.String r2 = "backgroundColor"
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L_0x001b
            r0 = 1
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r0 == 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            if (r1 == 0) goto L_0x0038
            s81$a r0 = r4.toBuilder()
            q81 r4 = r4.componentId()
            java.lang.String r4 = r4.category()
            java.lang.String r1 = "find:card"
            s81$a r4 = r0.o(r1, r4)
            s81 r4 = r4.l()
        L_0x0038:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ze4.b(s81):s81");
    }
}
