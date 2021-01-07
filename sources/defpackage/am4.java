package defpackage;

import com.google.common.base.Optional;
import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.l;

/* renamed from: am4  reason: default package */
public final /* synthetic */ class am4 implements l {
    public static final /* synthetic */ am4 a = new am4();

    private /* synthetic */ am4() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (GaiaDevice) ((Optional) obj).get();
    }
}
