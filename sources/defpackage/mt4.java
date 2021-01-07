package defpackage;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;
import java.util.List;

/* renamed from: mt4  reason: default package */
public final /* synthetic */ class mt4 implements l {
    public static final /* synthetic */ mt4 a = new mt4();

    private /* synthetic */ mt4() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        GaiaDevice gaiaDevice = null;
        for (GaiaDevice gaiaDevice2 : (List) obj) {
            if (gaiaDevice2.isSelf()) {
                gaiaDevice = gaiaDevice2;
            }
            if (gaiaDevice2.isActive()) {
                return s.i0(gaiaDevice2);
            }
        }
        if (gaiaDevice == null) {
            return o.a;
        }
        gaiaDevice.setActive();
        return s.i0(gaiaDevice);
    }
}
