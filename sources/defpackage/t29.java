package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import defpackage.c69;

/* renamed from: t29  reason: default package */
public final /* synthetic */ class t29 implements c69.c {
    public final /* synthetic */ da2 b;

    public /* synthetic */ t29(da2 da2) {
        this.b = da2;
    }

    @Override // defpackage.c69.c
    public final void a(MusicItem musicItem, int i, boolean z) {
        this.b.accept(s0.d(musicItem, z));
    }
}
