package defpackage;

import com.spotify.mobius.rx2.o;

/* renamed from: c8d  reason: default package */
/* compiled from: java-style lambda group */
public final class c8d<V> implements fa2<ia2> {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public c8d(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.fa2
    public final ia2 get() {
        int i = this.a;
        if (i == 0) {
            return new o(((g8d) this.b).k);
        }
        if (i == 1) {
            return new o(((g8d) this.b).k);
        }
        throw null;
    }
}
