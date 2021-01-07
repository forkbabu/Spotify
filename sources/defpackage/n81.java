package defpackage;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import defpackage.p81;
import java.util.List;

/* renamed from: n81  reason: default package */
public final class n81 {
    private static final p81[] a = new p81[0];

    public static p81 a(rqe rqe) {
        p81.a p = HubsImmutableComponentBundle.builder().p("ubi:app", rqe.d()).p("ubi:specification_id", rqe.n()).p("ubi:specification_version", rqe.o()).p("ubi:generator_version", rqe.f()).p("ubi:annotator_version", rqe.c()).p("ubi:annotator_configuration_version", rqe.b()).p("ubi:pageIdentifier", rqe.h()).p("ubi:pageUri", rqe.k()).p("ubi:pageReason", rqe.j());
        List<sqe> l = rqe.l();
        p81[] p81Arr = new p81[l.size()];
        for (int i = 0; i < l.size(); i++) {
            sqe sqe = l.get(i);
            p81.a p2 = HubsImmutableComponentBundle.builder().p("name", sqe.e()).p("id", sqe.d()).p("reason", sqe.g()).p("uri", sqe.h());
            Integer f = sqe.f();
            if (f != null) {
                p2 = p2.j("position", f.intValue());
            }
            p81Arr[i] = p2.d();
        }
        p81.a f2 = p.f("ubi:path", p81Arr);
        Integer i2 = rqe.i();
        if (i2 != null) {
            f2 = f2.j("ubi:pagePosition", i2.intValue());
        }
        if (rqe.g().booleanValue()) {
            f2 = f2.b("ubi:impression", true);
        }
        return f2.d();
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:8:0x00bc */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [rqe$b] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.util.ArrayList] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.rqe.b b(defpackage.p81 r7, java.lang.String r8) {
        /*
            rqe$b r0 = defpackage.rqe.e()
            java.lang.String r1 = "ubi:app"
            java.lang.String r2 = ""
            java.lang.String r1 = r7.string(r1, r2)
            r0.c(r1)
            java.lang.String r1 = "ubi:specification_id"
            java.lang.String r1 = r7.string(r1, r2)
            r0.l(r1)
            java.lang.String r1 = "ubi:specification_version"
            java.lang.String r1 = r7.string(r1, r2)
            r0.m(r1)
            java.lang.String r1 = "ubi:generator_version"
            java.lang.String r1 = r7.string(r1, r2)
            r0.e(r1)
            java.lang.String r1 = "ubi:annotator_version"
            java.lang.String r1 = r7.string(r1, r2)
            r0.b(r1)
            java.lang.String r1 = "ubi:annotator_configuration_version"
            java.lang.String r1 = r7.string(r1, r2)
            r0.a(r1)
            java.lang.String r1 = "ubi:pageIdentifier"
            java.lang.String r1 = r7.string(r1)
            r0.g(r1)
            java.lang.String r1 = "ubi:pageUri"
            java.lang.String r8 = r7.string(r1, r8)
            r0.j(r8)
            java.lang.String r8 = "ubi:pagePosition"
            java.lang.Integer r8 = r7.intValue(r8)
            r0.h(r8)
            java.lang.String r8 = "ubi:pageReason"
            java.lang.String r8 = r7.string(r8)
            r0.i(r8)
            java.lang.String r8 = "ubi:path"
            p81[] r7 = r7.bundleArray(r8)
            p81[] r8 = defpackage.n81.a
            java.lang.Object r7 = com.spotify.mobile.android.util.x.n(r7, r8)
            p81[] r7 = (defpackage.p81[]) r7
            int r8 = r7.length
            if (r8 <= 0) goto L_0x00b8
            java.util.ArrayList r8 = new java.util.ArrayList
            int r1 = r7.length
            r8.<init>(r1)
            int r1 = r7.length
            r3 = 0
        L_0x0079:
            if (r3 >= r1) goto L_0x00bc
            r4 = r7[r3]
            sqe$b r5 = defpackage.sqe.c()
            java.lang.String r6 = "name"
            java.lang.String r6 = r4.string(r6, r2)
            r5.c(r6)
            java.lang.String r6 = "id"
            java.lang.String r6 = r4.string(r6)
            r5.b(r6)
            java.lang.String r6 = "uri"
            java.lang.String r6 = r4.string(r6)
            r5.f(r6)
            java.lang.String r6 = "reason"
            java.lang.String r6 = r4.string(r6)
            r5.e(r6)
            java.lang.String r6 = "position"
            java.lang.Integer r4 = r4.intValue(r6)
            r5.d(r4)
            sqe r4 = r5.a()
            r8.add(r4)
            int r3 = r3 + 1
            goto L_0x0079
        L_0x00b8:
            java.util.List r8 = java.util.Collections.emptyList()
        L_0x00bc:
            r0.k(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n81.b(p81, java.lang.String):rqe$b");
    }
}
