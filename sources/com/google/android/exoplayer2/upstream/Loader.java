package com.google.android.exoplayer2.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.comscore.util.crashreport.CrashReportManager;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.o;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class Loader implements w {
    public static final c d = new c(2, -9223372036854775807L, null);
    public static final c e = new c(3, -9223372036854775807L, null);
    private final ExecutorService a;
    private d<? extends e> b;
    private IOException c;

    public static final class UnexpectedLoaderException extends IOException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public UnexpectedLoaderException(java.lang.Throwable r3) {
            /*
                r2 = this;
                java.lang.String r0 = "Unexpected "
                java.lang.StringBuilder r0 = defpackage.je.V0(r0)
                java.lang.Class r1 = r3.getClass()
                java.lang.String r1 = r1.getSimpleName()
                r0.append(r1)
                java.lang.String r1 = ": "
                r0.append(r1)
                java.lang.String r1 = r3.getMessage()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.Loader.UnexpectedLoaderException.<init>(java.lang.Throwable):void");
        }
    }

    public interface b<T extends e> {
        void g(T t, long j, long j2, boolean z);

        void i(T t, long j, long j2);

        c o(T t, long j, long j2, IOException iOException, int i);
    }

    public static final class c {
        private final int a;
        private final long b;

        c(int i, long j, a aVar) {
            this.a = i;
            this.b = j;
        }

        public boolean c() {
            int i = this.a;
            return i == 0 || i == 1;
        }
    }

    /* access modifiers changed from: private */
    public final class d<T extends e> extends Handler implements Runnable {
        public final int a;
        private final T b;
        private final long c;
        private b<T> f;
        private IOException n;
        private int o;
        private volatile Thread p;
        private volatile boolean q;
        private volatile boolean r;

        public d(Looper looper, T t, b<T> bVar, int i, long j) {
            super(looper);
            this.b = t;
            this.f = bVar;
            this.a = i;
            this.c = j;
        }

        private void b() {
            this.n = null;
            ExecutorService executorService = Loader.this.a;
            d dVar = Loader.this.b;
            dVar.getClass();
            executorService.execute(dVar);
        }

        public void a(boolean z) {
            this.r = z;
            this.n = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                this.q = true;
                this.b.b();
                Thread thread = this.p;
                if (thread != null) {
                    thread.interrupt();
                }
            }
            if (z) {
                Loader.this.b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                b<T> bVar = this.f;
                bVar.getClass();
                bVar.g(this.b, elapsedRealtime, elapsedRealtime - this.c, true);
                this.f = null;
            }
        }

        public void c(int i) {
            IOException iOException = this.n;
            if (iOException != null && this.o > i) {
                throw iOException;
            }
        }

        public void d(long j) {
            com.google.android.exoplayer2.util.g.m(Loader.this.b == null);
            Loader.this.b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            long j;
            if (!this.r) {
                int i = message.what;
                if (i == 0) {
                    b();
                } else if (i != 4) {
                    Loader.this.b = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j2 = elapsedRealtime - this.c;
                    b<T> bVar = this.f;
                    bVar.getClass();
                    if (this.q) {
                        bVar.g(this.b, elapsedRealtime, j2, false);
                        return;
                    }
                    int i2 = message.what;
                    if (i2 == 1) {
                        bVar.g(this.b, elapsedRealtime, j2, false);
                    } else if (i2 == 2) {
                        try {
                            bVar.i(this.b, elapsedRealtime, j2);
                        } catch (RuntimeException e) {
                            Log.e("LoadTask", "Unexpected exception handling load completed", e);
                            Loader.this.c = new UnexpectedLoaderException(e);
                        }
                    } else if (i2 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.n = iOException;
                        int i3 = this.o + 1;
                        this.o = i3;
                        c o2 = bVar.o(this.b, elapsedRealtime, j2, iOException, i3);
                        if (o2.a == 3) {
                            Loader.this.c = this.n;
                        } else if (o2.a != 2) {
                            if (o2.a == 1) {
                                this.o = 1;
                            }
                            if (o2.b != -9223372036854775807L) {
                                j = o2.b;
                            } else {
                                j = (long) Math.min((this.o - 1) * Constants.ONE_SECOND, (int) CrashReportManager.TIME_WINDOW);
                            }
                            d(j);
                        }
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.p = Thread.currentThread();
                if (!this.q) {
                    o.b("load:" + this.b.getClass().getSimpleName());
                    try {
                        this.b.a();
                    } finally {
                        o.f();
                    }
                }
                if (!this.r) {
                    sendEmptyMessage(2);
                }
            } catch (IOException e) {
                if (!this.r) {
                    obtainMessage(3, e).sendToTarget();
                }
            } catch (InterruptedException unused) {
                com.google.android.exoplayer2.util.g.m(this.q);
                if (!this.r) {
                    sendEmptyMessage(2);
                }
            } catch (Exception e2) {
                Log.e("LoadTask", "Unexpected exception loading stream", e2);
                if (!this.r) {
                    obtainMessage(3, new UnexpectedLoaderException(e2)).sendToTarget();
                }
            } catch (OutOfMemoryError e3) {
                Log.e("LoadTask", "OutOfMemory error loading stream", e3);
                if (!this.r) {
                    obtainMessage(3, new UnexpectedLoaderException(e3)).sendToTarget();
                }
            } catch (Error e4) {
                Log.e("LoadTask", "Unexpected error loading stream", e4);
                if (!this.r) {
                    obtainMessage(4, e4).sendToTarget();
                }
                throw e4;
            }
        }
    }

    public interface e {
        void a();

        void b();
    }

    public interface f {
        void p();
    }

    /* access modifiers changed from: private */
    public static final class g implements Runnable {
        private final f a;

        public g(f fVar) {
            this.a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.p();
        }
    }

    public Loader(String str) {
        int i = f0.a;
        this.a = Executors.newSingleThreadExecutor(new com.google.android.exoplayer2.util.e(str));
    }

    public static c g(boolean z, long j) {
        return new c(z ? 1 : 0, j, null);
    }

    public void e() {
        d<? extends e> dVar = this.b;
        com.google.android.exoplayer2.util.g.q(dVar);
        dVar.a(false);
    }

    public void f() {
        this.c = null;
    }

    public boolean h() {
        return this.c != null;
    }

    public boolean i() {
        return this.b != null;
    }

    public void j() {
        IOException iOException = this.c;
        if (iOException == null) {
            d<? extends e> dVar = this.b;
            if (dVar != null) {
                dVar.c(dVar.a);
                return;
            }
            return;
        }
        throw iOException;
    }

    public void k(int i) {
        IOException iOException = this.c;
        if (iOException == null) {
            d<? extends e> dVar = this.b;
            if (dVar != null) {
                if (i == Integer.MIN_VALUE) {
                    i = dVar.a;
                }
                dVar.c(i);
                return;
            }
            return;
        }
        throw iOException;
    }

    public void l(f fVar) {
        d<? extends e> dVar = this.b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.a.execute(new g(fVar));
        }
        this.a.shutdown();
    }

    public <T extends e> long m(T t, b<T> bVar, int i) {
        Looper myLooper = Looper.myLooper();
        com.google.android.exoplayer2.util.g.q(myLooper);
        this.c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new d(myLooper, t, bVar, i, elapsedRealtime).d(0);
        return elapsedRealtime;
    }
}
