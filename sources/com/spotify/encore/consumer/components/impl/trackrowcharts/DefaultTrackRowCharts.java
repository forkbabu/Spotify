package com.spotify.encore.consumer.components.impl.trackrowcharts;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.consumer.components.api.trackrowcharts.TrackRowCharts;
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
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.squareup.picasso.Picasso;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultTrackRowCharts implements TrackRowCharts {
    private final RowLayoutBinding binding;
    private final ViewGroup chartsIndicator;
    private final ContextMenuButton contextMenuButton;
    private final String higherContentDescription;
    private final SpotifyIconDrawable iconIndicatorDown;
    private final Drawable iconIndicatorNew;
    private final SpotifyIconDrawable iconIndicatorUp;
    private final String lowerContentDescription;
    private final ImageView lowerIconView;
    private final String newContentDescription;
    private final TextView trackRowNumberTextView;
    private final ImageView upperIconView;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

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
            TrackRowCharts.ChartEntryStatus.values();
            int[] iArr2 = new int[4];
            $EnumSwitchMapping$1 = iArr2;
            TrackRowCharts.ChartEntryStatus chartEntryStatus = TrackRowCharts.ChartEntryStatus.UP;
            iArr2[0] = 1;
            TrackRowCharts.ChartEntryStatus.values();
            int[] iArr3 = new int[4];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[0] = 1;
            TrackRowCharts.ChartEntryStatus chartEntryStatus2 = TrackRowCharts.ChartEntryStatus.DOWN;
            iArr3[1] = 2;
            TrackRowCharts.ChartEntryStatus chartEntryStatus3 = TrackRowCharts.ChartEntryStatus.NEW;
            iArr3[2] = 3;
            TrackRowCharts.ChartEntryStatus chartEntryStatus4 = TrackRowCharts.ChartEntryStatus.NONE;
            iArr3[3] = 4;
        }
    }

    public DefaultTrackRowCharts(Context context, Picasso picasso) {
        h.e(context, "context");
        h.e(picasso, "picasso");
        RowLayoutBinding inflate = RowLayoutBinding.inflate(LayoutInflater.from(context));
        h.d(inflate, "it");
        RowViewBindingsExtensions.init(inflate, picasso);
        h.d(inflate, "RowLayoutBinding.inflate…   it.init(picasso)\n    }");
        this.binding = inflate;
        this.contextMenuButton = (ContextMenuButton) RowViewBindingsExtensions.inflateAccessoryEnd(inflate, R.layout.context_menu_button);
        ViewGroup viewGroup = (ViewGroup) RowViewBindingsExtensions.inflateAccessoryStart(inflate, R.layout.track_row_charts_indicator);
        this.chartsIndicator = viewGroup;
        String string = context.getString(com.spotify.encore.consumer.elements.R.string.position_higher_indicator_content_description);
        h.d(string, "context.getString(positi…gher_content_description)");
        this.higherContentDescription = string;
        String string2 = context.getString(com.spotify.encore.consumer.elements.R.string.new_track_indicator_content_description);
        h.d(string2, "context.getString(new_track_content_description)");
        this.newContentDescription = string2;
        String string3 = context.getString(com.spotify.encore.consumer.elements.R.string.position_lower_indicator_content_description);
        h.d(string3, "context.getString(positi…ower_content_description)");
        this.lowerContentDescription = string3;
        q4.Q(getView(), 0, getView().getPaddingTop(), q4.q(getView()), getView().getPaddingBottom());
        View G = q4.G(viewGroup, R.id.img_indicator_icon_upper);
        h.d(G, "requireViewById(chartsIn…img_indicator_icon_upper)");
        this.upperIconView = (ImageView) G;
        View G2 = q4.G(viewGroup, R.id.img_indicator_icon_lower);
        h.d(G2, "requireViewById(chartsIn…img_indicator_icon_lower)");
        this.lowerIconView = (ImageView) G2;
        View G3 = q4.G(viewGroup, R.id.txt_track_row_number);
        h.d(G3, "requireViewById(chartsIn….id.txt_track_row_number)");
        this.trackRowNumberTextView = (TextView) G3;
        this.iconIndicatorUp = createArrowIcon(context, SpotifyIconV2.CHART_UP, R.color.track_row_charts_higher_indicator);
        this.iconIndicatorDown = createArrowIcon(context, SpotifyIconV2.CHART_DOWN, R.color.track_row_charts_lower_indicator);
        Drawable d = a.d(context, R.drawable.track_row_charts_icon_new);
        if (d != null) {
            this.iconIndicatorNew = d;
            return;
        }
        throw new IllegalStateException("Unable to load drawable track_row_charts_icon_new in TrackRowCharts");
    }

    private final SpotifyIconDrawable createArrowIcon(Context context, SpotifyIconV2 spotifyIconV2, int i) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, context.getResources().getDimension(R.dimen.charts_icon_size));
        spotifyIconDrawable.r(a.b(context, i));
        return spotifyIconDrawable;
    }

    private final void renderDownIndicator(TrackRowCharts.ChartEntryStatus chartEntryStatus) {
        Pair pair;
        Pair pair2;
        int ordinal = chartEntryStatus.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                pair2 = new Pair(this.iconIndicatorDown, this.lowerContentDescription);
            } else if (ordinal == 2) {
                pair2 = new Pair(this.iconIndicatorNew, this.newContentDescription);
            } else if (ordinal == 3) {
                pair = new Pair(null, null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            pair = pair2;
        } else {
            pair = new Pair(null, null);
        }
        this.lowerIconView.setImageDrawable((Drawable) pair.a());
        this.lowerIconView.setContentDescription((String) pair.b());
    }

    private final void renderUpIndicator(TrackRowCharts.ChartEntryStatus chartEntryStatus) {
        if (chartEntryStatus.ordinal() != 0) {
            this.upperIconView.setImageDrawable(null);
            this.upperIconView.setContentDescription(null);
            return;
        }
        this.upperIconView.setImageDrawable(this.iconIndicatorUp);
        this.upperIconView.setContentDescription(this.higherContentDescription);
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        ConstraintLayout root = this.binding.getRoot();
        h.d(root, "binding.root");
        return root;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super TrackRowCharts.Events, f> nmf) {
        h.e(nmf, "event");
        getView().setOnClickListener(new DefaultTrackRowCharts$onEvent$1(nmf));
        getView().setOnLongClickListener(new DefaultTrackRowCharts$onEvent$2(nmf));
        this.contextMenuButton.onEvent(new DefaultTrackRowCharts$onEvent$3(nmf));
        this.binding.quickAction.onEvent(new DefaultTrackRowCharts$onEvent$4(nmf));
    }

    public void render(TrackRowCharts.Model model) {
        h.e(model, "model");
        this.trackRowNumberTextView.setText(String.valueOf(model.getRowNumber()));
        TextView textView = this.binding.title;
        h.d(textView, "binding.title");
        textView.setText(model.getTrackName());
        TextView textView2 = this.binding.subtitle;
        h.d(textView2, "binding.subtitle");
        Resources resources = getView().getResources();
        h.d(resources, "view.resources");
        textView2.setText(ArtistAndAddedByNameFormatterKt.format(resources, model.getArtistNames(), null));
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
        renderDownIndicator(model.getChartEntryStatus());
        renderUpIndicator(model.getChartEntryStatus());
        Action action = model.getAction();
        if (!(!h.a(action, Action.Ban.INSTANCE) && !h.a(action, Action.Hide.INSTANCE)) || !model.isPlayable()) {
            z = false;
        }
        this.upperIconView.setEnabled(z);
        this.lowerIconView.setEnabled(z);
        this.trackRowNumberTextView.setEnabled(z);
        RowViewBindingsExtensions.setEnabled(this.binding, z);
    }
}
