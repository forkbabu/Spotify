package defpackage;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.a;
import io.reactivex.functions.l;

/* renamed from: mbf  reason: default package */
public final /* synthetic */ class mbf implements l {
    public final /* synthetic */ zr0 a;

    public /* synthetic */ mbf(zr0 zr0) {
        this.a = zr0;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return a.u(new abf((GaiaDevice) obj, this.a));
    }
}
