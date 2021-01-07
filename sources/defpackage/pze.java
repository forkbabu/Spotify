package defpackage;

import defpackage.l0f;
import defpackage.o1f;

/* renamed from: pze  reason: default package */
public final /* synthetic */ class pze implements Runnable {
    public final /* synthetic */ l0f.a a;
    public final /* synthetic */ o1f.a b;

    public /* synthetic */ pze(l0f.a aVar, o1f.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l0f.a aVar = this.a;
        o1f.a aVar2 = this.b;
        l0f.h(l0f.this, aVar2.h(), aVar2.f(), aVar2.g(), aVar2.i());
    }
}
