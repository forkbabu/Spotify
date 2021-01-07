package defpackage;

import com.google.common.base.Function;
import com.spotify.libs.connect.model.GaiaDevice;

/* renamed from: bm4  reason: default package */
public final /* synthetic */ class bm4 implements Function {
    public static final /* synthetic */ bm4 a = new bm4();

    private /* synthetic */ bm4() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return Boolean.valueOf(((GaiaDevice) obj).isSelf());
    }
}
