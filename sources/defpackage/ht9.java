package defpackage;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import io.reactivex.functions.l;
import java.util.Collection;
import java.util.List;

/* renamed from: ht9  reason: default package */
public final /* synthetic */ class ht9 implements l {
    public static final /* synthetic */ ht9 a = new ht9();

    private /* synthetic */ ht9() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Collections2.newArrayList(Collections2.filter((Collection) ((List) obj), (Predicate) lt9.a));
    }
}
