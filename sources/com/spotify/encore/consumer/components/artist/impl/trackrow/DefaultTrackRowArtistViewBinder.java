package com.spotify.encore.consumer.components.artist.impl.trackrow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.consumer.components.artist.api.trackrow.Event;
import com.spotify.encore.consumer.components.artist.api.trackrow.TrackRowArtist;
import com.spotify.encore.consumer.components.artist.impl.R;
import com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encore.consumer.elements.badge.download.DownloadBadgeView;
import com.spotify.encore.consumer.elements.badge.lyrics.LyricsBadgeView;
import com.spotify.encore.consumer.elements.badge.premium.PremiumBadgeView;
import com.spotify.encore.consumer.elements.contextmenu.ContextMenu;
import com.spotify.encore.consumer.elements.contextmenu.ContextMenuButton;
import com.spotify.encore.consumer.elements.contextmenu.ContextMenuType;
import com.spotify.encore.consumer.elements.coverart.CoverArt;
import com.spotify.encore.consumer.elements.coverart.CoverArtView;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultTrackRowArtistViewBinder {
    private final ContentRestrictionBadgeView contentRestrictionBadge;
    private final ContextMenuButton contextMenuButton;
    private final CoverArtView coverArtView;
    private final DownloadBadgeView downloadBadgeView;
    private final LyricsBadgeView lyricsBadgeView;
    private final TextView numberOfListenersTextView;
    private final PremiumBadgeView premiumBadgeView;
    private final View rootView;
    private final TextView trackNameTextView;
    private final TextView trackRowNumberTextView;

    public DefaultTrackRowArtistViewBinder(Context context, CoverArtView.ViewContext viewContext) {
        h.e(context, "context");
        h.e(viewContext, "coverArtContext");
        View inflate = LayoutInflater.from(context).inflate(R.layout.track_row_artist_layout, (ViewGroup) null);
        h.d(inflate, "inflater.inflate(R.layou…_row_artist_layout, null)");
        this.rootView = inflate;
        View G = q4.G(inflate, R.id.txt_track_row_number);
        h.d(G, "ViewCompat.requireViewBy….id.txt_track_row_number)");
        this.trackRowNumberTextView = (TextView) G;
        View G2 = q4.G(inflate, R.id.img_track_cover_art);
        h.d(G2, "ViewCompat.requireViewBy…R.id.img_track_cover_art)");
        CoverArtView coverArtView2 = (CoverArtView) G2;
        this.coverArtView = coverArtView2;
        View G3 = q4.G(inflate, R.id.txt_track_name);
        h.d(G3, "ViewCompat.requireViewBy…iew, R.id.txt_track_name)");
        TextView textView = (TextView) G3;
        this.trackNameTextView = textView;
        View G4 = q4.G(inflate, R.id.img_download_badge);
        h.d(G4, "ViewCompat.requireViewBy… R.id.img_download_badge)");
        this.downloadBadgeView = (DownloadBadgeView) G4;
        View G5 = q4.G(inflate, R.id.img_premium_badge);
        h.d(G5, "ViewCompat.requireViewBy…, R.id.img_premium_badge)");
        this.premiumBadgeView = (PremiumBadgeView) G5;
        View G6 = q4.G(inflate, R.id.img_lyrics_badge);
        h.d(G6, "ViewCompat.requireViewBy…w, R.id.img_lyrics_badge)");
        this.lyricsBadgeView = (LyricsBadgeView) G6;
        View G7 = q4.G(inflate, R.id.img_restriction_badge);
        h.d(G7, "ViewCompat.requireViewBy…id.img_restriction_badge)");
        this.contentRestrictionBadge = (ContentRestrictionBadgeView) G7;
        View G8 = q4.G(inflate, R.id.txt_track_num_listeners);
        h.d(G8, "ViewCompat.requireViewBy….txt_track_num_listeners)");
        TextView textView2 = (TextView) G8;
        this.numberOfListenersTextView = textView2;
        View G9 = q4.G(inflate, R.id.btn_context_menu);
        h.d(G9, "ViewCompat.requireViewBy…w, R.id.btn_context_menu)");
        this.contextMenuButton = (ContextMenuButton) G9;
        bvd c = dvd.c(inflate);
        c.g(textView, textView2);
        c.f(coverArtView2);
        c.a();
        coverArtView2.setViewContext(viewContext);
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    public final View getView() {
        return this.rootView;
    }

    public final void render(TrackRowArtist.Model model) {
        h.e(model, "model");
        this.trackRowNumberTextView.setText(String.valueOf(model.getRowNumber()));
        this.trackNameTextView.setText(model.getTrackName());
        this.numberOfListenersTextView.setText(model.getNumListeners());
        this.contentRestrictionBadge.render(model.getContentRestriction());
        this.downloadBadgeView.render(model.getDownloadState());
        this.premiumBadgeView.render(Boolean.valueOf(model.isPremium()));
        this.contextMenuButton.render(new ContextMenu.Model(ContextMenuType.TRACK, model.getTrackName(), false, 4, null));
        this.rootView.setActivated(model.isActive());
        this.rootView.setSelected(model.isActive());
        this.rootView.setEnabled(model.isPlayable());
        CoverArt.Model.Builder builder = CoverArt.Model.builder(SpotifyIconV2.TRACK);
        builder.data(model.getCoverArt());
        this.coverArtView.render(builder.build());
        boolean z = true;
        int i = 0;
        if (!(this.contentRestrictionBadge.getVisibility() == 8)) {
            if (!(this.premiumBadgeView.getVisibility() == 8)) {
                if (this.downloadBadgeView.getVisibility() != 8) {
                    z = false;
                }
                if (!z) {
                    return;
                }
            }
        }
        LyricsBadgeView lyricsBadgeView2 = this.lyricsBadgeView;
        if (!model.getHasLyrics()) {
            i = 8;
        }
        lyricsBadgeView2.setVisibility(i);
    }

    public final void setOnContextMenuClickedListener(nmf<? super Event, f> nmf) {
        h.e(nmf, "consumer");
        this.contextMenuButton.onEvent(new DefaultTrackRowArtistViewBinder$setOnContextMenuClickedListener$1(nmf));
    }

    public final void setOnTrackClickListener(nmf<? super Event, f> nmf) {
        h.e(nmf, "consumer");
        this.rootView.setOnClickListener(new DefaultTrackRowArtistViewBinder$setOnTrackClickListener$1(nmf));
    }

    public final void setOnTrackLongClickListener(nmf<? super Event, f> nmf) {
        h.e(nmf, "consumer");
        this.rootView.setOnLongClickListener(new DefaultTrackRowArtistViewBinder$setOnTrackLongClickListener$1(nmf));
    }
}
