package com.spotify.encore.consumer.components.podcast.impl.episoderow;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.podcast.impl.databinding.DefaultEpisodeRowBinding;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.header.EpisodeRowHeaderView;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.play.PlayElementView;
import com.squareup.picasso.Picasso;
import kotlin.jvm.internal.h;

public final class EpisodeRowViewBindingsExtensions {
    public static final void init(DefaultEpisodeRowBinding defaultEpisodeRowBinding, Picasso picasso) {
        h.e(defaultEpisodeRowBinding, "$this$init");
        h.e(picasso, "picasso");
        ConstraintLayout root = defaultEpisodeRowBinding.getRoot();
        h.d(root, "root");
        root.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        defaultEpisodeRowBinding.header.setViewContext(new EpisodeRowHeaderView.ViewContext(picasso));
        bvd c = dvd.c(defaultEpisodeRowBinding.getRoot());
        c.g(defaultEpisodeRowBinding.description);
        c.a();
    }

    public static final void setEnabled(DefaultEpisodeRowBinding defaultEpisodeRowBinding, boolean z) {
        h.e(defaultEpisodeRowBinding, "$this$setEnabled");
        EpisodeRowHeaderView episodeRowHeaderView = defaultEpisodeRowBinding.header;
        h.d(episodeRowHeaderView, "header");
        episodeRowHeaderView.setEnabled(z);
        TextView textView = defaultEpisodeRowBinding.description;
        h.d(textView, "description");
        textView.setEnabled(z);
        TextView textView2 = defaultEpisodeRowBinding.publishedLabel;
        h.d(textView2, "publishedLabel");
        textView2.setEnabled(z);
        ImageView imageView = defaultEpisodeRowBinding.checkPlayIcon;
        h.d(imageView, "checkPlayIcon");
        imageView.setEnabled(z);
        ImageView imageView2 = defaultEpisodeRowBinding.checkPlayIcon;
        h.d(imageView2, "checkPlayIcon");
        imageView2.setEnabled(z);
        PlayElementView playElementView = defaultEpisodeRowBinding.playElement;
        h.d(playElementView, "playElement");
        playElementView.setEnabled(z);
    }
}
