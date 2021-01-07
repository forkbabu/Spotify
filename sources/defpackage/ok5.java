package defpackage;

import com.google.common.collect.FluentIterable;
import com.spotify.remoteconfig.AndroidFeatureHomeProperties;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: ok5  reason: default package */
public class ok5 implements w<b91, b91> {
    private final s<Boolean> a;
    private final s<Boolean> b;
    private final AndroidFeatureHomeProperties c;
    private final hha d;

    ok5(s<Boolean> sVar, s<Boolean> sVar2, hha hha, AndroidFeatureHomeProperties androidFeatureHomeProperties) {
        sVar.getClass();
        this.a = sVar;
        sVar2.getClass();
        this.b = sVar2;
        this.d = hha;
        this.c = androidFeatureHomeProperties;
    }

    private static boolean a(s81 s81) {
        if (s81 == null) {
            return false;
        }
        return FluentIterable.from(s81.children()).anyMatch(nk5.a);
    }

    /* Return type fixed from 'io.reactivex.v' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.reactivex.s] */
    @Override // io.reactivex.w
    public v<b91> apply(s<b91> sVar) {
        return s.m(this.a, this.b, sVar, new mk5(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0074, code lost:
        if ((r0 && !r8) != false) goto L_0x0076;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.b91 b(java.lang.Boolean r7, java.lang.Boolean r8, defpackage.b91 r9) {
        /*
            r6 = this;
            com.spotify.remoteconfig.AndroidFeatureHomeProperties r0 = r6.c
            int r0 = r0.b()
            if (r0 <= 0) goto L_0x000a
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
        L_0x000a:
            s81 r0 = r9.header()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0023
            java.util.List r0 = r0.children()
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L_0x0023
            java.lang.Object r0 = r0.get(r2)
            s81 r0 = (defpackage.s81) r0
            goto L_0x0024
        L_0x0023:
            r0 = r1
        L_0x0024:
            boolean r3 = a(r0)
            java.lang.String r4 = "freetier:tasteOnboardingHomeHeader"
            if (r3 == 0) goto L_0x0034
            boolean r3 = defpackage.je.B(r0, r4)
            if (r3 == 0) goto L_0x0034
            r3 = 1
            goto L_0x0035
        L_0x0034:
            r3 = 0
        L_0x0035:
            if (r0 == 0) goto L_0x0045
            boolean r5 = a(r0)
            if (r5 != 0) goto L_0x0045
            boolean r0 = defpackage.je.B(r0, r4)
            if (r0 == 0) goto L_0x0045
            r0 = 1
            goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            hha r4 = r6.d
            boolean r4 = r4.c()
            if (r4 != 0) goto L_0x005c
            if (r3 != 0) goto L_0x0054
            if (r0 != 0) goto L_0x0054
            r4 = 1
            goto L_0x0055
        L_0x0054:
            r4 = 0
        L_0x0055:
            if (r4 == 0) goto L_0x005c
            hha r4 = r6.d
            r4.d()
        L_0x005c:
            boolean r7 = r7.booleanValue()
            boolean r8 = r8.booleanValue()
            if (r3 == 0) goto L_0x006a
            if (r7 == 0) goto L_0x006a
            r7 = 1
            goto L_0x006b
        L_0x006a:
            r7 = 0
        L_0x006b:
            if (r7 != 0) goto L_0x0076
            if (r0 == 0) goto L_0x0073
            if (r8 != 0) goto L_0x0073
            r7 = 1
            goto L_0x0074
        L_0x0073:
            r7 = 0
        L_0x0074:
            if (r7 == 0) goto L_0x0077
        L_0x0076:
            r2 = 1
        L_0x0077:
            if (r2 == 0) goto L_0x0085
            b91$a r7 = r9.toBuilder()
            b91$a r7 = r7.j(r1)
            b91 r9 = r7.g()
        L_0x0085:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ok5.b(java.lang.Boolean, java.lang.Boolean, b91):b91");
    }
}
