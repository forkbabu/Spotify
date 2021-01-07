package com.spotify.music.features.entityselector.pages.podcasts.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import io.reactivex.subjects.PublishSubject;
import kotlin.jvm.internal.h;

public final class e extends RecyclerView.b0 {
    private final ImageView C;
    private final TextView D;
    private final TextView E;
    private final View F;
    private final Picasso G;
    private final PublishSubject<sy4> H;

    /* access modifiers changed from: package-private */
    public static final class a implements View.OnClickListener {
        final /* synthetic */ e a;
        final /* synthetic */ sy4 b;

        a(e eVar, sy4 sy4) {
            this.a = eVar;
            this.b = sy4;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.H.onNext(this.b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(View view, Picasso picasso, PublishSubject<sy4> publishSubject) {
        super(view);
        h.e(view, "itemView");
        h.e(picasso, "picasso");
        h.e(publishSubject, "podcastEpisodeClickSubject");
        this.G = picasso;
        this.H = publishSubject;
        View G2 = q4.G(view, C0707R.id.podcast_image);
        h.d(G2, "requireViewById(itemView, R.id.podcast_image)");
        this.C = (ImageView) G2;
        View G3 = q4.G(view, C0707R.id.podcast_name);
        h.d(G3, "requireViewById(itemView, R.id.podcast_name)");
        this.D = (TextView) G3;
        View G4 = q4.G(view, C0707R.id.episode_title);
        h.d(G4, "requireViewById(itemView, R.id.episode_title)");
        this.E = (TextView) G4;
        View G5 = q4.G(view, C0707R.id.icon_plus);
        h.d(G5, "requireViewById(itemView, R.id.icon_plus)");
        this.F = G5;
    }

    public final void j0(sy4 sy4) {
        h.e(sy4, "podcastEpisode");
        this.D.setText(sy4.e());
        this.E.setText(sy4.b());
        this.G.m(sy4.c()).n(this.C, null);
        this.F.setOnClickListener(new a(this, sy4));
    }
}
