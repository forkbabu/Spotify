package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import okio.ByteString;
import okio.g;

/* access modifiers changed from: package-private */
public final class j0 {
    static final StringBuilder a = new StringBuilder();
    private static final ByteString b = ByteString.m("RIFF");
    private static final ByteString c = ByteString.m("WEBP");

    private static class a extends Thread {
        a(Runnable runnable) {
            super(runnable);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    static class b implements ThreadFactory {
        b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new a(runnable);
        }
    }

    static void a() {
        if (!f()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    static String b(y yVar, StringBuilder sb) {
        yVar.getClass();
        Uri uri = yVar.c;
        if (uri != null) {
            String uri2 = uri.toString();
            sb.ensureCapacity(uri2.length() + 50);
            sb.append(uri2);
        } else {
            sb.ensureCapacity(50);
            sb.append(yVar.d);
        }
        sb.append('\n');
        if (yVar.l != 0.0f) {
            sb.append("rotation:");
            sb.append(yVar.l);
            if (yVar.o) {
                sb.append('@');
                sb.append(yVar.m);
                sb.append('x');
                sb.append(yVar.n);
            }
            sb.append('\n');
        }
        if (yVar.a()) {
            sb.append("resize:");
            sb.append(yVar.f);
            sb.append('x');
            sb.append(yVar.g);
            sb.append('\n');
        }
        if (yVar.h) {
            sb.append("centerCrop:");
            sb.append(yVar.i);
            sb.append('\n');
        } else if (yVar.j) {
            sb.append("centerInside");
            sb.append('\n');
        }
        List<h0> list = yVar.e;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append(yVar.e.get(i).a());
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    static int c(Bitmap bitmap) {
        int allocationByteCount = Build.VERSION.SDK_INT >= 19 ? bitmap.getAllocationByteCount() : bitmap.getByteCount();
        if (allocationByteCount >= 0) {
            return allocationByteCount;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    static String d(e eVar) {
        return e(eVar, "");
    }

    static String e(e eVar, String str) {
        StringBuilder sb = new StringBuilder(str);
        c cVar = eVar.t;
        if (cVar != null) {
            sb.append(cVar.b.b());
        }
        List<c> list = eVar.u;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (i > 0 || cVar != null) {
                    sb.append(", ");
                }
                sb.append(list.get(i).b.b());
            }
        }
        return sb.toString();
    }

    static boolean f() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    static boolean g(g gVar) {
        return gVar.g0(0, b) && gVar.g0(8, c);
    }

    static void h(String str, String str2, String str3, String str4) {
        String.format("%1$-11s %2$-12s %3$s %4$s", str, str2, str3, str4);
    }
}
