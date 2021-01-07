package defpackage;

import com.google.common.base.Optional;
import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.l;

/* renamed from: kx5  reason: default package */
public final /* synthetic */ class kx5 implements l {
    public static final /* synthetic */ kx5 a = new kx5();

    private /* synthetic */ kx5() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        GaiaDevice gaiaDevice = (GaiaDevice) obj;
        if (!gaiaDevice.isSelf()) {
            return Optional.of(gaiaDevice.getName());
        }
        return Optional.absent();
    }
}
