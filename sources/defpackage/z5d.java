package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobius.e0;
import defpackage.i6d;
import defpackage.k6d;

/* renamed from: z5d  reason: default package */
public final /* synthetic */ class z5d implements ti0 {
    public final /* synthetic */ k6d a;

    public /* synthetic */ z5d(k6d k6d) {
        this.a = k6d;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        k6d k6d = this.a;
        boolean p = ((i6d.i) obj).p();
        k6d.a c = k6d.c();
        c.b(Optional.of(Boolean.valueOf(p)));
        return e0.f(c.a());
    }
}
