package defpackage;

import android.content.Context;
import java.util.List;

/* renamed from: x7e  reason: default package */
public final class x7e implements fjf<w7e> {
    private final wlf<List<String>> a;
    private final wlf<Context> b;

    public x7e(wlf<List<String>> wlf, wlf<Context> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new w7e(this.a.get(), this.b.get());
    }
}
