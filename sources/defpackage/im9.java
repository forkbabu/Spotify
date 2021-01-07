package defpackage;

import io.reactivex.functions.l;
import java.util.List;
import java.util.Queue;

/* renamed from: im9  reason: default package */
public final /* synthetic */ class im9 implements l {
    public final /* synthetic */ lm9 a;
    public final /* synthetic */ List b;

    public /* synthetic */ im9(lm9 lm9, List list) {
        this.a = lm9;
        this.b = list;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, (Queue) obj);
    }
}
