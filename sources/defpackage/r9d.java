package defpackage;

import com.google.common.base.Optional;
import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.l;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: r9d  reason: default package */
public final class r9d<T, R> implements l<List<GaiaDevice>, Optional<GaiaDevice>> {
    public static final r9d a = new r9d();

    r9d() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public Optional<GaiaDevice> apply(List<GaiaDevice> list) {
        T t;
        List<GaiaDevice> list2 = list;
        h.e(list2, "gaiaDevices");
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.isSelf()) {
                break;
            }
        }
        return Optional.fromNullable(t);
    }
}
