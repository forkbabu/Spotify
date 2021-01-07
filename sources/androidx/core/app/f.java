package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class f extends Service {
    static final Object o = new Object();
    static final HashMap<ComponentName, h> p = new HashMap<>();
    b a;
    h b;
    a c;
    boolean f = false;
    final ArrayList<d> n;

    /* access modifiers changed from: package-private */
    public final class a extends AsyncTask<Void, Void, Void> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            d dVar;
            while (true) {
                f fVar = f.this;
                b bVar = fVar.a;
                if (bVar != null) {
                    dVar = bVar.b();
                } else {
                    synchronized (fVar.n) {
                        if (fVar.n.size() > 0) {
                            dVar = fVar.n.remove(0);
                        } else {
                            dVar = null;
                        }
                    }
                }
                if (dVar == null) {
                    return null;
                }
                f.this.d(dVar.getIntent());
                dVar.c();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onCancelled(Void r1) {
            f.this.e();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Void r1) {
            f.this.e();
        }
    }

    interface b {
        IBinder a();

        e b();
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h {
        private final Context d;
        private final PowerManager.WakeLock e;
        private final PowerManager.WakeLock f;
        boolean g;
        boolean h;

        c(Context context, ComponentName componentName) {
            super(componentName);
            this.d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.app.f.h
        public void a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.a);
            if (this.d.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.g) {
                        this.g = true;
                        if (!this.h) {
                            this.e.acquire(60000);
                        }
                    }
                }
            }
        }

        @Override // androidx.core.app.f.h
        public void c() {
            synchronized (this) {
                if (this.h) {
                    if (this.g) {
                        this.e.acquire(60000);
                    }
                    this.h = false;
                    this.f.release();
                }
            }
        }

        @Override // androidx.core.app.f.h
        public void d() {
            synchronized (this) {
                if (!this.h) {
                    this.h = true;
                    this.f.acquire(600000);
                    this.e.release();
                }
            }
        }

        @Override // androidx.core.app.f.h
        public void e() {
            synchronized (this) {
                this.g = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final class d implements e {
        final Intent a;
        final int b;

        d(Intent intent, int i) {
            this.a = intent;
            this.b = i;
        }

        @Override // androidx.core.app.f.e
        public void c() {
            f.this.stopSelf(this.b);
        }

        @Override // androidx.core.app.f.e
        public Intent getIntent() {
            return this.a;
        }
    }

    interface e {
        void c();

        Intent getIntent();
    }

    /* renamed from: androidx.core.app.f$f  reason: collision with other inner class name */
    static final class job.JobServiceEngineC0027f extends JobServiceEngine implements b {
        final f a;
        final Object b = new Object();
        JobParameters c;

        /* renamed from: androidx.core.app.f$f$a */
        final class a implements e {
            final JobWorkItem a;

            a(JobWorkItem jobWorkItem) {
                this.a = jobWorkItem;
            }

            @Override // androidx.core.app.f.e
            public void c() {
                synchronized (job.JobServiceEngineC0027f.this.b) {
                    JobParameters jobParameters = job.JobServiceEngineC0027f.this.c;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.a);
                    }
                }
            }

            @Override // androidx.core.app.f.e
            public Intent getIntent() {
                return this.a.getIntent();
            }
        }

        job.JobServiceEngineC0027f(f fVar) {
            super(fVar);
            this.a = fVar;
        }

        @Override // androidx.core.app.f.b
        public IBinder a() {
            return getBinder();
        }

        @Override // androidx.core.app.f.b
        public e b() {
            JobWorkItem dequeueWork;
            synchronized (this.b) {
                JobParameters jobParameters = this.c;
                if (jobParameters == null) {
                    return null;
                }
                dequeueWork = jobParameters.dequeueWork();
            }
            if (dequeueWork == null) {
                return null;
            }
            dequeueWork.getIntent().setExtrasClassLoader(this.a.getClassLoader());
            return new a(dequeueWork);
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters jobParameters) {
            this.c = jobParameters;
            this.a.b(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters) {
            a aVar = this.a.c;
            if (aVar != null) {
                aVar.cancel(false);
            }
            synchronized (this.b) {
                this.c = null;
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends h {
        private final JobInfo d;
        private final JobScheduler e;

        g(Context context, ComponentName componentName, int i) {
            super(componentName);
            b(i);
            this.d = new JobInfo.Builder(i, this.a).setOverrideDeadline(0).build();
            this.e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.app.f.h
        public void a(Intent intent) {
            this.e.enqueue(this.d, new JobWorkItem(intent));
        }
    }

    /* access modifiers changed from: package-private */
    public static abstract class h {
        final ComponentName a;
        boolean b;
        int c;

        h(ComponentName componentName) {
            this.a = componentName;
        }

        /* access modifiers changed from: package-private */
        public abstract void a(Intent intent);

        /* access modifiers changed from: package-private */
        public void b(int i) {
            if (!this.b) {
                this.b = true;
                this.c = i;
            } else if (this.c != i) {
                StringBuilder W0 = je.W0("Given job ID ", i, " is different than previous ");
                W0.append(this.c);
                throw new IllegalArgumentException(W0.toString());
            }
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    public f() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.n = null;
        } else {
            this.n = new ArrayList<>();
        }
    }

    public static void a(Context context, Class<?> cls, int i, Intent intent) {
        ComponentName componentName = new ComponentName(context, cls);
        synchronized (o) {
            h c2 = c(context, componentName, true, i);
            c2.b(i);
            c2.a(intent);
        }
    }

    static h c(Context context, ComponentName componentName, boolean z, int i) {
        h hVar;
        HashMap<ComponentName, h> hashMap = p;
        h hVar2 = hashMap.get(componentName);
        if (hVar2 != null) {
            return hVar2;
        }
        if (Build.VERSION.SDK_INT < 26) {
            hVar = new c(context, componentName);
        } else if (z) {
            hVar = new g(context, componentName, i);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        hashMap.put(componentName, hVar);
        return hVar;
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z) {
        if (this.c == null) {
            this.c = new a();
            h hVar = this.b;
            if (hVar != null && z) {
                hVar.d();
            }
            this.c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void d(Intent intent);

    /* access modifiers changed from: package-private */
    public void e() {
        ArrayList<d> arrayList = this.n;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.c = null;
                ArrayList<d> arrayList2 = this.n;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    b(false);
                } else if (!this.f) {
                    this.b.c();
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        b bVar = this.a;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new job.JobServiceEngineC0027f(this);
            this.b = null;
            return;
        }
        this.a = null;
        this.b = c(this, new ComponentName(this, getClass()), false, 0);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<d> arrayList = this.n;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f = true;
                this.b.c();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.n == null) {
            return 2;
        }
        this.b.e();
        synchronized (this.n) {
            ArrayList<d> arrayList = this.n;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new d(intent, i2));
            b(true);
        }
        return 3;
    }
}
