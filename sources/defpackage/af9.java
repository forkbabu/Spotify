package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.yourlibrary.musicpages.datasource.y3;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import io.reactivex.functions.l;

/* renamed from: af9  reason: default package */
public final /* synthetic */ class af9 implements l {
    public final /* synthetic */ int a;

    public /* synthetic */ af9(int i) {
        this.a = i;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        int i = this.a;
        y3 y3Var = (y3) obj;
        int count = y3Var.getCount();
        ImmutableList.Builder builder = new ImmutableList.Builder();
        int i2 = 0;
        for (int i3 = 0; i3 < count && i2 < i; i3++) {
            MusicItem item = y3Var.getItem(i3);
            if (item.o() && !item.y().j()) {
                builder.mo53add((ImmutableList.Builder) y3Var.getItem(i3).A());
                i2++;
            }
        }
        return ge9.e(builder.build());
    }
}
