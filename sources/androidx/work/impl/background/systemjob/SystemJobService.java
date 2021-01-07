package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import androidx.work.impl.b;
import androidx.work.impl.l;
import androidx.work.j;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SystemJobService extends JobService implements b {
    private static final String c = j.f("SystemJobService");
    private l a;
    private final Map<String, JobParameters> b = new HashMap();

    private static String a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // androidx.work.impl.b
    public void e(String str, boolean z) {
        JobParameters remove;
        j.c().a(c, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.b) {
            remove = this.b.remove(str);
        }
        if (remove != null) {
            jobFinished(remove, z);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            l k = l.k(getApplicationContext());
            this.a = k;
            k.m().a(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                j.c().h(c, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        l lVar = this.a;
        if (lVar != null) {
            lVar.m().g(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.a == null) {
            j.c().a(c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String a2 = a(jobParameters);
        if (TextUtils.isEmpty(a2)) {
            j.c().b(c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.b) {
            if (this.b.containsKey(a2)) {
                j.c().a(c, String.format("Job is already being executed by SystemJobService: %s", a2), new Throwable[0]);
                return false;
            }
            j.c().a(c, String.format("onStartJob for %s", a2), new Throwable[0]);
            this.b.put(a2, jobParameters);
        }
        WorkerParameters.a aVar = null;
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            aVar = new WorkerParameters.a();
            if (jobParameters.getTriggeredContentUris() != null) {
                aVar.b = Arrays.asList(jobParameters.getTriggeredContentUris());
            }
            if (jobParameters.getTriggeredContentAuthorities() != null) {
                aVar.a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
            }
            if (i >= 28) {
                jobParameters.getNetwork();
            }
        }
        this.a.w(a2, aVar);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.a == null) {
            j.c().a(c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String a2 = a(jobParameters);
        if (TextUtils.isEmpty(a2)) {
            j.c().b(c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        j.c().a(c, String.format("onStopJob for %s", a2), new Throwable[0]);
        synchronized (this.b) {
            this.b.remove(a2);
        }
        this.a.y(a2);
        return !this.a.m().c(a2);
    }
}
