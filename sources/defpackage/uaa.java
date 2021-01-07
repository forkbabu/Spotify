package defpackage;

import com.google.common.base.Optional;
import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.l;

/* renamed from: uaa  reason: default package */
public final /* synthetic */ class uaa implements l {
    public static final /* synthetic */ uaa a = new uaa();

    private /* synthetic */ uaa() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (GaiaDevice) ((Optional) obj).get();
    }
}
