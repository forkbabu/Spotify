package defpackage;

import com.google.common.base.Predicate;
import com.spotify.libs.connect.model.GaiaDevice;

/* renamed from: im4  reason: default package */
public final /* synthetic */ class im4 implements Predicate {
    public final /* synthetic */ String a;

    public /* synthetic */ im4(String str) {
        this.a = str;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        GaiaDevice gaiaDevice = (GaiaDevice) obj;
        return gaiaDevice != null && this.a.equals(gaiaDevice.getCosmosIdentifier());
    }
}
