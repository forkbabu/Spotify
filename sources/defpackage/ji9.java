package defpackage;

import android.content.Context;
import androidx.fragment.app.o;

/* renamed from: ji9  reason: default package */
public final class ji9 implements fjf<hi9> {
    private final wlf<Context> a;
    private final wlf<o> b;
    private final wlf<si9> c;

    public ji9(wlf<Context> wlf, wlf<o> wlf2, wlf<si9> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hi9(this.a.get(), this.b.get(), this.c.get());
    }
}
