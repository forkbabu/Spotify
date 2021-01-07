package defpackage;

import defpackage.l0f;
import defpackage.r1f;

/* renamed from: qze  reason: default package */
public final /* synthetic */ class qze implements Runnable {
    public final /* synthetic */ l0f.a a;
    public final /* synthetic */ r1f.g b;

    public /* synthetic */ qze(l0f.a aVar, r1f.g gVar) {
        this.a = aVar;
        this.b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l0f.m(l0f.this, this.b.j().get());
    }
}
