package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements Runnable {
    private final g a;
    private final Intent b;
    private final h c;

    d(g gVar, Intent intent, h hVar) {
        this.a = gVar;
        this.b = intent;
        this.c = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar = this.a;
        Intent intent = this.b;
        h hVar = this.c;
        gVar.getClass();
        try {
            gVar.c(intent);
        } finally {
            hVar.c(null);
        }
    }
}
