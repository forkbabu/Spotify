package defpackage;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.d;

/* renamed from: rca  reason: default package */
public final /* synthetic */ class rca implements d {
    public static final /* synthetic */ rca a = new rca();

    private /* synthetic */ rca() {
    }

    @Override // io.reactivex.functions.d
    public final boolean a(Object obj, Object obj2) {
        return ((GaiaDevice) obj).getCosmosIdentifier().equals(((GaiaDevice) obj2).getCosmosIdentifier());
    }
}
