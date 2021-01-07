package defpackage;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.n;

/* renamed from: ix8  reason: default package */
public final /* synthetic */ class ix8 implements n {
    public static final /* synthetic */ ix8 a = new ix8();

    private /* synthetic */ ix8() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((GaiaDevice) obj).isSelf();
    }
}
