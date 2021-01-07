package defpackage;

import android.content.Context;

/* renamed from: q3e  reason: default package */
public class q3e implements x2e {
    private final Context a;
    private final w9e b;

    public q3e(Context context, w9e w9e) {
        this.a = context;
        this.b = w9e;
    }

    @Override // defpackage.x2e
    public boolean a(o8e o8e) {
        return this.b.e(this.a.getPackageManager());
    }
}
