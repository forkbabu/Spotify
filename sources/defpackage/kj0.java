package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: kj0  reason: default package */
public final /* synthetic */ class kj0 implements oj0 {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ oj0 b;

    public /* synthetic */ kj0(AtomicBoolean atomicBoolean, oj0 oj0) {
        this.a = atomicBoolean;
        this.b = oj0;
    }

    @Override // defpackage.oj0
    public final void dispose() {
        AtomicBoolean atomicBoolean = this.a;
        oj0 oj0 = this.b;
        atomicBoolean.set(true);
        oj0.dispose();
    }
}
