package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.d;
import java.util.concurrent.atomic.AtomicReference;

public abstract class d1 extends LifecycleCallback implements DialogInterface.OnCancelListener {
    protected volatile boolean b;
    protected final AtomicReference<c1> c = new AtomicReference<>(null);
    private final Handler f = new qt(Looper.getMainLooper());
    protected final d n;

    d1(j jVar, d dVar) {
        super(jVar);
        this.n = dVar;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void d(int i, int i2, Intent intent) {
        c1 c1Var = this.c.get();
        boolean z = false;
        if (i != 1) {
            if (i == 2) {
                int g = this.n.g(b());
                if (g == 0) {
                    z = true;
                }
                if (c1Var != null) {
                    if (c1Var.b().I1() == 18 && g == 18) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (i2 == -1) {
            z = true;
        } else if (i2 == 0) {
            if (c1Var != null) {
                int i3 = 13;
                if (intent != null) {
                    i3 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                c1 c1Var2 = new c1(new ConnectionResult(i3, null, c1Var.b().toString()), c1Var.a());
                this.c.set(c1Var2);
                c1Var = c1Var2;
            } else {
                return;
            }
        }
        if (z) {
            l();
        } else if (c1Var != null) {
            k(c1Var.b(), c1Var.a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void e(Bundle bundle) {
        if (bundle != null) {
            this.c.set(bundle.getBoolean("resolving_error", false) ? new c1(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void g(Bundle bundle) {
        c1 c1Var = this.c.get();
        if (c1Var != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", c1Var.a());
            bundle.putInt("failed_status", c1Var.b().I1());
            bundle.putParcelable("failed_resolution", c1Var.b().o2());
        }
    }

    /* access modifiers changed from: protected */
    public abstract void j();

    /* access modifiers changed from: protected */
    public abstract void k(ConnectionResult connectionResult, int i);

    /* access modifiers changed from: protected */
    public final void l() {
        this.c.set(null);
        j();
    }

    public final void m(ConnectionResult connectionResult, int i) {
        c1 c1Var = new c1(connectionResult, i);
        if (this.c.compareAndSet(null, c1Var)) {
            this.f.post(new f1(this, c1Var));
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        int i;
        ConnectionResult connectionResult = new ConnectionResult(13, null);
        c1 c1Var = this.c.get();
        if (c1Var == null) {
            i = -1;
        } else {
            i = c1Var.a();
        }
        k(connectionResult, i);
        l();
    }
}
