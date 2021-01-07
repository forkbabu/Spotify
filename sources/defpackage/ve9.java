package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import io.reactivex.functions.l;

/* renamed from: ve9  reason: default package */
public final /* synthetic */ class ve9 implements l {
    public static final /* synthetic */ ve9 a = new ve9();

    private /* synthetic */ ve9() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        ImmutableList immutableList = (ImmutableList) obj;
        int i = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        int size = immutableList.size();
        for (int i2 = 0; i2 < size; i2++) {
            MusicItem.b x = ((MusicItem) immutableList.get(i2)).x();
            x.g(i2);
            builder.mo53add((ImmutableList.Builder) x.b());
        }
        return builder.build();
    }
}
