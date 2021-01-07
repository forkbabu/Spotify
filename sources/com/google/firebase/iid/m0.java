package com.google.firebase.iid;

import com.google.android.gms.tasks.c;
import com.google.android.gms.tasks.g;
import java.util.concurrent.ScheduledFuture;

/* access modifiers changed from: package-private */
public final /* synthetic */ class m0 implements c {
    private final o0 a;
    private final String b;
    private final ScheduledFuture c;

    m0(o0 o0Var, String str, ScheduledFuture scheduledFuture) {
        this.a = o0Var;
        this.b = str;
        this.c = scheduledFuture;
    }

    @Override // com.google.android.gms.tasks.c
    public final void a(g gVar) {
        this.a.b(this.b, this.c);
    }
}
