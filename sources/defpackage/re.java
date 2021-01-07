package defpackage;

import android.app.Activity;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.b;
import com.facebook.internal.n;
import com.facebook.k;

/* renamed from: re  reason: default package */
public final class re {
    private static Boolean a = Boolean.FALSE;

    /* renamed from: re$a */
    static class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    if (!b.g(k.d())) {
                        if (!uf.c(re.class)) {
                            try {
                                if (!uf.c(re.class)) {
                                    try {
                                        n n = FetchedAppSettingsManager.n(k.e(), false);
                                        if (n != null) {
                                            String j = n.j();
                                            if (j != null) {
                                                te.g(j);
                                            }
                                        }
                                    } catch (Throwable th) {
                                        uf.b(th, re.class);
                                    }
                                }
                            } catch (Throwable th2) {
                                uf.b(th2, re.class);
                            }
                        }
                        re.a(Boolean.TRUE);
                    }
                } catch (Throwable th3) {
                    uf.b(th3, this);
                }
            }
        }
    }

    static /* synthetic */ Boolean a(Boolean bool) {
        if (uf.c(re.class)) {
            return null;
        }
        try {
            a = bool;
            return bool;
        } catch (Throwable th) {
            uf.b(th, re.class);
            return null;
        }
    }

    public static void b() {
        if (!uf.c(re.class)) {
            try {
                k.l().execute(new a());
            } catch (Exception unused) {
                boolean z = k.n;
            } catch (Throwable th) {
                uf.b(th, re.class);
            }
        }
    }

    public static void c(Activity activity) {
        if (!uf.c(re.class)) {
            try {
                if (!a.booleanValue()) {
                    return;
                }
                if (!te.e().isEmpty()) {
                    ue.e(activity);
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                uf.b(th, re.class);
            }
        }
    }
}
