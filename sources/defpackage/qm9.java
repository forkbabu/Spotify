package defpackage;

import io.reactivex.functions.n;
import java.util.List;

/* renamed from: qm9  reason: default package */
public final /* synthetic */ class qm9 implements n {
    public static final /* synthetic */ qm9 a = new qm9();

    private /* synthetic */ qm9() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return !((List) obj).isEmpty();
    }
}
