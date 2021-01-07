package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import defpackage.y59;

/* renamed from: g29  reason: default package */
public final /* synthetic */ class g29 implements y59.a {
    public final /* synthetic */ da2 b;

    public /* synthetic */ g29(da2 da2) {
        this.b = da2;
    }

    @Override // defpackage.y59.a
    public final void a(MusicItem musicItem, int i) {
        this.b.accept(s0.K(musicItem, i, musicItem.k(), ""));
    }
}
