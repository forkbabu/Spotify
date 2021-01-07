package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.components.glue.w;
import io.reactivex.functions.c;
import java.util.List;

/* renamed from: ah3  reason: default package */
class ah3 implements c<b91, Boolean, b91> {
    ah3() {
    }

    private static s81 b(s81 s81) {
        return (!HubsComponentCategory.ROW.d().equals(s81.componentId().category()) || !nt2.a(s81)) ? s81 : s81.toBuilder().c(w.a(true)).l();
    }

    static s81 c(s81 s81) {
        s81 b = b(s81);
        if (b.children().isEmpty()) {
            return b;
        }
        int i = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (s81 s812 : b.children()) {
            builder.mo53add((ImmutableList.Builder) b(s812));
        }
        return b.toBuilder().m(builder.build()).l();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // io.reactivex.functions.c
    public b91 a(b91 b91, Boolean bool) {
        b91 b912 = b91;
        return bool.booleanValue() ? b912.toBuilder().e(Collections2.transform((List) b912.body(), (Function) zg3.a)).g() : b912;
    }
}
