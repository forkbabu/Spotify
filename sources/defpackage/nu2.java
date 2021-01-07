package defpackage;

import android.content.Context;
import com.google.android.play.core.missingsplits.a;
import com.google.android.play.core.missingsplits.b;

/* renamed from: nu2  reason: default package */
public final class nu2 implements fjf<a> {
    private final wlf<Context> a;

    public nu2(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return b.a(this.a.get());
    }
}
