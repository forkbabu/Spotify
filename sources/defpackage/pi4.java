package defpackage;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: pi4  reason: default package */
public final class pi4<V> implements Callable<Boolean> {
    final /* synthetic */ ri4 a;

    pi4(ri4 ri4) {
        this.a = ri4;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public Boolean call() {
        return Boolean.valueOf(ri4.a(this.a).d(zg4.a(), true));
    }
}
