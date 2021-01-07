package defpackage;

import io.reactivex.functions.c;
import java.util.List;
import java.util.Map;

/* renamed from: rt4  reason: default package */
public final /* synthetic */ class rt4 implements c {
    public final /* synthetic */ ut4 a;

    public /* synthetic */ rt4(ut4 ut4) {
        this.a = ut4;
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        List list = (List) obj2;
        this.a.i((Map) obj, list);
        return list;
    }
}
