package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import com.spotify.music.features.yourlibrary.musicpages.e1;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;
import com.spotify.music.yourlibrary.quickscroll.QuickScrollView;
import com.spotify.music.yourlibrary.quickscroll.x;
import com.spotify.music.yourlibrary.quickscroll.z;

/* renamed from: hg9  reason: default package */
public class hg9 {
    private final e1 a;
    private final jg9 b;
    private MusicPageId c;
    private QuickScrollView d;
    private RecyclerView e;
    private d39<MusicItem.Type, MusicItem> f;
    private z g;
    private int h;
    private LinearLayoutManager i;

    public hg9(e1 e1Var, jg9 jg9) {
        this.a = e1Var;
        this.b = jg9;
    }

    static int c(hg9 hg9) {
        if (hg9.i == null) {
            hg9.i = (LinearLayoutManager) hg9.e.getLayoutManager();
        }
        LinearLayoutManager linearLayoutManager = hg9.i;
        if (linearLayoutManager != null) {
            return linearLayoutManager.Y1();
        }
        return 0;
    }

    public static String g(hg9 hg9, int i2) {
        if (hg9.f.u() > i2) {
            MusicItem X = hg9.f.X(i2, false);
            if (X.r() != null) {
                return X.r();
            }
            if (X.q() != null) {
                return hg9.b.a(X.q());
            }
        }
        return "";
    }

    public hg9 e(MusicPageId musicPageId) {
        this.c = musicPageId;
        return this;
    }

    public void f() {
        this.c.getClass();
        this.d.getClass();
        this.e.getClass();
        this.f.getClass();
        this.g.getClass();
        this.d.a(x.a(new vpd(this.e, new wf9(this), this.g), null));
        this.e.n(new gg9(this));
        boolean z = true;
        if (!(this.c == MusicPageId.SONGS) || !this.a.s()) {
            MusicPageId musicPageId = this.c;
            if (!(musicPageId == MusicPageId.PLAYLISTS || musicPageId == MusicPageId.ARTISTS || musicPageId == MusicPageId.ALBUMS || musicPageId == MusicPageId.FOLDER) || !this.a.t()) {
                z = false;
            }
        }
        if (!z) {
            this.d.setWithHandler(false);
            QuickScrollView quickScrollView = this.d;
            quickScrollView.setInitialIndicatorPadding((int) quickScrollView.getResources().getDimension(C0707R.dimen.quickscroll_default_initial_indicator_padding));
        }
    }

    public hg9 h(QuickScrollView quickScrollView) {
        this.d = quickScrollView;
        return this;
    }

    public hg9 i(RecyclerView recyclerView) {
        this.e = recyclerView;
        return this;
    }

    public hg9 j(d39<MusicItem.Type, MusicItem> d39) {
        this.f = d39;
        return this;
    }

    public hg9 k(z zVar) {
        this.g = zVar;
        return this;
    }
}
