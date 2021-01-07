package defpackage;

import io.reactivex.functions.l;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cg1  reason: default package */
public final /* synthetic */ class cg1 implements l {
    public static final /* synthetic */ cg1 a = new cg1();

    private /* synthetic */ cg1() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        ArrayList arrayList = new ArrayList(100);
        for (List list : (List) obj) {
            arrayList.addAll(list);
        }
        return arrayList;
    }
}
