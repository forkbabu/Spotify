package com.spotify.encore.consumer.components.podcast.impl.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.encore.consumer.components.podcast.impl.R;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestrictionBadgeView;

public final class EpisodeRowHeaderBinding {
    public final ArtworkView artwork;
    public final TextView publisher;
    public final ContentRestrictionBadgeView restrictionBadge;
    private final View rootView;
    public final TextView title;

    private EpisodeRowHeaderBinding(View view, ArtworkView artworkView, TextView textView, ContentRestrictionBadgeView contentRestrictionBadgeView, TextView textView2) {
        this.rootView = view;
        this.artwork = artworkView;
        this.publisher = textView;
        this.restrictionBadge = contentRestrictionBadgeView;
        this.title = textView2;
    }

    public static EpisodeRowHeaderBinding bind(View view) {
        int i = R.id.artwork;
        ArtworkView artworkView = (ArtworkView) view.findViewById(i);
        if (artworkView != null) {
            i = R.id.publisher;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                i = R.id.restriction_badge;
                ContentRestrictionBadgeView contentRestrictionBadgeView = (ContentRestrictionBadgeView) view.findViewById(i);
                if (contentRestrictionBadgeView != null) {
                    i = R.id.title;
                    TextView textView2 = (TextView) view.findViewById(i);
                    if (textView2 != null) {
                        return new EpisodeRowHeaderBinding(view, artworkView, textView, contentRestrictionBadgeView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static EpisodeRowHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.episode_row_header, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
