package defpackage;

import io.reactivex.functions.l;
import java.util.List;

/* renamed from: k9e  reason: default package */
public final /* synthetic */ class k9e implements l {
    public final /* synthetic */ l9e a;
    public final /* synthetic */ List b;

    public /* synthetic */ k9e(l9e l9e, List list) {
        this.a = l9e;
        this.b = list;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.b(this.b, (u9e) obj);
    }
}
