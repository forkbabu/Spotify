package defpackage;

import com.spotify.encore.ViewProvider;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.view.k1;
import defpackage.d39;

/* renamed from: q49  reason: default package */
public final /* synthetic */ class q49 implements d39.e {
    public final /* synthetic */ c69 a;

    public /* synthetic */ q49(c69 c69) {
        this.a = c69;
    }

    @Override // defpackage.d39.e
    public final void a(ViewProvider viewProvider, d39.b bVar, int i) {
        c69 c69 = this.a;
        MusicItem musicItem = (MusicItem) bVar;
        c69.getClass();
        k1 k1Var = (k1) viewProvider;
        MusicItem.f s = musicItem.s();
        k1Var.setTitle(musicItem.w());
        k1Var.setSubtitle(musicItem.u());
        k1Var.K(s.f());
        k1Var.e1(s.c());
        k1Var.d0(new s49(c69, musicItem, i));
    }
}
