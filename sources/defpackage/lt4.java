package defpackage;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.l;
import java.util.List;

/* renamed from: lt4  reason: default package */
public final /* synthetic */ class lt4 implements l {
    public static final /* synthetic */ lt4 a = new lt4();

    private /* synthetic */ lt4() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        List list = (List) obj;
        boolean z = !list.isEmpty();
        if (list.size() == 1) {
            z = !((GaiaDevice) list.get(0)).isSelf();
        }
        return Boolean.valueOf(z);
    }
}
