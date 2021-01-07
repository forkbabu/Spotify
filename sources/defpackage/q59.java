package defpackage;

import com.spotify.encore.ViewProvider;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import defpackage.d39;

/* renamed from: q59  reason: default package */
public final /* synthetic */ class q59 implements d39.e {
    public final /* synthetic */ c69 a;

    public /* synthetic */ q59(c69 c69) {
        this.a = c69;
    }

    @Override // defpackage.d39.e
    public final void a(ViewProvider viewProvider, d39.b bVar, int i) {
        this.a.getClass();
        ((ia0) viewProvider).setTitle(((MusicItem) bVar).w());
    }
}
