package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.e;
import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.j;
import java.util.concurrent.ExecutorService;

public class f implements a {
    private static final Object c = new Object();
    private static x0 d;
    public static final /* synthetic */ int e = 0;
    private final Context a;
    private final ExecutorService b;

    public f(Context context, ExecutorService executorService) {
        this.a = context;
        this.b = executorService;
    }

    private static g<Integer> b(Context context, Intent intent) {
        x0 x0Var;
        Log.isLoggable("FirebaseInstanceId", 3);
        synchronized (c) {
            if (d == null) {
                d = new x0(context, "com.google.firebase.MESSAGING_EVENT");
            }
            x0Var = d;
        }
        g<Void> c2 = x0Var.c(intent);
        int i = h.b;
        return c2.k(g.a, d.a);
    }

    static final /* synthetic */ g c(Context context, Intent intent, g gVar) {
        if (!e.c() || ((Integer) gVar.n()).intValue() != 402) {
            return gVar;
        }
        g<Integer> b2 = b(context, intent);
        int i = h.b;
        return b2.k(g.a, e.a);
    }

    @Override // com.google.firebase.iid.a
    public g<Integer> a(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = this.a;
        boolean z2 = e.c() && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) != 0) {
            z = true;
        }
        if (!z2 || z) {
            return j.c(this.b, new b(context, intent)).l(this.b, new c(context, intent));
        }
        return b(context, intent);
    }
}
