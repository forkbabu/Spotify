package defpackage;

import com.spotify.libs.connect.model.GaiaState;
import io.reactivex.functions.l;
import java.util.Collections;

/* renamed from: lm4  reason: default package */
public final /* synthetic */ class lm4 implements l {
    public static final /* synthetic */ lm4 a = new lm4();

    private /* synthetic */ lm4() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        GaiaState gaiaState = (GaiaState) obj;
        if (gaiaState == null) {
            return Collections.emptyList();
        }
        return gaiaState.getDevices();
    }
}
