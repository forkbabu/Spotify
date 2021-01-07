package com.spotify.music.features.followfeed.views;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import com.spotify.music.features.followfeed.views.FollowRecsView;
import com.spotify.paste.spotifyicon.SpotifyIconView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import kotlin.jvm.internal.h;

public final class j extends RecyclerView.b0 {
    private final ImageView C;
    private final TextView D;
    private final Button E;
    private final SpotifyIconView F;

    /* access modifiers changed from: package-private */
    public static final class a implements View.OnClickListener {
        final /* synthetic */ Button a;
        final /* synthetic */ j b;
        final /* synthetic */ FollowRecsView.c c;
        final /* synthetic */ j45 f;

        a(Button button, j jVar, FollowRecsView.c cVar, j45 j45) {
            this.a = button;
            this.b = jVar;
            this.c = cVar;
            this.f = j45;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Button button = this.b.E;
            View view2 = this.b.a;
            h.d(view2, "itemView");
            button.setText(view2.getResources().getString(C0707R.string.follow_recs_button_following));
            this.c.c(this.f.c());
            this.a.setOnClickListener(null);
            this.a.setClickable(false);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {
        final /* synthetic */ FollowRecsView.c a;
        final /* synthetic */ j45 b;

        b(FollowRecsView.c cVar, j45 j45) {
            this.a = cVar;
            this.b = j45;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.a(this.b.c());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements View.OnClickListener {
        final /* synthetic */ FollowRecsView.c a;
        final /* synthetic */ j45 b;
        final /* synthetic */ int c;

        c(FollowRecsView.c cVar, j45 j45, int i) {
            this.a = cVar;
            this.b = j45;
            this.c = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.b(this.b.c(), this.c);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(View view) {
        super(view);
        h.e(view, "itemView");
        View G = q4.G(view, C0707R.id.artist_avatar);
        h.d(G, "requireViewById(itemView, R.id.artist_avatar)");
        this.C = (ImageView) G;
        View G2 = q4.G(view, C0707R.id.artist_name);
        h.d(G2, "requireViewById(itemView, R.id.artist_name)");
        this.D = (TextView) G2;
        View G3 = q4.G(view, C0707R.id.follow_button);
        h.d(G3, "requireViewById(itemView, R.id.follow_button)");
        this.E = (Button) G3;
        View G4 = q4.G(view, C0707R.id.dismiss_icon);
        h.d(G4, "requireViewById(itemView, R.id.dismiss_icon)");
        this.F = (SpotifyIconView) G4;
    }

    public final void j0(j45 j45, int i, Picasso picasso, FollowRecsView.c cVar) {
        h.e(j45, "model");
        h.e(picasso, "picasso");
        h.e(cVar, "clickListener");
        z m = picasso.m(j45.b().length() == 0 ? "image/noUrl" : j45.b());
        m.f(C0707R.drawable.cat_placeholder_artist);
        m.s(C0707R.drawable.cat_placeholder_artist);
        m.o(rwd.c(this.C));
        this.F.setOnClickListener(new b(cVar, j45));
        this.D.setText(j45.a());
        this.C.setOnClickListener(new c(cVar, j45, i));
        Button button = this.E;
        button.setClickable(true);
        button.setOnClickListener(new a(button, this, cVar, j45));
    }
}
