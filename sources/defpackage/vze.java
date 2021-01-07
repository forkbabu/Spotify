package defpackage;

import defpackage.l0f;
import defpackage.o1f;

/* renamed from: vze  reason: default package */
public final /* synthetic */ class vze implements Runnable {
    public final /* synthetic */ l0f.a a;
    public final /* synthetic */ o1f.c b;

    public /* synthetic */ vze(l0f.a aVar, o1f.c cVar) {
        this.a = aVar;
        this.b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l0f.a aVar = this.a;
        o1f.c cVar = this.b;
        l0f.g(l0f.this, cVar.h(), cVar.f(), cVar.g());
    }
}
