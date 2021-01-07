package defpackage;

import android.content.Context;

/* renamed from: m80  reason: default package */
public final class m80 implements fjf<l80> {
    private final wlf<Context> a;

    public m80(wlf<Context> wlf) {
        this.a = wlf;
    }

    public static l80 a(Context context) {
        return new l80(context);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l80(this.a.get());
    }
}
