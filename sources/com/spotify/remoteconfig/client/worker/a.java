package com.spotify.remoteconfig.client.worker;

import android.content.Context;
import androidx.work.BackoffPolicy;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.b;
import androidx.work.d;
import androidx.work.impl.l;
import androidx.work.k;
import androidx.work.m;
import androidx.work.p;
import com.spotify.remoteconfig.client.model.resolve.FetchType;
import java.util.concurrent.TimeUnit;

public class a {
    private static p a(Context context) {
        if (context != null) {
            try {
                return l.k(context);
            } catch (IllegalStateException e) {
                trf.c(e, "An error occurred while getting an instance of WorkManager.", new Object[0]);
                return null;
            }
        } else {
            l j = l.j();
            if (j != null) {
                return j;
            }
            throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
        }
    }

    public static void b(Context context) {
        p a = a(context);
        if (a != null) {
            trf.d("Enqueueing periodic work", new Object[0]);
            TimeUnit timeUnit = TimeUnit.HOURS;
            c cVar = new c(24, timeUnit, 12, timeUnit);
            ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy = ExistingPeriodicWorkPolicy.REPLACE;
            FetchType fetchType = FetchType.BACKGROUND_SYNC;
            d.a aVar = new d.a();
            aVar.e("FETCH_TYPE", fetchType.d());
            d a2 = aVar.a();
            b.a aVar2 = new b.a();
            aVar2.c(true);
            aVar2.b(NetworkType.UNMETERED);
            a.d("remote-config-fetch-daily", existingPeriodicWorkPolicy, (m) ((m.a) ((m.a) ((m.a) new m.a(FetchPropertiesWorker.class, (long) cVar.c(), cVar.d(), (long) cVar.a(), cVar.b()).h(a2)).f(aVar2.a())).e(BackoffPolicy.EXPONENTIAL, 5, TimeUnit.MINUTES)).b());
        }
    }

    public static void c(Context context, int i) {
        p a = a(context);
        if (a != null) {
            trf.d("Enqueuing delayed work", new Object[0]);
            ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.REPLACE;
            FetchType fetchType = FetchType.DELAYED;
            d.a aVar = new d.a();
            aVar.e("FETCH_TYPE", fetchType.d());
            d a2 = aVar.a();
            b.a aVar2 = new b.a();
            aVar2.b(NetworkType.CONNECTED);
            a.e("remote-config-fetch-delayed", existingWorkPolicy, (k) ((k.a) ((k.a) ((k.a) ((k.a) new k.a(FetchPropertiesWorker.class).h(a2)).g((long) i, TimeUnit.SECONDS)).f(aVar2.a())).e(BackoffPolicy.EXPONENTIAL, 5, TimeUnit.MINUTES)).b());
        }
    }

    public static void d(Context context) {
        trf.d("Unscheduling background work", new Object[0]);
        e(context);
        trf.d("Unscheduling daily background work", new Object[0]);
        p a = a(context);
        if (a != null) {
            a.a("remote-config-fetch-daily");
        }
    }

    public static void e(Context context) {
        trf.d("Unscheduling delayed background work", new Object[0]);
        p a = a(context);
        if (a != null) {
            a.a("remote-config-fetch-delayed");
        }
    }
}
