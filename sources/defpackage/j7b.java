package defpackage;

import io.reactivex.functions.l;
import java.util.Map;

/* renamed from: j7b  reason: default package */
public final /* synthetic */ class j7b implements l {
    public final /* synthetic */ o7b a;
    public final /* synthetic */ z6b b;

    public /* synthetic */ j7b(o7b o7b, z6b z6b) {
        this.a = o7b;
        this.b = z6b;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.b(this.b, (Map) obj);
    }
}
