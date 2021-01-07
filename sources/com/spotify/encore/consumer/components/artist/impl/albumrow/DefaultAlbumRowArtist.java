package com.spotify.encore.consumer.components.artist.impl.albumrow;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.artist.api.albumrow.AlbumRowArtist;
import com.spotify.encore.consumer.components.artist.impl.databinding.AlbumRowArtistLayoutBinding;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import com.squareup.picasso.Picasso;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultAlbumRowArtist implements AlbumRowArtist {
    private final AlbumRowArtistLayoutBinding binding;

    public DefaultAlbumRowArtist(Context context, Picasso picasso) {
        h.e(context, "context");
        h.e(picasso, "picasso");
        AlbumRowArtistLayoutBinding inflate = AlbumRowArtistLayoutBinding.inflate(LayoutInflater.from(context));
        h.d(inflate, "it");
        DefaultAlbumRowViewBindingsExtensions.init(inflate, picasso);
        h.d(inflate, "AlbumRowArtistLayoutBind…   it.init(picasso)\n    }");
        this.binding = inflate;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        ConstraintLayout root = this.binding.getRoot();
        h.d(root, "binding.root");
        return root;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super AlbumRowArtist.Events, f> nmf) {
        h.e(nmf, "event");
        getView().setOnClickListener(new DefaultAlbumRowArtist$onEvent$1(nmf));
    }

    public void render(AlbumRowArtist.Model model) {
        h.e(model, "model");
        TextView textView = this.binding.title;
        h.d(textView, "binding.title");
        textView.setText(model.getName());
        TextView textView2 = this.binding.subtitle;
        h.d(textView2, "binding.subtitle");
        textView2.setText(model.getDescription());
        this.binding.artwork.render((Artwork.Model) new Artwork.Model.Track(model.getArtwork()));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DefaultAlbumRowArtist(Activity activity, Picasso picasso) {
        this((Context) activity, picasso);
        h.e(activity, "activity");
        h.e(picasso, "picasso");
    }
}
