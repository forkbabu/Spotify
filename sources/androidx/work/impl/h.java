package androidx.work.impl;

import android.content.Context;
import defpackage.q7;

/* access modifiers changed from: package-private */
public class h implements q7.c {
    final /* synthetic */ Context a;

    h(Context context) {
        this.a = context;
    }

    @Override // defpackage.q7.c
    public q7 a(q7.b bVar) {
        q7.b.a a2 = q7.b.a(this.a);
        a2.c(bVar.b);
        a2.b(bVar.c);
        a2.d(true);
        return new w7().a(a2.a());
    }
}
