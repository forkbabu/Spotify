package defpackage;

import android.content.Context;

/* access modifiers changed from: package-private */
/* renamed from: l80  reason: default package */
public class l80 {
    private final Context a;

    l80(Context context) {
        this.a = context;
    }

    /* access modifiers changed from: package-private */
    public void a(j1 j1Var) {
        g1.a(this.a, "com.android.chrome", j1Var);
    }

    /* access modifiers changed from: package-private */
    public void b(j1 j1Var) {
        this.a.unbindService(j1Var);
    }
}
