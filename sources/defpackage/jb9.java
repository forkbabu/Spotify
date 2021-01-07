package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import com.spotify.music.features.yourlibrary.musicpages.datasource.y3;
import com.spotify.music.features.yourlibrary.musicpages.datasource.z3;
import com.spotify.music.features.yourlibrary.musicpages.filtertags.loader.FilterTagsResponseItem;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.m;
import defpackage.ya9;

/* renamed from: jb9  reason: default package */
public class jb9 {
    private final m a;

    public jb9(m mVar) {
        this.a = mVar;
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0068: APUT  
      (r0v3 com.spotify.music.features.yourlibrary.musicpages.item.MusicItem[])
      (0 ??[int, short, byte, char])
      (wrap: com.spotify.music.features.yourlibrary.musicpages.item.MusicItem : 0x0064: INVOKE  (r10v2 com.spotify.music.features.yourlibrary.musicpages.item.MusicItem) = 
      (r2v0 com.spotify.music.features.yourlibrary.musicpages.item.m)
      (wrap: com.google.common.collect.ImmutableList : 0x0060: INVOKE  (r10v1 com.google.common.collect.ImmutableList) = (r3v1 com.google.common.collect.ImmutableList$Builder) type: VIRTUAL call: com.google.common.collect.ImmutableList.Builder.build():com.google.common.collect.ImmutableList)
     type: VIRTUAL call: com.spotify.music.features.yourlibrary.musicpages.item.m.g(java.util.List):com.spotify.music.features.yourlibrary.musicpages.item.MusicItem)
     */
    public y3 a(zb9 zb9) {
        if (zb9.c().isEmpty()) {
            return y3.a;
        }
        MusicItem[] musicItemArr = new MusicItem[1];
        m mVar = this.a;
        int i = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        UnmodifiableListIterator<FilterTagsResponseItem> listIterator = zb9.c().listIterator();
        while (listIterator.hasNext()) {
            FilterTagsResponseItem next = listIterator.next();
            boolean booleanValue = zb9.b().getOrDefault(next.query(), Boolean.FALSE).booleanValue();
            ya9.a aVar = new ya9.a();
            aVar.b(next.query());
            aVar.c(next.title());
            aVar.d(booleanValue);
            builder.mo53add((ImmutableList.Builder) aVar.a());
        }
        musicItemArr[0] = mVar.g(builder.build());
        return z3.i(ImmutableList.copyOf(musicItemArr));
    }
}
