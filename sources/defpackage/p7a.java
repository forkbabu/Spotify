package defpackage;

import java.util.concurrent.Callable;

/* renamed from: p7a  reason: default package */
/* compiled from: java-style lambda group */
public final class p7a<V> implements Callable<Boolean> {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public p7a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final Boolean call() {
        int i = this.a;
        if (i == 0) {
            return (Boolean) ((wlf) this.b).get();
        }
        if (i == 1) {
            return (Boolean) ((wlf) this.b).get();
        }
        throw null;
    }
}
