package defpackage;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.n;

/* renamed from: kt4  reason: default package */
public final /* synthetic */ class kt4 implements n {
    public static final /* synthetic */ kt4 a = new kt4();

    private /* synthetic */ kt4() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return !((GaiaDevice) obj).isActive();
    }
}
