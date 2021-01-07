package defpackage;

import android.content.Context;
import com.google.android.exoplayer2.database.a;
import com.google.android.exoplayer2.database.b;

/* renamed from: e82  reason: default package */
public final class e82 implements fjf<a> {
    private final wlf<Context> a;

    public e82(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get());
    }
}
