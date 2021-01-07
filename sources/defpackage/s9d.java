package defpackage;

import com.google.common.base.Optional;
import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.n;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: s9d  reason: default package */
public final class s9d<T> implements n<Optional<GaiaDevice>> {
    public static final s9d a = new s9d();

    s9d() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.n
    public boolean test(Optional<GaiaDevice> optional) {
        Optional<GaiaDevice> optional2 = optional;
        h.e(optional2, "optionalDevice");
        return optional2.isPresent();
    }
}
