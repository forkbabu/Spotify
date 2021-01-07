package defpackage;

import com.google.common.base.Optional;
import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.l;

/* renamed from: no4  reason: default package */
public final /* synthetic */ class no4 implements l {
    public static final /* synthetic */ no4 a = new no4();

    private /* synthetic */ no4() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Optional.fromNullable((GaiaDevice) obj);
    }
}
