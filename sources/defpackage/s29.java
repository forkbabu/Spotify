package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import defpackage.u59;

/* renamed from: s29  reason: default package */
public final /* synthetic */ class s29 implements u59.a {
    public final /* synthetic */ da2 b;
    public final /* synthetic */ zc9 c;

    public /* synthetic */ s29(da2 da2, zc9 zc9) {
        this.b = da2;
        this.c = zc9;
    }

    @Override // defpackage.u59.a
    public final void a(MusicItem musicItem, int i) {
        da2 da2 = this.b;
        zc9 zc9 = this.c;
        da2.accept(s0.k(musicItem, i, musicItem.k()));
        zc9.h(musicItem, i);
    }
}
