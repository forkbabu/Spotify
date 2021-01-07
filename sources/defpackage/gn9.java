package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.l;

/* renamed from: gn9  reason: default package */
public final /* synthetic */ class gn9 implements l {
    public static final /* synthetic */ gn9 a = new gn9();

    private /* synthetic */ gn9() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        String str = (String) obj;
        if (str.isEmpty()) {
            str = null;
        }
        return Optional.fromNullable(str);
    }
}
