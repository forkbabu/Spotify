package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import defpackage.c69;

/* renamed from: q29  reason: default package */
public final /* synthetic */ class q29 implements c69.h {
    public final /* synthetic */ da2 b;

    public /* synthetic */ q29(da2 da2) {
        this.b = da2;
    }

    @Override // defpackage.c69.h
    public final void a(MusicItem musicItem, int i) {
        this.b.accept(s0.y(musicItem));
    }
}
