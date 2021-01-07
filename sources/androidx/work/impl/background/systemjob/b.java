package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.e;
import androidx.work.impl.l;
import androidx.work.impl.utils.c;
import androidx.work.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class b implements e {
    private static final String n = j.f("SystemJobScheduler");
    private final Context a;
    private final JobScheduler b;
    private final l c;
    private final a f;

    public b(Context context, l lVar) {
        a aVar = new a(context);
        this.a = context;
        this.c = lVar;
        this.b = (JobScheduler) context.getSystemService("jobscheduler");
        this.f = aVar;
    }

    public static void b(Context context) {
        List<JobInfo> h;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (!(jobScheduler == null || (h = h(context, jobScheduler)) == null || h.isEmpty())) {
            for (JobInfo jobInfo : h) {
                f(jobScheduler, jobInfo.getId());
            }
        }
    }

    public static void e(Context context) {
        List<JobInfo> h;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (!(jobScheduler == null || (h = h(context, jobScheduler)) == null || h.isEmpty())) {
            for (JobInfo jobInfo : h) {
                if (i(jobInfo) == null) {
                    f(jobScheduler, jobInfo.getId());
                }
            }
        }
    }

    private static void f(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            j.c().b(n, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    private static List<Integer> g(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> h = h(context, jobScheduler);
        if (h == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : h) {
            if (str.equals(i(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    private static List<JobInfo> h(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            j.c().b(n, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    private static String i(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // androidx.work.impl.e
    public void a(String str) {
        List<Integer> g = g(this.a, this.b, str);
        if (!(g == null || g.isEmpty())) {
            for (Integer num : g) {
                f(this.b, num.intValue());
            }
            ((z9) this.c.o().w()).c(str);
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // androidx.work.impl.e
    public void c(ga... gaVarArr) {
        int i;
        List<Integer> g;
        int i2;
        WorkDatabase o = this.c.o();
        c cVar = new c(o);
        for (ga gaVar : gaVarArr) {
            o.c();
            try {
                ga p = ((ia) o.z()).p(gaVar.a);
                if (p == null) {
                    j.c().h(n, "Skipping scheduling " + gaVar.a + " because it's no longer in the DB", new Throwable[0]);
                    o.s();
                } else if (p.b != WorkInfo.State.ENQUEUED) {
                    j.c().h(n, "Skipping scheduling " + gaVar.a + " because it is no longer enqueued", new Throwable[0]);
                    o.s();
                } else {
                    x9 a2 = ((z9) o.w()).a(gaVar.a);
                    if (a2 != null) {
                        i = a2.b;
                    } else {
                        this.c.i().getClass();
                        i = cVar.c(0, this.c.i().d());
                    }
                    if (a2 == null) {
                        ((z9) this.c.o().w()).b(new x9(gaVar.a, i));
                    }
                    j(gaVar, i);
                    if (Build.VERSION.SDK_INT == 23 && (g = g(this.a, this.b, gaVar.a)) != null) {
                        int indexOf = g.indexOf(Integer.valueOf(i));
                        if (indexOf >= 0) {
                            g.remove(indexOf);
                        }
                        if (!g.isEmpty()) {
                            i2 = g.get(0).intValue();
                        } else {
                            this.c.i().getClass();
                            i2 = cVar.c(0, this.c.i().d());
                        }
                        j(gaVar, i2);
                    }
                    o.s();
                }
                o.h();
            } catch (Throwable th) {
                o.h();
                throw th;
            }
        }
    }

    @Override // androidx.work.impl.e
    public boolean d() {
        return true;
    }

    public void j(ga gaVar, int i) {
        JobInfo a2 = this.f.a(gaVar, i);
        j.c().a(n, String.format("Scheduling work ID %s Job ID %s", gaVar.a, Integer.valueOf(i)), new Throwable[0]);
        try {
            this.b.schedule(a2);
        } catch (IllegalStateException e) {
            List<JobInfo> h = h(this.a, this.b);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(h != null ? h.size() : 0), Integer.valueOf(((ArrayList) ((ia) this.c.o().z()).m()).size()), Integer.valueOf(this.c.i().e()));
            j.c().b(n, format, new Throwable[0]);
            throw new IllegalStateException(format, e);
        } catch (Throwable th) {
            j.c().b(n, String.format("Unable to schedule %s", gaVar), th);
        }
    }
}
