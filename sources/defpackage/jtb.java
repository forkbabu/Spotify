package defpackage;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.n;

/* renamed from: jtb  reason: default package */
public final /* synthetic */ class jtb implements n {
    public final /* synthetic */ mtb a;

    public /* synthetic */ jtb(mtb mtb) {
        this.a = mtb;
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return this.a.b((GaiaDevice) obj);
    }
}
