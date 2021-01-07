package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: cg0  reason: default package */
public final /* synthetic */ class cg0 implements wlf {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Class b;

    public /* synthetic */ cg0(Context context, Class cls) {
        this.a = context;
        this.b = cls;
    }

    @Override // defpackage.wlf
    public final Object get() {
        return new Intent(this.a, this.b);
    }
}
