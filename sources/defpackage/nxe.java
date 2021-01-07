package defpackage;

import defpackage.uue;
import io.reactivex.functions.l;

/* renamed from: nxe  reason: default package */
public final /* synthetic */ class nxe implements l {
    public final /* synthetic */ t92 a;
    public final /* synthetic */ hze b;

    public /* synthetic */ nxe(t92 t92, hze hze) {
        this.a = t92;
        this.b = hze;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        uue.a aVar = (uue.a) obj;
        return yye.i(this.a).d(this.b.dismiss()).N();
    }
}
