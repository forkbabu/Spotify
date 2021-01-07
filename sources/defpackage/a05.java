package defpackage;

import defpackage.uz4;
import io.reactivex.functions.l;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: a05  reason: default package */
final class a05<T, R> implements l<List<? extends ty4>, uz4> {
    public static final a05 a = new a05();

    a05() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public uz4 apply(List<? extends ty4> list) {
        List<? extends ty4> list2 = list;
        h.e(list2, "userSelectionList");
        return new uz4.h(list2);
    }
}
