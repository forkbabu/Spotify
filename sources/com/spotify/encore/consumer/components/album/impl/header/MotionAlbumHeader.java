package com.spotify.encore.consumer.components.album.impl.header;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.consumer.components.album.api.header.AlbumHeader;
import com.spotify.encore.consumer.components.viewbindings.headers.ContentMotionBindingsExtensions;
import com.spotify.encore.consumer.components.viewbindings.headers.HeaderMotionBindingsExtensions;
import com.spotify.encore.consumer.components.viewbindings.headers.R;
import com.spotify.encore.consumer.components.viewbindings.headers.databinding.ActionRowBinding;
import com.spotify.encore.consumer.components.viewbindings.headers.databinding.ContentMotionBinding;
import com.spotify.encore.consumer.components.viewbindings.headers.databinding.HeaderMotionLayoutBinding;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import com.spotify.encore.consumer.elements.contextmenu.ContextMenu;
import com.spotify.encore.consumer.elements.contextmenu.ContextMenuType;
import com.spotify.encore.consumer.elements.creator.Creator;
import com.spotify.encore.consumer.elements.creator.CreatorButton;
import com.spotify.encore.consumer.elements.heart.Heart;
import com.spotify.encore.consumer.elements.playbutton.PlayButtonView;
import com.squareup.picasso.Picasso;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class MotionAlbumHeader implements AlbumHeader {
    private final ActionRowBinding actionRow;
    private final String albumContentDescContext;
    private final HeaderMotionLayoutBinding binding;
    private final ContentMotionBinding content;
    private final PlayButtonView playButton;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            Artwork.Events.values();
            int[] iArr = new int[3];
            $EnumSwitchMapping$0 = iArr;
            Artwork.Events events = Artwork.Events.ArtworkFetchComplete;
            iArr[0] = 1;
            Artwork.Events events2 = Artwork.Events.ArtworkFetchError;
            iArr[2] = 2;
        }
    }

    public MotionAlbumHeader(Activity activity, Picasso picasso) {
        h.e(activity, "activity");
        h.e(picasso, "picasso");
        HeaderMotionLayoutBinding inflate = HeaderMotionLayoutBinding.inflate(LayoutInflater.from(activity));
        h.d(inflate, "it");
        HeaderMotionBindingsExtensions.init(inflate);
        h.d(inflate, "HeaderMotionLayoutBindin…vity)).also { it.init() }");
        this.binding = inflate;
        ContentMotionBinding bind = ContentMotionBinding.bind(HeaderMotionBindingsExtensions.mergeContent(inflate, R.layout.content_motion));
        h.d(bind, "ContentMotionBinding.bin…R.layout.content_motion))");
        this.content = bind;
        ActionRowBinding bind2 = ActionRowBinding.bind(ContentMotionBindingsExtensions.inflateActionRow(bind, R.layout.action_row));
        h.d(bind2, "ActionRowBinding.bind(co…dersR.layout.action_row))");
        this.actionRow = bind2;
        this.playButton = HeaderMotionBindingsExtensions.inflatePlayButton(inflate);
        String string = getView().getContext().getString(com.spotify.encore.consumer.components.album.impl.R.string.element_content_description_context_album);
        h.d(string, "view.context.getString(R…escription_context_album)");
        this.albumContentDescContext = string;
        HeaderMotionBindingsExtensions.applyMotionScene(inflate, R.xml.header_motion_layout_scene);
        bind.artwork.setViewContext(new ArtworkView.ViewContext(picasso));
        bind.creatorButton.setViewContext(new CreatorButton.ViewContext(picasso));
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        AppBarLayout root = this.binding.getRoot();
        h.d(root, "binding.root");
        return root;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super AlbumHeader.Events, f> nmf) {
        h.e(nmf, "consumer");
        this.binding.backButton.onEvent(new MotionAlbumHeader$onEvent$1(nmf));
        this.playButton.onEvent(new MotionAlbumHeader$onEvent$2(nmf));
        this.content.creatorButton.onEvent(new MotionAlbumHeader$onEvent$3(nmf));
        this.actionRow.downloadButton.onEvent(new MotionAlbumHeader$onEvent$4(nmf));
        this.actionRow.heartButton.onEvent(new MotionAlbumHeader$onEvent$5(nmf));
        this.actionRow.contextMenuButton.onEvent(new MotionAlbumHeader$onEvent$6(nmf));
    }

    public void render(AlbumHeader.Model model) {
        h.e(model, "model");
        Toolbar toolbar = this.binding.toolbar;
        h.d(toolbar, "binding.toolbar");
        toolbar.setTitle(model.getTitle());
        this.playButton.render(model.getPlayState());
        ContentMotionBinding contentMotionBinding = this.content;
        TextView textView = contentMotionBinding.title;
        h.d(textView, "title");
        textView.setText(model.getTitle());
        contentMotionBinding.creatorButton.render(new Creator.Model(new Creator.ImageData(model.getCreatorImageData().getUri(), model.getCreatorImageData().getTag()), model.getArtists(), SpotifyIconV2.SPOTIFYLOGO));
        ContentMotionBindingsExtensions.renderArtwork(contentMotionBinding, model.getArtworkUri(), new MotionAlbumHeader$render$$inlined$with$lambda$1(this, model));
        ActionRowBinding actionRowBinding = this.actionRow;
        TextView textView2 = actionRowBinding.metadata;
        h.d(textView2, "metadata");
        textView2.setText(model.getMetadata());
        actionRowBinding.heartButton.render(new Heart.Model(model.isLiked(), this.albumContentDescContext));
        actionRowBinding.downloadButton.render(model.getDownloadButtonModel());
        actionRowBinding.contextMenuButton.render(new ContextMenu.Model(ContextMenuType.TRACK, model.getTitle(), false, 4, null));
    }
}
