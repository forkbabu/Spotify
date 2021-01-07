package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.h;
import kotlinx.coroutines.Job;

final class LifecycleController$observer$1 implements l {
    @Override // androidx.lifecycle.l
    public final void p(n nVar, Lifecycle.Event event) {
        h.f(nVar, "source");
        h.f(event, "<anonymous parameter 1>");
        Lifecycle A = nVar.A();
        h.b(A, "source.lifecycle");
        if (A.b() == Lifecycle.State.DESTROYED) {
            Job.DefaultImpls.cancel$default((Job) null, (CancellationException) null, 1, (Object) null);
            throw null;
        }
        Lifecycle A2 = nVar.A();
        h.b(A2, "source.lifecycle");
        A2.b();
        throw null;
    }
}
