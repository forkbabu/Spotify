package defpackage;

import android.content.Context;
import com.google.common.base.Optional;
import java.util.Map;

/* renamed from: j9e  reason: default package */
public final class j9e implements fjf<Map.Entry<Integer, o8e>> {
    private final wlf<Context> a;
    private final wlf<Optional<Integer>> b;

    public j9e(wlf<Context> wlf, wlf<Optional<Integer>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    public static Map.Entry<Integer, o8e> a(Context context, Optional<Integer> optional) {
        return v8e.o(context, optional);
    }

    @Override // defpackage.wlf
    public Object get() {
        return v8e.o(this.a.get(), this.b.get());
    }
}
