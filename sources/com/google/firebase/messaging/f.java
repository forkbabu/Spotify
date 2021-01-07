package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.c;
import com.google.android.gms.tasks.g;

final /* synthetic */ class f implements c {
    private final g a;
    private final Intent b;

    f(g gVar, Intent intent) {
        this.a = gVar;
        this.b = intent;
    }

    @Override // com.google.android.gms.tasks.c
    public final void a(g gVar) {
        this.a.d(this.b);
    }
}
