package androidx.core.app;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.Intent;
import android.os.IBinder;
import androidx.core.app.f;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;

public class t extends JobServiceEngine implements f.b {
    private final f a;
    private final Object b = new Object();
    private JobParameters c;
    private volatile short d;

    final class a implements f.e {
        final JobWorkItem a;

        a(JobWorkItem jobWorkItem) {
            this.a = jobWorkItem;
        }

        @Override // androidx.core.app.f.e
        public void c() {
            synchronized (t.this.b) {
                if (t.this.c != null) {
                    try {
                        t.this.c.completeWork(this.a);
                    } catch (SecurityException e) {
                        Logger.o(e, "Security exception while completing work.", new Object[0]);
                    } catch (IllegalArgumentException e2) {
                        Assertion.i("SafeJobService lifecycle issue, state:" + ((int) t.this.d), e2);
                    }
                }
            }
        }

        @Override // androidx.core.app.f.e
        public Intent getIntent() {
            return this.a.getIntent();
        }
    }

    t(f fVar) {
        super(fVar);
        this.a = fVar;
        this.d = 43;
    }

    @Override // androidx.core.app.f.b
    public IBinder a() {
        return getBinder();
    }

    @Override // androidx.core.app.f.b
    public f.e b() {
        JobWorkItem jobWorkItem;
        synchronized (this.b) {
            JobParameters jobParameters = this.c;
            if (jobParameters == null) {
                return null;
            }
            try {
                jobWorkItem = jobParameters.dequeueWork();
            } catch (SecurityException e) {
                Logger.o(e, "Security exception while dequeing work.", new Object[0]);
                jobWorkItem = null;
            }
        }
        if (jobWorkItem == null) {
            return null;
        }
        jobWorkItem.getIntent().setExtrasClassLoader(this.a.getClassLoader());
        return new a(jobWorkItem);
    }

    @Override // android.app.job.JobServiceEngine
    public boolean onStartJob(JobParameters jobParameters) {
        this.c = jobParameters;
        this.a.b(false);
        this.d = 44;
        return true;
    }

    @Override // android.app.job.JobServiceEngine
    public boolean onStopJob(JobParameters jobParameters) {
        f.a aVar = this.a.c;
        if (aVar != null) {
            aVar.cancel(false);
        }
        synchronized (this.b) {
            this.c = null;
        }
        this.d = 45;
        return true;
    }
}
