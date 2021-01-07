package com.spotify.encore.consumer.components.artist.impl.header;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.encore.consumer.components.artist.api.header.ArtistHeader;
import com.spotify.encore.consumer.components.artist.impl.databinding.ActionRowArtistBinding;
import com.spotify.encore.consumer.components.viewbindings.headers.FullbleedContentBindingsExtensions;
import com.spotify.encore.consumer.components.viewbindings.headers.HeaderViewBindingsExtensions;
import com.spotify.encore.consumer.components.viewbindings.headers.R;
import com.spotify.encore.consumer.components.viewbindings.headers.databinding.FullbleedContentBinding;
import com.spotify.encore.consumer.components.viewbindings.headers.databinding.HeaderLayoutBinding;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import com.spotify.encore.consumer.elements.contextmenu.ContextMenu;
import com.spotify.encore.consumer.elements.contextmenu.ContextMenuType;
import com.spotify.encore.consumer.elements.follow.FollowButton;
import com.spotify.encore.consumer.elements.playbutton.PlayButtonView;
import com.spotify.encore.consumer.elements.playbutton.PlayState;
import com.squareup.picasso.Picasso;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultArtistHeader implements ArtistHeader {
    private final ActionRowArtistBinding actionRow;
    private final HeaderLayoutBinding binding;
    private final FullbleedContentBinding content;
    private final PlayButtonView playButton;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            Artwork.Events.values();
            int[] iArr = new int[3];
            $EnumSwitchMapping$0 = iArr;
            Artwork.Events events = Artwork.Events.ArtworkColorExtractionComplete;
            iArr[1] = 1;
            Artwork.Events events2 = Artwork.Events.ArtworkFetchComplete;
            iArr[0] = 2;
            Artwork.Events events3 = Artwork.Events.ArtworkFetchError;
            iArr[2] = 3;
        }
    }

    public DefaultArtistHeader(Context context, Picasso picasso) {
        h.e(context, "context");
        h.e(picasso, "picasso");
        HeaderLayoutBinding inflate = HeaderLayoutBinding.inflate(LayoutInflater.from(context));
        h.d(inflate, "Header.inflate(LayoutInflater.from(context))");
        this.binding = inflate;
        FullbleedContentBinding bind = FullbleedContentBinding.bind(HeaderViewBindingsExtensions.inflateContent(inflate, R.layout.fullbleed_content));
        h.d(bind, "Content.bind(binding.inf…ayout.fullbleed_content))");
        this.content = bind;
        ActionRowArtistBinding bind2 = ActionRowArtistBinding.bind(FullbleedContentBindingsExtensions.inflateActionRow(bind, com.spotify.encore.consumer.components.artist.impl.R.layout.action_row_artist));
        h.d(bind2, "ActionRow.bind(content.i…ayout.action_row_artist))");
        this.actionRow = bind2;
        this.playButton = HeaderViewBindingsExtensions.inflatePlayButton(inflate);
        HeaderViewBindingsExtensions.init(inflate);
        bind.artwork.setViewContext(new ArtworkView.ViewContext(picasso));
        HeaderViewBindingsExtensions.requestWindowInsets$default(inflate, null, 1, null);
        inflate.getRoot().a(new AppBarLayout.c(this) {
            /* class com.spotify.encore.consumer.components.artist.impl.header.DefaultArtistHeader.AnonymousClass1 */
            final /* synthetic */ DefaultArtistHeader this$0;

            {
                this.this$0 = r1;
            }

            @Override // com.google.android.material.appbar.AppBarLayout.b
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                HeaderLayoutBinding headerLayoutBinding = this.this$0.binding;
                TextView textView = this.this$0.content.title;
                h.d(textView, "content.title");
                HeaderViewBindingsExtensions.updateToolbarWithOffset(headerLayoutBinding, i, textView);
                FullbleedContentBinding fullbleedContentBinding = this.this$0.content;
                h.d(appBarLayout, "appBarLayout");
                FullbleedContentBindingsExtensions.updateMotionProgress(fullbleedContentBinding, i, appBarLayout);
                ArtworkView artworkView = this.this$0.content.artwork;
                h.d(artworkView, "content.artwork");
                artworkView.setTranslationY(-((float) i));
            }
        });
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        AppBarLayout root = this.binding.getRoot();
        h.d(root, "binding.root");
        return root;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super ArtistHeader.Events, f> nmf) {
        h.e(nmf, "consumer");
        this.binding.backButton.onEvent(new DefaultArtistHeader$onEvent$1(nmf));
        this.playButton.onEvent(new DefaultArtistHeader$onEvent$2(nmf));
        this.actionRow.followButton.onEvent(new DefaultArtistHeader$onEvent$3(nmf));
        this.actionRow.contextMenuButton.onEvent(new DefaultArtistHeader$onEvent$4(nmf));
    }

    public void render(ArtistHeader.Model model) {
        h.e(model, "model");
        Toolbar toolbar = this.binding.toolbar;
        h.d(toolbar, "binding.toolbar");
        toolbar.setTitle(model.getName());
        this.playButton.render(model.isPlaying() ? PlayState.PAUSE : PlayState.PLAY_WITH_SHUFFLE);
        FullbleedContentBinding fullbleedContentBinding = this.content;
        TextView textView = fullbleedContentBinding.title;
        h.d(textView, "title");
        textView.setText(model.getName());
        FullbleedContentBindingsExtensions.renderArtwork(fullbleedContentBinding, model.getArtworkUri(), new DefaultArtistHeader$render$$inlined$with$lambda$1(fullbleedContentBinding, this, model));
        ActionRowArtistBinding actionRowArtistBinding = this.actionRow;
        TextView textView2 = actionRowArtistBinding.metadata;
        h.d(textView2, "metadata");
        textView2.setText(model.getMonthlyListeners());
        actionRowArtistBinding.followButton.render(new FollowButton.Model(model.isFollowed(), null, 2, null));
        actionRowArtistBinding.contextMenuButton.render(new ContextMenu.Model(ContextMenuType.TRACK, model.getName(), false, 4, null));
    }
}
