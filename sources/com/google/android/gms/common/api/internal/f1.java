package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.d;

/* access modifiers changed from: package-private */
public final class f1 implements Runnable {
    private final c1 a;
    final /* synthetic */ d1 b;

    f1(d1 d1Var, c1 c1Var) {
        this.b = d1Var;
        this.a = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.b) {
            ConnectionResult b2 = this.a.b();
            if (b2.p2()) {
                d1 d1Var = this.b;
                j jVar = d1Var.a;
                Activity b3 = d1Var.b();
                PendingIntent o2 = b2.o2();
                g.l(o2);
                int a2 = this.a.a();
                int i = GoogleApiActivity.b;
                Intent intent = new Intent(b3, GoogleApiActivity.class);
                intent.putExtra("pending_intent", o2);
                intent.putExtra("failing_client_id", a2);
                intent.putExtra("notify_manager", false);
                jVar.startActivityForResult(intent, 1);
                return;
            }
            d1 d1Var2 = this.b;
            if (d1Var2.n.a(d1Var2.b(), b2.I1(), null) != null) {
                d1 d1Var3 = this.b;
                d1Var3.n.p(d1Var3.b(), this.b.a, b2.I1(), this.b);
            } else if (b2.I1() == 18) {
                Dialog k = d.k(this.b.b(), this.b);
                d1 d1Var4 = this.b;
                d1Var4.n.m(d1Var4.b().getApplicationContext(), new e1(this, k));
            } else {
                this.b.k(b2, this.a.a());
            }
        }
    }
}
