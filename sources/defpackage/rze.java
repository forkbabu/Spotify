package defpackage;

import defpackage.l0f;
import defpackage.o1f;

/* renamed from: rze  reason: default package */
public final /* synthetic */ class rze implements Runnable {
    public final /* synthetic */ l0f.a a;
    public final /* synthetic */ o1f.b b;

    public /* synthetic */ rze(l0f.a aVar, o1f.b bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l0f.a aVar = this.a;
        o1f.b bVar = this.b;
        l0f.f(l0f.this, bVar.g(), bVar.f());
    }
}
