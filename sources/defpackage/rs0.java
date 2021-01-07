package defpackage;

import com.google.common.base.Optional;
import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.l;
import java.util.List;

/* renamed from: rs0  reason: default package */
public class rs0 implements l<List<GaiaDevice>, Optional<GaiaDevice>> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public Optional<GaiaDevice> apply(List<GaiaDevice> list) {
        GaiaDevice gaiaDevice = null;
        for (GaiaDevice gaiaDevice2 : list) {
            if (gaiaDevice2.isBeingActivated()) {
                gaiaDevice = gaiaDevice2;
            }
        }
        if (gaiaDevice != null) {
            return Optional.of(gaiaDevice);
        }
        return Optional.absent();
    }
}
