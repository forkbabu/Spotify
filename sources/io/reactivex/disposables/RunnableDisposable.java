package io.reactivex.disposables;

/* access modifiers changed from: package-private */
public final class RunnableDisposable extends ReferenceDisposable<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    RunnableDisposable(Runnable runnable) {
        super(runnable);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // io.reactivex.disposables.ReferenceDisposable
    public void a(Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference, java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("RunnableDisposable(disposed=");
        V0.append(d());
        V0.append(", ");
        V0.append(get());
        V0.append(")");
        return V0.toString();
    }
}
