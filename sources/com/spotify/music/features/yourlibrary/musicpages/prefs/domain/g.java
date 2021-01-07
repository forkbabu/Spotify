package com.spotify.music.features.yourlibrary.musicpages.prefs.domain;

import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobius.e0;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PrefsModel;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.k;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.m;
import java.util.List;
import java.util.Map;

public final /* synthetic */ class g implements ti0 {
    public final /* synthetic */ m a;

    public /* synthetic */ g(m mVar) {
        this.a = mVar;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        m mVar = this.a;
        k.c cVar = (k.c) obj;
        if (!mVar.d().isPresent()) {
            return e0.h();
        }
        PrefsModel prefsModel = mVar.d().get();
        List<PagePrefs> pagePrefs = mVar.d().get().pagePrefs();
        int i = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        Optional tryFind = Collections2.tryFind(pagePrefs, new c(cVar));
        if (tryFind.isPresent()) {
            PagePrefs pagePrefs2 = (PagePrefs) tryFind.get();
            ImmutableMap.Builder builder2 = ImmutableMap.builder();
            String f = cVar.f();
            if (cVar.i().isPresent()) {
                builder2.mo51put(cVar.f(), cVar.i().get());
            }
            for (Map.Entry<String, String> entry : pagePrefs2.options().entrySet()) {
                if (!entry.getKey().equals(f)) {
                    builder2.mo51put(entry.getKey(), entry.getValue());
                }
            }
            PagePrefs.a builder3 = pagePrefs2.toBuilder();
            builder3.e(cVar.g());
            builder3.d(builder2.build());
            builder.mo53add((ImmutableList.Builder) builder3.b());
        } else if (cVar.i().isPresent()) {
            PagePrefs.a builderWithDefault = PagePrefs.builderWithDefault();
            builderWithDefault.e(cVar.g());
            builderWithDefault.f(cVar.h());
            builderWithDefault.d(ImmutableMap.of(cVar.f(), cVar.i().get()));
            builder.mo53add((ImmutableList.Builder) builderWithDefault.b());
        }
        builder.addAll(Collections2.filter((Iterable) pagePrefs, (Predicate) new b(cVar)));
        m.a e = mVar.e();
        PrefsModel.a builder4 = prefsModel.toBuilder();
        ImmutableList build = builder.build();
        int b = mVar.b();
        ImmutableList sortedCopyOf = ImmutableList.sortedCopyOf(f.a, build);
        if (sortedCopyOf.size() > b) {
            sortedCopyOf = sortedCopyOf.subList(0, b);
        }
        builder4.b(sortedCopyOf);
        e.d(Optional.of(builder4.a()));
        return e0.f(e.a());
    }
}
