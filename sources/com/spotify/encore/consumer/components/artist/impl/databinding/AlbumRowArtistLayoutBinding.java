package com.spotify.encore.consumer.components.artist.impl.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.artist.impl.R;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encore.consumer.elements.badge.download.DownloadBadgeView;
import com.spotify.encore.consumer.elements.badge.lyrics.LyricsBadgeView;
import com.spotify.encore.consumer.elements.badge.premium.PremiumBadgeView;
import com.spotify.encore.consumer.elements.quickactions.QuickActionView;

public final class AlbumRowArtistLayoutBinding {
    public final ViewStub accessory;
    public final ViewStub accessoryStart;
    public final ArtworkView artwork;
    public final DownloadBadgeView downloadBadge;
    public final LyricsBadgeView lyricsBadge;
    public final PremiumBadgeView premiumBadge;
    public final QuickActionView quickAction;
    public final ContentRestrictionBadgeView restrictionBadge;
    private final ConstraintLayout rootView;
    public final ConstraintLayout rowRoot;
    public final TextView subtitle;
    public final TextView title;

    private AlbumRowArtistLayoutBinding(ConstraintLayout constraintLayout, ViewStub viewStub, ViewStub viewStub2, ArtworkView artworkView, DownloadBadgeView downloadBadgeView, LyricsBadgeView lyricsBadgeView, PremiumBadgeView premiumBadgeView, QuickActionView quickActionView, ContentRestrictionBadgeView contentRestrictionBadgeView, ConstraintLayout constraintLayout2, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.accessory = viewStub;
        this.accessoryStart = viewStub2;
        this.artwork = artworkView;
        this.downloadBadge = downloadBadgeView;
        this.lyricsBadge = lyricsBadgeView;
        this.premiumBadge = premiumBadgeView;
        this.quickAction = quickActionView;
        this.restrictionBadge = contentRestrictionBadgeView;
        this.rowRoot = constraintLayout2;
        this.subtitle = textView;
        this.title = textView2;
    }

    public static AlbumRowArtistLayoutBinding bind(View view) {
        int i = R.id.accessory;
        ViewStub viewStub = (ViewStub) view.findViewById(i);
        if (viewStub != null) {
            i = R.id.accessory_start;
            ViewStub viewStub2 = (ViewStub) view.findViewById(i);
            if (viewStub2 != null) {
                i = R.id.artwork;
                ArtworkView artworkView = (ArtworkView) view.findViewById(i);
                if (artworkView != null) {
                    i = R.id.download_badge;
                    DownloadBadgeView downloadBadgeView = (DownloadBadgeView) view.findViewById(i);
                    if (downloadBadgeView != null) {
                        i = R.id.lyrics_badge;
                        LyricsBadgeView lyricsBadgeView = (LyricsBadgeView) view.findViewById(i);
                        if (lyricsBadgeView != null) {
                            i = R.id.premium_badge;
                            PremiumBadgeView premiumBadgeView = (PremiumBadgeView) view.findViewById(i);
                            if (premiumBadgeView != null) {
                                i = R.id.quick_action;
                                QuickActionView quickActionView = (QuickActionView) view.findViewById(i);
                                if (quickActionView != null) {
                                    i = R.id.restriction_badge;
                                    ContentRestrictionBadgeView contentRestrictionBadgeView = (ContentRestrictionBadgeView) view.findViewById(i);
                                    if (contentRestrictionBadgeView != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                        i = R.id.subtitle;
                                        TextView textView = (TextView) view.findViewById(i);
                                        if (textView != null) {
                                            i = R.id.title;
                                            TextView textView2 = (TextView) view.findViewById(i);
                                            if (textView2 != null) {
                                                return new AlbumRowArtistLayoutBinding(constraintLayout, viewStub, viewStub2, artworkView, downloadBadgeView, lyricsBadgeView, premiumBadgeView, quickActionView, contentRestrictionBadgeView, constraintLayout, textView, textView2);
                                            }
                                        }
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

    public static AlbumRowArtistLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AlbumRowArtistLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.album_row_artist_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
