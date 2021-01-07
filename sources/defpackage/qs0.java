package defpackage;

import com.google.common.base.Optional;
import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.l;
import java.util.List;

/* renamed from: qs0  reason: default package */
public class qs0 implements l<List<GaiaDevice>, Optional<GaiaDevice>> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public Optional<GaiaDevice> apply(List<GaiaDevice> list) {
        GaiaDevice gaiaDevice = null;
        GaiaDevice gaiaDevice2 = null;
        GaiaDevice gaiaDevice3 = null;
        for (GaiaDevice gaiaDevice4 : list) {
            if (gaiaDevice4.isBeingActivated()) {
                gaiaDevice = gaiaDevice4;
            }
            if (gaiaDevice4.isActive()) {
                gaiaDevice2 = gaiaDevice4;
            }
            if (gaiaDevice4.isSelf()) {
                gaiaDevice3 = gaiaDevice4;
            }
        }
        if (gaiaDevice != null) {
            return Optional.of(gaiaDevice);
        }
        if (gaiaDevice2 != null) {
            return Optional.of(gaiaDevice2);
        }
        if (gaiaDevice3 != null) {
            return Optional.of(gaiaDevice3);
        }
        return Optional.absent();
    }
}
