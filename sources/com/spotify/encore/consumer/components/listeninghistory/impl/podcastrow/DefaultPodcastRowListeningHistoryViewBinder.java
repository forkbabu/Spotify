package com.spotify.encore.consumer.components.listeninghistory.impl.podcastrow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.encore.consumer.components.listeninghistory.api.entityrow.Events;
import com.spotify.encore.consumer.components.listeninghistory.api.podcastrow.PodcastRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.impl.R;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import com.spotify.encore.consumer.elements.contextmenu.ContextMenuButton;
import com.squareup.picasso.Picasso;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultPodcastRowListeningHistoryViewBinder {
    private final ArtworkView artwork;
    private final ContextMenuButton contextMenuButton;
    private final TextView podcastNameTextView;
    private final TextView podcastOwnerTextView;
    private final View view;

    public DefaultPodcastRowListeningHistoryViewBinder(Context context, Picasso picasso) {
        h.e(context, "context");
        h.e(picasso, "picasso");
        View inflate = LayoutInflater.from(context).inflate(R.layout.podcast_row_listeninghistory_layout, (ViewGroup) null);
        h.d(inflate, "inflater.inflate(R.layou…ninghistory_layout, null)");
        this.view = inflate;
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        View G = q4.G(inflate, R.id.txt_podcast_name);
        h.d(G, "requireViewById(view, R.id.txt_podcast_name)");
        TextView textView = (TextView) G;
        this.podcastNameTextView = textView;
        View G2 = q4.G(inflate, R.id.txt_podcast_owner);
        h.d(G2, "requireViewById(view, R.id.txt_podcast_owner)");
        TextView textView2 = (TextView) G2;
        this.podcastOwnerTextView = textView2;
        View G3 = q4.G(inflate, R.id.img_podcast_artwork);
        h.d(G3, "requireViewById(view, R.id.img_podcast_artwork)");
        ArtworkView artworkView = (ArtworkView) G3;
        this.artwork = artworkView;
        View G4 = q4.G(inflate, R.id.btn_context_menu);
        h.d(G4, "requireViewById(view, R.id.btn_context_menu)");
        this.contextMenuButton = (ContextMenuButton) G4;
        bvd c = dvd.c(inflate);
        c.g(textView, textView2);
        c.f(artworkView);
        c.a();
        artworkView.setViewContext(new ArtworkView.ViewContext(picasso));
    }

    public final View getView() {
        return this.view;
    }

    public final void render(PodcastRowListeningHistory.Model model) {
        h.e(model, "model");
        this.podcastNameTextView.setText(model.getPodcastTitle());
        this.podcastOwnerTextView.setText(model.getPodcastOwnerTitle());
        this.artwork.render((Artwork.Model) new Artwork.Model.Show(new Artwork.ImageData(model.getImageUri()), false, 2, null));
    }

    public final void setOnContextMenuClickListener(nmf<? super Events, f> nmf) {
        h.e(nmf, "consumer");
        this.contextMenuButton.onEvent(new DefaultPodcastRowListeningHistoryViewBinder$setOnContextMenuClickListener$1(nmf));
    }

    public final void setOnShowClickListener(nmf<? super Events, f> nmf) {
        h.e(nmf, "consumer");
        this.view.setOnClickListener(new DefaultPodcastRowListeningHistoryViewBinder$setOnShowClickListener$1(nmf));
    }
}
