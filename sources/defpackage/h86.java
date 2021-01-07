package defpackage;

import android.content.Context;
import defpackage.f86;

/* access modifiers changed from: package-private */
/* renamed from: h86  reason: default package */
public final class h86 implements f86.a {
    private final wlf<Context> a;

    h86(wlf<Context> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.f86.a
    public f86 create() {
        Context context = this.a.get();
        a(context, 1);
        return new g86(context);
    }
}
