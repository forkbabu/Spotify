package androidx.work.impl.utils.futures;

import androidx.work.impl.utils.futures.AbstractFuture;
import com.google.common.util.concurrent.ListenableFuture;

public final class a<V> extends AbstractFuture<V> {
    private a() {
    }

    public static <V> a<V> y() {
        return new a<>();
    }

    public boolean A(ListenableFuture<? extends V> listenableFuture) {
        AbstractFuture.f fVar;
        AbstractFuture.Failure failure;
        listenableFuture.getClass();
        Object obj = this.a;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!AbstractFuture.o.b(this, null, AbstractFuture.f(listenableFuture))) {
                    return false;
                }
                AbstractFuture.b(this);
            } else {
                fVar = new AbstractFuture.f(this, listenableFuture);
                if (AbstractFuture.o.b(this, null, fVar)) {
                    try {
                        listenableFuture.addListener(fVar, DirectExecutor.INSTANCE);
                    } catch (Throwable unused) {
                        failure = AbstractFuture.Failure.b;
                    }
                } else {
                    obj = this.a;
                }
            }
            return true;
        }
        if (!(obj instanceof AbstractFuture.c)) {
            return false;
        }
        listenableFuture.cancel(((AbstractFuture.c) obj).a);
        return false;
        AbstractFuture.o.b(this, fVar, failure);
        return true;
    }

    @Override // androidx.work.impl.utils.futures.AbstractFuture
    public boolean t(V v) {
        return super.t(v);
    }

    public boolean z(Throwable th) {
        th.getClass();
        if (!AbstractFuture.o.b(this, null, new AbstractFuture.Failure(th))) {
            return false;
        }
        AbstractFuture.b(this);
        return true;
    }
}
