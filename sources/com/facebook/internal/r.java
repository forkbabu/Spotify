package com.facebook.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.facebook.internal.m0;
import com.facebook.internal.s;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class r {
    private static Handler a;
    private static m0 b = new m0(8);
    private static m0 c = new m0(2);
    private static final Map<e, d> d = new HashMap();

    /* access modifiers changed from: package-private */
    public static class a implements Runnable {
        final /* synthetic */ s a;
        final /* synthetic */ Exception b;
        final /* synthetic */ boolean c;
        final /* synthetic */ Bitmap f;
        final /* synthetic */ s.c n;

        a(s sVar, Exception exc, boolean z, Bitmap bitmap, s.c cVar) {
            this.a = sVar;
            this.b = exc;
            this.c = z;
            this.f = bitmap;
            this.n = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    this.n.a(new t(this.a, this.b, this.c, this.f));
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static class b implements Runnable {
        private Context a;
        private e b;
        private boolean c;

        b(Context context, e eVar, boolean z) {
            this.a = context;
            this.b = eVar;
            this.c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    r.a(this.b, this.a, this.c);
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static class c implements Runnable {
        private Context a;
        private e b;

        c(Context context, e eVar) {
            this.a = context;
            this.b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    r.b(this.b, this.a);
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static class d {
        m0.a a;
        s b;
        boolean c;

        private d() {
        }

        d(a aVar) {
        }
    }

    /* access modifiers changed from: private */
    public static class e {
        Uri a;
        Object b;

        e(Uri uri, Object obj) {
            this.a = uri;
            this.b = obj;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (eVar.a == this.a && eVar.b == this.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.b.hashCode() + ((this.a.hashCode() + 1073) * 37);
        }
    }

    static void a(e eVar, Context context, boolean z) {
        InputStream inputStream;
        Uri c2;
        boolean z2 = false;
        if (!z || (c2 = e0.c(eVar.a)) == null) {
            inputStream = null;
        } else {
            inputStream = u.b(c2, context);
            if (inputStream != null) {
                z2 = true;
            }
        }
        if (!z2) {
            inputStream = u.b(eVar.a, context);
        }
        if (inputStream != null) {
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
            f(eVar, null, decodeStream, z2);
            return;
        }
        d g = g(eVar);
        if (g != null && !g.c) {
            s sVar = g.b;
            e(sVar, eVar, b, new c(sVar.c(), eVar));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0090, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0096, code lost:
        r4 = r10;
        r10 = null;
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ae, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00af, code lost:
        r0 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b3, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a6 A[SYNTHETIC, Splitter:B:38:0x00a6] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ae A[ExcHandler: all (th java.lang.Throwable), Splitter:B:11:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b3 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x0014] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00bd A[SYNTHETIC, Splitter:B:51:0x00bd] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ca A[SYNTHETIC, Splitter:B:59:0x00ca] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void b(com.facebook.internal.r.e r9, android.content.Context r10) {
        /*
        // Method dump skipped, instructions count: 215
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.r.b(com.facebook.internal.r$e, android.content.Context):void");
    }

    public static boolean c(s sVar) {
        boolean z;
        e eVar = new e(sVar.d(), sVar.b());
        Map<e, d> map = d;
        synchronized (map) {
            d dVar = map.get(eVar);
            z = true;
            if (dVar == null) {
                z = false;
            } else if (((m0.b) dVar.a).b()) {
                map.remove(eVar);
            } else {
                dVar.c = true;
            }
        }
        return z;
    }

    public static void d(s sVar) {
        e eVar = new e(sVar.d(), sVar.b());
        Map<e, d> map = d;
        synchronized (map) {
            d dVar = map.get(eVar);
            if (dVar != null) {
                dVar.b = sVar;
                dVar.c = false;
                ((m0.b) dVar.a).d();
            } else {
                e(sVar, eVar, c, new b(sVar.c(), eVar, sVar.e()));
            }
        }
    }

    private static void e(s sVar, e eVar, m0 m0Var, Runnable runnable) {
        Map<e, d> map = d;
        synchronized (map) {
            d dVar = new d(null);
            dVar.b = sVar;
            map.put(eVar, dVar);
            dVar.a = m0Var.e(runnable);
        }
    }

    private static void f(e eVar, Exception exc, Bitmap bitmap, boolean z) {
        s sVar;
        s.c a2;
        Handler handler;
        d g = g(eVar);
        if (g != null && !g.c && (a2 = (sVar = g.b).a()) != null) {
            synchronized (r.class) {
                if (a == null) {
                    a = new Handler(Looper.getMainLooper());
                }
                handler = a;
            }
            handler.post(new a(sVar, exc, z, bitmap, a2));
        }
    }

    private static d g(e eVar) {
        d remove;
        Map<e, d> map = d;
        synchronized (map) {
            remove = map.remove(eVar);
        }
        return remove;
    }
}
