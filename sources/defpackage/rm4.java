package defpackage;

import com.google.common.base.Function;
import com.spotify.libs.connect.model.GaiaDevice;

/* renamed from: rm4  reason: default package */
public final /* synthetic */ class rm4 implements Function {
    public static final /* synthetic */ rm4 a = new rm4();

    private /* synthetic */ rm4() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return ((GaiaDevice) obj).getName();
    }
}
