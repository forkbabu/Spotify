package com.spotify.encore.consumer.components.podcastinteractivity.impl.replycard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.podcastinteractivity.api.replycard.ReplyCardEpisodePage;
import com.spotify.encore.consumer.components.podcastinteractivity.impl.databinding.ReplyCardEpisodePageLayoutBinding;
import com.squareup.picasso.Picasso;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultReplyCardEpisodePage implements ReplyCardEpisodePage {
    private final ReplyCardEpisodePageLayoutBinding binding;

    public DefaultReplyCardEpisodePage(Context context, Picasso picasso) {
        h.e(context, "context");
        h.e(picasso, "picasso");
        ReplyCardEpisodePageLayoutBinding inflate = ReplyCardEpisodePageLayoutBinding.inflate(LayoutInflater.from(context));
        h.d(inflate, "it");
        ReplyCardEpisodePageViewBindingsExtensions.init(inflate, picasso);
        h.d(inflate, "ReplyCardEpisodePageLayo…   it.init(picasso)\n    }");
        this.binding = inflate;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        ConstraintLayout root = this.binding.getRoot();
        h.d(root, "binding.root");
        return root;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super ReplyCardEpisodePage.Events, f> nmf) {
        h.e(nmf, "event");
        getView().setOnClickListener(new DefaultReplyCardEpisodePage$onEvent$1(nmf));
    }

    public void render(ReplyCardEpisodePage.Model model) {
        h.e(model, "model");
        ReplyCardEpisodePageLayoutBinding replyCardEpisodePageLayoutBinding = this.binding;
        TextView textView = replyCardEpisodePageLayoutBinding.response;
        h.d(textView, "response");
        textView.setText(model.getResponse());
        TextView textView2 = replyCardEpisodePageLayoutBinding.name;
        h.d(textView2, "name");
        textView2.setText(model.getName());
        TextView textView3 = replyCardEpisodePageLayoutBinding.repliedAt;
        h.d(textView3, "repliedAt");
        textView3.setText(model.getRepliedAt());
        replyCardEpisodePageLayoutBinding.artwork.render(model.getArtwork());
    }
}
