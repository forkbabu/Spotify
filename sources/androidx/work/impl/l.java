package androidx.work.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.lifecycle.LiveData;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkInfo;
import androidx.work.WorkerParameters;
import androidx.work.a;
import androidx.work.impl.background.systemjob.b;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.d;
import androidx.work.impl.utils.f;
import androidx.work.impl.utils.h;
import androidx.work.impl.utils.i;
import androidx.work.j;
import androidx.work.k;
import androidx.work.m;
import androidx.work.p;
import androidx.work.q;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class l extends p {
    private static l j;
    private static l k;
    private static final Object l = new Object();
    private Context a;
    private a b;
    private WorkDatabase c;
    private na d;
    private List<e> e;
    private d f;
    private f g;
    private boolean h;
    private BroadcastReceiver.PendingResult i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l(android.content.Context r9, androidx.work.a r10, defpackage.na r11) {
        /*
            r8 = this;
            android.content.res.Resources r0 = r9.getResources()
            r1 = 2131034131(0x7f050013, float:1.767877E38)
            boolean r0 = r0.getBoolean(r1)
            android.content.Context r1 = r9.getApplicationContext()
            oa r11 = (defpackage.oa) r11
            androidx.work.impl.utils.g r2 = r11.b()
            int r3 = androidx.work.impl.WorkDatabase.l
            java.lang.Class<androidx.work.impl.WorkDatabase> r3 = androidx.work.impl.WorkDatabase.class
            if (r0 == 0) goto L_0x0023
            androidx.room.RoomDatabase$a r0 = androidx.room.h.b(r1, r3)
            r0.c()
            goto L_0x0033
        L_0x0023:
            int r0 = androidx.work.impl.k.c
            java.lang.String r0 = "androidx.work.workdb"
            androidx.room.RoomDatabase$a r0 = androidx.room.h.a(r1, r3, r0)
            androidx.work.impl.h r3 = new androidx.work.impl.h
            r3.<init>(r1)
            r0.f(r3)
        L_0x0033:
            r0.g(r2)
            androidx.work.impl.i r2 = new androidx.work.impl.i
            r2.<init>()
            r0.a(r2)
            r2 = 1
            j7[] r3 = new defpackage.j7[r2]
            j7 r4 = androidx.work.impl.j.a
            r5 = 0
            r3[r5] = r4
            r0.b(r3)
            j7[] r3 = new defpackage.j7[r2]
            androidx.work.impl.j$g r4 = new androidx.work.impl.j$g
            r6 = 2
            r7 = 3
            r4.<init>(r1, r6, r7)
            r3[r5] = r4
            r0.b(r3)
            j7[] r3 = new defpackage.j7[r2]
            j7 r4 = androidx.work.impl.j.b
            r3[r5] = r4
            r0.b(r3)
            j7[] r3 = new defpackage.j7[r2]
            j7 r4 = androidx.work.impl.j.c
            r3[r5] = r4
            r0.b(r3)
            j7[] r3 = new defpackage.j7[r2]
            androidx.work.impl.j$g r4 = new androidx.work.impl.j$g
            r6 = 5
            r7 = 6
            r4.<init>(r1, r6, r7)
            r3[r5] = r4
            r0.b(r3)
            j7[] r3 = new defpackage.j7[r2]
            j7 r4 = androidx.work.impl.j.d
            r3[r5] = r4
            r0.b(r3)
            j7[] r3 = new defpackage.j7[r2]
            j7 r4 = androidx.work.impl.j.e
            r3[r5] = r4
            r0.b(r3)
            j7[] r3 = new defpackage.j7[r2]
            j7 r4 = androidx.work.impl.j.f
            r3[r5] = r4
            r0.b(r3)
            j7[] r3 = new defpackage.j7[r2]
            androidx.work.impl.j$h r4 = new androidx.work.impl.j$h
            r4.<init>(r1)
            r3[r5] = r4
            r0.b(r3)
            j7[] r2 = new defpackage.j7[r2]
            androidx.work.impl.j$g r3 = new androidx.work.impl.j$g
            r4 = 10
            r6 = 11
            r3.<init>(r1, r4, r6)
            r2[r5] = r3
            r0.b(r2)
            r0.e()
            androidx.room.RoomDatabase r0 = r0.d()
            androidx.work.impl.WorkDatabase r0 = (androidx.work.impl.WorkDatabase) r0
            r8.<init>(r9, r10, r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.l.<init>(android.content.Context, androidx.work.a, na):void");
    }

    @Deprecated
    public static l j() {
        synchronized (l) {
            l lVar = j;
            if (lVar != null) {
                return lVar;
            }
            return k;
        }
    }

    public static l k(Context context) {
        l j2;
        synchronized (l) {
            j2 = j();
            if (j2 == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof a.b) {
                    r(applicationContext, ((a.b) applicationContext).a());
                    j2 = k(applicationContext);
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return j2;
    }

    public static void r(Context context, a aVar) {
        synchronized (l) {
            l lVar = j;
            if (lVar != null) {
                if (k != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            }
            if (lVar == null) {
                Context applicationContext = context.getApplicationContext();
                if (k == null) {
                    k = new l(applicationContext, aVar, new oa(aVar.h()));
                }
                j = k;
            }
        }
    }

    @Override // androidx.work.p
    public androidx.work.l a(String str) {
        androidx.work.impl.utils.a c2 = androidx.work.impl.utils.a.c(str, this, true);
        ((oa) this.d).a(c2);
        return c2.d();
    }

    @Override // androidx.work.p
    public androidx.work.l c(List<? extends q> list) {
        if (!list.isEmpty()) {
            return new g(this, null, ExistingWorkPolicy.KEEP, list, null).a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    @Override // androidx.work.p
    public androidx.work.l d(String str, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, m mVar) {
        ExistingWorkPolicy existingWorkPolicy;
        if (existingPeriodicWorkPolicy == ExistingPeriodicWorkPolicy.KEEP) {
            existingWorkPolicy = ExistingWorkPolicy.KEEP;
        } else {
            existingWorkPolicy = ExistingWorkPolicy.REPLACE;
        }
        return new g(this, str, existingWorkPolicy, Collections.singletonList(mVar), null).a();
    }

    @Override // androidx.work.p
    public androidx.work.l f(String str, ExistingWorkPolicy existingWorkPolicy, List<k> list) {
        return new g(this, str, existingWorkPolicy, list, null).a();
    }

    public androidx.work.l g(UUID uuid) {
        androidx.work.impl.utils.a b2 = androidx.work.impl.utils.a.b(uuid, this);
        ((oa) this.d).a(b2);
        return b2.d();
    }

    public Context h() {
        return this.a;
    }

    public a i() {
        return this.b;
    }

    public f l() {
        return this.g;
    }

    public d m() {
        return this.f;
    }

    public List<e> n() {
        return this.e;
    }

    public WorkDatabase o() {
        return this.c;
    }

    public LiveData<List<WorkInfo>> p(String str) {
        return d.a(((ia) this.c.z()).r(str), ga.s, this.d);
    }

    public na q() {
        return this.d;
    }

    public void s() {
        synchronized (l) {
            this.h = true;
            BroadcastReceiver.PendingResult pendingResult = this.i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.i = null;
            }
        }
    }

    public void t() {
        if (Build.VERSION.SDK_INT >= 23) {
            b.b(this.a);
        }
        ((ia) this.c.z()).v();
        f.b(this.b, this.c, this.e);
    }

    public void u(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (l) {
            this.i = pendingResult;
            if (this.h) {
                pendingResult.finish();
                this.i = null;
            }
        }
    }

    public void v(String str) {
        ((oa) this.d).a(new h(this, str, null));
    }

    public void w(String str, WorkerParameters.a aVar) {
        ((oa) this.d).a(new h(this, str, aVar));
    }

    public void x(String str) {
        ((oa) this.d).a(new i(this, str, true));
    }

    public void y(String str) {
        ((oa) this.d).a(new i(this, str, false));
    }

    public l(Context context, a aVar, na naVar, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        j.e(new j.a(aVar.f()));
        List<e> asList = Arrays.asList(f.a(applicationContext, this), new x8(applicationContext, aVar, naVar, this));
        d dVar = new d(context, aVar, naVar, workDatabase, asList);
        Context applicationContext2 = context.getApplicationContext();
        this.a = applicationContext2;
        this.b = aVar;
        this.d = naVar;
        this.c = workDatabase;
        this.e = asList;
        this.f = dVar;
        this.g = new f(workDatabase);
        this.h = false;
        if (Build.VERSION.SDK_INT < 24 || !applicationContext2.isDeviceProtectedStorage()) {
            ((oa) this.d).a(new ForceStopRunnable(applicationContext2, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }
}
