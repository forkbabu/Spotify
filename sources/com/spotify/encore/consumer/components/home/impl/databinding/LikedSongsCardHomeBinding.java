package com.spotify.encore.consumer.components.home.impl.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.home.impl.R;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import com.spotify.encore.consumer.elements.badge.download.DownloadBadgeView;

public final class LikedSongsCardHomeBinding {
    public final DownloadBadgeView downloadBadgeSubtitle;
    public final DownloadBadgeView downloadBadgeTitle;
    public final ArtworkView image;
    public final ConstraintLayout likedSongsCardRootView;
    private final ConstraintLayout rootView;
    public final TextView subtitle;
    public final TextView title;

    private LikedSongsCardHomeBinding(ConstraintLayout constraintLayout, DownloadBadgeView downloadBadgeView, DownloadBadgeView downloadBadgeView2, ArtworkView artworkView, ConstraintLayout constraintLayout2, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.downloadBadgeSubtitle = downloadBadgeView;
        this.downloadBadgeTitle = downloadBadgeView2;
        this.image = artworkView;
        this.likedSongsCardRootView = constraintLayout2;
        this.subtitle = textView;
        this.title = textView2;
    }

    public static LikedSongsCardHomeBinding bind(View view) {
        int i = R.id.download_badge_subtitle;
        DownloadBadgeView downloadBadgeView = (DownloadBadgeView) view.findViewById(i);
        if (downloadBadgeView != null) {
            i = R.id.download_badge_title;
            DownloadBadgeView downloadBadgeView2 = (DownloadBadgeView) view.findViewById(i);
            if (downloadBadgeView2 != null) {
                i = R.id.image;
                ArtworkView artworkView = (ArtworkView) view.findViewById(i);
                if (artworkView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i = R.id.subtitle;
                    TextView textView = (TextView) view.findViewById(i);
                    if (textView != null) {
                        i = R.id.title;
                        TextView textView2 = (TextView) view.findViewById(i);
                        if (textView2 != null) {
                            return new LikedSongsCardHomeBinding(constraintLayout, downloadBadgeView, downloadBadgeView2, artworkView, constraintLayout, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static LikedSongsCardHomeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LikedSongsCardHomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.liked_songs_card_home, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
