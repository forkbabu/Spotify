package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.l;

/* renamed from: pm9  reason: default package */
public final /* synthetic */ class pm9 implements l {
    public static final /* synthetic */ pm9 a = new pm9();

    private /* synthetic */ pm9() {
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
