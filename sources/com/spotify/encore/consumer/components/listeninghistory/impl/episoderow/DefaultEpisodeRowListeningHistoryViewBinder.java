package com.spotify.encore.consumer.components.listeninghistory.impl.episoderow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.consumer.components.listeninghistory.api.episoderow.EpisodeRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.impl.R;
import com.spotify.encore.consumer.elements.contextmenu.ContextMenu;
import com.spotify.encore.consumer.elements.contextmenu.ContextMenuButton;
import com.spotify.encore.consumer.elements.contextmenu.ContextMenuType;
import com.spotify.encore.consumer.elements.coverart.CoverArt;
import com.spotify.encore.consumer.elements.coverart.CoverArtView;
import com.squareup.picasso.Picasso;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultEpisodeRowListeningHistoryViewBinder {
    private final ContextMenuButton contextMenuButton;
    private final CoverArtView coverArt;
    private final TextView episodeNameTextView;
    private final ProgressBar progressBar;
    private final TextView showNameTextView;
    private final View view;

    public DefaultEpisodeRowListeningHistoryViewBinder(Context context, Picasso picasso) {
        h.e(context, "context");
        h.e(picasso, "picasso");
        View inflate = LayoutInflater.from(context).inflate(R.layout.episode_row_listeninghistory_layout, (ViewGroup) null);
        h.d(inflate, "inflater.inflate(R.layou…ninghistory_layout, null)");
        this.view = inflate;
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        View G = q4.G(inflate, R.id.txt_episode_name);
        h.d(G, "requireViewById(view, R.id.txt_episode_name)");
        TextView textView = (TextView) G;
        this.episodeNameTextView = textView;
        View G2 = q4.G(inflate, R.id.txt_podcast_name);
        h.d(G2, "requireViewById(view, R.id.txt_podcast_name)");
        TextView textView2 = (TextView) G2;
        this.showNameTextView = textView2;
        View G3 = q4.G(inflate, R.id.img_episode_cover_art);
        h.d(G3, "requireViewById(view, R.id.img_episode_cover_art)");
        CoverArtView coverArtView = (CoverArtView) G3;
        this.coverArt = coverArtView;
        View G4 = q4.G(inflate, R.id.btn_context_menu);
        h.d(G4, "requireViewById(view, R.id.btn_context_menu)");
        this.contextMenuButton = (ContextMenuButton) G4;
        View G5 = q4.G(inflate, R.id.progress_bar);
        h.d(G5, "requireViewById(view, R.id.progress_bar)");
        this.progressBar = (ProgressBar) G5;
        bvd c = dvd.c(inflate);
        c.g(textView, textView2);
        c.f(coverArtView);
        c.a();
        coverArtView.setViewContext(new CoverArtView.ViewContext(picasso));
    }

    public final View getView() {
        return this.view;
    }

    public final void render(EpisodeRowListeningHistory.Model model) {
        h.e(model, "model");
        this.episodeNameTextView.setText(model.getEpisodeTitle());
        this.showNameTextView.setText(model.getShowTitle());
        this.progressBar.setProgress(model.getProgress());
        CoverArt.Model.Builder builder = CoverArt.Model.builder(SpotifyIconV2.PODCASTS);
        builder.data(model.getCoverArt());
        this.coverArt.render(builder.build());
        this.contextMenuButton.render(new ContextMenu.Model(ContextMenuType.EPISODE, model.getEpisodeTitle(), false, 4, null));
        this.view.setActivated(model.isPlaying());
    }

    public final void setOnContextMenuClickedListener(nmf<? super EpisodeRowListeningHistory.Events, f> nmf) {
        h.e(nmf, "consumer");
        this.contextMenuButton.onEvent(new DefaultEpisodeRowListeningHistoryViewBinder$setOnContextMenuClickedListener$1(nmf));
    }

    public final void setOnEpisodeClickListener(nmf<? super EpisodeRowListeningHistory.Events, f> nmf) {
        h.e(nmf, "consumer");
        this.view.setOnClickListener(new DefaultEpisodeRowListeningHistoryViewBinder$setOnEpisodeClickListener$1(nmf));
    }
}
