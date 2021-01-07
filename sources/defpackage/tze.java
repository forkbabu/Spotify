package defpackage;

import defpackage.l0f;
import defpackage.r1f;

/* renamed from: tze  reason: default package */
public final /* synthetic */ class tze implements si0 {
    public final /* synthetic */ l0f.a a;

    public /* synthetic */ tze(l0f.a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        l0f.a aVar = this.a;
        r1f.g gVar = (r1f.g) obj;
        aVar.getClass();
        if (gVar.j().isPresent()) {
            l0f.c(l0f.this, new qze(aVar, gVar));
        } else {
            l0f.this.K();
        }
    }
}
