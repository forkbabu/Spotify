package com.spotify.android.recaptcha;

import android.app.Activity;
import com.google.android.gms.internal.recaptcha.d3;
import com.google.android.gms.recaptcha.a;
import com.google.android.gms.recaptcha.b;
import com.google.android.gms.recaptcha.d;
import com.google.android.gms.recaptcha.e;
import com.google.android.gms.tasks.g;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.C0707R;

public class n implements m {
    protected d a;
    private final k b;
    private final q c;
    private final o d;
    private final boolean e;

    public n(boolean z, k kVar, q qVar, o oVar) {
        this.e = z;
        this.b = kVar;
        this.c = qVar;
        this.d = oVar;
    }

    public void a(Activity activity, String str) {
        boolean z = this.e;
        if (!z) {
            Logger.d("[ReCAPTCHA]", "cannot assess action feature enabled? %s", str, String.valueOf(z));
        } else if (this.a == null) {
            Logger.d("[ReCAPTCHA]", "cannot assess using null handle for this action %s", str);
        } else {
            ((p) this.d).i("Execute", str);
            g<e> v = ((d3) this.b.a()).v(this.a, new a(new b(str)));
            v.g(activity, new a(this, str));
            v.d(activity, new f(this));
        }
    }

    public void b(Boolean bool) {
        ((r) this.c).d("Close", String.format("Got closed before? %s", bool));
    }

    public void c(Exception exc) {
        ((r) this.c).c("Close", exc);
    }

    public void d(d dVar) {
        this.a = dVar;
        ((r) this.c).d("Init", "");
    }

    public void e(Exception exc) {
        ((r) this.c).c("Init", exc);
    }

    public void f(String str, e eVar) {
        ((r) this.c).a(str, eVar.I1());
        ((r) this.c).d("Execute", eVar.I1());
    }

    public void g(Exception exc) {
        ((r) this.c).c("Execute", exc);
    }

    public void h(Activity activity) {
        boolean z = this.e;
        if (!z) {
            Logger.d("[ReCAPTCHA]", "cannot start sdk with feature enabled? %s", String.valueOf(z));
            return;
        }
        ((p) this.d).f("Init");
        g<d> w = ((d3) this.b.a()).w(activity.getResources().getString(C0707R.string.recaptcha_site_key));
        w.g(activity, new e(this));
        w.d(activity, new c(this));
    }

    public void i(Activity activity) {
        ((r) this.c).b();
        boolean z = this.e;
        if (!z) {
            Logger.d("[ReCAPTCHA]", "cannot stop sdk with feature enabled? %s", String.valueOf(z));
        } else if (this.a == null) {
            Logger.d("[ReCAPTCHA]", "cannot close sdk using null handle");
        } else {
            ((p) this.d).f("Close");
            g<Boolean> u = ((d3) this.b.a()).u(this.a);
            u.g(activity, new d(this));
            u.d(activity, new b(this));
        }
    }
}
