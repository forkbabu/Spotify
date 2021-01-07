package com.google.firebase.iid;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.g;
import com.google.firebase.iid.x0;

public class u0 extends Binder {
    private final a a;

    public interface a {
        g<Void> a(Intent intent);
    }

    public u0(a aVar) {
        this.a = aVar;
    }

    /* access modifiers changed from: package-private */
    public void a(x0.a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            Log.isLoggable("FirebaseInstanceId", 3);
            g<Void> a2 = this.a.a(aVar.a);
            int i = h.b;
            a2.c(g.a, new t0(aVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
