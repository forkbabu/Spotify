package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import defpackage.c69;

/* renamed from: p29  reason: default package */
public final /* synthetic */ class p29 implements c69.b {
    public final /* synthetic */ da2 b;

    public /* synthetic */ p29(da2 da2) {
        this.b = da2;
    }

    @Override // defpackage.c69.b
    public final void a(MusicItem musicItem, int i) {
        this.b.accept(s0.z(musicItem, i));
    }
}
