package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.spotify.mobile.android.service.o;
import com.spotify.mobile.android.util.Assertion;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.jvm.internal.h;

/* renamed from: ht2  reason: default package */
public final class ht2 implements it2 {
    private final Context a;
    private final o b;
    private final Random c;

    public ht2(Context context, o oVar, Random random) {
        h.e(context, "context");
        h.e(oVar, "intentFactory");
        h.e(random, "throttler");
        this.a = context;
        this.b = oVar;
        this.c = random;
    }

    public static final boolean a(ht2 ht2) {
        return ((double) ht2.c.nextFloat()) < 0.01d;
    }

    public void b() {
        Context applicationContext = this.a.getApplicationContext();
        Intent c2 = this.b.c(this.a, "com.spotify.mobile.android.service.action.START_SERVICE");
        h.d(c2, "intentFactory.getSpotify…N_START_SERVICE\n        )");
        if (Build.VERSION.SDK_INT < 26) {
            applicationContext.startService(c2);
            return;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) applicationContext.getSystemService(ActivityManager.class)).getRunningAppProcesses();
        boolean z = false;
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().importance <= 100) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z) {
            applicationContext.startService(c2);
        } else if (a(this)) {
            Assertion.v("Unable to start service, see https://issuetracker.google.com/issues/113122354");
        }
    }
}
