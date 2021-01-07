package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobius.e0;
import defpackage.ddd;
import defpackage.edd;

/* renamed from: ycd  reason: default package */
public final /* synthetic */ class ycd implements ti0 {
    public final /* synthetic */ edd a;

    public /* synthetic */ ycd(edd edd) {
        this.a = edd;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        edd edd = this.a;
        String e = ((ddd.c) obj).e();
        edd.a b = edd.b();
        b.c(Optional.of(e));
        return e0.f(b.a());
    }
}
