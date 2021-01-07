package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.l;

/* renamed from: pgd  reason: default package */
public final /* synthetic */ class pgd implements l {
    public static final /* synthetic */ pgd a = new pgd();

    private /* synthetic */ pgd() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            return (String) optional.get();
        }
        return null;
    }
}
