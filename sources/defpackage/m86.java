package defpackage;

import android.content.Context;
import defpackage.f86;
import defpackage.j86;

/* access modifiers changed from: package-private */
/* renamed from: m86  reason: default package */
public final class m86 implements j86.a {
    private final wlf<d86> a;
    private final wlf<Context> b;
    private final wlf<f86.a> c;

    m86(wlf<d86> wlf, wlf<Context> wlf2, wlf<f86.a> wlf3) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.j86.a
    public j86 create() {
        d86 d86 = this.a.get();
        a(d86, 1);
        Context context = this.b.get();
        a(context, 2);
        f86.a aVar = this.c.get();
        a(aVar, 3);
        return new l86(d86, context, aVar);
    }
}
