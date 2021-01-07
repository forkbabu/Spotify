package com.spotify.encore.consumer.components.podcastinteractivity.impl.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.podcastinteractivity.impl.R;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;

public final class ReplyCardEpisodePageLayoutBinding {
    public final ArtworkView artwork;
    public final Barrier barrier;
    public final TextView name;
    public final TextView repliedAt;
    public final ConstraintLayout replyCardEpisodePageRootView;
    public final TextView response;
    private final ConstraintLayout rootView;

    private ReplyCardEpisodePageLayoutBinding(ConstraintLayout constraintLayout, ArtworkView artworkView, Barrier barrier2, TextView textView, TextView textView2, ConstraintLayout constraintLayout2, TextView textView3) {
        this.rootView = constraintLayout;
        this.artwork = artworkView;
        this.barrier = barrier2;
        this.name = textView;
        this.repliedAt = textView2;
        this.replyCardEpisodePageRootView = constraintLayout2;
        this.response = textView3;
    }

    public static ReplyCardEpisodePageLayoutBinding bind(View view) {
        int i = R.id.artwork;
        ArtworkView artworkView = (ArtworkView) view.findViewById(i);
        if (artworkView != null) {
            i = R.id.barrier;
            Barrier barrier2 = (Barrier) view.findViewById(i);
            if (barrier2 != null) {
                i = R.id.name;
                TextView textView = (TextView) view.findViewById(i);
                if (textView != null) {
                    i = R.id.repliedAt;
                    TextView textView2 = (TextView) view.findViewById(i);
                    if (textView2 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i = R.id.response;
                        TextView textView3 = (TextView) view.findViewById(i);
                        if (textView3 != null) {
                            return new ReplyCardEpisodePageLayoutBinding(constraintLayout, artworkView, barrier2, textView, textView2, constraintLayout, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ReplyCardEpisodePageLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ReplyCardEpisodePageLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.reply_card_episode_page_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
