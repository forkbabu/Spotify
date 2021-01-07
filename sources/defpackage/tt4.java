package defpackage;

import com.spotify.libs.connect.model.GaiaDevice;
import java.util.Comparator;

/* renamed from: tt4  reason: default package */
public final /* synthetic */ class tt4 implements Comparator {
    public static final /* synthetic */ tt4 a = new tt4();

    private /* synthetic */ tt4() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        GaiaDevice gaiaDevice = (GaiaDevice) obj2;
        if (((GaiaDevice) obj).isSelf()) {
            return -1;
        }
        return gaiaDevice.isSelf() ? 1 : 0;
    }
}
