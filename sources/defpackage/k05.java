package defpackage;

import defpackage.d05;
import io.reactivex.functions.l;
import java.util.List;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: k05  reason: default package */
public final class k05<T, R> implements l<List<? extends ty4>, d05> {
    public static final k05 a = new k05();

    k05() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public d05 apply(List<? extends ty4> list) {
        List<? extends ty4> list2 = list;
        h.e(list2, "userSelectionList");
        return new d05.h(list2);
    }
}
