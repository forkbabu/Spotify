package defpackage;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.l;
import io.reactivex.s;
import java.util.List;

/* renamed from: aba  reason: default package */
public final /* synthetic */ class aba implements l {
    public static final /* synthetic */ aba a = new aba();

    private /* synthetic */ aba() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        gba gba;
        List<GaiaDevice> list = (List) obj;
        int i = hba.h;
        if (list.size() <= 1) {
            gba = gba.d();
        } else {
            GaiaDevice gaiaDevice = null;
            GaiaDevice gaiaDevice2 = null;
            for (GaiaDevice gaiaDevice3 : list) {
                if (gaiaDevice3.isActive() && !gaiaDevice3.isSelf()) {
                    gaiaDevice2 = gaiaDevice3;
                } else if (gaiaDevice3.isBeingActivated()) {
                    gaiaDevice = gaiaDevice3;
                }
            }
            if (gaiaDevice != null) {
                gba = gba.c(gaiaDevice);
            } else if (gaiaDevice2 != null) {
                gba = gba.b(gaiaDevice2);
            } else {
                gba = gba.a();
            }
        }
        return s.i0(gba);
    }
}
