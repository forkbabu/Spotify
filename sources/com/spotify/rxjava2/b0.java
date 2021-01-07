package com.spotify.rxjava2;

import io.reactivex.disposables.b;
import io.reactivex.f;
import io.reactivex.h;
import io.reactivex.t;

/* access modifiers changed from: package-private */
public class b0 {
    private final f<?> a;
    private final b b;
    private final y c;
    private final String d;
    private final boolean e;

    b0(f<?> fVar, b bVar, y yVar, String str, boolean z) {
        this.a = fVar;
        this.b = bVar;
        this.c = yVar;
        this.d = str;
        this.e = z;
    }

    public y a() {
        return this.c;
    }

    public boolean b() {
        boolean z;
        f<?> fVar = this.a;
        if (fVar instanceof t) {
            z = ((t) fVar).d();
        } else if (fVar instanceof h) {
            z = ((h) fVar).isCancelled();
        } else {
            throw new IllegalArgumentException("Must be either ObservableEmitter or FlowableEmitter");
        }
        if (z) {
            return false;
        }
        if (this.e) {
            f<?> fVar2 = this.a;
            RxJavaLeakException rxJavaLeakException = new RxJavaLeakException(this.d);
            if (fVar2 instanceof t) {
                return ((t) fVar2).f(rxJavaLeakException);
            }
            if (fVar2 instanceof h) {
                return ((h) fVar2).f(rxJavaLeakException);
            }
            throw new IllegalArgumentException("Must be either ObservableEmitter or FlowableEmitter");
        }
        this.b.dispose();
        return true;
    }
}
