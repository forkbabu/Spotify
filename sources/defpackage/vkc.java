package defpackage;

import com.google.common.collect.ImmutableMap;
import defpackage.tkc;
import kotlin.jvm.internal.h;

/* renamed from: vkc  reason: default package */
public final class vkc implements fjf<ImmutableMap<String, Boolean>> {

    /* access modifiers changed from: private */
    /* renamed from: vkc$a */
    public static final class a {
        private static final vkc a = new vkc();
    }

    public static vkc a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        tkc.a aVar = tkc.a;
        ImmutableMap.Builder builder = ImmutableMap.builder();
        Boolean bool = Boolean.TRUE;
        builder.mo51put("link", bool);
        builder.mo51put("name", bool);
        builder.mo51put("covers", bool);
        builder.mo51put("publisher", bool);
        builder.mo51put("latestPublishedEpisodeDate", bool);
        builder.mo51put("hasNewEpisodes", bool);
        ImmutableMap build = builder.build();
        h.d(build, "ImmutableMap.builder<Str…\n                .build()");
        return build;
    }
}
