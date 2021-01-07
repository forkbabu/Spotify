package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.l;
import io.reactivex.s;

/* renamed from: swc  reason: default package */
public final /* synthetic */ class swc implements l {
    public static final /* synthetic */ swc a = new swc();

    private /* synthetic */ swc() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Optional optional = (Optional) obj;
        return s.i0(Boolean.valueOf(optional.isPresent() && "1".equals(optional.get())));
    }
}
