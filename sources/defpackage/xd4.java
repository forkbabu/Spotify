package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.l;

/* renamed from: xd4  reason: default package */
public final /* synthetic */ class xd4 implements l {
    public static final /* synthetic */ xd4 a = new xd4();

    private /* synthetic */ xd4() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (String) ((Optional) obj).get();
    }
}
