package defpackage;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: u9d  reason: default package */
public final class u9d<T, R> implements l<GaiaDevice, String> {
    public static final u9d a = new u9d();

    u9d() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public String apply(GaiaDevice gaiaDevice) {
        GaiaDevice gaiaDevice2 = gaiaDevice;
        h.e(gaiaDevice2, "optionalDevice");
        return gaiaDevice2.getPhysicalIdentifier();
    }
}
