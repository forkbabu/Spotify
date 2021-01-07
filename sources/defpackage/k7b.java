package defpackage;

import io.reactivex.functions.l;
import java.util.Map;

/* renamed from: k7b  reason: default package */
public final /* synthetic */ class k7b implements l {
    public final /* synthetic */ q7b a;
    public final /* synthetic */ z6b b;

    public /* synthetic */ k7b(q7b q7b, z6b z6b) {
        this.a = q7b;
        this.b = z6b;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.b(this.b, (Map) obj);
    }
}
