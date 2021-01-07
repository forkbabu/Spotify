package com.google.android.exoplayer2.offline;

import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.q0;
import com.google.android.exoplayer2.source.e0;
import com.google.android.exoplayer2.source.f0;
import com.google.android.exoplayer2.source.s;
import com.google.android.exoplayer2.source.t;
import com.google.android.exoplayer2.source.w;
import com.google.android.exoplayer2.upstream.a0;
import com.google.android.exoplayer2.upstream.f;
import com.google.android.exoplayer2.upstream.k;
import com.google.android.exoplayer2.upstream.n;
import com.google.android.exoplayer2.util.g;
import com.google.android.exoplayer2.v0;
import defpackage.cq;
import defpackage.eq;
import defpackage.gq;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class DownloadHelper {
    public static final cq.d p;
    private final String a;
    private final Uri b;
    private final t c;
    private final cq d;
    private final q0[] e;
    private final SparseIntArray f = new SparseIntArray();
    private final Handler g;
    private final v0.c h;
    private boolean i;
    private b j;
    private e k;
    private f0[] l;
    private eq.a[] m;
    private List<gq>[][] n;
    private List<gq>[][] o;

    public static class LiveContentUnsupportedException extends IOException {
    }

    public interface b {
        void a(DownloadHelper downloadHelper);

        void b(DownloadHelper downloadHelper, IOException iOException);
    }

    /* access modifiers changed from: private */
    public static final class c extends bq {

        private static final class a implements gq.b {
            a(a aVar) {
            }

            @Override // defpackage.gq.b
            public gq[] a(gq.a[] aVarArr, f fVar) {
                gq[] gqVarArr = new gq[aVarArr.length];
                for (int i = 0; i < aVarArr.length; i++) {
                    gqVarArr[i] = aVarArr[i] == null ? null : new c(aVarArr[i].a, aVarArr[i].b);
                }
                return gqVarArr;
            }
        }

        public c(e0 e0Var, int[] iArr) {
            super(e0Var, iArr);
        }

        @Override // defpackage.gq
        public int b() {
            return 0;
        }

        @Override // defpackage.gq
        public Object g() {
            return null;
        }

        @Override // defpackage.gq
        public void m(long j, long j2, long j3, List<? extends po> list, qo[] qoVarArr) {
        }

        @Override // defpackage.gq
        public int p() {
            return 0;
        }
    }

    private static final class d implements f {
        d(a aVar) {
        }

        @Override // com.google.android.exoplayer2.upstream.f
        public a0 b() {
            return null;
        }

        @Override // com.google.android.exoplayer2.upstream.f
        public void c(f.a aVar) {
        }

        @Override // com.google.android.exoplayer2.upstream.f
        public long d() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.upstream.f
        public void f(Handler handler, f.a aVar) {
        }
    }

    /* access modifiers changed from: private */
    public static final class e implements t.b, s.a, Handler.Callback {
        private final t a;
        private final DownloadHelper b;
        private final n c = new n(true, 65536);
        private final ArrayList<s> f = new ArrayList<>();
        private final Handler n = new Handler(com.google.android.exoplayer2.util.f0.p(), new a(this));
        private final HandlerThread o;
        private final Handler p;
        public v0 q;
        public s[] r;
        private boolean s;

        public e(t tVar, DownloadHelper downloadHelper) {
            this.a = tVar;
            this.b = downloadHelper;
            HandlerThread handlerThread = new HandlerThread("DownloadHelper");
            this.o = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper(), this);
            this.p = handler;
            handler.sendEmptyMessage(0);
        }

        public static boolean a(e eVar, Message message) {
            boolean z = eVar.s;
            if (z) {
                return false;
            }
            int i = message.what;
            if (i == 0) {
                DownloadHelper.a(eVar.b);
            } else if (i != 1) {
                return false;
            } else {
                if (!z) {
                    eVar.s = true;
                    eVar.p.sendEmptyMessage(3);
                }
                DownloadHelper downloadHelper = eVar.b;
                Object obj = message.obj;
                int i2 = com.google.android.exoplayer2.util.f0.a;
                DownloadHelper.b(downloadHelper, (IOException) obj);
            }
            return true;
        }

        @Override // com.google.android.exoplayer2.source.t.b
        public void b(t tVar, v0 v0Var) {
            s[] sVarArr;
            if (this.q == null) {
                if (v0Var.k(0, new v0.c()).e) {
                    this.n.obtainMessage(1, new LiveContentUnsupportedException()).sendToTarget();
                    return;
                }
                this.q = v0Var;
                this.r = new s[v0Var.g()];
                int i = 0;
                while (true) {
                    sVarArr = this.r;
                    if (i >= sVarArr.length) {
                        break;
                    }
                    s f2 = this.a.f(new t.a(v0Var.j(i)), this.c, 0);
                    this.r[i] = f2;
                    this.f.add(f2);
                    i++;
                }
                for (s sVar : sVarArr) {
                    sVar.n(this, 0);
                }
            }
        }

        public void c() {
            if (!this.s) {
                this.s = true;
                this.p.sendEmptyMessage(3);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i != 0) {
                int i2 = 0;
                if (i == 1) {
                    try {
                        if (this.r == null) {
                            this.a.g();
                        } else {
                            while (i2 < this.f.size()) {
                                this.f.get(i2).r();
                                i2++;
                            }
                        }
                        this.p.sendEmptyMessageDelayed(1, 100);
                    } catch (IOException e) {
                        this.n.obtainMessage(1, e).sendToTarget();
                    }
                    return true;
                } else if (i == 2) {
                    s sVar = (s) message.obj;
                    if (this.f.contains(sVar)) {
                        sVar.b(0);
                    }
                    return true;
                } else if (i != 3) {
                    return false;
                } else {
                    s[] sVarArr = this.r;
                    if (sVarArr != null) {
                        int length = sVarArr.length;
                        while (i2 < length) {
                            this.a.d(sVarArr[i2]);
                            i2++;
                        }
                    }
                    this.a.a(this);
                    this.p.removeCallbacksAndMessages(null);
                    this.o.quit();
                    return true;
                }
            } else {
                this.a.e(this, null);
                this.p.sendEmptyMessage(1);
                return true;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.exoplayer2.source.c0] */
        @Override // com.google.android.exoplayer2.source.c0.a
        public void i(s sVar) {
            s sVar2 = sVar;
            if (this.f.contains(sVar2)) {
                this.p.obtainMessage(2, sVar2).sendToTarget();
            }
        }

        @Override // com.google.android.exoplayer2.source.s.a
        public void j(s sVar) {
            this.f.remove(sVar);
            if (this.f.isEmpty()) {
                this.p.removeMessages(1);
                this.n.sendEmptyMessage(0);
            }
        }
    }

    static {
        cq.e c2 = cq.d.L.c();
        c2.c(true);
        p = c2.b();
        d("com.google.android.exoplayer2.source.dash.DashMediaSource$Factory");
        d("com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory");
        d("com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory");
    }

    public DownloadHelper(String str, Uri uri, String str2, t tVar, cq.d dVar, q0[] q0VarArr) {
        this.a = str;
        this.b = uri;
        this.c = tVar;
        cq cqVar = new cq(dVar, new c.a(null));
        this.d = cqVar;
        this.e = q0VarArr;
        cqVar.b(c.a, new d(null));
        this.g = new Handler(com.google.android.exoplayer2.util.f0.p());
        this.h = new v0.c();
    }

    static void a(DownloadHelper downloadHelper) {
        downloadHelper.k.getClass();
        downloadHelper.k.r.getClass();
        downloadHelper.k.q.getClass();
        int length = downloadHelper.k.r.length;
        int length2 = downloadHelper.e.length;
        int[] iArr = new int[2];
        iArr[1] = length2;
        iArr[0] = length;
        downloadHelper.n = (List[][]) Array.newInstance(List.class, iArr);
        int[] iArr2 = new int[2];
        iArr2[1] = length2;
        iArr2[0] = length;
        downloadHelper.o = (List[][]) Array.newInstance(List.class, iArr2);
        for (int i2 = 0; i2 < length; i2++) {
            for (int i3 = 0; i3 < length2; i3++) {
                downloadHelper.n[i2][i3] = new ArrayList();
                downloadHelper.o[i2][i3] = Collections.unmodifiableList(downloadHelper.n[i2][i3]);
            }
        }
        downloadHelper.l = new f0[length];
        downloadHelper.m = new eq.a[length];
        for (int i4 = 0; i4 < length; i4++) {
            downloadHelper.l[i4] = downloadHelper.k.r[i4].t();
            downloadHelper.d.d(downloadHelper.k(i4).d);
            eq.a[] aVarArr = downloadHelper.m;
            eq.a f2 = downloadHelper.d.f();
            f2.getClass();
            aVarArr[i4] = f2;
        }
        downloadHelper.i = true;
        Handler handler = downloadHelper.g;
        handler.getClass();
        handler.post(new b(downloadHelper));
    }

    static void b(DownloadHelper downloadHelper, IOException iOException) {
        Handler handler = downloadHelper.g;
        handler.getClass();
        handler.post(new d(downloadHelper, iOException));
    }

    private static Constructor<? extends w> d(String str) {
        try {
            return Class.forName(str).asSubclass(w.class).getConstructor(k.a.class);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @RequiresNonNull({"trackGroupArrays", "trackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline"})
    private kq k(int i2) {
        boolean z;
        try {
            kq e2 = this.d.e(this.e, this.l[i2], new t.a(this.k.q.j(i2)), this.k.q);
            for (int i3 = 0; i3 < e2.a; i3++) {
                gq a2 = e2.c.a(i3);
                if (a2 != null) {
                    List<gq> list = this.n[i2][i3];
                    int i4 = 0;
                    while (true) {
                        if (i4 >= list.size()) {
                            z = false;
                            break;
                        }
                        gq gqVar = list.get(i4);
                        if (gqVar.j() == a2.j()) {
                            this.f.clear();
                            for (int i5 = 0; i5 < gqVar.length(); i5++) {
                                this.f.put(gqVar.e(i5), 0);
                            }
                            for (int i6 = 0; i6 < a2.length(); i6++) {
                                this.f.put(a2.e(i6), 0);
                            }
                            int[] iArr = new int[this.f.size()];
                            for (int i7 = 0; i7 < this.f.size(); i7++) {
                                iArr[i7] = this.f.keyAt(i7);
                            }
                            list.set(i4, new c(gqVar.j(), iArr));
                            z = true;
                        } else {
                            i4++;
                        }
                    }
                    if (!z) {
                        list.add(a2);
                    }
                }
            }
            return e2;
        } catch (ExoPlaybackException e3) {
            throw new UnsupportedOperationException(e3);
        }
    }

    public void c(boolean z, String... strArr) {
        g.m(this.i);
        for (int i2 = 0; i2 < this.m.length; i2++) {
            cq.e c2 = p.c();
            eq.a aVar = this.m[i2];
            int a2 = aVar.a();
            for (int i3 = 0; i3 < a2; i3++) {
                if (aVar.b(i3) != 3) {
                    c2.g(i3, true);
                }
            }
            c2.h(z);
            for (String str : strArr) {
                c2.f(str);
                cq.d b2 = c2.b();
                g.m(this.i);
                this.d.r(b2);
                k(i2);
            }
        }
    }

    public DownloadRequest e(String str, byte[] bArr) {
        if (this.c == null) {
            return new DownloadRequest(str, this.a, this.b, Collections.emptyList(), null, null);
        }
        g.m(this.i);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = this.n.length;
        for (int i2 = 0; i2 < length; i2++) {
            arrayList2.clear();
            int length2 = this.n[i2].length;
            for (int i3 = 0; i3 < length2; i3++) {
                arrayList2.addAll(this.n[i2][i3]);
            }
            arrayList.addAll(this.k.r[i2].h(arrayList2));
        }
        return new DownloadRequest(str, this.a, this.b, arrayList, null, null);
    }

    public Object f() {
        if (this.c == null) {
            return null;
        }
        g.m(this.i);
        if (this.k.q.m() > 0) {
            return this.k.q.k(0, this.h).c;
        }
        return null;
    }

    public void g(IOException iOException) {
        b bVar = this.j;
        bVar.getClass();
        bVar.b(this, iOException);
    }

    public void h() {
        b bVar = this.j;
        bVar.getClass();
        bVar.a(this);
    }

    public void i(b bVar) {
        g.m(this.j == null);
        this.j = bVar;
        t tVar = this.c;
        if (tVar != null) {
            this.k = new e(tVar, this);
        } else {
            this.g.post(new e(this, bVar));
        }
    }

    public void j() {
        e eVar = this.k;
        if (eVar != null) {
            eVar.c();
        }
    }
}
