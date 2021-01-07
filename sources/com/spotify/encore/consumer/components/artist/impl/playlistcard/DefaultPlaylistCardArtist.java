package com.spotify.encore.consumer.components.artist.impl.playlistcard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.artist.api.playlistcard.PlaylistCardArtist;
import com.spotify.encore.consumer.components.viewbindings.cards.CardViewBindingsExtensions;
import com.spotify.encore.consumer.components.viewbindings.cards.databinding.CardLayoutBinding;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import com.squareup.picasso.Picasso;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultPlaylistCardArtist implements PlaylistCardArtist {
    private final CardLayoutBinding binding;

    public DefaultPlaylistCardArtist(Context context, Picasso picasso) {
        h.e(context, "context");
        h.e(picasso, "picasso");
        CardLayoutBinding inflate = CardLayoutBinding.inflate(LayoutInflater.from(context));
        h.d(inflate, "it");
        CardViewBindingsExtensions.init(inflate, picasso);
        h.d(inflate, "CardLayoutBinding.inflat…   it.init(picasso)\n    }");
        this.binding = inflate;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        ConstraintLayout root = this.binding.getRoot();
        h.d(root, "binding.root");
        return root;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super PlaylistCardArtist.Events, f> nmf) {
        h.e(nmf, "event");
        getView().setOnClickListener(new DefaultPlaylistCardArtist$onEvent$1(nmf));
    }

    public void render(PlaylistCardArtist.Model model) {
        h.e(model, "model");
        TextView textView = this.binding.title;
        h.d(textView, "binding.title");
        textView.setText(model.getPlaylistName());
        this.binding.artwork.render((Artwork.Model) new Artwork.Model.Playlist(new Artwork.ImageData(model.getCoverArtUri()), false, 2, null));
    }
}
