package defpackage;

import io.reactivex.functions.l;
import java.util.Map;

/* renamed from: i7b  reason: default package */
public final /* synthetic */ class i7b implements l {
    public final /* synthetic */ l7b a;
    public final /* synthetic */ z6b b;

    public /* synthetic */ i7b(l7b l7b, z6b z6b) {
        this.a = l7b;
        this.b = z6b;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.b(this.b, (Map) obj);
    }
}
