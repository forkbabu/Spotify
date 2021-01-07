package com.comscore.android.task;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TaskExecutor {
    private static final long a = 50000;
    private b b;
    private BlockingQueue<a> c;
    private boolean d;
    private TaskExceptionHandler e;

    public TaskExecutor() {
        this(new TaskExceptionHandler() {
            /* class com.comscore.android.task.TaskExecutor.AnonymousClass1 */

            @Override // com.comscore.android.task.TaskExceptionHandler
            public void exception(Exception exc, TaskExecutor taskExecutor, Runnable runnable) {
                exc.printStackTrace();
            }
        });
    }

    public TaskExecutor(TaskExceptionHandler taskExceptionHandler) {
        this.d = true;
        this.e = taskExceptionHandler;
        this.c = new LinkedBlockingQueue();
        b bVar = new b(this, this.e);
        this.b = bVar;
        bVar.start();
    }

    /* access modifiers changed from: package-private */
    public long a() {
        long j = a;
        for (a aVar : this.c) {
            j = Math.min(j, aVar.a());
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        this.c.remove(aVar);
    }

    /* access modifiers changed from: package-private */
    public a b() {
        for (a aVar : this.c) {
            if (aVar.f() <= System.currentTimeMillis()) {
                return aVar;
            }
        }
        return null;
    }

    public boolean containsTask(Runnable runnable) {
        for (a aVar : this.c) {
            if (aVar.i() == runnable) {
                return true;
            }
            if ((runnable instanceof a) && aVar == runnable) {
                return true;
            }
        }
        return false;
    }

    public boolean execute(Runnable runnable) {
        return execute(runnable, true);
    }

    public boolean execute(Runnable runnable, long j) {
        return execute(runnable, j, 0);
    }

    public boolean execute(Runnable runnable, long j, long j2) {
        return execute(runnable, j, j2, false);
    }

    public boolean execute(Runnable runnable, long j, long j2, boolean z) {
        if (!this.d) {
            return false;
        }
        for (a aVar : this.c) {
            if (aVar != null && aVar.i() == runnable) {
                return false;
            }
        }
        this.c.add(new a(runnable, j, j2, z));
        this.b.c();
        return true;
    }

    public boolean execute(Runnable runnable, boolean z) {
        if (z) {
            return execute(runnable, 0);
        }
        if (!this.d) {
            return false;
        }
        try {
            runnable.run();
            return true;
        } catch (Exception e2) {
            if (this.e == null) {
                return true;
            }
            this.e.exception(e2, this, runnable);
            return true;
        }
    }

    public boolean executeInMainThread(final Runnable runnable) {
        if (!this.d) {
            return false;
        }
        return new Handler(Looper.getMainLooper()).post(new Runnable() {
            /* class com.comscore.android.task.TaskExecutor.AnonymousClass2 */

            @Override // java.lang.Runnable
            public void run() {
                try {
                    runnable.run();
                } catch (Exception e) {
                    if (TaskExecutor.this.e != null) {
                        TaskExecutor.this.e.exception(e, TaskExecutor.this, runnable);
                    }
                }
            }
        });
    }

    public boolean isEnabled() {
        return this.d;
    }

    public void removeAllEnqueuedTasks() {
        ArrayList arrayList = new ArrayList();
        for (a aVar : this.c) {
            if (aVar.k()) {
                arrayList.add(aVar);
            }
        }
        this.c.removeAll(arrayList);
    }

    public boolean removeEnqueuedTask(Runnable runnable) {
        if (runnable == null) {
            return false;
        }
        for (a aVar : this.c) {
            if (aVar.i() == runnable) {
                return this.c.remove(aVar);
            }
        }
        return false;
    }

    public void setEnabled(boolean z) {
        this.d = z;
    }

    public int size() {
        return this.c.size();
    }

    public void waitForLastNonDelayedTaskToFinish() {
        Runnable runnable;
        int size = this.c.size();
        Runnable[] runnableArr = new a[size];
        this.c.toArray(runnableArr);
        int i = size - 1;
        while (true) {
            if (i >= 0) {
                if (runnableArr[i] != null && !runnableArr[i].d()) {
                    runnable = runnableArr[i];
                    break;
                }
                i--;
            } else {
                runnable = null;
                break;
            }
        }
        waitForTaskToFinish(runnable, 0);
    }

    public void waitForTaskToFinish(Runnable runnable, long j) {
        a aVar;
        if (!(runnable instanceof a)) {
            Iterator it = this.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar = null;
                    break;
                }
                aVar = (a) it.next();
                if (aVar.i() == runnable) {
                    break;
                }
            }
        } else {
            aVar = (a) runnable;
        }
        if (aVar != null) {
            long currentTimeMillis = System.currentTimeMillis();
            while (this.c.contains(aVar)) {
                if (j <= 0 || System.currentTimeMillis() < currentTimeMillis + j) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void waitForTasks() {
        while (this.c.size() != 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    }
}
