package defpackage;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.n;

/* renamed from: fba  reason: default package */
public final /* synthetic */ class fba implements n {
    public static final /* synthetic */ fba a = new fba();

    private /* synthetic */ fba() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((GaiaDevice) obj).isActive();
    }
}
