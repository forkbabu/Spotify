package defpackage;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.g;

/* renamed from: dt4  reason: default package */
public final /* synthetic */ class dt4 implements g {
    public final /* synthetic */ ft4 a;

    public /* synthetic */ dt4(ft4 ft4) {
        this.a = ft4;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        ft4.b(this.a, (GaiaDevice) obj);
    }
}
