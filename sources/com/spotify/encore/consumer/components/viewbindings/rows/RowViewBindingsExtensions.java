package com.spotify.encore.consumer.components.viewbindings.rows;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.viewbindings.rows.databinding.RowLayoutBinding;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encore.consumer.elements.badge.download.DownloadBadgeView;
import com.spotify.encore.consumer.elements.badge.lyrics.LyricsBadgeView;
import com.spotify.encore.consumer.elements.badge.premium.PremiumBadgeView;
import com.spotify.encore.consumer.elements.quickactions.QuickActionView;
import com.spotify.player.model.ContextTrack;
import com.squareup.picasso.Picasso;
import kotlin.jvm.internal.h;

public final class RowViewBindingsExtensions {
    public static final void capVisibleBadges(ContentRestrictionBadgeView contentRestrictionBadgeView, PremiumBadgeView premiumBadgeView, DownloadBadgeView downloadBadgeView, LyricsBadgeView lyricsBadgeView) {
        h.e(contentRestrictionBadgeView, "restrictionBadge");
        h.e(premiumBadgeView, "premiumBadge");
        h.e(downloadBadgeView, "downloadBadgeImageView");
        h.e(lyricsBadgeView, "lyricsBadgeView");
        if (contentRestrictionBadgeView.getVisibility() == 0 && premiumBadgeView.getVisibility() == 0 && downloadBadgeView.getVisibility() == 0) {
            lyricsBadgeView.setVisibility(8);
        }
    }

    public static final <T extends View> T inflateAccessoryEnd(RowLayoutBinding rowLayoutBinding, int i) {
        h.e(rowLayoutBinding, "$this$inflateAccessoryEnd");
        ViewStub viewStub = rowLayoutBinding.accessory;
        h.d(viewStub, "accessory");
        viewStub.setLayoutResource(i);
        T t = (T) rowLayoutBinding.accessory.inflate();
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null cannot be cast to non-null type T");
    }

    public static final <T extends View> T inflateAccessoryStart(RowLayoutBinding rowLayoutBinding, int i) {
        h.e(rowLayoutBinding, "$this$inflateAccessoryStart");
        ViewStub viewStub = rowLayoutBinding.accessoryStart;
        h.d(viewStub, "accessoryStart");
        viewStub.setLayoutResource(i);
        T t = (T) rowLayoutBinding.accessoryStart.inflate();
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null cannot be cast to non-null type T");
    }

    public static final void init(RowLayoutBinding rowLayoutBinding, Picasso picasso) {
        h.e(rowLayoutBinding, "$this$init");
        h.e(picasso, "picasso");
        ConstraintLayout root = rowLayoutBinding.getRoot();
        h.d(root, "root");
        root.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        rowLayoutBinding.artwork.setViewContext(new ArtworkView.ViewContext(picasso));
        rowLayoutBinding.quickAction.setViewContext(new QuickActionView.ViewContext(picasso));
        bvd c = dvd.c(rowLayoutBinding.getRoot());
        c.g(rowLayoutBinding.title, rowLayoutBinding.subtitle);
        c.f(rowLayoutBinding.artwork);
        c.a();
    }

    public static final void setEnabled(RowLayoutBinding rowLayoutBinding, boolean z) {
        h.e(rowLayoutBinding, "$this$setEnabled");
        ArtworkView artworkView = rowLayoutBinding.artwork;
        h.d(artworkView, "artwork");
        artworkView.setEnabled(z);
        TextView textView = rowLayoutBinding.title;
        h.d(textView, "title");
        textView.setEnabled(z);
        TextView textView2 = rowLayoutBinding.subtitle;
        h.d(textView2, ContextTrack.Metadata.KEY_SUBTITLE);
        textView2.setEnabled(z);
        DownloadBadgeView downloadBadgeView = rowLayoutBinding.downloadBadge;
        h.d(downloadBadgeView, "downloadBadge");
        downloadBadgeView.setEnabled(z);
        ContentRestrictionBadgeView contentRestrictionBadgeView = rowLayoutBinding.restrictionBadge;
        h.d(contentRestrictionBadgeView, "restrictionBadge");
        contentRestrictionBadgeView.setEnabled(z);
        PremiumBadgeView premiumBadgeView = rowLayoutBinding.premiumBadge;
        h.d(premiumBadgeView, "premiumBadge");
        premiumBadgeView.setEnabled(z);
        LyricsBadgeView lyricsBadgeView = rowLayoutBinding.lyricsBadge;
        h.d(lyricsBadgeView, "lyricsBadge");
        lyricsBadgeView.setEnabled(z);
    }
}
