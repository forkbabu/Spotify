package defpackage;

/* renamed from: aua  reason: default package */
public class aua implements sg0<jua, b91> {
    private final kua a;
    private final oua b;
    private final eua c;
    private final hua d;
    private final int e;

    public aua(kua kua, oua oua, eua eua, hua hua, int i) {
        this.a = kua;
        this.b = oua;
        this.c = eua;
        this.d = hua;
        this.e = i;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object[], s81[], java.io.Serializable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // defpackage.sg0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.b91 apply(defpackage.jua r9) {
        /*
            r8 = this;
            jua r9 = (defpackage.jua) r9
            com.spotify.searchview.proto.MainViewResponse r0 = r9.e()
            java.util.List r0 = r0.n()
            java.util.List r0 = defpackage.zta.a(r0)
            boolean r1 = r0.isEmpty()
            java.lang.String r2 = "lastOffset"
            r3 = 0
            java.lang.String r4 = "isLastPage"
            r5 = 1
            if (r1 != 0) goto L_0x00c5
            kua r1 = r8.a
            java.util.List r0 = r1.a(r9, r0)
            com.spotify.searchview.proto.MainViewResponse r1 = r9.e()
            com.spotify.searchview.proto.Entity r1 = r1.l(r3)
            java.lang.String r1 = r1.n()
            r6 = r0
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r6 = r6.size()
            int r6 = r6 - r5
            eua r7 = r8.c
            p81 r1 = r7.a(r9, r1, r6)
            p81$a r1 = r1.toBuilder()
            com.spotify.searchview.proto.MainViewResponse r6 = r9.e()
            int r6 = r6.m()
            int r7 = r8.e
            if (r6 >= r7) goto L_0x004b
            r3 = 1
        L_0x004b:
            p81$a r1 = r1.b(r4, r3)
            com.google.common.base.Optional r3 = r9.b()
            boolean r3 = r3.isPresent()
            if (r3 == 0) goto L_0x006b
            com.google.common.base.Optional r3 = r9.b()
            java.lang.Object r3 = r3.get()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            p81$a r1 = r1.j(r2, r3)
        L_0x006b:
            p81 r1 = r1.d()
            b91$a r2 = defpackage.z81.i()
            b91$a r0 = r2.a(r0)
            b91$a r0 = r0.h(r1)
            b91 r0 = r0.g()
            com.google.common.base.Optional r1 = r9.b()
            boolean r1 = r1.isPresent()
            if (r1 == 0) goto L_0x00bc
            com.google.common.base.Optional r1 = r9.b()
            java.lang.Object r1 = r1.get()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != 0) goto L_0x00bc
            oua r1 = r8.b
            java.util.List r9 = r1.apply(r9)
            boolean r1 = r9.isEmpty()
            if (r1 != 0) goto L_0x00bc
            int r1 = r9.size()
            s81[] r1 = new defpackage.s81[r1]
            r9.toArray(r1)
            b91$a r9 = r0.toBuilder()
            java.lang.String r0 = "see-all-results"
            b91$a r9 = r9.d(r0, r1)
            b91 r0 = r9.g()
        L_0x00bc:
            b91$a r9 = r0.toBuilder()
            b91 r9 = r9.g()
            goto L_0x0136
        L_0x00c5:
            com.google.common.base.Optional r0 = r9.b()
            boolean r0 = r0.isPresent()
            if (r0 == 0) goto L_0x00fb
            com.google.common.base.Optional r0 = r9.b()
            java.lang.Object r0 = r0.get()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x00e0
            goto L_0x00fb
        L_0x00e0:
            com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel r9 = com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel.EMPTY
            b91$a r9 = r9.toBuilder()
            p81$a r0 = defpackage.z81.a()
            p81$a r0 = r0.b(r4, r5)
            p81 r0 = r0.d()
            b91$a r9 = r9.c(r0)
            b91 r9 = r9.g()
            goto L_0x0136
        L_0x00fb:
            hua r0 = r8.d
            b91 r0 = r0.a(r9)
            b91$a r0 = r0.toBuilder()
            com.spotify.searchview.proto.MainViewResponse r1 = r9.e()
            int r1 = r1.m()
            int r6 = r8.e
            if (r1 >= r6) goto L_0x0112
            r3 = 1
        L_0x0112:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            b91$a r0 = r0.d(r4, r1)
            com.google.common.base.Optional r1 = r9.b()
            boolean r1 = r1.isPresent()
            if (r1 == 0) goto L_0x0132
            com.google.common.base.Optional r9 = r9.b()
            java.lang.Object r9 = r9.get()
            java.io.Serializable r9 = (java.io.Serializable) r9
            b91$a r0 = r0.d(r2, r9)
        L_0x0132:
            b91 r9 = r0.g()
        L_0x0136:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aua.apply(java.lang.Object):java.lang.Object");
    }
}
