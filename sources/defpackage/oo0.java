package defpackage;

import com.google.common.collect.ImmutableList;
import io.reactivex.functions.l;
import java.util.Collection;
import java.util.List;

/* renamed from: oo0  reason: default package */
public final /* synthetic */ class oo0 implements l {
    public static final /* synthetic */ oo0 a = new oo0();

    private /* synthetic */ oo0() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return jo0.f(ImmutableList.copyOf((Collection) ((List) obj)));
    }
}
