package defpackage;

import android.content.Context;

/* renamed from: bg9  reason: default package */
public final class bg9 implements fjf<ag9> {
    private final wlf<Context> a;

    public bg9(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ag9(this.a.get());
    }
}
