package defpackage;

import android.content.Context;

/* renamed from: xj7  reason: default package */
public final class xj7 implements fjf<wj7> {
    private final wlf<Context> a;

    public xj7(wlf<Context> wlf) {
        this.a = wlf;
    }

    public static wj7 a(Context context) {
        return new wj7(context);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wj7(this.a.get());
    }
}
