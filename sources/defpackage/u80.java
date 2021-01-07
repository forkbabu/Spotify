package defpackage;

import com.google.protobuf.Any;
import com.spotify.android.dac.api.view.helpers.a;
import com.spotify.android.dac.engine.view.binders.common.NotFoundComponentBinder;
import java.util.Map;
import kotlin.jvm.internal.h;

/* renamed from: u80  reason: default package */
public final class u80 implements s80 {
    private final Map<String, a<?>> a;

    public u80(Map<String, a<?>> map) {
        h.e(map, "componentViewBinderMap");
        this.a = map;
    }

    @Override // defpackage.s80
    public t80 a(Any any) {
        h.e(any, "proto");
        a<?> aVar = this.a.get(any.i());
        if (aVar == null) {
            aVar = new NotFoundComponentBinder();
        }
        return new a90(any, aVar);
    }
}
