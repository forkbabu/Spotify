package defpackage;

import defpackage.z0a;
import io.reactivex.functions.l;

/* renamed from: g0a  reason: default package */
public final /* synthetic */ class g0a implements l {
    public final /* synthetic */ z0a a;
    public final /* synthetic */ String b;

    public /* synthetic */ g0a(z0a z0a, String str) {
        this.a = z0a;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.b(this.b, (z0a.b) obj);
    }
}
