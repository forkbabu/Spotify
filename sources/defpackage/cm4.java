package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.n;

/* renamed from: cm4  reason: default package */
public final /* synthetic */ class cm4 implements n {
    public static final /* synthetic */ cm4 a = new cm4();

    private /* synthetic */ cm4() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((Optional) obj).isPresent();
    }
}
