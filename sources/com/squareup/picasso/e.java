package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import com.squareup.picasso.NetworkRequestHandler;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.a0;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import okio.g;
import okio.o;
import okio.w;

/* access modifiers changed from: package-private */
public class e implements Runnable {
    private static final Object C = new Object();
    private static final ThreadLocal<StringBuilder> D = new a();
    private static final AtomicInteger E = new AtomicInteger();
    private static final a0 F = new b();
    int A;
    Picasso.Priority B;
    final int a = E.incrementAndGet();
    final Picasso b;
    final k c;
    final f f;
    final d0 n;
    final String o;
    final y p;
    final int q;
    int r;
    final a0 s;
    c t;
    List<c> u;
    Bitmap v;
    Future<?> w;
    Picasso.LoadedFrom x;
    Exception y;
    int z;

    static class a extends ThreadLocal<StringBuilder> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    static class b extends a0 {
        b() {
        }

        @Override // com.squareup.picasso.a0
        public boolean c(y yVar) {
            return true;
        }

        @Override // com.squareup.picasso.a0
        public a0.a f(y yVar, int i) {
            throw new IllegalStateException("Unrecognized type of request: " + yVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static class c implements Runnable {
        final /* synthetic */ h0 a;
        final /* synthetic */ RuntimeException b;

        c(h0 h0Var, RuntimeException runtimeException) {
            this.a = h0Var;
            this.b = runtimeException;
        }

        @Override // java.lang.Runnable
        public void run() {
            StringBuilder V0 = je.V0("Transformation ");
            V0.append(this.a.a());
            V0.append(" crashed with exception.");
            throw new RuntimeException(V0.toString(), this.b);
        }
    }

    /* access modifiers changed from: package-private */
    public static class d implements Runnable {
        final /* synthetic */ StringBuilder a;

        d(StringBuilder sb) {
            this.a = sb;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new NullPointerException(this.a.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.squareup.picasso.e$e  reason: collision with other inner class name */
    public static class RunnableC0582e implements Runnable {
        final /* synthetic */ h0 a;

        RunnableC0582e(h0 h0Var) {
            this.a = h0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            StringBuilder V0 = je.V0("Transformation ");
            V0.append(this.a.a());
            V0.append(" returned input Bitmap but recycled it.");
            throw new IllegalStateException(V0.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public static class f implements Runnable {
        final /* synthetic */ h0 a;

        f(h0 h0Var) {
            this.a = h0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            StringBuilder V0 = je.V0("Transformation ");
            V0.append(this.a.a());
            V0.append(" mutated input Bitmap but failed to recycle the original.");
            throw new IllegalStateException(V0.toString());
        }
    }

    e(Picasso picasso, k kVar, f fVar, d0 d0Var, c cVar, a0 a0Var) {
        this.b = picasso;
        this.c = kVar;
        this.f = fVar;
        this.n = d0Var;
        this.t = cVar;
        this.o = cVar.i;
        y yVar = cVar.b;
        this.p = yVar;
        this.B = yVar.r;
        this.q = cVar.e;
        this.r = cVar.f;
        this.s = a0Var;
        this.A = a0Var.e();
    }

    static Bitmap a(List<h0> list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            h0 h0Var = list.get(i);
            try {
                Bitmap b2 = h0Var.b(bitmap);
                if (b2 == null) {
                    StringBuilder V0 = je.V0("Transformation ");
                    V0.append(h0Var.a());
                    V0.append(" returned null after ");
                    V0.append(i);
                    V0.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (h0 h0Var2 : list) {
                        V0.append(h0Var2.a());
                        V0.append('\n');
                    }
                    Picasso.o.post(new d(V0));
                    return null;
                } else if (b2 == bitmap && bitmap.isRecycled()) {
                    Picasso.o.post(new RunnableC0582e(h0Var));
                    return null;
                } else if (b2 == bitmap || bitmap.isRecycled()) {
                    i++;
                    bitmap = b2;
                } else {
                    Picasso.o.post(new f(h0Var));
                    return null;
                }
            } catch (RuntimeException e) {
                Picasso.o.post(new c(h0Var, e));
                return null;
            }
        }
        return bitmap;
    }

    static Bitmap c(w wVar, y yVar) {
        g d2 = o.d(wVar);
        boolean g = j0.g(d2);
        boolean z2 = yVar.p && Build.VERSION.SDK_INT < 21;
        BitmapFactory.Options d3 = a0.d(yVar);
        boolean z3 = d3 != null && d3.inJustDecodeBounds;
        if (g || z2) {
            byte[] j1 = d2.j1();
            if (z3) {
                BitmapFactory.decodeByteArray(j1, 0, j1.length, d3);
                a0.b(yVar.f, yVar.g, d3, yVar);
            }
            return BitmapFactory.decodeByteArray(j1, 0, j1.length, d3);
        }
        InputStream m2 = d2.m2();
        if (z3) {
            u uVar = new u(m2);
            uVar.a(false);
            long d4 = uVar.d(1024);
            BitmapFactory.decodeStream(uVar, null, d3);
            a0.b(yVar.f, yVar.g, d3, yVar);
            uVar.b(d4);
            uVar.a(true);
            m2 = uVar;
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(m2, null, d3);
        if (decodeStream != null) {
            return decodeStream;
        }
        throw new IOException("Failed to decode stream.");
    }

    static e e(Picasso picasso, k kVar, f fVar, d0 d0Var, c cVar) {
        y yVar = cVar.b;
        List<a0> i = picasso.i();
        int size = i.size();
        for (int i2 = 0; i2 < size; i2++) {
            a0 a0Var = i.get(i2);
            if (a0Var.c(yVar)) {
                return new e(picasso, kVar, fVar, d0Var, cVar, a0Var);
            }
        }
        return new e(picasso, kVar, fVar, d0Var, cVar, F);
    }

    private static boolean g(boolean z2, int i, int i2, int i3, int i4) {
        return !z2 || (i3 != 0 && i > i3) || (i4 != 0 && i2 > i4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0253  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.graphics.Bitmap h(com.squareup.picasso.y r27, android.graphics.Bitmap r28, int r29) {
        /*
        // Method dump skipped, instructions count: 718
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.e.h(com.squareup.picasso.y, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    static void i(y yVar) {
        String str;
        Uri uri = yVar.c;
        if (uri != null) {
            str = String.valueOf(uri.getPath());
        } else {
            str = Integer.toHexString(yVar.d);
        }
        StringBuilder sb = D.get();
        sb.ensureCapacity(str.length() + 8);
        sb.replace(8, sb.length(), str);
        Thread.currentThread().setName(sb.toString());
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        Future<?> future;
        if (this.t != null) {
            return false;
        }
        List<c> list = this.u;
        if ((list == null || list.isEmpty()) && (future = this.w) != null && future.cancel(false)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void d(c cVar) {
        boolean z2;
        boolean z3 = true;
        if (this.t == cVar) {
            this.t = null;
            z2 = true;
        } else {
            List<c> list = this.u;
            z2 = list != null ? list.remove(cVar) : false;
        }
        if (z2 && cVar.b.r == this.B) {
            Picasso.Priority priority = Picasso.Priority.LOW;
            List<c> list2 = this.u;
            boolean z4 = list2 != null && !list2.isEmpty();
            c cVar2 = this.t;
            if (cVar2 == null && !z4) {
                z3 = false;
            }
            if (z3) {
                if (cVar2 != null) {
                    priority = cVar2.b.r;
                }
                if (z4) {
                    int size = this.u.size();
                    for (int i = 0; i < size; i++) {
                        Picasso.Priority priority2 = this.u.get(i).b.r;
                        if (priority2.ordinal() > priority.ordinal()) {
                            priority = priority2;
                        }
                    }
                }
            }
            this.B = priority;
        }
        if (this.b.n) {
            j0.h("Hunter", "removed", cVar.b.b(), j0.e(this, "from "));
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bb A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap f() {
        /*
        // Method dump skipped, instructions count: 290
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.e.f():android.graphics.Bitmap");
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            i(this.p);
            if (this.b.n) {
                j0.h("Hunter", "executing", j0.d(this), "");
            }
            Bitmap f2 = f();
            this.v = f2;
            if (f2 == null) {
                this.c.c(this);
            } else {
                this.c.b(this);
            }
        } catch (NetworkRequestHandler.ResponseException e) {
            if (!NetworkPolicy.d(e.networkPolicy) || e.code != 504) {
                this.y = e;
            }
            Handler handler = this.c.i;
            handler.sendMessage(handler.obtainMessage(6, this));
        } catch (IOException e2) {
            this.y = e2;
            Handler handler2 = this.c.i;
            handler2.sendMessageDelayed(handler2.obtainMessage(5, this), 500);
        } catch (OutOfMemoryError e3) {
            StringWriter stringWriter = new StringWriter();
            this.n.a().a(new PrintWriter(stringWriter));
            this.y = new RuntimeException(stringWriter.toString(), e3);
            Handler handler3 = this.c.i;
            handler3.sendMessage(handler3.obtainMessage(6, this));
        } catch (Exception e4) {
            this.y = e4;
            Handler handler4 = this.c.i;
            handler4.sendMessage(handler4.obtainMessage(6, this));
        } catch (Throwable th) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
        Thread.currentThread().setName("Picasso-Idle");
    }
}
