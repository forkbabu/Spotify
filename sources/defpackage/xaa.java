package defpackage;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.d;

/* renamed from: xaa  reason: default package */
public final /* synthetic */ class xaa implements d {
    public static final /* synthetic */ xaa a = new xaa();

    private /* synthetic */ xaa() {
    }

    @Override // io.reactivex.functions.d
    public final boolean a(Object obj, Object obj2) {
        int i = hba.h;
        return ((GaiaDevice) obj).getCosmosIdentifier().equals(((GaiaDevice) obj2).getCosmosIdentifier());
    }
}
