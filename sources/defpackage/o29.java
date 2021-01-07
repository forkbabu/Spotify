package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import defpackage.w59;

/* renamed from: o29  reason: default package */
public final /* synthetic */ class o29 implements w59.b {
    public final /* synthetic */ da2 b;
    public final /* synthetic */ zc9 c;

    public /* synthetic */ o29(da2 da2, zc9 zc9) {
        this.b = da2;
        this.c = zc9;
    }

    @Override // defpackage.w59.b
    public final void a(MusicItem musicItem, int i) {
        da2 da2 = this.b;
        zc9 zc9 = this.c;
        da2.accept(s0.m(musicItem));
        zc9.p(musicItem, i);
    }
}
