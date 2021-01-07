package com.github.anrwatchdog;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;

public class a extends Thread {
    private static final f s = new C0083a();
    private static final e t = new b();
    private static final g u = new c();
    private f a = s;
    private e b = t;
    private g c = u;
    private final Handler f = new Handler(Looper.getMainLooper());
    private final int n;
    private String o = "";
    private volatile long p = 0;
    private volatile boolean q = false;
    private final Runnable r = new d();

    /* renamed from: com.github.anrwatchdog.a$a  reason: collision with other inner class name */
    static class C0083a implements f {
        C0083a() {
        }

        @Override // com.github.anrwatchdog.a.f
        public void a(ANRError aNRError) {
            throw aNRError;
        }
    }

    static class b implements e {
        b() {
        }
    }

    static class c implements g {
        c() {
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.p = 0;
            a.this.q = false;
        }
    }

    public interface e {
    }

    public interface f {
        void a(ANRError aNRError);
    }

    public interface g {
    }

    public a(int i) {
        this.n = i;
    }

    public a c(f fVar) {
        this.a = fVar;
        return this;
    }

    public a d() {
        this.o = null;
        return this;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        ANRError aNRError;
        setName("|ANR-WatchDog|");
        long j = (long) this.n;
        while (!isInterrupted()) {
            boolean z = this.p == 0;
            this.p += j;
            if (z) {
                this.f.post(this.r);
            }
            try {
                Thread.sleep(j);
                if (this.p != 0 && !this.q) {
                    if (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) {
                        this.q = true;
                    } else {
                        this.b.getClass();
                        if (this.o != null) {
                            aNRError = ANRError.a(this.p, this.o, false);
                        } else {
                            aNRError = ANRError.b(this.p);
                        }
                        this.a.a(aNRError);
                        j = (long) this.n;
                        this.q = true;
                    }
                }
            } catch (InterruptedException e2) {
                ((c) this.c).getClass();
                e2.getMessage();
                return;
            }
        }
    }
}
