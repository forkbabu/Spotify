package com.spotify.encore.consumer.components.artist.impl.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.artist.impl.R;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import com.spotify.encore.consumer.elements.follow.FollowButtonGroupView;

public final class ArtistCardFollowLayoutBinding {
    public final ConstraintLayout artistCardFollowRootView;
    public final ArtworkView artwork;
    public final FollowButtonGroupView followButton;
    private final ConstraintLayout rootView;
    public final TextView title;

    private ArtistCardFollowLayoutBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ArtworkView artworkView, FollowButtonGroupView followButtonGroupView, TextView textView) {
        this.rootView = constraintLayout;
        this.artistCardFollowRootView = constraintLayout2;
        this.artwork = artworkView;
        this.followButton = followButtonGroupView;
        this.title = textView;
    }

    public static ArtistCardFollowLayoutBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.artwork;
        ArtworkView artworkView = (ArtworkView) view.findViewById(i);
        if (artworkView != null) {
            i = R.id.follow_button;
            FollowButtonGroupView followButtonGroupView = (FollowButtonGroupView) view.findViewById(i);
            if (followButtonGroupView != null) {
                i = R.id.title;
                TextView textView = (TextView) view.findViewById(i);
                if (textView != null) {
                    return new ArtistCardFollowLayoutBinding((ConstraintLayout) view, constraintLayout, artworkView, followButtonGroupView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ArtistCardFollowLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ArtistCardFollowLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.artist_card_follow_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
