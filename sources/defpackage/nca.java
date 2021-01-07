package defpackage;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.n;

/* renamed from: nca  reason: default package */
public final /* synthetic */ class nca implements n {
    public static final /* synthetic */ nca a = new nca();

    private /* synthetic */ nca() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((GaiaDevice) obj).getVolumeSteps() != 0;
    }
}
