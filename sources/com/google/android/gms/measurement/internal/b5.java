package com.google.android.gms.measurement.internal;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* access modifiers changed from: package-private */
public final class b5 extends Thread {
    private final Object a;
    private final BlockingQueue<c5<?>> b;
    private boolean c = false;
    private final /* synthetic */ y4 f;

    public b5(y4 y4Var, String str, BlockingQueue<c5<?>> blockingQueue) {
        this.f = y4Var;
        if (blockingQueue != null) {
            this.a = new Object();
            this.b = blockingQueue;
            setName(str);
            return;
        }
        throw new NullPointerException("null reference");
    }

    private final void b(InterruptedException interruptedException) {
        this.f.l().H().b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    private final void c() {
        synchronized (this.f.i) {
            if (!this.c) {
                this.f.j.release();
                this.f.i.notifyAll();
                if (this == this.f.c) {
                    this.f.c = null;
                } else if (this == this.f.d) {
                    this.f.d = null;
                } else {
                    this.f.l().E().a("Current scheduler thread is neither worker nor network");
                }
                this.c = true;
            }
        }
    }

    public final void a() {
        synchronized (this.a) {
            this.a.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.f.j.acquire();
                z = true;
            } catch (InterruptedException e) {
                b(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                c5<?> poll = this.b.poll();
                if (poll != null) {
                    Process.setThreadPriority(poll.b ? threadPriority : 10);
                    poll.run();
                } else {
                    synchronized (this.a) {
                        if (this.b.peek() == null) {
                            this.f.getClass();
                            try {
                                this.a.wait(30000);
                            } catch (InterruptedException e2) {
                                b(e2);
                            }
                        }
                    }
                    synchronized (this.f.i) {
                        if (this.b.peek() == null) {
                            if (this.f.j().r(t.t0)) {
                            }
                            c();
                            return;
                        }
                    }
                }
            }
        } finally {
            c();
        }
    }
}
