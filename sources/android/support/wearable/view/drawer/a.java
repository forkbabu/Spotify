package android.support.wearable.view.drawer;

import android.os.Handler;
import android.os.Looper;
import android.view.View;

@Deprecated
public class a {
    private final Handler a = new Handler(Looper.getMainLooper());
    private final b b;
    private boolean c = false;
    private View d;
    private int e;
    private final Runnable f = new RunnableC0012a();

    /* renamed from: android.support.wearable.view.drawer.a$a  reason: collision with other inner class name */
    class RunnableC0012a implements Runnable {
        RunnableC0012a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.a();
        }
    }

    public interface b {
    }

    public a(b bVar) {
        this.b = bVar;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        View view;
        if (this.c && (view = this.d) != null) {
            int scrollY = view.getScrollY();
            if (scrollY == this.e) {
                this.c = false;
                ((WearableDrawerLayout) this.b).z(this.d);
                return;
            }
            this.e = scrollY;
            this.a.postDelayed(this.f, 100);
        }
    }

    public void b(View view) {
        if (!this.c) {
            this.c = true;
            this.d = view;
            this.e = view.getScrollY();
            this.a.postDelayed(this.f, 100);
        }
    }
}
