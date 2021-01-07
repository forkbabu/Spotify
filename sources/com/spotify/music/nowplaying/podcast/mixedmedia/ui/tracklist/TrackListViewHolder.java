package com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.d;
import com.airbnb.lottie.e;
import com.airbnb.lottie.l;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.nowplaying.podcast.mixedmedia.model.TrackListItemType;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.contextmenu.f;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.SquareImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import kotlin.jvm.internal.h;

public final class TrackListViewHolder extends RecyclerView.b0 {
    private final Context C;
    private final SquareImageView D = ((SquareImageView) this.a.findViewById(C0707R.id.npv_tracklist_item_image));
    private final TextView E = ((TextView) this.a.findViewById(C0707R.id.npv_tracklist_item_title));
    private final TextView F = ((TextView) this.a.findViewById(C0707R.id.npv_tracklist_item_subtitle));
    private final int G;
    private final int H;
    private final Drawable I;
    private final SquareImageView J;
    private final LottieAnimationView K;
    private final d L;
    private final View M;
    private final Picasso N;
    private final Drawable O;
    private final Drawable P;
    private final float Q;
    private final f R;
    private final b S;
    private final g1c T;
    private final f1c U;

    /* compiled from: java-style lambda group */
    static final class a implements View.OnClickListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ Object f;

        public a(int i, int i2, Object obj, Object obj2) {
            this.a = i;
            this.b = i2;
            this.c = obj;
            this.f = obj2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = this.a;
            if (i == 0) {
                c cVar = ViewUris.h0;
                f fVar = ((TrackListViewHolder) this.c).R;
                if (fVar != null) {
                    String h = ((c) this.f).h();
                    String g = ((c) this.f).g();
                    String cVar2 = cVar.toString();
                    h.d(cVar2, "viewUri.toString()");
                    h.d(cVar, "viewUri");
                    fVar.a(h, g, cVar2, cVar, this.b);
                }
            } else if (i == 1) {
                ((TrackListViewHolder) this.c).S.b(this.b, (c) this.f);
            } else {
                throw null;
            }
        }
    }

    public static final class b implements z0c {
        final /* synthetic */ TrackListViewHolder a;
        final /* synthetic */ int b;
        final /* synthetic */ c c;

        b(TrackListViewHolder trackListViewHolder, a aVar, int i, c cVar) {
            this.a = trackListViewHolder;
            this.b = i;
            this.c = cVar;
        }

        @Override // defpackage.z0c
        public void a() {
            this.a.U.d(this.b, this.c.h());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TrackListViewHolder(View view, Picasso picasso, Drawable drawable, Drawable drawable2, float f, f fVar, b bVar, g1c g1c, f1c f1c) {
        super(view);
        h.e(view, "rootView");
        h.e(picasso, "picasso");
        h.e(drawable, "musicImagePlaceholder");
        h.e(drawable2, "spokenImagePlaceholder");
        h.e(g1c, "likeButtonPresenter");
        h.e(f1c, "trackListLogger");
        this.M = view;
        this.N = picasso;
        this.O = drawable;
        this.P = drawable2;
        this.Q = f;
        this.R = fVar;
        this.S = bVar;
        this.T = g1c;
        this.U = f1c;
        Context context = view.getContext();
        this.C = context;
        h.d(context, "context");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0707R.dimen.mixed_media_episode_talk_icon_height);
        this.G = dimensionPixelSize;
        h.d(context, "context");
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C0707R.dimen.mixed_media_episode_talk_icon_width);
        this.H = dimensionPixelSize2;
        Drawable d = androidx.core.content.a.d(context, C0707R.drawable.current_track_talk_icon);
        if (d != null) {
            d.setBounds(0, 0, dimensionPixelSize2, dimensionPixelSize);
        } else {
            d = null;
        }
        this.I = d;
        SquareImageView squareImageView = (SquareImageView) this.a.findViewById(C0707R.id.npv_tracklist_item_context_menu);
        this.J = squareImageView;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.a.findViewById(C0707R.id.npv_tracklist_item_playing_animation);
        this.K = lottieAnimationView;
        View view2 = this.a;
        h.d(view2, "itemView");
        l<d> j = e.j(view2.getContext(), C0707R.raw.playback_indicator);
        h.d(j, "LottieCompositionFactory….playback_indicator\n    )");
        d b2 = j.b();
        h.c(b2);
        h.d(b2, "LottieCompositionFactory…k_indicator\n    ).value!!");
        d dVar = b2;
        this.L = dVar;
        lottieAnimationView.setComposition(dVar);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.setRepeatMode(2);
        h.d(context, "context");
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.MORE_ANDROID, (float) context.getResources().getDimensionPixelSize(C0707R.dimen.mme_track_item_icon_inner_size));
        spotifyIconDrawable.s(androidx.core.content.a.c(context, R.color.white_70));
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) spotifyIconDrawable, context.getResources().getDimensionPixelSize(C0707R.dimen.mme_track_item_icon_padding));
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        squareImageView.setBackground(insetDrawable);
    }

    public void m0(a aVar, c cVar, int i) {
        h.e(aVar, "enhancedModel");
        h.e(cVar, "itemViewModel");
        TextView textView = this.E;
        h.d(textView, "titleView");
        textView.setText(cVar.g());
        TextView textView2 = this.F;
        h.d(textView2, "subtitleView");
        textView2.setText(cVar.f());
        int i2 = 0;
        this.J.setOnClickListener(new a(0, i, this, cVar));
        if (cVar.d() == TrackListItemType.MUSIC) {
            SquareImageView squareImageView = this.J;
            h.d(squareImageView, "contextMenuView");
            squareImageView.setVisibility(0);
            z m = this.N.m(cVar.c());
            m.t(this.O);
            m.g(this.O);
            m.n(this.D, null);
            this.F.setCompoundDrawables(null, null, null, null);
        } else {
            SquareImageView squareImageView2 = this.J;
            h.d(squareImageView2, "contextMenuView");
            squareImageView2.setVisibility(4);
            z m2 = this.N.m(cVar.c());
            m2.t(this.P);
            m2.g(this.P);
            m2.o(rwd.f(this.D, com.spotify.paste.graphics.drawable.d.a(this.Q)));
            TextView textView3 = this.F;
            h.d(textView3, "subtitleView");
            Context context = this.C;
            h.d(context, "context");
            textView3.setCompoundDrawablePadding(context.getResources().getDimensionPixelSize(C0707R.dimen.mme_subtitle_icon_padding));
            this.F.setCompoundDrawables(this.I, null, null, null);
        }
        View view = this.a;
        h.d(view, "itemView");
        view.setSelected(cVar.k());
        LottieAnimationView lottieAnimationView = this.K;
        if (!cVar.k()) {
            i2 = 8;
        }
        lottieAnimationView.setVisibility(i2);
        if (cVar.j()) {
            lottieAnimationView.post(new l(new TrackListViewHolder$bind$2$1(lottieAnimationView)));
        } else {
            lottieAnimationView.post(new l(new TrackListViewHolder$bind$2$2(lottieAnimationView)));
        }
        if (this.S != null) {
            this.M.setOnClickListener(new a(1, i, this, cVar));
        } else {
            this.M.setOnClickListener(null);
        }
        this.T.c(aVar, cVar.d(), cVar.h(), cVar.b().toString(), new b(this, aVar, i, cVar));
    }
}
