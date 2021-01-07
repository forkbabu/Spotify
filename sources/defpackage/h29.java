package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import defpackage.y59;

/* renamed from: h29  reason: default package */
public final /* synthetic */ class h29 implements y59.b {
    public final /* synthetic */ da2 b;

    public /* synthetic */ h29(da2 da2) {
        this.b = da2;
    }

    @Override // defpackage.y59.b
    public final void a(MusicItem musicItem, int i) {
        this.b.accept(s0.M(musicItem, i, musicItem.k()));
    }
}
