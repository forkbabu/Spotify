package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.l;

/* renamed from: eq8  reason: default package */
public final /* synthetic */ class eq8 implements l {
    public static final /* synthetic */ eq8 a = new eq8();

    private /* synthetic */ eq8() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Optional optional = (Optional) obj;
        return optional.isPresent() ? (String) optional.get() : "Control";
    }
}
