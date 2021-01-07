package com.spotify.encore.consumer.components.listeninghistory.impl.entityrow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.encore.consumer.components.listeninghistory.api.entityrow.EntityRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.api.entityrow.EntityTypeListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.api.entityrow.Events;
import com.spotify.encore.consumer.components.listeninghistory.impl.R;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import com.spotify.encore.consumer.elements.contextmenu.ContextMenuButton;
import com.squareup.picasso.Picasso;
import kotlin.collections.d;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultEntityRowListeningHistoryViewBinder {
    private final ArtworkView artworkView;
    private final ContextMenuButton contextMenuButton;
    private final TextView entityNameTextView;
    private final TextView entityTypeTextView;
    private final View view;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            EntityTypeListeningHistory.values();
            int[] iArr = new int[8];
            $EnumSwitchMapping$0 = iArr;
            EntityTypeListeningHistory entityTypeListeningHistory = EntityTypeListeningHistory.ALBUM;
            iArr[0] = 1;
            EntityTypeListeningHistory entityTypeListeningHistory2 = EntityTypeListeningHistory.ARTIST;
            iArr[1] = 2;
            EntityTypeListeningHistory entityTypeListeningHistory3 = EntityTypeListeningHistory.ARTIST_COLLECTION;
            iArr[2] = 3;
            EntityTypeListeningHistory entityTypeListeningHistory4 = EntityTypeListeningHistory.COLLECTION;
            iArr[3] = 4;
            EntityTypeListeningHistory entityTypeListeningHistory5 = EntityTypeListeningHistory.PLAYLIST;
            iArr[5] = 5;
            EntityTypeListeningHistory entityTypeListeningHistory6 = EntityTypeListeningHistory.RADIO;
            iArr[7] = 6;
            EntityTypeListeningHistory entityTypeListeningHistory7 = EntityTypeListeningHistory.SEARCH;
            iArr[6] = 7;
        }
    }

    public DefaultEntityRowListeningHistoryViewBinder(Context context, Picasso picasso) {
        h.e(context, "context");
        h.e(picasso, "picasso");
        View inflate = LayoutInflater.from(context).inflate(R.layout.entity_row_listening_history_layout, (ViewGroup) null);
        h.d(inflate, "inflater.inflate(R.layou…ing_history_layout, null)");
        this.view = inflate;
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        View G = q4.G(inflate, R.id.txt_entity_name);
        h.d(G, "requireViewById(view, R.id.txt_entity_name)");
        TextView textView = (TextView) G;
        this.entityNameTextView = textView;
        View G2 = q4.G(inflate, R.id.txt_entity_type);
        h.d(G2, "requireViewById(view, R.id.txt_entity_type)");
        TextView textView2 = (TextView) G2;
        this.entityTypeTextView = textView2;
        View G3 = q4.G(inflate, R.id.img_entity_cover_art);
        h.d(G3, "requireViewById(view, R.id.img_entity_cover_art)");
        ArtworkView artworkView2 = (ArtworkView) G3;
        this.artworkView = artworkView2;
        View G4 = q4.G(inflate, R.id.btn_context_menu);
        h.d(G4, "requireViewById(view, R.id.btn_context_menu)");
        this.contextMenuButton = (ContextMenuButton) G4;
        bvd c = dvd.c(inflate);
        c.g(textView, textView2);
        c.f(artworkView2);
        c.a();
        artworkView2.setViewContext(new ArtworkView.ViewContext(picasso));
    }

    private final Artwork.Model getModel(EntityTypeListeningHistory entityTypeListeningHistory, Artwork.ImageData imageData) {
        int ordinal = entityTypeListeningHistory.ordinal();
        if (ordinal == 0) {
            return new Artwork.Model.Album(imageData, false, 2, null);
        }
        if (ordinal == 1) {
            return new Artwork.Model.Artist(imageData, false, 2, null);
        }
        if (ordinal == 2) {
            return new Artwork.Model.ArtistCollection(imageData, false, 2, null);
        }
        if (ordinal == 3) {
            return new Artwork.Model.Collection(imageData, false, 2, null);
        }
        if (ordinal == 5) {
            return new Artwork.Model.Playlist(imageData, false, 2, null);
        }
        if (ordinal == 6) {
            return new Artwork.Model.Search(imageData, false, 2, null);
        }
        if (ordinal != 7) {
            return new Artwork.Model.Playlist(imageData, false, 2, null);
        }
        return new Artwork.Model.Radio(imageData, false, 2, null);
    }

    private final boolean hasContextMenu(EntityTypeListeningHistory entityTypeListeningHistory) {
        return d.u(EntityTypeListeningHistory.ALBUM, EntityTypeListeningHistory.ARTIST, EntityTypeListeningHistory.ARTIST_COLLECTION, EntityTypeListeningHistory.PLAYLIST).contains(entityTypeListeningHistory);
    }

    public final View getView() {
        return this.view;
    }

    public final void render(EntityRowListeningHistory.Model model) {
        h.e(model, "model");
        this.entityNameTextView.setText(model.getEntityTitle());
        this.entityTypeTextView.setText(model.getEntitySubtitle());
        this.contextMenuButton.setVisibility(hasContextMenu(model.getEntityType()) ? 0 : 8);
        this.artworkView.render(getModel(model.getEntityType(), new Artwork.ImageData(model.getImage())));
    }

    public final void setOnContextMenuClickListener(nmf<? super Events, f> nmf) {
        h.e(nmf, "consumer");
        this.contextMenuButton.onEvent(new DefaultEntityRowListeningHistoryViewBinder$setOnContextMenuClickListener$1(nmf));
    }

    public final void setOnEntityClickListener(nmf<? super Events, f> nmf) {
        h.e(nmf, "consumer");
        this.view.setOnClickListener(new DefaultEntityRowListeningHistoryViewBinder$setOnEntityClickListener$1(nmf));
    }
}
