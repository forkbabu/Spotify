package defpackage;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.l;

/* renamed from: lx8  reason: default package */
public final /* synthetic */ class lx8 implements l {
    public static final /* synthetic */ lx8 a = new lx8();

    private /* synthetic */ lx8() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((GaiaDevice) obj).getCosmosIdentifier();
    }
}
