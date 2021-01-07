package defpackage;

import io.reactivex.functions.l;
import java.util.Set;

/* renamed from: e0a  reason: default package */
public final /* synthetic */ class e0a implements l {
    public final /* synthetic */ z0a a;
    public final /* synthetic */ Set b;

    public /* synthetic */ e0a(z0a z0a, Set set) {
        this.a = z0a;
        this.b = set;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, (String) obj);
    }
}
