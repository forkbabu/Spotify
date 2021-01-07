package defpackage;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import io.reactivex.functions.g;
import java.io.IOException;

/* renamed from: w0e  reason: default package */
public class w0e implements g<Throwable> {
    /* access modifiers changed from: protected */
    public void a(Throwable th) {
        Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Throwable th) {
        Throwable th2 = th;
        if (th2 instanceof UndeliverableException) {
            b((UndeliverableException) th2);
        } else if (th2 instanceof CompositeException) {
            a((CompositeException) th2);
        } else if (th2 instanceof MissingBackpressureException) {
            a((MissingBackpressureException) th2);
        } else if (th2 instanceof OnErrorNotImplementedException) {
            a(((OnErrorNotImplementedException) th2).getCause());
        } else {
            a(th2);
        }
    }

    /* access modifiers changed from: protected */
    public void b(UndeliverableException undeliverableException) {
        Throwable cause = undeliverableException.getCause();
        if (!(cause instanceof IOException) && !(cause instanceof InterruptedException)) {
            a(cause);
        }
    }
}
