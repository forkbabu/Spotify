package defpackage;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.g;

/* renamed from: eda  reason: default package */
public final /* synthetic */ class eda implements g {
    public final /* synthetic */ mda a;

    public /* synthetic */ eda(mda mda) {
        this.a = mda;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        mda.b(this.a, (GaiaDevice) obj);
    }
}
