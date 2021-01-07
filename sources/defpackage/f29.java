package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import defpackage.w59;

/* renamed from: f29  reason: default package */
public final /* synthetic */ class f29 implements w59.a {
    public final /* synthetic */ da2 b;

    public /* synthetic */ f29(da2 da2) {
        this.b = da2;
    }

    @Override // defpackage.w59.a
    public final void a(MusicItem musicItem, int i) {
        this.b.accept(s0.k(musicItem, i, musicItem.k()));
    }
}
