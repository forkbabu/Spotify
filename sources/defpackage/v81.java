package defpackage;

import com.google.common.collect.Collections2;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: v81  reason: default package */
public final class v81 {
    public static final <M extends s81> M a(Iterable<? extends M> iterable, String str) {
        h.e(iterable, "models");
        return (M) ((s81) Collections2.find(iterable, new u81(str), null));
    }

    public static final <M extends s81> List<M> b(Iterable<? extends M> iterable, String str) {
        h.e(iterable, "models");
        h.e(iterable, "models");
        FluentIterable filter = FluentIterable.from(iterable).filter(new t81(str));
        h.d(filter, "FluentIterable.from(mode….filter(withGroup(group))");
        ImmutableList list = FluentIterable.from(filter).toList();
        h.d(list, "FluentIterable.from(filt…(models, group)).toList()");
        return list;
    }
}
