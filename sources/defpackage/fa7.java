package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encore.consumer.elements.contextmenu.ContextMenuButton;
import com.spotify.music.C0707R;
import com.spotify.music.features.podcast.episode.inspector.tracklist.model.TrackListItemType;
import com.spotify.paste.graphics.drawable.d;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;

/* renamed from: fa7  reason: default package */
public class fa7 extends RecyclerView.b0 {
    private final TextView C;
    private final TextView D;
    private final View E;
    private final View F;
    private final ImageView G;
    private final ContextMenuButton H;
    private final View I;
    private final Drawable J;
    private final Drawable K;
    private final Picasso L;
    private final y97 M;

    public fa7(View view, Picasso picasso, Drawable drawable, Drawable drawable2, y97 y97) {
        super(view);
        this.L = picasso;
        this.C = (TextView) view.findViewById(C0707R.id.tracklist_item_title);
        this.D = (TextView) view.findViewById(C0707R.id.tracklist_item_artists);
        this.G = (ImageView) view.findViewById(C0707R.id.tracklist_item_image);
        this.H = (ContextMenuButton) view.findViewById(C0707R.id.segment_context_menu);
        this.I = view.findViewById(C0707R.id.tracklist_item_preview_label);
        this.E = view.findViewById(C0707R.id.path_up);
        this.F = view.findViewById(C0707R.id.path_down);
        this.J = drawable;
        this.K = drawable2;
        this.M = y97;
    }

    public void h0(int i, j87 j87) {
        if (j87.c()) {
            this.H.setOnClickListener(new v97(this, i, j87));
            this.H.setVisibility(0);
        } else {
            this.H.setVisibility(8);
        }
        this.a.setOnClickListener(new w97(this, i, j87));
        this.a.setSelected(j87.h());
        this.C.setText(j87.k());
        this.D.setText(j87.j());
        if (j87.f()) {
            this.E.setVisibility(8);
        } else {
            this.E.setVisibility(0);
        }
        if (j87.g()) {
            this.F.setVisibility(8);
        } else {
            this.F.setVisibility(0);
        }
        if (this.L != null) {
            if (j87.l() == TrackListItemType.SPOKEN) {
                z m = this.L.m(j87.e());
                m.t(this.K);
                m.g(this.K);
                m.o(rwd.f(this.G, d.a(((float) this.G.getContext().getResources().getDimensionPixelSize(C0707R.dimen.track_list_item_icon_size)) / 2.0f)));
            } else {
                z m2 = this.L.m(j87.e());
                m2.t(this.J);
                m2.g(this.J);
                m2.m(this.G);
            }
        }
        if (j87.d()) {
            this.I.setVisibility(0);
        } else {
            this.I.setVisibility(8);
        }
    }

    public /* synthetic */ void j0(int i, j87 j87, View view) {
        y97 y97 = this.M;
        if (y97 != null) {
            y97.a(i, j87);
        }
    }

    public /* synthetic */ void l0(int i, j87 j87, View view) {
        y97 y97 = this.M;
        if (y97 != null) {
            y97.b(i, j87);
        }
    }
}
