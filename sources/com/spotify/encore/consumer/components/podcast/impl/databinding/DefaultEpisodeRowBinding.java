package com.spotify.encore.consumer.components.podcast.impl.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.podcast.impl.R;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.header.EpisodeRowHeaderView;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.play.PlayElementView;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.quickaction.section.EpisodeRowQuickActionSectionView;
import com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestrictionBadgeView;

public final class DefaultEpisodeRowBinding {
    public final ContentRestrictionBadgeView bodyRestrictionBadge;
    public final View bottomDivider;
    public final ImageView checkPlayIcon;
    public final TextView description;
    public final EpisodeRowHeaderView header;
    public final PlayElementView playElement;
    public final ProgressBar playProgress;
    public final TextView publishedLabel;
    public final EpisodeRowQuickActionSectionView quickActionSection;
    private final ConstraintLayout rootView;
    public final ConstraintLayout rowRoot;

    private DefaultEpisodeRowBinding(ConstraintLayout constraintLayout, ContentRestrictionBadgeView contentRestrictionBadgeView, View view, ImageView imageView, TextView textView, EpisodeRowHeaderView episodeRowHeaderView, PlayElementView playElementView, ProgressBar progressBar, TextView textView2, EpisodeRowQuickActionSectionView episodeRowQuickActionSectionView, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.bodyRestrictionBadge = contentRestrictionBadgeView;
        this.bottomDivider = view;
        this.checkPlayIcon = imageView;
        this.description = textView;
        this.header = episodeRowHeaderView;
        this.playElement = playElementView;
        this.playProgress = progressBar;
        this.publishedLabel = textView2;
        this.quickActionSection = episodeRowQuickActionSectionView;
        this.rowRoot = constraintLayout2;
    }

    public static DefaultEpisodeRowBinding bind(View view) {
        View findViewById;
        int i = R.id.body_restriction_badge;
        ContentRestrictionBadgeView contentRestrictionBadgeView = (ContentRestrictionBadgeView) view.findViewById(i);
        if (!(contentRestrictionBadgeView == null || (findViewById = view.findViewById((i = R.id.bottom_divider))) == null)) {
            i = R.id.check_play_icon;
            ImageView imageView = (ImageView) view.findViewById(i);
            if (imageView != null) {
                i = R.id.description;
                TextView textView = (TextView) view.findViewById(i);
                if (textView != null) {
                    i = R.id.header;
                    EpisodeRowHeaderView episodeRowHeaderView = (EpisodeRowHeaderView) view.findViewById(i);
                    if (episodeRowHeaderView != null) {
                        i = R.id.play_element;
                        PlayElementView playElementView = (PlayElementView) view.findViewById(i);
                        if (playElementView != null) {
                            i = R.id.play_progress;
                            ProgressBar progressBar = (ProgressBar) view.findViewById(i);
                            if (progressBar != null) {
                                i = R.id.published_label;
                                TextView textView2 = (TextView) view.findViewById(i);
                                if (textView2 != null) {
                                    i = R.id.quick_action_section;
                                    EpisodeRowQuickActionSectionView episodeRowQuickActionSectionView = (EpisodeRowQuickActionSectionView) view.findViewById(i);
                                    if (episodeRowQuickActionSectionView != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                        return new DefaultEpisodeRowBinding(constraintLayout, contentRestrictionBadgeView, findViewById, imageView, textView, episodeRowHeaderView, playElementView, progressBar, textView2, episodeRowQuickActionSectionView, constraintLayout);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static DefaultEpisodeRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DefaultEpisodeRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.default_episode_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
