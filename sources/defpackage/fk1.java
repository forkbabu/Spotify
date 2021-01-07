package defpackage;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.l;

/* renamed from: fk1  reason: default package */
public final /* synthetic */ class fk1 implements l {
    public static final /* synthetic */ fk1 a = new fk1();

    private /* synthetic */ fk1() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(((GaiaDevice) obj).isSelf());
    }
}
