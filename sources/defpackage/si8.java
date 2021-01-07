package defpackage;

import com.spotify.mobius.e0;
import defpackage.xi8;

/* renamed from: si8  reason: default package */
public final /* synthetic */ class si8 implements ti0 {
    public final /* synthetic */ yi8 a;

    public /* synthetic */ si8(yi8 yi8) {
        this.a = yi8;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        yi8 yi8 = this.a;
        xi8.b bVar = (xi8.b) obj;
        if (!bVar.h() || bVar.g() <= yi8.f() || bVar.g() - yi8.f() <= 86400000 || !yi8.c()) {
            return e0.h();
        }
        return e0.f(yi8.a(yi8.f(), bVar.g(), false, true, yi8.b()));
    }
}
