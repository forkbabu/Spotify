package defpackage;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.a;

/* renamed from: abf  reason: default package */
public final /* synthetic */ class abf implements a {
    public final /* synthetic */ GaiaDevice a;
    public final /* synthetic */ zr0 b;

    public /* synthetic */ abf(GaiaDevice gaiaDevice, zr0 zr0) {
        this.a = gaiaDevice;
        this.b = zr0;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        GaiaDevice gaiaDevice = this.a;
        zr0 zr0 = this.b;
        if (!gaiaDevice.isSelf()) {
            zr0.d();
        }
    }
}
