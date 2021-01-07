package defpackage;

import com.google.common.base.Optional;
import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: t9d  reason: default package */
public final class t9d<T, R> implements l<Optional<GaiaDevice>, GaiaDevice> {
    public static final t9d a = new t9d();

    t9d() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public GaiaDevice apply(Optional<GaiaDevice> optional) {
        Optional<GaiaDevice> optional2 = optional;
        h.e(optional2, "optionalDevice");
        return optional2.get();
    }
}
