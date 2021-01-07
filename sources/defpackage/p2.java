package defpackage;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* renamed from: p2  reason: default package */
public abstract class p2 {

    /* access modifiers changed from: package-private */
    /* renamed from: p2$a */
    public class a implements Runnable {
        final /* synthetic */ Typeface a;

        a(Typeface typeface) {
            this.a = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            p2.this.d(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p2$b */
    public class b implements Runnable {
        final /* synthetic */ int a;

        b(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            p2.this.c(this.a);
        }
    }

    public final void a(int i, Handler handler) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new b(i));
    }

    public final void b(Typeface typeface, Handler handler) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new a(typeface));
    }

    public abstract void c(int i);

    public abstract void d(Typeface typeface);
}
