package com.spotify.encore.consumer.components.podcastinteractivity.impl.replycard;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.podcastinteractivity.impl.R;
import com.spotify.encore.consumer.components.podcastinteractivity.impl.databinding.ReplyCardEpisodePageLayoutBinding;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import com.squareup.picasso.Picasso;
import kotlin.jvm.internal.h;

public final class ReplyCardEpisodePageViewBindingsExtensions {
    public static final void init(ReplyCardEpisodePageLayoutBinding replyCardEpisodePageLayoutBinding, Picasso picasso) {
        h.e(replyCardEpisodePageLayoutBinding, "$this$init");
        h.e(picasso, "picasso");
        ConstraintLayout root = replyCardEpisodePageLayoutBinding.getRoot();
        root.setLayoutParams(new ViewGroup.LayoutParams(root.getResources().getDimensionPixelSize(R.dimen.reply_card_episode_page_width), root.getResources().getDimensionPixelSize(R.dimen.reply_card_episode_page_height)));
        replyCardEpisodePageLayoutBinding.artwork.setViewContext(new ArtworkView.ViewContext(picasso));
        bvd b = dvd.b(replyCardEpisodePageLayoutBinding.getRoot());
        b.g(replyCardEpisodePageLayoutBinding.response);
        b.g(replyCardEpisodePageLayoutBinding.name);
        b.g(replyCardEpisodePageLayoutBinding.repliedAt);
        b.f(replyCardEpisodePageLayoutBinding.artwork);
        b.a();
    }
}
