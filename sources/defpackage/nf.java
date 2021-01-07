package defpackage;

import android.os.Bundle;
import android.view.View;
import com.facebook.appevents.codeless.internal.c;
import com.facebook.appevents.i;
import com.facebook.internal.f0;
import com.facebook.k;
import com.facebook.m;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: nf  reason: default package */
public final class nf implements View.OnClickListener {
    private static final Set<Integer> n = new HashSet();
    private View.OnClickListener a;
    private WeakReference<View> b;
    private WeakReference<View> c;
    private String f;

    /* access modifiers changed from: package-private */
    /* renamed from: nf$a */
    public static class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    nf.a(this.a, this.b, new float[0]);
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    private nf(View view, View view2, String str) {
        this.a = c.f(view);
        this.c = new WeakReference<>(view);
        this.b = new WeakReference<>(view2);
        this.f = str.toLowerCase().replace("activity", "");
    }

    static void a(String str, String str2, float[] fArr) {
        if (!uf.c(nf.class)) {
            try {
                if (!uf.c(nf.class)) {
                    try {
                        if (lf.d(str)) {
                            new i(k.d()).e(str, str2);
                        } else if (lf.c(str)) {
                            f(str, str2, fArr);
                        }
                    } catch (Throwable th) {
                        uf.b(th, nf.class);
                    }
                }
            } catch (Throwable th2) {
                uf.b(th2, nf.class);
            }
        }
    }

    static /* synthetic */ String b(nf nfVar) {
        if (uf.c(nf.class)) {
            return null;
        }
        try {
            return nfVar.f;
        } catch (Throwable th) {
            uf.b(th, nf.class);
            return null;
        }
    }

    static void c(View view, View view2, String str) {
        if (!uf.c(nf.class)) {
            try {
                int hashCode = view.hashCode();
                Set<Integer> set = n;
                if (!set.contains(Integer.valueOf(hashCode))) {
                    c.n(view, new nf(view, view2, str));
                    set.add(Integer.valueOf(hashCode));
                }
            } catch (Throwable th) {
                uf.b(th, nf.class);
            }
        }
    }

    private void d() {
        if (!uf.c(this)) {
            try {
                View view = this.b.get();
                View view2 = this.c.get();
                if (view != null && view2 != null) {
                    try {
                        String d = kf.d(view2);
                        String b2 = jf.b(view2, d);
                        if (b2 != null && !e(b2, d)) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("view", kf.b(view, view2));
                            jSONObject.put("screenname", this.f);
                            if (!uf.c(this)) {
                                try {
                                    f0.P(new of(this, jSONObject, d, b2));
                                } catch (Throwable th) {
                                    uf.b(th, this);
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th2) {
                uf.b(th2, this);
            }
        }
    }

    private static boolean e(String str, String str2) {
        if (uf.c(nf.class)) {
            return false;
        }
        try {
            String d = jf.d(str);
            if (d == null) {
                return false;
            }
            if (d.equals("other")) {
                return true;
            }
            f0.P(new a(d, str2));
            return true;
        } catch (Throwable th) {
            uf.b(th, nf.class);
            return false;
        }
    }

    private static void f(String str, String str2, float[] fArr) {
        if (!uf.c(nf.class)) {
            try {
                Bundle bundle = new Bundle();
                try {
                    bundle.putString("event_name", str);
                    JSONObject jSONObject = new JSONObject();
                    StringBuilder sb = new StringBuilder();
                    for (float f2 : fArr) {
                        sb.append(f2);
                        sb.append(",");
                    }
                    jSONObject.put("dense", sb.toString());
                    jSONObject.put("button_text", str2);
                    bundle.putString("metadata", jSONObject.toString());
                    m s = m.s(null, String.format(Locale.US, "%s/suggested_events", k.e()), null, null);
                    s.C(bundle);
                    s.g();
                } catch (JSONException unused) {
                }
            } catch (Throwable th) {
                uf.b(th, nf.class);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (!uf.c(this)) {
            try {
                View.OnClickListener onClickListener = this.a;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                d();
            } catch (Throwable th) {
                uf.b(th, this);
            }
        }
    }
}
