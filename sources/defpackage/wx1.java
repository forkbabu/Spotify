package defpackage;

import defpackage.px1;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: wx1  reason: default package */
final class wx1<T, R> implements l<Integer, px1> {
    public static final wx1 a = new wx1();

    wx1() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public px1 apply(Integer num) {
        Integer num2 = num;
        h.e(num2, "storyCount");
        return new px1.d(num2.intValue());
    }
}
