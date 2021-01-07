package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.g;

/* access modifiers changed from: package-private */
public final class y0 implements Handler.Callback {
    private final /* synthetic */ x0 a;

    y0(x0 x0Var, w0 w0Var) {
        this.a = x0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.a.d) {
                g.a aVar = (g.a) message.obj;
                z0 z0Var = (z0) this.a.d.get(aVar);
                if (z0Var != null && z0Var.h()) {
                    if (z0Var.d()) {
                        z0Var.g();
                    }
                    this.a.d.remove(aVar);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.a.d) {
                g.a aVar2 = (g.a) message.obj;
                z0 z0Var2 = (z0) this.a.d.get(aVar2);
                if (z0Var2 != null && z0Var2.f() == 3) {
                    String valueOf = String.valueOf(aVar2);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName j = z0Var2.j();
                    if (j == null) {
                        aVar2.getClass();
                        j = null;
                    }
                    if (j == null) {
                        String b = aVar2.b();
                        com.google.android.exoplayer2.util.g.l(b);
                        j = new ComponentName(b, "unknown");
                    }
                    z0Var2.onServiceDisconnected(j);
                }
            }
            return true;
        }
    }
}
