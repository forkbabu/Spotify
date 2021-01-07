package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import defpackage.u59;

/* renamed from: k29  reason: default package */
public final /* synthetic */ class k29 implements u59.a {
    public final /* synthetic */ da2 b;

    public /* synthetic */ k29(da2 da2) {
        this.b = da2;
    }

    @Override // defpackage.u59.a
    public final void a(MusicItem musicItem, int i) {
        this.b.accept(s0.k(musicItem, i, musicItem.k()));
    }
}
