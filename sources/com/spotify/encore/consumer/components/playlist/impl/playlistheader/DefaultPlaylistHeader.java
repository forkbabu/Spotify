package com.spotify.encore.consumer.components.playlist.impl.playlistheader;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.consumer.components.playlist.api.playlistheader.PlaylistHeader;
import com.spotify.encore.consumer.components.viewbindings.headers.ContentBindingsExtensions;
import com.spotify.encore.consumer.components.viewbindings.headers.HeaderViewBindingsExtensions;
import com.spotify.encore.consumer.components.viewbindings.headers.R;
import com.spotify.encore.consumer.components.viewbindings.headers.databinding.ActionRowBinding;
import com.spotify.encore.consumer.components.viewbindings.headers.databinding.ContentBinding;
import com.spotify.encore.consumer.components.viewbindings.headers.databinding.HeaderLayoutBinding;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import com.spotify.encore.consumer.elements.contextmenu.ContextMenu;
import com.spotify.encore.consumer.elements.contextmenu.ContextMenuType;
import com.spotify.encore.consumer.elements.creator.Creator;
import com.spotify.encore.consumer.elements.creator.CreatorButton;
import com.spotify.encore.consumer.elements.heart.Heart;
import com.spotify.encore.consumer.elements.playbutton.PlayButtonView;
import com.squareup.picasso.Picasso;
import kotlin.collections.d;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultPlaylistHeader implements PlaylistHeader {
    private final ActionRowBinding actionRow;
    private final HeaderLayoutBinding binding;
    private final ContentBinding content;
    private final int defaultHeaderColor = a.b(getView().getContext(), R.color.header_background_default);
    private final PlayButtonView playButton;
    private final String playlistContentDescContext;

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

    public DefaultPlaylistHeader(Context context, Picasso picasso) {
        h.e(context, "context");
        h.e(picasso, "picasso");
        HeaderLayoutBinding inflate = HeaderLayoutBinding.inflate(LayoutInflater.from(context));
        h.d(inflate, "it");
        HeaderViewBindingsExtensions.init(inflate);
        h.d(inflate, "HeaderLayoutBinding.infl…text)).also { it.init() }");
        this.binding = inflate;
        ContentBinding bind = ContentBinding.bind(HeaderViewBindingsExtensions.inflateContent(inflate, R.layout.content));
        h.d(bind, "ContentBinding.bind(bind…HeadersR.layout.content))");
        this.content = bind;
        ActionRowBinding bind2 = ActionRowBinding.bind(ContentBindingsExtensions.inflateActionRow(bind, R.layout.action_row));
        h.d(bind2, "ActionRowBinding.bind(co…dersR.layout.action_row))");
        this.actionRow = bind2;
        this.playButton = HeaderViewBindingsExtensions.inflatePlayButton(inflate);
        String string = getView().getContext().getString(com.spotify.encore.consumer.components.playlist.impl.R.string.element_content_description_context_playlist);
        h.d(string, "view.context.getString(R…ription_context_playlist)");
        this.playlistContentDescContext = string;
        HeaderViewBindingsExtensions.requestWindowInsets(inflate, new nmf<Integer, f>(bind) {
            /* class com.spotify.encore.consumer.components.playlist.impl.playlistheader.DefaultPlaylistHeader.AnonymousClass1 */

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // defpackage.nmf
            public /* bridge */ /* synthetic */ f invoke(Integer num) {
                invoke(num.intValue());
                return f.a;
            }

            public final void invoke(int i) {
                ContentBindingsExtensions.applySystemWindowInsetTop((ContentBinding) this.receiver, i);
            }
        });
        bind.artwork.setViewContext(new ArtworkView.ViewContext(picasso));
        bind.creatorButton.setViewContext(new CreatorButton.ViewContext(picasso));
        TextView textView = bind.title;
        h.d(textView, "content.title");
        textView.setVisibility(8);
        TextView textView2 = bind.description;
        h.d(textView2, "content.description");
        textView2.setVisibility(0);
        inflate.getRoot().a(new AppBarLayout.c(this) {
            /* class com.spotify.encore.consumer.components.playlist.impl.playlistheader.DefaultPlaylistHeader.AnonymousClass2 */
            final /* synthetic */ DefaultPlaylistHeader this$0;

            {
                this.this$0 = r1;
            }

            @Override // com.google.android.material.appbar.AppBarLayout.b
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                ContentBindingsExtensions.updateArtworkWithOffset(this.this$0.content, i);
                TextView textView = this.this$0.content.title;
                h.d(textView, "content.title");
                TextView textView2 = textView.getVisibility() == 0 ? this.this$0.content.title : this.this$0.content.description;
                h.d(textView2, "if (content.title.visibi… else content.description");
                HeaderViewBindingsExtensions.updateToolbarWithOffset(this.this$0.binding, i, textView2);
                if (Build.VERSION.SDK_INT >= 21) {
                    this.this$0.updateActionRowAccessibility();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void updateActionRowAccessibility() {
        Toolbar toolbar = this.binding.toolbar;
        h.d(toolbar, "binding.toolbar");
        if (toolbar.getAlpha() == 1.0f) {
            TextView textView = this.actionRow.metadata;
            h.d(textView, "actionRow.metadata");
            if (textView.isImportantForAccessibility()) {
                ConstraintLayout constraintLayout = this.actionRow.actionRowContainer;
                h.d(constraintLayout, "actionRow.actionRowContainer");
                constraintLayout.setImportantForAccessibility(4);
                return;
            }
        }
        if (toolbar.getAlpha() < 1.0f) {
            TextView textView2 = this.actionRow.metadata;
            h.d(textView2, "actionRow.metadata");
            if (!textView2.isImportantForAccessibility()) {
                ConstraintLayout constraintLayout2 = this.actionRow.actionRowContainer;
                h.d(constraintLayout2, "actionRow.actionRowContainer");
                constraintLayout2.setImportantForAccessibility(1);
            }
        }
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        AppBarLayout root = this.binding.getRoot();
        h.d(root, "binding.root");
        return root;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super PlaylistHeader.Events, f> nmf) {
        h.e(nmf, "consumer");
        this.binding.backButton.onEvent(new DefaultPlaylistHeader$onEvent$1(nmf));
        this.playButton.onEvent(new DefaultPlaylistHeader$onEvent$2(nmf));
        this.content.creatorButton.onEvent(new DefaultPlaylistHeader$onEvent$3(nmf));
        this.actionRow.downloadButton.onEvent(new DefaultPlaylistHeader$onEvent$4(nmf));
        this.actionRow.heartButton.onEvent(new DefaultPlaylistHeader$onEvent$5(nmf));
        this.actionRow.contextMenuButton.onEvent(new DefaultPlaylistHeader$onEvent$6(nmf));
    }

    public void render(PlaylistHeader.Model model) {
        h.e(model, "model");
        Toolbar toolbar = this.binding.toolbar;
        h.d(toolbar, "binding.toolbar");
        toolbar.setTitle(model.getTitle());
        this.playButton.render(model.getPlayState());
        ContentBinding contentBinding = this.content;
        TextView textView = contentBinding.title;
        h.d(textView, "title");
        textView.setText(model.getTitle());
        TextView textView2 = contentBinding.description;
        h.d(textView2, "description");
        textView2.setText(model.getDescription());
        contentBinding.creatorButton.render(new Creator.Model(new Creator.ImageData(model.getCreatorImageData().getUri(), model.getCreatorImageData().getTag()), d.t(model.getCreatorName()), SpotifyIconV2.SPOTIFYLOGO));
        ContentBindingsExtensions.renderArtwork(contentBinding, model.getArtworkUri(), true, new DefaultPlaylistHeader$render$$inlined$with$lambda$1(this, model));
        ActionRowBinding actionRowBinding = this.actionRow;
        TextView textView3 = actionRowBinding.metadata;
        h.d(textView3, "metadata");
        textView3.setText(model.getMetadata());
        actionRowBinding.heartButton.render(new Heart.Model(model.isLiked(), this.playlistContentDescContext));
        actionRowBinding.downloadButton.render(model.getDownloadButtonModel());
        actionRowBinding.contextMenuButton.render(new ContextMenu.Model(ContextMenuType.TRACK, model.getTitle(), false, 4, null));
    }
}
