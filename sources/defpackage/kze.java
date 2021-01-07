package defpackage;

import defpackage.l0f;
import defpackage.o1f;

/* renamed from: kze  reason: default package */
public final /* synthetic */ class kze implements Runnable {
    public final /* synthetic */ l0f.a a;
    public final /* synthetic */ o1f.d b;

    public /* synthetic */ kze(l0f.a aVar, o1f.d dVar) {
        this.a = aVar;
        this.b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l0f.a aVar = this.a;
        o1f.d dVar = this.b;
        l0f.e(l0f.this, dVar.g(), dVar.f());
    }
}
