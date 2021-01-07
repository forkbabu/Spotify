package com.spotify.encore.consumer.components.album.impl.trackrow;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.encore.consumer.components.album.api.trackrow.TrackRowAlbum;
import com.spotify.encore.consumer.components.album.impl.R;
import com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encore.consumer.elements.badge.download.DownloadBadgeView;
import com.spotify.encore.consumer.elements.badge.lyrics.LyricsBadgeView;
import com.spotify.encore.consumer.elements.badge.premium.PremiumBadgeView;
import com.spotify.encore.consumer.elements.contextmenu.ContextMenuButton;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultTrackRowAlbumViewBinder {
    private final TextView artistsNamesTextView;
    private final ContentRestrictionBadgeView contentRestrictionBadge;
    private final ContextMenuButton contextMenuButton;
    private final DownloadBadgeView downloadBadgeView;
    private final LyricsBadgeView lyricsBadgeView;
    private final PremiumBadgeView premiumBadgeView;
    private final TextView trackNameTextView;
    private final View view;

    public DefaultTrackRowAlbumViewBinder(Activity activity) {
        h.e(activity, "activity");
        View inflate = LayoutInflater.from(activity).inflate(R.layout.track_row_album_layout, (ViewGroup) null);
        h.d(inflate, "it");
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        h.d(inflate, "inflater.inflate(R.layou…, WRAP_CONTENT)\n        }");
        this.view = inflate;
        View G = q4.G(inflate, R.id.txt_track_name);
        h.d(G, "ViewCompat.requireViewBy…iew, R.id.txt_track_name)");
        TextView textView = (TextView) G;
        this.trackNameTextView = textView;
        View G2 = q4.G(inflate, R.id.txt_artists_names);
        h.d(G2, "ViewCompat.requireViewBy…, R.id.txt_artists_names)");
        TextView textView2 = (TextView) G2;
        this.artistsNamesTextView = textView2;
        View G3 = q4.G(inflate, R.id.img_download_badge);
        h.d(G3, "ViewCompat.requireViewBy… R.id.img_download_badge)");
        this.downloadBadgeView = (DownloadBadgeView) G3;
        View G4 = q4.G(inflate, R.id.img_premium_badge);
        h.d(G4, "ViewCompat.requireViewBy…, R.id.img_premium_badge)");
        this.premiumBadgeView = (PremiumBadgeView) G4;
        View G5 = q4.G(inflate, R.id.img_lyrics_badge);
        h.d(G5, "ViewCompat.requireViewBy…w, R.id.img_lyrics_badge)");
        this.lyricsBadgeView = (LyricsBadgeView) G5;
        View G6 = q4.G(inflate, R.id.img_restriction_badge);
        h.d(G6, "ViewCompat.requireViewBy…id.img_restriction_badge)");
        this.contentRestrictionBadge = (ContentRestrictionBadgeView) G6;
        View G7 = q4.G(inflate, R.id.btn_context_menu);
        h.d(G7, "ViewCompat.requireViewBy…w, R.id.btn_context_menu)");
        this.contextMenuButton = (ContextMenuButton) G7;
        bvd c = dvd.c(inflate);
        c.g(textView, textView2);
        c.a();
    }

    public final View getView() {
        return this.view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0080, code lost:
        if ((r10.downloadBadgeView.getVisibility() == 8) != false) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void render(com.spotify.encore.consumer.components.album.api.trackrow.TrackRowAlbum.Model r11) {
        /*
            r10 = this;
            java.lang.String r0 = "model"
            kotlin.jvm.internal.h.e(r11, r0)
            android.widget.TextView r0 = r10.trackNameTextView
            java.lang.String r1 = r11.getTrackName()
            r0.setText(r1)
            android.widget.TextView r0 = r10.artistsNamesTextView
            java.util.List r1 = r11.getArtistNames()
            java.lang.String r2 = ","
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 62
            r9 = 0
            java.lang.String r1 = kotlin.collections.d.p(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0.setText(r1)
            com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestrictionBadgeView r0 = r10.contentRestrictionBadge
            com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction r1 = r11.getContentRestriction()
            r0.render(r1)
            com.spotify.encore.consumer.elements.contextmenu.ContextMenuButton r0 = r10.contextMenuButton
            com.spotify.encore.consumer.elements.contextmenu.ContextMenu$Model r7 = new com.spotify.encore.consumer.elements.contextmenu.ContextMenu$Model
            com.spotify.encore.consumer.elements.contextmenu.ContextMenuType r2 = com.spotify.encore.consumer.elements.contextmenu.ContextMenuType.TRACK
            java.lang.String r3 = r11.getTrackName()
            r4 = 0
            r5 = 4
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r0.render(r7)
            com.spotify.encore.consumer.elements.badge.download.DownloadBadgeView r0 = r10.downloadBadgeView
            com.spotify.encore.consumer.elements.badge.download.DownloadState r1 = r11.getDownloadState()
            r0.render(r1)
            com.spotify.encore.consumer.elements.badge.premium.PremiumBadgeView r0 = r10.premiumBadgeView
            boolean r1 = r11.isPremium()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.render(r1)
            com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestrictionBadgeView r0 = r10.contentRestrictionBadge
            int r0 = r0.getVisibility()
            r1 = 8
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x0065
            r0 = 1
            goto L_0x0066
        L_0x0065:
            r0 = 0
        L_0x0066:
            if (r0 != 0) goto L_0x0082
            com.spotify.encore.consumer.elements.badge.premium.PremiumBadgeView r0 = r10.premiumBadgeView
            int r0 = r0.getVisibility()
            if (r0 != r1) goto L_0x0072
            r0 = 1
            goto L_0x0073
        L_0x0072:
            r0 = 0
        L_0x0073:
            if (r0 != 0) goto L_0x0082
            com.spotify.encore.consumer.elements.badge.download.DownloadBadgeView r0 = r10.downloadBadgeView
            int r0 = r0.getVisibility()
            if (r0 != r1) goto L_0x007f
            r0 = 1
            goto L_0x0080
        L_0x007f:
            r0 = 0
        L_0x0080:
            if (r0 == 0) goto L_0x008e
        L_0x0082:
            com.spotify.encore.consumer.elements.badge.lyrics.LyricsBadgeView r0 = r10.lyricsBadgeView
            boolean r4 = r11.getHasLyrics()
            if (r4 == 0) goto L_0x008b
            r1 = 0
        L_0x008b:
            r0.setVisibility(r1)
        L_0x008e:
            android.view.View r0 = r10.view
            boolean r1 = r11.isActive()
            r0.setActivated(r1)
            android.view.View r0 = r10.view
            boolean r1 = r11.isActive()
            r0.setSelected(r1)
            android.view.View r0 = r10.view
            boolean r1 = r11.getShouldAppearDisabled()
            if (r1 != 0) goto L_0x00ae
            boolean r1 = r11.isPlayable()
            if (r1 == 0) goto L_0x00af
        L_0x00ae:
            r2 = 1
        L_0x00af:
            r0.setEnabled(r2)
            android.widget.TextView r0 = r10.trackNameTextView
            boolean r1 = r11.getShouldAppearDisabled()
            r1 = r1 ^ r3
            r0.setDuplicateParentStateEnabled(r1)
            android.widget.TextView r0 = r10.trackNameTextView
            boolean r1 = r11.getShouldAppearDisabled()
            r1 = r1 ^ r3
            r0.setEnabled(r1)
            android.widget.TextView r0 = r10.artistsNamesTextView
            boolean r1 = r11.getShouldAppearDisabled()
            r1 = r1 ^ r3
            r0.setDuplicateParentStateEnabled(r1)
            android.widget.TextView r0 = r10.artistsNamesTextView
            boolean r11 = r11.getShouldAppearDisabled()
            r11 = r11 ^ r3
            r0.setEnabled(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.encore.consumer.components.album.impl.trackrow.DefaultTrackRowAlbumViewBinder.render(com.spotify.encore.consumer.components.album.api.trackrow.TrackRowAlbum$Model):void");
    }

    public final void setOnContextMenuClickedListener(nmf<? super TrackRowAlbum.Events, f> nmf) {
        h.e(nmf, "consumer");
        this.contextMenuButton.onEvent(new DefaultTrackRowAlbumViewBinder$setOnContextMenuClickedListener$1(nmf));
    }

    public final void setOnTrackClickListener(nmf<? super TrackRowAlbum.Events, f> nmf) {
        h.e(nmf, "consumer");
        this.view.setOnClickListener(new DefaultTrackRowAlbumViewBinder$setOnTrackClickListener$1(nmf));
    }

    public final void setOnTrackLongClickListener(nmf<? super TrackRowAlbum.Events, f> nmf) {
        h.e(nmf, "consumer");
        this.view.setOnLongClickListener(new DefaultTrackRowAlbumViewBinder$setOnTrackLongClickListener$1(nmf));
    }
}
