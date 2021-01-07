package com.google.android.gms.common.internal;

import com.google.android.gms.cast.framework.f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.tasks.h;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public final class i0 implements e.a {
    private final /* synthetic */ e a;
    private final /* synthetic */ h b;
    private final /* synthetic */ n.a c;
    private final /* synthetic */ n.b d;

    i0(e eVar, h hVar, n.a aVar, n.b bVar) {
        this.a = eVar;
        this.b = hVar;
        this.c = aVar;
        this.d = bVar;
    }

    @Override // com.google.android.gms.common.api.e.a
    public final void a(Status status) {
        if (status.r2()) {
            this.b.c(this.c.a(this.a.c(0, TimeUnit.MILLISECONDS)));
            return;
        }
        h hVar = this.b;
        ((g0) this.d).getClass();
        hVar.b(f.c(status));
    }
}
