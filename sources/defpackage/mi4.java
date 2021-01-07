package defpackage;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: mi4  reason: default package */
public final class mi4<V> implements Callable<String> {
    final /* synthetic */ ri4 a;

    mi4(ri4 ri4) {
        this.a = ri4;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public String call() {
        return this.a.b.m(zg4.b(), null);
    }
}
