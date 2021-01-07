package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import io.reactivex.functions.l;
import java.util.Map;

/* renamed from: se9  reason: default package */
public final /* synthetic */ class se9 implements l {
    public final /* synthetic */ ImmutableList a;

    public /* synthetic */ se9(ImmutableList immutableList) {
        this.a = immutableList;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        CollectionStateProvider.a aVar;
        ImmutableList immutableList = this.a;
        Map map = (Map) obj;
        int i = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        UnmodifiableListIterator listIterator = immutableList.listIterator();
        while (listIterator.hasNext()) {
            MusicItem musicItem = (MusicItem) listIterator.next();
            if (musicItem.o() && (aVar = (CollectionStateProvider.a) map.get(musicItem.A())) != null) {
                MusicItem.b x = musicItem.x();
                MusicItem.g.a n = musicItem.y().n();
                n.g(aVar.b());
                n.a(aVar.a());
                x.c(n.b());
                builder.mo53add((ImmutableList.Builder) x.b());
            }
        }
        return builder.build();
    }
}
