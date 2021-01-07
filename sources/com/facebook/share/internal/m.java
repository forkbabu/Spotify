package com.facebook.share.internal;

import com.facebook.LoggingBehavior;
import com.facebook.internal.y;
import com.facebook.k;
import com.facebook.p;
import com.facebook.share.internal.e;

/* access modifiers changed from: package-private */
public class m implements e.o {
    final /* synthetic */ e a;

    class a implements p.a {
        final /* synthetic */ e.k a;
        final /* synthetic */ e.f b;

        a(e.k kVar, e.f fVar) {
            this.a = kVar;
            this.b = fVar;
        }

        @Override // com.facebook.p.a
        public void a(p pVar) {
            e.k kVar = this.a;
            if (((e.c) kVar).d == null && this.b.d == null) {
                e eVar = m.this.a;
                boolean a2 = kVar.a();
                e.f fVar = this.b;
                eVar.X(a2, fVar.e, fVar.f, fVar.g, fVar.h, this.a.b());
                return;
            }
            LoggingBehavior loggingBehavior = LoggingBehavior.REQUESTS;
            String unused = e.o;
            String unused2 = m.this.a.a;
            int i = y.e;
            k.v(loggingBehavior);
        }
    }

    m(e eVar) {
        this.a = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.facebook.share.internal.e$h] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.facebook.share.internal.e.o
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onComplete() {
        /*
            r5 = this;
            com.facebook.share.internal.e r0 = r5.a
            com.facebook.share.widget.LikeView$ObjectType r0 = com.facebook.share.internal.e.l(r0)
            int r0 = r0.ordinal()
            r1 = 2
            if (r0 == r1) goto L_0x001f
            com.facebook.share.internal.e$h r0 = new com.facebook.share.internal.e$h
            com.facebook.share.internal.e r1 = r5.a
            java.lang.String r2 = com.facebook.share.internal.e.j(r1)
            com.facebook.share.internal.e r3 = r5.a
            com.facebook.share.widget.LikeView$ObjectType r3 = com.facebook.share.internal.e.l(r3)
            r0.<init>(r2, r3)
            goto L_0x002a
        L_0x001f:
            com.facebook.share.internal.e$j r0 = new com.facebook.share.internal.e$j
            com.facebook.share.internal.e r1 = r5.a
            java.lang.String r2 = com.facebook.share.internal.e.j(r1)
            r0.<init>(r2)
        L_0x002a:
            com.facebook.share.internal.e$f r1 = new com.facebook.share.internal.e$f
            com.facebook.share.internal.e r2 = r5.a
            java.lang.String r3 = com.facebook.share.internal.e.j(r2)
            com.facebook.share.internal.e r4 = r5.a
            com.facebook.share.widget.LikeView$ObjectType r4 = com.facebook.share.internal.e.l(r4)
            r1.<init>(r3, r4)
            com.facebook.p r2 = new com.facebook.p
            r2.<init>()
            r0.c(r2)
            r1.c(r2)
            com.facebook.share.internal.m$a r3 = new com.facebook.share.internal.m$a
            r3.<init>(r0, r1)
            r2.d(r3)
            r2.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.m.onComplete():void");
    }
}
