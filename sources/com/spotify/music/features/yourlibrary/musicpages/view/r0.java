package com.spotify.music.features.yourlibrary.musicpages.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.freetiercommon.uicomponents.Rows;
import com.spotify.music.libs.viewuri.c;

public class r0 implements g<MusicPagesModel, s0> {
    public static final /* synthetic */ int q = 0;
    private final Context a;
    private final c b;
    private final x0 c;
    private final zc9 f;
    private b n;
    private b o;
    private b p;

    class a implements h<MusicPagesModel> {
        a() {
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            MusicPagesModel musicPagesModel = (MusicPagesModel) obj;
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            r0 r0Var = r0.this;
            int i = r0.q;
            j jVar = j.a;
            r0.a(r0Var, jVar);
            r0.b(r0.this, jVar);
        }
    }

    /* access modifiers changed from: private */
    public interface b {
        void a(MusicItem musicItem, int i);
    }

    public r0(Context context, c cVar, x0 x0Var, zc9 zc9) {
        j jVar = j.a;
        this.n = jVar;
        this.o = jVar;
        this.p = jVar;
        this.a = context;
        this.b = cVar;
        this.c = x0Var;
        this.f = zc9;
    }

    static void a(r0 r0Var, b bVar) {
        r0Var.getClass();
        r0Var.o = (b) MoreObjects.firstNonNull(bVar, j.a);
    }

    static void b(r0 r0Var, b bVar) {
        r0Var.n = bVar;
    }

    private View e(SpotifyIconV2 spotifyIconV2, int i, int i2, View.OnClickListener onClickListener) {
        Drawable drawable;
        if (i != 0) {
            Context context = this.a;
            drawable = z42.f(context, spotifyIconV2, nud.i(context, i));
        } else {
            drawable = z42.e(this.a, spotifyIconV2);
        }
        ImageButton h = z42.h(this.a, drawable);
        h.setContentDescription(h.getResources().getString(i2));
        h.setOnClickListener(onClickListener);
        return h;
    }

    public void c(p90 p90, MusicItem musicItem, int i) {
        int i2 = 0;
        if (musicItem.type() == MusicItem.Type.ARTIST_TWO_LINES || musicItem.type() == MusicItem.Type.ARTIST) {
            Context context = this.a;
            Button d = com.spotify.android.paste.app.c.d(context);
            d.setBackground(context.getResources().getDrawable(C0707R.drawable.square_accessory_button));
            d.setGravity(17);
            d.setMinHeight(nud.q(28.0f, context.getResources()));
            d.setTextColor(androidx.core.content.a.b(context, C0707R.color.glue_button_text));
            androidx.core.widget.c.n(d, R.style.TextAppearance_Encore_MinuetBold);
            d.setText(this.a.getString(C0707R.string.your_library_music_pages_button_label_follow));
            d.setContentDescription(this.a.getString(C0707R.string.your_library_music_pages_content_description_artist_follow, musicItem.w()));
            d.setOnClickListener(new i(this, musicItem, i));
            d.setEnabled(!musicItem.m());
            p90.z0(d);
        } else if (musicItem.type() == MusicItem.Type.ALBUM) {
            boolean i3 = musicItem.i();
            SpotifyIconV2 spotifyIconV2 = i3 ? SpotifyIconV2.HEART_ACTIVE : SpotifyIconV2.HEART;
            if (i3) {
                i2 = C0707R.attr.pasteColorAccessoryGreen;
            }
            p90.z0(e(spotifyIconV2, i2, i3 ? C0707R.string.your_library_music_pages_content_description_album_unlike : C0707R.string.your_library_music_pages_content_description_album_like, new h(this, musicItem, i)));
        }
    }

    public void d(Rows.d dVar, MusicItem musicItem, int i) {
        int i2 = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        MusicItem.g y = musicItem.y();
        int i3 = 0;
        if (y.c() && !y.a()) {
            boolean h = y.h();
            builder.mo53add((ImmutableList.Builder) e(h ? SpotifyIconV2.HEART_ACTIVE : SpotifyIconV2.HEART, h ? C0707R.attr.pasteColorAccessoryGreen : 0, h ? C0707R.string.your_library_music_pages_content_description_track_remove : C0707R.string.your_library_music_pages_content_description_track_add, new g(this, musicItem, i)));
        }
        if (y.b() || y.a()) {
            boolean a2 = y.a();
            SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.BLOCK;
            if (a2) {
                i3 = C0707R.attr.pasteColorAccessoryRed;
            }
            builder.mo53add((ImmutableList.Builder) e(spotifyIconV2, i3, a2 ? C0707R.string.your_library_music_pages_content_description_track_unban : C0707R.string.your_library_music_pages_content_description_track_ban, new f(this, musicItem, i)));
        }
        Context context = this.a;
        builder.mo53add((ImmutableList.Builder) p42.b(context, z42.e(context, SpotifyIconV2.MORE_ANDROID), this.c, musicItem, this.b));
        dVar.z(builder.build());
    }

    public /* synthetic */ void f(MusicItem musicItem, int i, View view) {
        this.n.a(musicItem, i);
    }

    public /* synthetic */ void g(MusicItem musicItem, int i, View view) {
        this.o.a(musicItem, i);
    }

    public /* synthetic */ void h(MusicItem musicItem, int i, View view) {
        this.p.a(musicItem, i);
    }

    public /* synthetic */ void i(MusicItem musicItem, int i, View view) {
        this.n.a(musicItem, i);
    }

    public /* synthetic */ void j(da2 da2, MusicItem musicItem, int i) {
        da2.accept(s0.l(musicItem, i, musicItem.k()));
        this.f.a(musicItem, i);
    }

    public /* synthetic */ void k(da2 da2, MusicItem musicItem, int i) {
        da2.accept(s0.j(musicItem, i, musicItem.k()));
        if (musicItem.t()) {
            this.f.a(musicItem, i);
        }
    }

    @Override // com.spotify.mobius.g
    public h<MusicPagesModel> t(da2<s0> da2) {
        this.o = (b) MoreObjects.firstNonNull(new k(da2), j.a);
        this.n = new l(this, da2);
        this.p = new e(this, da2);
        return new a();
    }
}
