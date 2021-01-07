package com.spotify.encore.consumer.components.impl.trackrowplaylistextender;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.encore.consumer.components.api.trackrowplaylistextender.Events;
import com.spotify.encore.consumer.components.impl.R;
import com.spotify.encore.consumer.components.impl.trackrowplaylistextender.elements.AddToPlaylistButton;
import com.spotify.encore.consumer.elements.artistandaddedbyname.ArtistAndAddedByName;
import com.spotify.encore.consumer.elements.artistandaddedbyname.ArtistAndAddedByNameView;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction;
import com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.squareup.picasso.Picasso;
import java.util.List;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultTrackRowPlaylistExtenderViewBinder {
    private final AddToPlaylistButton addToPlaylistButton;
    private final ArtistAndAddedByNameView artistAndAddedByNameView;
    private final ArtworkView artworkView;
    private final ContentRestrictionBadgeView restrictionBadge;
    private final View rootView;
    private final TextView trackNameTextView;

    public DefaultTrackRowPlaylistExtenderViewBinder(Context context, Picasso picasso) {
        h.e(context, "context");
        h.e(picasso, "picasso");
        View inflate = LayoutInflater.from(context).inflate(R.layout.track_row_playlist_extender_layout, (ViewGroup) null);
        h.d(inflate, "inflater.inflate(R.layou…st_extender_layout, null)");
        this.rootView = inflate;
        View G = q4.G(inflate, R.id.txt_track_name);
        h.d(G, "requireViewById(rootView, R.id.txt_track_name)");
        TextView textView = (TextView) G;
        this.trackNameTextView = textView;
        View G2 = q4.G(inflate, R.id.txt_artist_addedby_name);
        h.d(G2, "requireViewById(rootView….txt_artist_addedby_name)");
        ArtistAndAddedByNameView artistAndAddedByNameView2 = (ArtistAndAddedByNameView) G2;
        this.artistAndAddedByNameView = artistAndAddedByNameView2;
        View G3 = q4.G(inflate, R.id.img_track_artwork);
        h.d(G3, "requireViewById(rootView, R.id.img_track_artwork)");
        ArtworkView artworkView2 = (ArtworkView) G3;
        this.artworkView = artworkView2;
        View G4 = q4.G(inflate, R.id.btn_add_to_playlist);
        h.d(G4, "requireViewById(rootView…R.id.btn_add_to_playlist)");
        this.addToPlaylistButton = (AddToPlaylistButton) G4;
        View G5 = q4.G(inflate, R.id.img_restriction_badge);
        h.d(G5, "requireViewById(rootView…id.img_restriction_badge)");
        this.restrictionBadge = (ContentRestrictionBadgeView) G5;
        bvd c = dvd.c(inflate);
        c.g(textView, artistAndAddedByNameView2);
        c.f(artworkView2);
        c.a();
        artworkView2.setViewContext(new ArtworkView.ViewContext(picasso));
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    public final View getView() {
        return this.rootView;
    }

    public final void setActionButtonState(boolean z) {
        this.addToPlaylistButton.render(z);
    }

    public final void setArtistsAndAddedByNames(List<String> list, String str) {
        h.e(list, "artistNames");
        this.artistAndAddedByNameView.render(new ArtistAndAddedByName.Model(list, str));
    }

    public final void setModelState(boolean z, boolean z2, boolean z3) {
        if (z) {
            this.rootView.setEnabled(false);
            this.rootView.setActivated(false);
            this.trackNameTextView.setEnabled(false);
        } else if (!z2) {
            this.rootView.setEnabled(true);
            this.rootView.setActivated(false);
            this.trackNameTextView.setEnabled(false);
        } else if (z3) {
            this.rootView.setEnabled(true);
            this.rootView.setActivated(true);
            this.trackNameTextView.setEnabled(true);
        } else {
            this.rootView.setEnabled(true);
            this.rootView.setActivated(false);
            this.trackNameTextView.setEnabled(true);
        }
    }

    public final void setOnQuickActionListener(nmf<? super Events, f> nmf) {
        h.e(nmf, "consumer");
        this.addToPlaylistButton.onEvent(new DefaultTrackRowPlaylistExtenderViewBinder$setOnQuickActionListener$1(nmf));
    }

    public final void setOnTrackClickListener(nmf<? super Events.RowClicked, f> nmf) {
        h.e(nmf, "consumer");
        this.rootView.setOnClickListener(new DefaultTrackRowPlaylistExtenderViewBinder$setOnTrackClickListener$1(nmf));
    }

    public final void setOnTrackLongClickListener(nmf<? super Events.RowLongClicked, f> nmf) {
        h.e(nmf, "consumer");
        this.rootView.setOnLongClickListener(new DefaultTrackRowPlaylistExtenderViewBinder$setOnTrackLongClickListener$1(nmf));
    }

    public final void setRestrictionBadge(ContentRestriction contentRestriction) {
        h.e(contentRestriction, "restriction");
        this.restrictionBadge.render(contentRestriction);
    }

    public final void setTrackName(String str) {
        h.e(str, "title");
        this.trackNameTextView.setText(str);
    }

    public final void updateArtwork(Artwork.ImageData imageData) {
        h.e(imageData, "data");
        this.artworkView.render((Artwork.Model) new Artwork.Model.Track(imageData));
    }
}
