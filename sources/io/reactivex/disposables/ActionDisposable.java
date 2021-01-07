package io.reactivex.disposables;

import io.reactivex.functions.a;
import io.reactivex.internal.util.ExceptionHelper;

/* access modifiers changed from: package-private */
public final class ActionDisposable extends ReferenceDisposable<a> {
    private static final long serialVersionUID = -8219729196779211169L;

    ActionDisposable(a aVar) {
        super(aVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // io.reactivex.disposables.ReferenceDisposable
    public void a(a aVar) {
        try {
            aVar.run();
        } catch (Throwable th) {
            throw ExceptionHelper.e(th);
        }
    }
}
