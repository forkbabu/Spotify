package defpackage;

import io.reactivex.b;
import io.reactivex.d;

/* renamed from: qld  reason: default package */
public final /* synthetic */ class qld implements d {
    public final /* synthetic */ xld a;
    public final /* synthetic */ String b;

    public /* synthetic */ qld(xld xld, String str) {
        this.a = xld;
        this.b = str;
    }

    @Override // io.reactivex.d
    public final void subscribe(b bVar) {
        this.a.e(this.b, bVar);
    }
}
