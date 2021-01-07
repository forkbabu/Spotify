package defpackage;

import com.spotify.mobius.e0;
import defpackage.dza;
import defpackage.xya;
import java.util.Arrays;

/* renamed from: qya  reason: default package */
public final /* synthetic */ class qya implements ti0 {
    public final /* synthetic */ eza a;
    public final /* synthetic */ xya b;

    public /* synthetic */ qya(eza eza, xya xya) {
        this.a = eza;
        this.b = xya;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        dza.d dVar = (dza.d) obj;
        return e0.a(z42.l(new xya.d(Arrays.asList(new xya.a(this.a.b()), this.b))));
    }
}
