package androidx.lifecycle;

import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import kotlin.d;
import kotlin.jvm.internal.h;
import kotlin.reflect.c;

public final class f0<VM extends e0> implements d<VM> {
    private VM a;
    private final c<VM> b;
    private final cmf<h0> c;
    private final cmf<g0.b> f;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: cmf<? extends androidx.lifecycle.h0> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: cmf<? extends androidx.lifecycle.g0$b> */
    /* JADX WARN: Multi-variable type inference failed */
    public f0(c<VM> cVar, cmf<? extends h0> cmf, cmf<? extends g0.b> cmf2) {
        h.f(cVar, "viewModelClass");
        h.f(cmf, "storeProducer");
        h.f(cmf2, "factoryProducer");
        this.b = cVar;
        this.c = cmf;
        this.f = cmf2;
    }

    @Override // kotlin.d
    public Object getValue() {
        VM vm = this.a;
        if (vm != null) {
            return vm;
        }
        VM vm2 = (VM) new g0(this.c.invoke(), this.f.invoke()).a(yif.s(this.b));
        this.a = vm2;
        h.b(vm2, "ViewModelProvider(store,…ed = it\n                }");
        return vm2;
    }
}
