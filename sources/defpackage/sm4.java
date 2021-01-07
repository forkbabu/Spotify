package defpackage;

import com.google.common.base.Function;
import com.spotify.libs.connect.model.GaiaDevice;

/* renamed from: sm4  reason: default package */
public final /* synthetic */ class sm4 implements Function {
    public static final /* synthetic */ sm4 a = new sm4();

    private /* synthetic */ sm4() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return ((GaiaDevice) obj).getCosmosIdentifier();
    }
}
