package defpackage;

import com.spotify.android.flags.c;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;

/* renamed from: jk5  reason: default package */
public final class jk5 implements fjf<s<Boolean>> {
    private final wlf<g<c>> a;

    public jk5(wlf<g<c>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new v(this.a.get().O(fk5.a).s());
    }
}
