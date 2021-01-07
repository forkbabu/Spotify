package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: lj0  reason: default package */
public final /* synthetic */ class lj0 implements wi0 {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ wi0 b;

    public /* synthetic */ lj0(AtomicBoolean atomicBoolean, wi0 wi0) {
        this.a = atomicBoolean;
        this.b = wi0;
    }

    @Override // defpackage.wi0
    public final void a(Object obj) {
        AtomicBoolean atomicBoolean = this.a;
        wi0 wi0 = this.b;
        if (!atomicBoolean.get()) {
            wi0.a(obj);
        }
    }
}
