package defpackage;

import defpackage.wy4;
import io.reactivex.functions.l;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: bz4  reason: default package */
final class bz4<T, R> implements l<List<? extends ty4>, wy4> {
    public static final bz4 a = new bz4();

    bz4() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public wy4 apply(List<? extends ty4> list) {
        List<? extends ty4> list2 = list;
        h.e(list2, "userSelectionList");
        return new wy4.b(list2);
    }
}
