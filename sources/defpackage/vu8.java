package defpackage;

import com.spotify.mobius.rx2.o;
import io.reactivex.schedulers.a;

/* renamed from: vu8  reason: default package */
/* compiled from: java-style lambda group */
public final class vu8<V> implements fa2<ia2> {
    public static final vu8 b = new vu8(0);
    public static final vu8 c = new vu8(1);
    public final /* synthetic */ int a;

    public vu8(int i) {
        this.a = i;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.fa2
    public final ia2 get() {
        int i = this.a;
        if (i == 0) {
            return new o(a.c());
        }
        if (i == 1) {
            return new o(a.a());
        }
        throw null;
    }
}
