package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import defpackage.y59;

/* renamed from: m29  reason: default package */
public final /* synthetic */ class m29 implements y59.c {
    public final /* synthetic */ da2 b;

    public /* synthetic */ m29(da2 da2) {
        this.b = da2;
    }

    @Override // defpackage.y59.c
    public final void a(MusicItem musicItem, int i) {
        this.b.accept(s0.m(musicItem));
    }
}
