package defpackage;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.l;

/* renamed from: yj1  reason: default package */
public final /* synthetic */ class yj1 implements l {
    public static final /* synthetic */ yj1 a = new yj1();

    private /* synthetic */ yj1() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(((GaiaDevice) obj).supportsVolume());
    }
}
