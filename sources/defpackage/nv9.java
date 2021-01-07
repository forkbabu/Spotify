package defpackage;

import io.reactivex.exceptions.UndeliverableException;
import retrofit2.HttpException;

/* access modifiers changed from: package-private */
/* renamed from: nv9  reason: default package */
public final class nv9 extends w0e {
    nv9() {
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.w0e
    public void b(UndeliverableException undeliverableException) {
        if (!(undeliverableException.getCause() instanceof HttpException)) {
            super.b(undeliverableException);
        }
    }
}
