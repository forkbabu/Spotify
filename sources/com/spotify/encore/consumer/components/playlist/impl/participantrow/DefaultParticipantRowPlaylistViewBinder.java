package com.spotify.encore.consumer.components.playlist.impl.participantrow;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.encore.consumer.components.playlist.api.participantrow.ParticipantRowPlaylist;
import com.spotify.encore.consumer.components.playlist.impl.R;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultParticipantRowPlaylistViewBinder {
    private final ArtworkView artWork;
    private final TextView subtitleTextView;
    private final TextView titleTextView;
    private final View view;

    public DefaultParticipantRowPlaylistViewBinder(Activity activity, ArtworkView.ViewContext viewContext) {
        h.e(activity, "activity");
        h.e(viewContext, "artWorkContext");
        View inflate = LayoutInflater.from(activity).inflate(R.layout.participant_row_playlist, (ViewGroup) null);
        h.d(inflate, "it");
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        h.d(inflate, "inflater.inflate(R.layou…, WRAP_CONTENT)\n        }");
        this.view = inflate;
        View G = q4.G(inflate, R.id.title_text_view);
        h.d(G, "ViewCompat.requireViewBy…ew, R.id.title_text_view)");
        TextView textView = (TextView) G;
        this.titleTextView = textView;
        View G2 = q4.G(inflate, R.id.subtitle_text_view);
        h.d(G2, "ViewCompat.requireViewBy… R.id.subtitle_text_view)");
        TextView textView2 = (TextView) G2;
        this.subtitleTextView = textView2;
        View G3 = q4.G(inflate, R.id.art_work);
        h.d(G3, "ViewCompat.requireViewBy…iew>(view, R.id.art_work)");
        ArtworkView artworkView = (ArtworkView) G3;
        artworkView.setViewContext(viewContext);
        this.artWork = artworkView;
        bvd c = dvd.c(inflate);
        c.g(textView, textView2);
        c.f(artworkView);
        c.a();
    }

    public final View getView() {
        return this.view;
    }

    public final void render(ParticipantRowPlaylist.Model model) {
        h.e(model, "model");
        this.titleTextView.setText(model.getName());
        this.subtitleTextView.setText(model.getAddedItems());
        this.artWork.render((Artwork.Model) new Artwork.Model.User(new Artwork.ImageData(model.getImageUri()), model.getInitials().getInitials(), model.getInitials().getColor(), false, 8, null));
    }

    public final void setOnParticipantClickListener(nmf<? super ParticipantRowPlaylist.Event, f> nmf) {
        h.e(nmf, "consumer");
        this.view.setOnClickListener(new DefaultParticipantRowPlaylistViewBinder$setOnParticipantClickListener$1(nmf));
    }
}
