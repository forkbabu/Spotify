package defpackage;

import io.reactivex.functions.n;
import java.util.List;

/* renamed from: in9  reason: default package */
public final /* synthetic */ class in9 implements n {
    public static final /* synthetic */ in9 a = new in9();

    private /* synthetic */ in9() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return !((List) obj).isEmpty();
    }
}
