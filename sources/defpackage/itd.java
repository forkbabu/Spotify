package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.n;

/* renamed from: itd  reason: default package */
public final /* synthetic */ class itd implements n {
    public static final /* synthetic */ itd a = new itd();

    private /* synthetic */ itd() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((Optional) obj).isPresent();
    }
}
