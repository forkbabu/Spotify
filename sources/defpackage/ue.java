package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.facebook.appevents.internal.d;
import com.spotify.music.features.ads.rules.m;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* access modifiers changed from: package-private */
/* renamed from: ue  reason: default package */
public final class ue implements ViewTreeObserver.OnGlobalFocusChangeListener {
    private static final Map<Integer, ue> n = new HashMap();
    private final Set<String> a = new HashSet();
    private final Handler b;
    private WeakReference<Activity> c;
    private AtomicBoolean f;

    /* access modifiers changed from: package-private */
    /* renamed from: ue$a */
    public class a implements Runnable {
        final /* synthetic */ View a;

        a(View view) {
            this.a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    View view = this.a;
                    if (view instanceof EditText) {
                        ue.a(ue.this, view);
                    }
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    private ue(Activity activity) {
        this.c = new WeakReference<>(activity);
        this.b = new Handler(Looper.getMainLooper());
        this.f = new AtomicBoolean(false);
    }

    static /* synthetic */ void a(ue ueVar, View view) {
        if (!uf.c(ue.class)) {
            try {
                ueVar.c(view);
            } catch (Throwable th) {
                uf.b(th, ue.class);
            }
        }
    }

    private void b(View view) {
        if (!uf.c(this)) {
            try {
                a aVar = new a(view);
                if (!uf.c(this)) {
                    try {
                        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                            aVar.run();
                        } else {
                            this.b.post(aVar);
                        }
                    } catch (Throwable th) {
                        uf.b(th, this);
                    }
                }
            } catch (Throwable th2) {
                uf.b(th2, this);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(android.view.View r13) {
        /*
        // Method dump skipped, instructions count: 264
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ue.c(android.view.View):void");
    }

    private static void d(Map<String, String> map, String str, String str2) {
        if (!uf.c(ue.class)) {
            char c2 = 65535;
            try {
                switch (str.hashCode()) {
                    case 3585:
                        if (str.equals("r3")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 3586:
                        if (str.equals("r4")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 3587:
                        if (str.equals("r5")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 3588:
                        if (str.equals("r6")) {
                            c2 = 3;
                            break;
                        }
                        break;
                }
                if (c2 == 0) {
                    str2 = (str2.startsWith(m.f) || str2.startsWith("b") || str2.startsWith("ge")) ? m.f : "f";
                } else if (c2 == 1 || c2 == 2) {
                    str2 = str2.replaceAll("[^a-z]+", "");
                } else if (c2 == 3 && str2.contains("-")) {
                    str2 = str2.split("-")[0];
                }
                map.put(str, str2);
            } catch (Throwable th) {
                uf.b(th, ue.class);
            }
        }
    }

    static void e(Activity activity) {
        ue ueVar;
        if (!uf.c(ue.class)) {
            try {
                int hashCode = activity.hashCode();
                Map<Integer, ue> map = n;
                if (!map.containsKey(Integer.valueOf(hashCode))) {
                    ueVar = new ue(activity);
                    map.put(Integer.valueOf(activity.hashCode()), ueVar);
                } else {
                    ueVar = map.get(Integer.valueOf(hashCode));
                }
                ueVar.getClass();
                if (!uf.c(ueVar)) {
                    try {
                        if (!ueVar.f.getAndSet(true)) {
                            View b2 = d.b(ueVar.c.get());
                            if (b2 != null) {
                                ViewTreeObserver viewTreeObserver = b2.getViewTreeObserver();
                                if (viewTreeObserver.isAlive()) {
                                    viewTreeObserver.addOnGlobalFocusChangeListener(ueVar);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        uf.b(th, ueVar);
                    }
                }
            } catch (Throwable th2) {
                uf.b(th2, ue.class);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View view, View view2) {
        if (!uf.c(this)) {
            if (view != null) {
                try {
                    b(view);
                } catch (Throwable th) {
                    uf.b(th, this);
                    return;
                }
            }
            if (view2 != null) {
                b(view2);
            }
        }
    }
}
