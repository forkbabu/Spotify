package defpackage;

import defpackage.vp3;
import io.reactivex.b;

/* renamed from: pd2  reason: default package */
public final /* synthetic */ class pd2 implements vp3.a {
    public final /* synthetic */ b a;

    public /* synthetic */ pd2(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.vp3.a
    public final void c() {
        b bVar = this.a;
        if (!bVar.d()) {
            bVar.onComplete();
        }
    }
}
