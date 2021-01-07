package defpackage;

import android.content.Context;
import java.util.Calendar;

/* renamed from: vna  reason: default package */
public final class vna implements fjf<una> {
    private final wlf<Context> a;
    private final wlf<Calendar> b;
    private final wlf<Calendar> c;

    public vna(wlf<Context> wlf, wlf<Calendar> wlf2, wlf<Calendar> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new una(this.a.get(), this.b.get(), this.c.get());
    }
}
