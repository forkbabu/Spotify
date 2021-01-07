package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.n;

/* renamed from: mid  reason: default package */
public final /* synthetic */ class mid implements n {
    public static final /* synthetic */ mid a = new mid();

    private /* synthetic */ mid() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((Optional) obj).isPresent();
    }
}
