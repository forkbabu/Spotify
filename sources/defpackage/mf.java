package defpackage;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.appevents.codeless.internal.b;
import com.facebook.appevents.internal.d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* access modifiers changed from: package-private */
/* renamed from: mf  reason: default package */
public final class mf implements ViewTreeObserver.OnGlobalLayoutListener {
    private static final Map<Integer, mf> f = new HashMap();
    private WeakReference<Activity> a;
    private final Handler b = new Handler(Looper.getMainLooper());
    private AtomicBoolean c = new AtomicBoolean(false);

    /* access modifiers changed from: package-private */
    /* renamed from: mf$a */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    View b = d.b((Activity) mf.a(mf.this).get());
                    Activity activity = (Activity) mf.a(mf.this).get();
                    if (b == null) {
                        return;
                    }
                    if (activity != null) {
                        for (View view : kf.a(b)) {
                            if (!b.a(view)) {
                                String d = kf.d(view);
                                if (!d.isEmpty() && d.length() <= 300) {
                                    nf.c(view, b, activity.getLocalClassName());
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    private mf(Activity activity) {
        this.a = new WeakReference<>(activity);
    }

    static /* synthetic */ WeakReference a(mf mfVar) {
        if (uf.c(mf.class)) {
            return null;
        }
        try {
            return mfVar.a;
        } catch (Throwable th) {
            uf.b(th, mf.class);
            return null;
        }
    }

    private void b() {
        if (!uf.c(this)) {
            try {
                a aVar = new a();
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    aVar.run();
                } else {
                    this.b.post(aVar);
                }
            } catch (Throwable th) {
                uf.b(th, this);
            }
        }
    }

    static void c(Activity activity) {
        if (!uf.c(mf.class)) {
            try {
                int hashCode = activity.hashCode();
                Map<Integer, mf> map = f;
                if (!map.containsKey(Integer.valueOf(hashCode))) {
                    mf mfVar = new mf(activity);
                    map.put(Integer.valueOf(hashCode), mfVar);
                    if (!uf.c(mfVar)) {
                        try {
                            if (!mfVar.c.getAndSet(true)) {
                                View b2 = d.b(mfVar.a.get());
                                if (b2 != null) {
                                    ViewTreeObserver viewTreeObserver = b2.getViewTreeObserver();
                                    if (viewTreeObserver.isAlive()) {
                                        viewTreeObserver.addOnGlobalLayoutListener(mfVar);
                                        mfVar.b();
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            uf.b(th, mfVar);
                        }
                    }
                }
            } catch (Throwable th2) {
                uf.b(th2, mf.class);
            }
        }
    }

    static void d(Activity activity) {
        if (!uf.c(mf.class)) {
            try {
                int hashCode = activity.hashCode();
                Map<Integer, mf> map = f;
                if (map.containsKey(Integer.valueOf(hashCode))) {
                    mf mfVar = map.get(Integer.valueOf(hashCode));
                    map.remove(Integer.valueOf(hashCode));
                    mfVar.getClass();
                    if (!uf.c(mfVar)) {
                        try {
                            if (mfVar.c.getAndSet(false)) {
                                View b2 = d.b(mfVar.a.get());
                                if (b2 != null) {
                                    ViewTreeObserver viewTreeObserver = b2.getViewTreeObserver();
                                    if (viewTreeObserver.isAlive()) {
                                        int i = Build.VERSION.SDK_INT;
                                        viewTreeObserver.removeOnGlobalLayoutListener(mfVar);
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            uf.b(th, mfVar);
                        }
                    }
                }
            } catch (Throwable th2) {
                uf.b(th2, mf.class);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (!uf.c(this)) {
            try {
                b();
            } catch (Throwable th) {
                uf.b(th, this);
            }
        }
    }
}
