package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.core.widget.c;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.spotify.encore.ViewProvider;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import com.spotify.music.features.yourlibrary.musicpages.domain.u0;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.view.p0;
import com.spotify.music.features.yourlibrary.musicpages.view.r0;
import com.spotify.music.freetiercommon.uicomponents.Rows;
import com.spotify.playlist.models.offline.a;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import defpackage.d39;

/* renamed from: w59  reason: default package */
public class w59 implements d39.h<MusicItem.Type, MusicItem>, c39 {
    private final Context a;
    private final Picasso b;
    private final p0 c;
    private final r0 f;
    private final ag9 n;
    private a o;
    private b p;
    private String q;
    private cfc r;

    /* renamed from: w59$a */
    public interface a {
        public static final /* synthetic */ int a = 0;

        void a(MusicItem musicItem, int i);
    }

    /* renamed from: w59$b */
    public interface b {
        public static final /* synthetic */ int a = 0;

        void a(MusicItem musicItem, int i);
    }

    public w59(Context context, Picasso picasso, p0 p0Var, r0 r0Var, ag9 ag9) {
        this.a = context;
        this.b = picasso;
        this.c = p0Var;
        this.f = r0Var;
        this.n = ag9;
    }

    private void b(p90 p90, MusicItem musicItem, int i) {
        MusicItem.Type z = musicItem.type();
        if ((z == MusicItem.Type.ARTIST || z == MusicItem.Type.ARTIST_TWO_LINES || z == MusicItem.Type.ALBUM) && musicItem.t()) {
            this.f.c(p90, musicItem, i);
            return;
        }
        this.f.getClass();
        p90.z0(null);
    }

    public static void f(w59 w59, ViewProvider viewProvider, MusicItem musicItem, int i) {
        w59.getClass();
        Rows.e eVar = (Rows.e) viewProvider;
        c.n(eVar.Z(), R.style.TextAppearance_Encore_BalladBold);
        eVar.setText(musicItem.w());
        w59.j(eVar.getImageView(), musicItem);
        View view = eVar.getView();
        view.setOnClickListener(new l39(w59, musicItem, i));
        w59.b(eVar, musicItem, i);
        view.setOnLongClickListener(new j39(w59, musicItem, i));
        eVar.setAppearsDisabled(!musicItem.l());
        eVar.getImageView().setImageAlpha(musicItem.l() ? BitmapRenderer.ALPHA_VISIBLE : 128);
        w59.k(eVar, musicItem);
    }

    public static void i(w59 w59, ViewProvider viewProvider, MusicItem musicItem, int i) {
        w59.getClass();
        Rows.f fVar = (Rows.f) viewProvider;
        fVar.setTitle(musicItem.w());
        c.n(fVar.getTitleView(), R.style.TextAppearance_Encore_BalladBold);
        fVar.setSubtitle(musicItem.u());
        w59.j(fVar.getImageView(), musicItem);
        com.spotify.playlist.models.offline.a aVar = (com.spotify.playlist.models.offline.a) x.n(musicItem.p(), a.f.a);
        x.m(w59.a, fVar.getSubtitleView(), aVar);
        aVar.getClass();
        if (aVar instanceof a.b) {
            fVar.e(w59.a.getString(C0707R.string.header_downloading_progress, Integer.valueOf(((a.b) aVar).c())));
        } else if (aVar instanceof a.h) {
            fVar.e(w59.a.getString(C0707R.string.header_download_waiting));
        }
        View view = fVar.getView();
        view.setOnClickListener(new n39(w59, musicItem, i));
        view.setOnLongClickListener(new j39(w59, musicItem, i));
        w59.b(fVar, musicItem, i);
        fVar.setAppearsDisabled(!musicItem.l());
        w59.k(fVar, musicItem);
        String b2 = w59.n.b(musicItem);
        if (b2 != null) {
            view.setContentDescription(b2);
        }
    }

    private void j(ImageView imageView, MusicItem musicItem) {
        Drawable c2 = this.c.c(musicItem);
        z m = this.b.m(musicItem.j().isEmpty() ? null : musicItem.j());
        m.g(c2);
        m.t(c2);
        if (musicItem.type() == MusicItem.Type.ARTIST || musicItem.type() == MusicItem.Type.ARTIST_TWO_LINES) {
            m.o(rwd.c(imageView));
        } else {
            m.o(rwd.g(imageView, new s39(this), null));
        }
    }

    private void k(p90 p90, MusicItem musicItem) {
        boolean z;
        if (MoreObjects.isNullOrEmpty(this.q)) {
            z = false;
        } else if (musicItem.type() == MusicItem.Type.PLAYLIST) {
            z = new cfc(musicItem.A()).equals(this.r);
        } else if (musicItem.type() != MusicItem.Type.LIKED_SONGS || !l0.b(this.q, LinkType.COLLECTION_TRACKS)) {
            z = musicItem.A().equals(this.q);
        } else {
            z = true;
        }
        p90.setActive(z);
        p90.getView().setSelected(z);
    }

    @Override // defpackage.d39.h
    public ImmutableList<d39.d<MusicItem.Type, MusicItem>> a() {
        return ImmutableList.of(d39.d.a(ImmutableSet.of(MusicItem.Type.ARTIST), new m39(this), new q39(this)), d39.d.a(ImmutableSet.of(MusicItem.Type.ALBUM, MusicItem.Type.ARTIST_TWO_LINES, MusicItem.Type.PLAYLIST, MusicItem.Type.FOLDER, MusicItem.Type.LIKED_SONGS_EMPTY, MusicItem.Type.LIKED_SONGS, MusicItem.Type.BANNED_ARTISTS, MusicItem.Type.BANNED_TRACKS, MusicItem.Type.YOUR_EPISODES), new k39(this), new u39(this)));
    }

    public /* synthetic */ void c(MusicItem musicItem, int i, View view) {
        this.o.a(musicItem, i);
    }

    @Override // defpackage.c39
    public void d(u0 u0Var, String str) {
        String str2 = (String) u0Var.a(e39.a, n49.a, t39.a, r39.a);
        this.q = str2;
        this.r = new cfc(str2);
    }

    public /* synthetic */ void e(MusicItem musicItem, int i, View view) {
        this.o.a(musicItem, i);
    }

    public /* synthetic */ boolean g(MusicItem musicItem, int i, View view) {
        b bVar = this.p;
        if (bVar == null) {
            return false;
        }
        bVar.a(musicItem, i);
        return true;
    }

    public /* synthetic */ Drawable h(Bitmap bitmap) {
        return new BitmapDrawable(this.a.getResources(), bitmap);
    }

    public void l(a aVar) {
        int i = a.a;
        this.o = (a) x.n(aVar, o39.b);
    }

    public void m(b bVar) {
        int i = b.a;
        this.p = (b) x.n(bVar, p39.b);
    }
}
