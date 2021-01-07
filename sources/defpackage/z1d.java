package defpackage;

import io.reactivex.functions.l;
import java.util.List;

/* renamed from: z1d  reason: default package */
public final /* synthetic */ class z1d implements l {
    public final /* synthetic */ d2d a;
    public final /* synthetic */ List b;
    public final /* synthetic */ pzc c;

    public /* synthetic */ z1d(d2d d2d, List list, pzc pzc) {
        this.a = d2d;
        this.b = list;
        this.c = pzc;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, this.c, (List) obj);
    }
}
