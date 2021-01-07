package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.i;
import androidx.core.app.k;
import com.google.android.gms.common.util.e;
import com.google.android.gms.tasks.j;
import com.google.firebase.messaging.a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class c {
    private final Executor a;
    private final Context b;
    private final o c;

    public c(Context context, o oVar, Executor executor) {
        this.a = executor;
        this.b = context;
        this.c = oVar;
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        boolean z;
        if (this.c.a("gcm.n.noui")) {
            return true;
        }
        if (!((KeyguardManager) this.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            if (!e.b()) {
                SystemClock.sleep(10);
            }
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.b.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            z = true;
                        }
                    }
                }
            }
        }
        z = false;
        if (z) {
            return false;
        }
        m b2 = m.b(this.c.f("gcm.n.image"));
        if (b2 != null) {
            b2.f(this.a);
        }
        a.C0135a b3 = a.b(this.b, this.c);
        k kVar = b3.a;
        if (b2 != null) {
            try {
                Bitmap bitmap = (Bitmap) j.b(b2.d(), 5, TimeUnit.SECONDS);
                kVar.q(bitmap);
                i iVar = new i();
                iVar.k(bitmap);
                iVar.j(null);
                kVar.B(iVar);
            } catch (ExecutionException e) {
                String.valueOf(e.getCause()).length();
            } catch (InterruptedException unused) {
                b2.close();
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                b2.close();
            }
        }
        Log.isLoggable("FirebaseMessaging", 3);
        ((NotificationManager) this.b.getSystemService("notification")).notify(b3.b, 0, b3.a.a());
        return true;
    }
}
