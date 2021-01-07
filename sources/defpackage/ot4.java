package defpackage;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.l;
import java.util.Iterator;
import java.util.List;

/* renamed from: ot4  reason: default package */
public final /* synthetic */ class ot4 implements l {
    public static final /* synthetic */ ot4 a = new ot4();

    private /* synthetic */ ot4() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        List list = (List) obj;
        Iterator it = list.iterator();
        GaiaDevice gaiaDevice = null;
        while (true) {
            if (it.hasNext()) {
                GaiaDevice gaiaDevice2 = (GaiaDevice) it.next();
                if (gaiaDevice2.isSelf()) {
                    gaiaDevice = gaiaDevice2;
                }
                if (gaiaDevice2.isActive()) {
                    break;
                }
            } else if (gaiaDevice != null) {
                gaiaDevice.setActive();
            }
        }
        return list;
    }
}
