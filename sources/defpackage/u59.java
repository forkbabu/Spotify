package defpackage;

import android.view.View;
import androidx.core.widget.c;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.spotify.encore.ViewProvider;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.util.x;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.view.p0;
import com.spotify.music.freetiercommon.uicomponents.Rows;
import defpackage.d39;

/* renamed from: u59  reason: default package */
public class u59 implements d39.h<MusicItem.Type, MusicItem> {
    private final p0 a;
    private a b;

    /* renamed from: u59$a */
    public interface a {
        public static final /* synthetic */ int a = 0;

        void a(MusicItem musicItem, int i);
    }

    public u59(p0 p0Var) {
        this.a = p0Var;
    }

    public static void b(u59 u59, ViewProvider viewProvider, MusicItem musicItem, int i) {
        u59.getClass();
        Rows.e eVar = (Rows.e) viewProvider;
        c.n(eVar.Z(), R.style.TextAppearance_Encore_BalladBold);
        eVar.setText(musicItem.w());
        eVar.getImageView().setImageDrawable(u59.a.c(musicItem));
        eVar.getView().setOnClickListener(new i39(u59, musicItem, i));
    }

    @Override // defpackage.d39.h
    public ImmutableList<d39.d<MusicItem.Type, MusicItem>> a() {
        return ImmutableList.of(d39.d.a(ImmutableSet.of(MusicItem.Type.CREATE_PLAYLIST_BUTTON, MusicItem.Type.ADD_ARTISTS_BUTTON), new h39(this), new f39(this)));
    }

    public /* synthetic */ void c(MusicItem musicItem, int i, View view) {
        this.b.a(musicItem, i);
    }

    public void d(a aVar) {
        int i = a.a;
        this.b = (a) x.n(aVar, g39.b);
    }
}
