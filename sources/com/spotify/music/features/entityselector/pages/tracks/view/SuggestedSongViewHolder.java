package com.spotify.music.features.entityselector.pages.tracks.view;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.C0707R;
import com.spotify.music.features.entityselector.common.EntitySelectorTrackRow;
import com.spotify.music.features.entityselector.common.a;
import com.spotify.music.preview.q;
import com.spotify.music.preview.t;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import io.reactivex.subjects.c;
import kotlin.jvm.internal.h;

public final class SuggestedSongViewHolder extends RecyclerView.b0 {
    private final EntitySelectorTrackRow C;
    private final Picasso D;
    private final q E;
    private final c<com.spotify.music.features.entityselector.common.a> F;

    static final class a implements View.OnClickListener {
        final /* synthetic */ SuggestedSongViewHolder a;
        final /* synthetic */ uy4 b;

        a(SuggestedSongViewHolder suggestedSongViewHolder, uy4 uy4) {
            this.a = suggestedSongViewHolder;
            this.b = uy4;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.F.onNext(new a.C0229a(this.b));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuggestedSongViewHolder(View view, Picasso picasso, q qVar, c<com.spotify.music.features.entityselector.common.a> cVar) {
        super(view);
        h.e(view, "itemView");
        h.e(picasso, "picasso");
        h.e(qVar, "previewOverlay");
        h.e(cVar, "userInteractionSubject");
        this.D = picasso;
        this.E = qVar;
        this.F = cVar;
        View G = q4.G(view, C0707R.id.entity_selector_track_row);
        h.d(G, "requireViewById(itemView…ntity_selector_track_row)");
        this.C = (EntitySelectorTrackRow) G;
    }

    public final void j0(uy4 uy4) {
        h.e(uy4, AppProtocol.TrackData.TYPE_TRACK);
        this.C.setTrackData(uy4);
        this.C.getAddIcon().setOnClickListener(new a(this, uy4));
        this.C.D(new SuggestedSongViewHolder$bind$2(this, uy4), new SuggestedSongViewHolder$bind$3(this, uy4));
        z m = this.D.m(uy4.getImageUri());
        m.t(this.C.getTrackPlaceholder());
        m.o(t.a(this.C.getImage(), this.E, uy4.getPreviewId()));
    }
}
