package com.google.android.exoplayer2.offline;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.comscore.util.crashreport.CrashReportManager;
import com.google.android.exoplayer2.offline.q;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;
import defpackage.Cdo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

public final class n {
    public static final co n = new co(1);
    private final Context a;
    private final y b;
    private final c c;
    private final Cdo.d d;
    private final CopyOnWriteArraySet<d> e = new CopyOnWriteArraySet<>();
    private int f;
    private int g;
    private boolean h = true;
    private int i = 3;
    private int j = 5;
    private int k;
    private List<k> l = Collections.emptyList();
    private Cdo m;

    public static final class b {
        public final k a;
        public final boolean b;
        public final List<k> c;

        public b(k kVar, boolean z, List<k> list) {
            this.a = kVar;
            this.b = z;
            this.c = list;
        }
    }

    public static final class c extends Handler {
        public static final /* synthetic */ int l = 0;
        private final HandlerThread a;
        private final y b;
        private final s c;
        private final Handler d;
        private final ArrayList<k> e = new ArrayList<>();
        private final HashMap<String, e> f = new HashMap<>();
        private int g;
        private boolean h;
        private int i;
        private int j;
        private int k;

        public c(HandlerThread handlerThread, y yVar, s sVar, Handler handler, int i2, int i3, boolean z) {
            super(handlerThread.getLooper());
            this.a = handlerThread;
            this.b = yVar;
            this.c = sVar;
            this.d = handler;
            this.i = i2;
            this.j = i3;
            this.h = z;
        }

        private static k a(k kVar, int i2) {
            return new k(kVar.a, i2, kVar.c, System.currentTimeMillis(), kVar.e, 0, 0, kVar.h);
        }

        private k b(String str, boolean z) {
            int c2 = c(str);
            if (c2 != -1) {
                return this.e.get(c2);
            }
            if (!z) {
                return null;
            }
            try {
                return ((i) this.b).d(str);
            } catch (IOException e2) {
                Log.e("DownloadManager", "Failed to load download: " + str, e2);
                return null;
            }
        }

