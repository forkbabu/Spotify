package defpackage;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.l;

/* renamed from: os0  reason: default package */
public class os0 implements l<GaiaDevice, ps0> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public ps0 apply(GaiaDevice gaiaDevice) {
        GaiaDevice gaiaDevice2 = gaiaDevice;
        return new ps0(gaiaDevice2.getState(), gaiaDevice2.isActive(), gaiaDevice2.isBeingActivated(), gaiaDevice2.getCosmosIdentifier(), gaiaDevice2.getName(), gaiaDevice2.supportsVolume());
    }
}
