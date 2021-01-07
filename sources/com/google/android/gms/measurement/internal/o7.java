package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.common.util.d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class o7 extends d5 {
    private volatile p7 c;
    private p7 d;
    protected p7 e;
    private final Map<Activity, p7> f = new ConcurrentHashMap();
    private Activity g;
    private volatile boolean h;
    private volatile p7 i;
    private p7 j;
    private boolean k;
    private final Object l = new Object();
    private String m;

    public o7(f5 f5Var) {
        super(f5Var);
    }

    private static String D(String str) {
        String[] split = str.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    private final void G(Activity activity, p7 p7Var, boolean z) {
        p7 p7Var2;
        p7 p7Var3 = this.c == null ? this.d : this.c;
        if (p7Var.b == null) {
            p7Var2 = new p7(p7Var.a, activity != null ? D(activity.getClass().getCanonicalName()) : null, p7Var.c, p7Var.e, p7Var.f);
        } else {
            p7Var2 = p7Var;
        }
        this.d = this.c;
        this.c = p7Var2;
        ((d) super.d()).getClass();
        super.k().y(new q7(this, p7Var2, p7Var3, SystemClock.elapsedRealtime(), z));
    }

    static void J(o7 o7Var, Bundle bundle, p7 p7Var, p7 p7Var2, long j2) {
        o7Var.getClass();
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        o7Var.N(p7Var, p7Var2, j2, true, super.f().C(null, "screen_view", bundle, null, true, true));
    }

    public static void M(p7 p7Var, Bundle bundle, boolean z) {
        if (bundle != null && p7Var != null && (!bundle.containsKey("_sc") || z)) {
            String str = p7Var.a;
            if (str != null) {
                bundle.putString("_sn", str);
            } else {
                bundle.remove("_sn");
            }
            String str2 = p7Var.b;
            if (str2 != null) {
                bundle.putString("_sc", str2);
            } else {
                bundle.remove("_sc");
            }
            bundle.putLong("_si", p7Var.c);
        } else if (bundle != null && p7Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void N(com.google.android.gms.measurement.internal.p7 r9, com.google.android.gms.measurement.internal.p7 r10, long r11, boolean r13, android.os.Bundle r14) {
        /*
        // Method dump skipped, instructions count: 332
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.o7.N(com.google.android.gms.measurement.internal.p7, com.google.android.gms.measurement.internal.p7, long, boolean, android.os.Bundle):void");
    }

    /* access modifiers changed from: private */
    public final void O(p7 p7Var, boolean z, long j2) {
        a n = super.n();
        ((d) super.d()).getClass();
        n.v(SystemClock.elapsedRealtime());
        if (super.u().D(p7Var != null && p7Var.d, z, j2) && p7Var != null) {
            p7Var.d = false;
        }
    }

    private final p7 V(Activity activity) {
        if (activity != null) {
            p7 p7Var = this.f.get(activity);
            if (p7Var == null) {
                p7 p7Var2 = new p7(null, D(activity.getClass().getCanonicalName()), super.f().y0());
                this.f.put(activity, p7Var2);
                p7Var = p7Var2;
            }
            return (super.j().r(t.x0) && this.i != null) ? this.i : p7Var;
        }
        throw new NullPointerException("null reference");
    }

    public final p7 C(boolean z) {
        w();
        super.b();
        if (!super.j().r(t.x0) || !z) {
            return this.e;
        }
        p7 p7Var = this.e;
        return p7Var != null ? p7Var : this.j;
    }

    public final void E(Activity activity) {
        if (super.j().r(t.x0)) {
            synchronized (this.l) {
                this.k = true;
                if (activity != this.g) {
                    synchronized (this.l) {
                        this.g = activity;
                        this.h = false;
                    }
                    if (super.j().r(t.w0) && super.j().E().booleanValue()) {
                        this.i = null;
                        super.k().y(new u7(this));
                    }
                }
            }
        }
        if (!super.j().r(t.w0) || super.j().E().booleanValue()) {
            G(activity, V(activity), false);
            a n = super.n();
            ((d) n.d()).getClass();
            n.k().y(new d3(n, SystemClock.elapsedRealtime()));
            return;
        }
        this.c = this.i;
        super.k().y(new t7(this));
    }

    public final void F(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (super.j().E().booleanValue() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f.put(activity, new p7(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }

    @Deprecated
    public final void H(Activity activity, String str, String str2) {
        if (!super.j().E().booleanValue()) {
            super.l().J().a("setCurrentScreen cannot be called while screen reporting is disabled.");
        } else if (this.c == null) {
            super.l().J().a("setCurrentScreen cannot be called while no activity active");
        } else if (this.f.get(activity) == null) {
            super.l().J().a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = D(activity.getClass().getCanonicalName());
            }
            boolean v0 = z9.v0(this.c.b, str2);
            boolean v02 = z9.v0(this.c.a, str);
            if (v0 && v02) {
                super.l().J().a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > 100)) {
                super.l().J().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 == null || (str2.length() > 0 && str2.length() <= 100)) {
                super.l().M().c("Setting current screen to name, class", str == null ? "null" : str, str2);
                p7 p7Var = new p7(str, str2, super.f().y0());
                this.f.put(activity, p7Var);
                G(activity, p7Var, true);
            } else {
                super.l().J().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            }
        }
    }

    public final void I(Bundle bundle, long j2) {
        String string;
        String str;
        if (!super.j().r(t.x0)) {
            super.l().J().a("Manual screen reporting is disabled.");
            return;
        }
        synchronized (this.l) {
            if (!this.k) {
                super.l().J().a("Cannot log screen view event when the app is in the background.");
                return;
            }
            string = bundle.getString("screen_name");
            if (string == null || (string.length() > 0 && string.length() <= 100)) {
                String string2 = bundle.getString("screen_class");
                if (string2 == null || (string2.length() > 0 && string2.length() <= 100)) {
                    if (string2 == null) {
                        Activity activity = this.g;
                        str = activity != null ? D(activity.getClass().getCanonicalName()) : "Activity";
                    } else {
                        str = string2;
                    }
                    if (this.h && this.c != null) {
                        this.h = false;
                        boolean v0 = z9.v0(this.c.b, str);
                        boolean v02 = z9.v0(this.c.a, string);
                        if (v0 && v02) {
                            super.l().J().a("Ignoring call to log screen view event with duplicate parameters.");
                            return;
                        }
                    }
                } else {
                    super.l().J().b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                }
            } else {
                super.l().J().b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                return;
            }
        }
        super.l().M().c("Logging screen view with name, class", string == null ? "null" : string, str == null ? "null" : str);
        p7 p7Var = this.c == null ? this.d : this.c;
        p7 p7Var2 = new p7(string, str, super.f().y0(), true, j2);
        this.c = p7Var2;
        this.d = p7Var;
        this.i = p7Var2;
        ((d) super.d()).getClass();
        super.k().y(new r7(this, bundle, p7Var2, p7Var, SystemClock.elapsedRealtime()));
    }

    public final void P(String str, p7 p7Var) {
        super.b();
        synchronized (this) {
            String str2 = this.m;
            if (str2 == null || str2.equals(str) || p7Var != null) {
                this.m = str;
            }
        }
    }

    public final p7 Q() {
        return this.c;
    }

    public final void S(Activity activity) {
        if (super.j().r(t.x0)) {
            synchronized (this.l) {
                this.k = false;
                this.h = true;
            }
        }
        ((d) super.d()).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!super.j().r(t.w0) || super.j().E().booleanValue()) {
            p7 V = V(activity);
            this.d = this.c;
            this.c = null;
            super.k().y(new v7(this, V, elapsedRealtime));
            return;
        }
        this.c = null;
        super.k().y(new s7(this, elapsedRealtime));
    }

    public final void T(Activity activity, Bundle bundle) {
        p7 p7Var;
        if (super.j().E().booleanValue() && bundle != null && (p7Var = this.f.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", p7Var.c);
            bundle2.putString("name", p7Var.a);
            bundle2.putString("referrer_name", p7Var.b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    public final void U(Activity activity) {
        synchronized (this.l) {
            if (activity == this.g) {
                this.g = null;
            }
        }
        if (super.j().E().booleanValue()) {
            this.f.remove(activity);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.d5
    public final boolean z() {
        return false;
    }
}
