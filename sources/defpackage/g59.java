package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.encore.ViewProvider;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.yourlibrary.filterchips.FilterChipsView;
import com.spotify.music.yourlibrary.filterchips.l;
import defpackage.d39;

/* renamed from: g59  reason: default package */
public final /* synthetic */ class g59 implements d39.e {
    public final /* synthetic */ c69 a;

    public /* synthetic */ g59(c69 c69) {
        this.a = c69;
    }

    @Override // defpackage.d39.e
    public final void a(ViewProvider viewProvider, d39.b bVar, int i) {
        c69 c69 = this.a;
        MusicItem musicItem = (MusicItem) bVar;
        c69.getClass();
        FilterChipsView filterChipsView = (FilterChipsView) viewProvider.getView();
        int i2 = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        if (musicItem.h() != null) {
            for (fb9 fb9 : musicItem.h()) {
                l.a a2 = l.a();
                a2.b(fb9.a());
                a2.c(Boolean.valueOf(fb9.c()));
                a2.d(fb9.b());
                builder.mo53add((ImmutableList.Builder) a2.a());
            }
        }
        filterChipsView.setFilterChips(builder.build());
        filterChipsView.setFilterStateChangeListener(new b69(c69));
    }
}
