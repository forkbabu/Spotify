package defpackage;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.g;

/* renamed from: qca  reason: default package */
public final /* synthetic */ class qca implements g {
    public final /* synthetic */ xca a;

    public /* synthetic */ qca(xca xca) {
        this.a = xca;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.c((GaiaDevice) obj);
    }
}
