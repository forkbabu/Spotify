package com.google.android.gms.internal.measurement;

import android.util.Pair;
import com.google.android.gms.internal.measurement.h;
import com.google.android.gms.measurement.internal.g6;

/* access modifiers changed from: package-private */
public final class a0 extends h.a {
    private final /* synthetic */ g6 n;
    private final /* synthetic */ h o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    a0(h hVar, g6 g6Var) {
        super(true);
        this.o = hVar;
        this.n = g6Var;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.h.a
    public final void a() {
        for (int i = 0; i < this.o.e.size(); i++) {
            if (this.n.equals(((Pair) this.o.e.get(i)).first)) {
                String unused = this.o.a;
                return;
            }
        }
        h.c cVar = new h.c(this.n);
        this.o.e.add(new Pair(this.n, cVar));
        this.o.h.registerOnMeasurementEventListener(cVar);
    }
}
