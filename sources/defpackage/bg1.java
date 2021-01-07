package defpackage;

import io.reactivex.functions.l;
import java.util.List;

/* renamed from: bg1  reason: default package */
public final /* synthetic */ class bg1 implements l {
    public static final /* synthetic */ bg1 a = new bg1();

    private /* synthetic */ bg1() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        List list = (List) obj;
        return list.size() > 5 ? list.subList(0, 5) : list;
    }
}