        private int c(String str) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                if (this.e.get(i2).a.a.equals(str)) {
                    return i2;
                }
            }
            return -1;
        }

        private k d(k kVar) {
            g gVar = g.a;
            int i2 = kVar.b;
            boolean z = true;
            g.m((i2 == 3 || i2 == 4) ? false : true);
            int c2 = c(kVar.a.a);
            if (c2 == -1) {
                this.e.add(kVar);
                Collections.sort(this.e, gVar);
            } else {
                if (kVar.c == this.e.get(c2).c) {
                    z = false;
                }
                this.e.set(c2, kVar);
                if (z) {
                    Collections.sort(this.e, gVar);
                }
            }
            try {
                ((i) this.b).h(kVar);
            } catch (IOException e2) {
                Log.e("DownloadManager", "Failed to update index.", e2);
            }
            this.d.obtainMessage(2, new b(kVar, false, new ArrayList(this.e))).sendToTarget();
            return kVar;
        }

        private k e(k kVar, int i2) {
            boolean z = true;
            if (i2 == 3 || i2 == 4 || i2 == 1) {
                z = false;
            }
            g.m(z);
            k a2 = a(kVar, i2);
            d(a2);
            return a2;
        }

        private void f(k kVar, int i2) {
            if (i2 == 0) {
                if (kVar.b == 1) {
                    e(kVar, 0);
                }
            } else if (i2 != kVar.f) {
                int i3 = kVar.b;
                if (i3 == 0 || i3 == 2) {
                    i3 = 1;
                }
                d(new k(kVar.a, i3, kVar.c, System.currentTimeMillis(), kVar.e, i2, 0, kVar.h));
            }
        }

        private void g() {
            int i2 = 0;
            for (int i3 = 0; i3 < this.e.size(); i3++) {
                k kVar = this.e.get(i3);
                e eVar = this.f.get(kVar.a.a);
                int i4 = kVar.b;
                boolean z = true;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            eVar.getClass();
                            g.m(!eVar.f);
                            if (this.h || this.g != 0) {
                                z = false;
                            }
                            if (!z || i2 >= this.i) {
                                e(kVar, 0);
                                eVar.f(false);
                            }
                        } else if (i4 != 5 && i4 != 7) {
                            throw new IllegalStateException();
                        } else if (eVar == null) {
                            e eVar2 = new e(kVar.a, this.c.a(kVar.a), kVar.h, true, this.j, this, null);
                            this.f.put(kVar.a.a, eVar2);
                            eVar2.start();
                        } else if (!eVar.f) {
                            eVar.f(false);
                        }
                    } else if (eVar != null) {
                        g.m(!eVar.f);
                        eVar.f(false);
                    }
                } else if (eVar != null) {
                    g.m(!eVar.f);
                    eVar.f(false);
                } else {
                    if (this.h || this.g != 0) {
                        z = false;
                    }
                    if (!z || this.k >= this.i) {
                        eVar = null;
                    } else {
                        k e2 = e(kVar, 2);
                        eVar = new e(e2.a, this.c.a(e2.a), e2.h, false, this.j, this, null);
                        this.f.put(e2.a.a, eVar);
                        int i5 = this.k;
                        this.k = i5 + 1;
                        if (i5 == 0) {
                            sendEmptyMessageDelayed(11, 5000);
                        }
                        eVar.start();
                    }
                }
                if (eVar != null && !eVar.f) {
                    i2++;
                }
            }
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:229:0x033f */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v12, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r4v14, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r4v17, types: [java.util.ArrayList] */
        /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
            ((com.google.android.exoplayer2.offline.i.b) r4).close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x020d, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:205:0x0450, code lost:
            if (0 == 0) goto L_0x0457;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x0206, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // android.os.Handler
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r28) {
            /*
            // Method dump skipped, instructions count: 1190
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.offline.n.c.handleMessage(android.os.Message):void");
        }
    }

    public interface d {
        void a(n nVar, k kVar);

        void b(n nVar, k kVar);

        void c(n nVar, co coVar, int i);

        void d(n nVar);

        void e(n nVar);
    }

    public static class e extends Thread implements q.a {
        private final DownloadRequest a;
        private final q b;
        private final p c;
        private final boolean f;
        private final int n;
        private volatile c o;
        private volatile boolean p;
        private Throwable q;
        private long r = -1;

        e(DownloadRequest downloadRequest, q qVar, p pVar, boolean z, int i, c cVar, a aVar) {
            this.a = downloadRequest;
            this.b = qVar;
            this.c = pVar;
            this.f = z;
            this.n = i;
            this.o = cVar;
        }

        public void f(boolean z) {
            if (z) {
                this.o = null;
            }
            if (!this.p) {
                this.p = true;
                this.b.cancel();
                interrupt();
            }
        }

        public void g(long j, long j2, float f2) {
            p pVar = this.c;
            pVar.a = j2;
            pVar.b = f2;
            if (j != this.r) {
                this.r = j;
                c cVar = this.o;
                if (cVar != null) {
                    cVar.obtainMessage(10, this).sendToTarget();
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                if (this.f) {
                    this.b.remove();
                } else {
                    long j = -1;
                    int i = 0;
                    while (!this.p) {
                        try {
                            this.b.a(this);
                            break;
                        } catch (IOException e) {
                            if (!this.p) {
                                long j2 = this.c.a;
                                if (j2 != j) {
                                    j = j2;
                                    i = 0;
                                }
                                i++;
                                if (i <= this.n) {
                                    Thread.sleep((long) Math.min((i - 1) * Constants.ONE_SECOND, (int) CrashReportManager.TIME_WINDOW));
                                } else {
                                    throw e;
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                this.q = th;
            }
            c cVar = this.o;
            if (cVar != null) {
                cVar.obtainMessage(9, this).sendToTarget();
            }
        }
    }

    public n(Context context, y yVar, s sVar) {
        this.a = context.getApplicationContext();
        this.b = yVar;
        Handler handler = new Handler(f0.p(), new h(this));
        HandlerThread handlerThread = new HandlerThread("DownloadManager file i/o");
        handlerThread.start();
        c cVar = new c(handlerThread, yVar, sVar, handler, this.i, this.j, this.h);
        this.c = cVar;
        f fVar = new f(this);
        this.d = fVar;
        Cdo doVar = new Cdo(context, fVar, n);
        this.m = doVar;
        int e2 = doVar.e();
        this.k = e2;
        this.f = 1;
        cVar.obtainMessage(0, e2, 0).sendToTarget();
    }

    public static boolean e(n nVar, Message message) {
        nVar.getClass();
        int i2 = message.what;
        if (i2 == 0) {
            nVar.l = Collections.unmodifiableList((List) message.obj);
            Iterator<d> it = nVar.e.iterator();
            while (it.hasNext()) {
                it.next().e(nVar);
            }
        } else if (i2 == 1) {
            int i3 = message.arg1;
            int i4 = message.arg2;
            int i5 = nVar.f - i3;
            nVar.f = i5;
            nVar.g = i4;
            if (i4 == 0 && i5 == 0) {
                Iterator<d> it2 = nVar.e.iterator();
                while (it2.hasNext()) {
                    it2.next().d(nVar);
                }
            }
        } else if (i2 == 2) {
            b bVar = (b) message.obj;
            nVar.l = Collections.unmodifiableList(bVar.c);
            k kVar = bVar.a;
            if (bVar.b) {
                Iterator<d> it3 = nVar.e.iterator();
                while (it3.hasNext()) {
                    it3.next().b(nVar, kVar);
                }
            } else {
                Iterator<d> it4 = nVar.e.iterator();
                while (it4.hasNext()) {
                    it4.next().a(nVar, kVar);
                }
            }
        } else {
            throw new IllegalStateException();
        }
        return true;
    }

    /* access modifiers changed from: public */
    private void f(Cdo doVar, int i2) {
        co d2 = doVar.d();
        Iterator<d> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().c(this, d2, i2);
        }
        if (this.k != i2) {
            this.k = i2;
            this.f++;
            this.c.obtainMessage(2, i2, 0).sendToTarget();
        }
    }

    public void a(DownloadRequest downloadRequest, int i2) {
        this.f++;
        this.c.obtainMessage(6, i2, 0, downloadRequest).sendToTarget();
    }

    public void b(d dVar) {
        this.e.add(dVar);
    }

    public y c() {
        return this.b;
    }

    public void g(String str) {
        this.f++;
        this.c.obtainMessage(7, str).sendToTarget();
    }

    public void h(d dVar) {
        this.e.remove(dVar);
    }

    public void i() {
        if (this.h) {
            this.h = false;
            this.f++;
            this.c.obtainMessage(1, 0, 0).sendToTarget();
        }
    }

    public void j(int i2) {
        g.a(i2 > 0);
        if (this.i != i2) {
            this.i = i2;
            this.f++;
            this.c.obtainMessage(4, i2, 0).sendToTarget();
        }
    }

    public void k(co coVar) {
        if (!coVar.equals(this.m.d())) {
            this.m.f();
            Cdo doVar = new Cdo(this.a, this.d, coVar);
            this.m = doVar;
            f(this.m, doVar.e());
        }
    }

    public void l(String str, int i2) {
        this.f++;
        this.c.obtainMessage(3, i2, 0, str).sendToTarget();
    }
}
