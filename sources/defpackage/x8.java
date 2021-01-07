package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import androidx.work.WorkInfo;
import androidx.work.a;
import androidx.work.impl.b;
import androidx.work.impl.e;
import androidx.work.impl.l;
import androidx.work.j;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: x8  reason: default package */
public class x8 implements e, a9, b {
    private static final String r = j.f("GreedyScheduler");
    private final Context a;
    private final l b;
    private final b9 c;
    private final Set<ga> f = new HashSet();
    private w8 n;
    private boolean o;
    private final Object p;
    Boolean q;

    public x8(Context context, a aVar, na naVar, l lVar) {
        this.a = context;
        this.b = lVar;
        this.c = new b9(context, naVar, this);
        this.n = new w8(this, aVar.g());
        this.p = new Object();
    }

    private String g() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        Object obj;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return Application.getProcessName();
        }
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread", false, x8.class.getClassLoader());
            if (i >= 18) {
                Method declaredMethod = cls.getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                obj = declaredMethod.invoke(null, new Object[0]);
            } else {
                Method declaredMethod2 = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = cls.getDeclaredMethod("getProcessName", new Class[0]);
                declaredMethod3.setAccessible(true);
                obj = declaredMethod3.invoke(declaredMethod2.invoke(null, new Object[0]), new Object[0]);
            }
            if (obj instanceof String) {
                return (String) obj;
            }
        } catch (Throwable th) {
            j.c().a(r, "Unable to check ActivityThread for processName", th);
        }
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) this.a.getSystemService("activity");
        if (!(activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null || runningAppProcesses.isEmpty())) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return null;
    }

    @Override // androidx.work.impl.e
    public void a(String str) {
        if (this.q == null) {
            this.q = Boolean.valueOf(TextUtils.equals(this.a.getPackageName(), g()));
        }
        if (!this.q.booleanValue()) {
            j.c().d(r, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.o) {
            this.b.m().a(this);
            this.o = true;
        }
        j.c().a(r, String.format("Cancelling work ID %s", str), new Throwable[0]);
        w8 w8Var = this.n;
        if (w8Var != null) {
            w8Var.b(str);
        }
        this.b.y(str);
    }

    @Override // defpackage.a9
    public void b(List<String> list) {
        for (String str : list) {
            j.c().a(r, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.b.y(str);
        }
    }

    @Override // androidx.work.impl.e
    public void c(ga... gaVarArr) {
        if (this.q == null) {
            this.q = Boolean.valueOf(TextUtils.equals(this.a.getPackageName(), g()));
        }
        if (!this.q.booleanValue()) {
            j.c().d(r, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.o) {
            this.b.m().a(this);
            this.o = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (ga gaVar : gaVarArr) {
            long a2 = gaVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (gaVar.b == WorkInfo.State.ENQUEUED) {
                if (currentTimeMillis < a2) {
                    w8 w8Var = this.n;
                    if (w8Var != null) {
                        w8Var.a(gaVar);
                    }
                } else if (gaVar.b()) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 23 && gaVar.j.h()) {
                        j.c().a(r, String.format("Ignoring WorkSpec %s, Requires device idle.", gaVar), new Throwable[0]);
                    } else if (i < 24 || !gaVar.j.e()) {
                        hashSet.add(gaVar);
                        hashSet2.add(gaVar.a);
                    } else {
                        j.c().a(r, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", gaVar), new Throwable[0]);
                    }
                } else {
                    j.c().a(r, String.format("Starting work for %s", gaVar.a), new Throwable[0]);
                    this.b.v(gaVar.a);
                }
            }
        }
        synchronized (this.p) {
            if (!hashSet.isEmpty()) {
                j.c().a(r, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                this.f.addAll(hashSet);
                this.c.d(this.f);
            }
        }
    }

    @Override // androidx.work.impl.e
    public boolean d() {
        return false;
    }

    @Override // androidx.work.impl.b
    public void e(String str, boolean z) {
        synchronized (this.p) {
            Iterator<ga> it = this.f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ga next = it.next();
                if (next.a.equals(str)) {
                    j.c().a(r, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.f.remove(next);
                    this.c.d(this.f);
                    break;
                }
            }
        }
    }

    @Override // defpackage.a9
    public void f(List<String> list) {
        for (String str : list) {
            j.c().a(r, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.b.v(str);
        }
    }
}
