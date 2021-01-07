package com.spotify.encore.consumer.components.impl.trackrow;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.api.trackrow.TrackRow;
import com.spotify.encore.consumer.components.viewbindings.rows.R;
import com.spotify.encore.consumer.components.viewbindings.rows.RowViewBindingsExtensions;
import com.spotify.encore.consumer.components.viewbindings.rows.databinding.RowLayoutBinding;
import com.spotify.encore.consumer.elements.artistandaddedbyname.ArtistAndAddedByNameFormatterKt;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encore.consumer.elements.badge.download.DownloadBadgeView;
import com.spotify.encore.consumer.elements.badge.lyrics.LyricsBadgeView;
import com.spotify.encore.consumer.elements.badge.premium.PremiumBadgeView;
import com.spotify.encore.consumer.elements.contextmenu.ContextMenu;
import com.spotify.encore.consumer.elements.contextmenu.ContextMenuButton;
import com.spotify.encore.consumer.elements.contextmenu.ContextMenuType;
import com.spotify.encore.consumer.elements.quickactions.Action;
import com.spotify.encore.consumer.elements.quickactions.Events;
import com.squareup.picasso.Picasso;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultTrackRow implements TrackRow {
    private final RowLayoutBinding binding;
    private final ContextMenuButton contextMenuButton;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            Events.values();
            int[] iArr = new int[4];
            $EnumSwitchMapping$0 = iArr;
            Events events = Events.HeartClicked;
            iArr[0] = 1;
            Events events2 = Events.BanClicked;
            iArr[2] = 2;
            Events events3 = Events.HideClicked;
            iArr[1] = 3;
            Events events4 = Events.ProfileClicked;
            iArr[3] = 4;
        }
    }

    public DefaultTrackRow(Context context, Picasso picasso) {
        h.e(context, "context");
        h.e(picasso, "picasso");
        RowLayoutBinding inflate = RowLayoutBinding.inflate(LayoutInflater.from(context));
        h.d(inflate, "it");
        RowViewBindingsExtensions.init(inflate, picasso);
        h.d(inflate, "RowLayoutBinding.inflate…   it.init(picasso)\n    }");
        this.binding = inflate;
        this.contextMenuButton = (ContextMenuButton) RowViewBindingsExtensions.inflateAccessoryEnd(inflate, R.layout.context_menu_button);
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        ConstraintLayout root = this.binding.getRoot();
        h.d(root, "binding.root");
        return root;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super TrackRow.Events, f> nmf) {
        h.e(nmf, "event");
        getView().setOnClickListener(new DefaultTrackRow$onEvent$1(nmf));
        getView().setOnLongClickListener(new DefaultTrackRow$onEvent$2(nmf));
        this.contextMenuButton.onEvent(new DefaultTrackRow$onEvent$3(nmf));
        this.binding.quickAction.onEvent(new DefaultTrackRow$onEvent$4(nmf));
    }

    public void render(TrackRow.Model model) {
        h.e(model, "model");
        TextView textView = this.binding.title;
        h.d(textView, "binding.title");
        textView.setText(model.getTrackName());
        TextView textView2 = this.binding.subtitle;
        h.d(textView2, "binding.subtitle");
        Resources resources = getView().getResources();
        h.d(resources, "view.resources");
        textView2.setText(ArtistAndAddedByNameFormatterKt.format(resources, model.getArtistNames(), model.getAddedBy()));
        this.binding.artwork.render((Artwork.Model) new Artwork.Model.Track(model.getArtwork()));
        boolean z = true;
        this.contextMenuButton.render(new ContextMenu.Model(ContextMenuType.TRACK, model.getTrackName(), true));
        this.binding.quickAction.render(model.getAction());
        this.binding.restrictionBadge.render(model.getContentRestriction());
        this.binding.downloadBadge.render(model.getDownloadState());
        this.binding.premiumBadge.render(Boolean.valueOf(model.isPremium()));
        LyricsBadgeView lyricsBadgeView = this.binding.lyricsBadge;
        h.d(lyricsBadgeView, "binding.lyricsBadge");
        lyricsBadgeView.setVisibility(model.getHasLyrics() ? 0 : 8);
        ContentRestrictionBadgeView contentRestrictionBadgeView = this.binding.restrictionBadge;
        h.d(contentRestrictionBadgeView, "binding.restrictionBadge");
        PremiumBadgeView premiumBadgeView = this.binding.premiumBadge;
        h.d(premiumBadgeView, "binding.premiumBadge");
        DownloadBadgeView downloadBadgeView = this.binding.downloadBadge;
        h.d(downloadBadgeView, "binding.downloadBadge");
        LyricsBadgeView lyricsBadgeView2 = this.binding.lyricsBadge;
        h.d(lyricsBadgeView2, "binding.lyricsBadge");
        RowViewBindingsExtensions.capVisibleBadges(contentRestrictionBadgeView, premiumBadgeView, downloadBadgeView, lyricsBadgeView2);
        getView().setActivated(model.isPlaying());
        getView().setSelected(model.isPlaying());
        Action action = model.getAction();
        boolean z2 = !h.a(action, Action.Ban.INSTANCE) && !h.a(action, Action.Hide.INSTANCE);
        RowLayoutBinding rowLayoutBinding = this.binding;
        if (!model.isPlayable() || !z2) {
            z = false;
        }
        RowViewBindingsExtensions.setEnabled(rowLayoutBinding, z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DefaultTrackRow(Activity activity, Picasso picasso) {
        this((Context) activity, picasso);
        h.e(activity, "activity");
        h.e(picasso, "picasso");
    }
}
