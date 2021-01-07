package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.UnmodifiableListIterator;
import com.spotify.music.features.yourlibrary.musicpages.filterandsort.MusicPagesFiltering;
import com.spotify.music.features.yourlibrary.musicpages.filtertags.loader.FilterTagsResponseItem;
import defpackage.wb9;
import io.reactivex.functions.g;

/* renamed from: lc9  reason: default package */
public final /* synthetic */ class lc9 implements g {
    public final /* synthetic */ MusicPagesFiltering a;
    public final /* synthetic */ String b;

    public /* synthetic */ lc9(MusicPagesFiltering musicPagesFiltering, String str) {
        this.a = musicPagesFiltering;
        this.b = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        MusicPagesFiltering musicPagesFiltering = this.a;
        String str = this.b;
        wb9.c cVar = (wb9.c) obj;
        ImmutableList<FilterTagsResponseItem> a2 = cVar.a();
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        UnmodifiableListIterator<FilterTagsResponseItem> listIterator = a2.listIterator();
        while (listIterator.hasNext()) {
            builder.mo53add((ImmutableSet.Builder) listIterator.next().query());
        }
        ImmutableSet build = builder.build();
        UnmodifiableIterator<String> it = cVar.b().keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!build.contains(next)) {
                musicPagesFiltering.i(str, next, Boolean.FALSE);
            }
        }
    }
}
