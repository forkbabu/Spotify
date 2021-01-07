package defpackage;

import io.reactivex.functions.l;
import java.util.Set;

/* renamed from: o0a  reason: default package */
public final /* synthetic */ class o0a implements l {
    public final /* synthetic */ b1a a;
    public final /* synthetic */ Set b;

    public /* synthetic */ o0a(b1a b1a, Set set) {
        this.a = b1a;
        this.b = set;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.d(this.b, (String) obj);
    }
}
