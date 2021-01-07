package com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.contextmenu.f;
import com.squareup.picasso.Picasso;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

public final class TrackListAdapter extends v<e, TrackListViewHolder> {
    private final Picasso n;
    private final Drawable o;
    private final Drawable p;
    private final float q;
    private final f r;
    private final b s;
    private final h1c t;
    private final f1c u;

    public enum ItemViewType {
        FIRST,
        MIDDLE,
        LAST
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TrackListAdapter(Picasso picasso, Drawable drawable, Drawable drawable2, float f, f fVar, b bVar, h1c h1c, f1c f1c) {
        super(d.a);
        h.e(picasso, "picasso");
        h.e(drawable, "musicImagePlaceholder");
        h.e(drawable2, "spokenImagePlaceholder");
        h.e(h1c, "likeButtonPresenterFactory");
        h.e(f1c, "trackListLogger");
        this.n = picasso;
        this.o = drawable;
        this.p = drawable2;
        this.q = f;
        this.r = fVar;
        this.s = bVar;
        this.t = h1c;
        this.u = f1c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(RecyclerView.b0 b0Var, int i) {
        TrackListViewHolder trackListViewHolder = (TrackListViewHolder) b0Var;
        h.e(trackListViewHolder, "holder");
        e eVar = (e) Y(i);
        trackListViewHolder.m0(eVar.a(), eVar.b(), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        int i2;
        h.e(viewGroup, "parent");
        int ordinal = ItemViewType.values()[i].ordinal();
        if (ordinal == 0) {
            i2 = C0707R.layout.mixed_media_episode_mode_tracklist_item_first_layout;
        } else if (ordinal == 1) {
            i2 = C0707R.layout.mixed_media_episode_mode_tracklist_item_layout;
        } else if (ordinal == 2) {
            i2 = C0707R.layout.mixed_media_episode_mode_tracklist_item_last_layout;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        View G = je.G(viewGroup, i2, viewGroup, false);
        h.d(G, "this");
        Picasso picasso = this.n;
        Drawable drawable = this.o;
        Drawable drawable2 = this.p;
        float f = this.q;
        f fVar = this.r;
        b bVar = this.s;
        g1c b = this.t.b(C0707R.dimen.mme_track_item_icon_inner_size, Integer.valueOf((int) C0707R.dimen.mme_track_item_icon_padding), false, G.findViewById(C0707R.id.npv_tracklist_item_like));
        h.d(b, "likeButtonPresenterFacto…m_like)\n                )");
        return new TrackListViewHolder(G, picasso, drawable, drawable2, f, fVar, bVar, b, this.u);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        if (i == 0) {
            return 0;
        }
        return i < u() - 1 ? 1 : 2;
    }
}
