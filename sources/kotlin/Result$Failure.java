package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.h;

public final class Result$Failure implements Serializable {
    public final Throwable exception;

    public Result$Failure(Throwable th) {
        h.e(th, "exception");
        this.exception = th;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        return (obj instanceof Result$Failure) && h.a(this.exception, ((Result$Failure) obj).exception);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.exception.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        return je.K0(je.V0("Failure("), this.exception, ')');
    }
}
