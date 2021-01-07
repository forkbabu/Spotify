package com.spotify.encore.consumer.components.artist.impl.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.artist.impl.R;
import com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encore.consumer.elements.badge.download.DownloadBadgeView;
import com.spotify.encore.consumer.elements.badge.lyrics.LyricsBadgeView;
import com.spotify.encore.consumer.elements.badge.premium.PremiumBadgeView;
import com.spotify.encore.consumer.elements.contextmenu.ContextMenuButton;
import com.spotify.encore.consumer.elements.coverart.CoverArtView;

public final class TrackRowArtistLayoutBinding {
    public final ContextMenuButton btnContextMenu;
    public final DownloadBadgeView imgDownloadBadge;
    public final LyricsBadgeView imgLyricsBadge;
    public final PremiumBadgeView imgPremiumBadge;
    public final ContentRestrictionBadgeView imgRestrictionBadge;
    public final CoverArtView imgTrackCoverArt;
    private final ConstraintLayout rootView;
    public final ConstraintLayout trackRowArtistRoot;
    public final TextView txtTrackName;
    public final TextView txtTrackNumListeners;
    public final TextView txtTrackRowNumber;

    private TrackRowArtistLayoutBinding(ConstraintLayout constraintLayout, ContextMenuButton contextMenuButton, DownloadBadgeView downloadBadgeView, LyricsBadgeView lyricsBadgeView, PremiumBadgeView premiumBadgeView, ContentRestrictionBadgeView contentRestrictionBadgeView, CoverArtView coverArtView, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.btnContextMenu = contextMenuButton;
        this.imgDownloadBadge = downloadBadgeView;
        this.imgLyricsBadge = lyricsBadgeView;
        this.imgPremiumBadge = premiumBadgeView;
        this.imgRestrictionBadge = contentRestrictionBadgeView;
        this.imgTrackCoverArt = coverArtView;
        this.trackRowArtistRoot = constraintLayout2;
        this.txtTrackName = textView;
        this.txtTrackNumListeners = textView2;
        this.txtTrackRowNumber = textView3;
    }

    public static TrackRowArtistLayoutBinding bind(View view) {
        int i = R.id.btn_context_menu;
        ContextMenuButton contextMenuButton = (ContextMenuButton) view.findViewById(i);
        if (contextMenuButton != null) {
            i = R.id.img_download_badge;
            DownloadBadgeView downloadBadgeView = (DownloadBadgeView) view.findViewById(i);
            if (downloadBadgeView != null) {
                i = R.id.img_lyrics_badge;
                LyricsBadgeView lyricsBadgeView = (LyricsBadgeView) view.findViewById(i);
                if (lyricsBadgeView != null) {
                    i = R.id.img_premium_badge;
                    PremiumBadgeView premiumBadgeView = (PremiumBadgeView) view.findViewById(i);
                    if (premiumBadgeView != null) {
                        i = R.id.img_restriction_badge;
                        ContentRestrictionBadgeView contentRestrictionBadgeView = (ContentRestrictionBadgeView) view.findViewById(i);
                        if (contentRestrictionBadgeView != null) {
                            i = R.id.img_track_cover_art;
                            CoverArtView coverArtView = (CoverArtView) view.findViewById(i);
                            if (coverArtView != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                i = R.id.txt_track_name;
                                TextView textView = (TextView) view.findViewById(i);
                                if (textView != null) {
                                    i = R.id.txt_track_num_listeners;
                                    TextView textView2 = (TextView) view.findViewById(i);
                                    if (textView2 != null) {
                                        i = R.id.txt_track_row_number;
                                        TextView textView3 = (TextView) view.findViewById(i);
                                        if (textView3 != null) {
                                            return new TrackRowArtistLayoutBinding(constraintLayout, contextMenuButton, downloadBadgeView, lyricsBadgeView, premiumBadgeView, contentRestrictionBadgeView, coverArtView, constraintLayout, textView, textView2, textView3);
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

    public static TrackRowArtistLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static TrackRowArtistLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.track_row_artist_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
