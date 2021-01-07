package defpackage;

import io.reactivex.functions.g;

/* renamed from: nne  reason: default package */
public final /* synthetic */ class nne implements g {
    public final /* synthetic */ vne a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ nne(vne vne, boolean z) {
        this.a = vne;
        this.b = z;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.j(this.b, (Long) obj);
    }
}
