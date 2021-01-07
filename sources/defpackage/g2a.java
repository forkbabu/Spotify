package defpackage;

import io.reactivex.functions.l;

/* renamed from: g2a  reason: default package */
public final /* synthetic */ class g2a implements l {
    public final /* synthetic */ v2a a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ g2a(v2a v2a, boolean z) {
        this.a = v2a;
        this.b = z;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.e(this.b, (y2a) obj);
    }
}
