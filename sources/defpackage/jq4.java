package defpackage;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.g;

/* renamed from: jq4  reason: default package */
public final /* synthetic */ class jq4 implements g {
    public final /* synthetic */ nq4 a;

    public /* synthetic */ jq4(nq4 nq4) {
        this.a = nq4;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        nq4.b(this.a, (GaiaDevice) obj);
    }
}
