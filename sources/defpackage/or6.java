package defpackage;

import io.reactivex.functions.n;
import java.util.Map;

/* renamed from: or6  reason: default package */
public final /* synthetic */ class or6 implements n {
    public static final /* synthetic */ or6 a = new or6();

    private /* synthetic */ or6() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return !((Map) obj).isEmpty();
    }
}
