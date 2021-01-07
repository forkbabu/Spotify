package defpackage;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.g;

/* renamed from: ls4  reason: default package */
public final /* synthetic */ class ls4 implements g {
    public final /* synthetic */ us4 a;

    public /* synthetic */ ls4(us4 us4) {
        this.a = us4;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.v((GaiaDevice) obj);
    }
}
