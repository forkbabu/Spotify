package com.spotify.encore.consumer.components.yourlibrary.impl.albumrow;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.yourlibrary.api.albumrow.AlbumRowLibrary;
import com.spotify.encore.consumer.components.yourlibrary.impl.databinding.LibraryRowLayoutBinding;
import com.spotify.encore.consumer.components.yourlibrary.impl.viewbindings.rows.LibraryRowBindingsKt;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import com.squareup.picasso.Picasso;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultAlbumRowLibrary implements AlbumRowLibrary {
    private final LibraryRowLayoutBinding binding;
    private final ImageButton dismiss;

    public DefaultAlbumRowLibrary(Context context, Picasso picasso) {
        h.e(context, "context");
        h.e(picasso, "picasso");
        LibraryRowLayoutBinding inflate = LibraryRowLayoutBinding.inflate(LayoutInflater.from(context));
        h.d(inflate, "it");
        LibraryRowBindingsKt.init(inflate, picasso);
        h.d(inflate, "LibraryRowLayoutBinding.…   it.init(picasso)\n    }");
        this.binding = inflate;
        this.dismiss = LibraryRowBindingsKt.inflateAccessoryDismiss(inflate);
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        ConstraintLayout root = this.binding.getRoot();
        h.d(root, "binding.root");
        return root;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super AlbumRowLibrary.Events, f> nmf) {
        h.e(nmf, "event");
        getView().setOnClickListener(new DefaultAlbumRowLibrary$onEvent$1(nmf));
        getView().setOnLongClickListener(new DefaultAlbumRowLibrary$onEvent$2(nmf));
        this.dismiss.setOnClickListener(new DefaultAlbumRowLibrary$onEvent$3(nmf));
    }

    public void render(AlbumRowLibrary.Model model) {
        h.e(model, "model");
        TextView textView = this.binding.title;
        h.d(textView, "binding.title");
        textView.setText(model.getName());
        int i = 0;
        this.binding.artwork.render((Artwork.Model) new Artwork.Model.Album(model.getArtwork(), false, 2, null));
        this.binding.downloadBadge.render(model.getDownloadState());
        ImageView imageView = this.binding.pinBadge;
        h.d(imageView, "binding.pinBadge");
        imageView.setVisibility(model.isPinned() ? 0 : 8);
        getView().setActivated(model.isPlaying());
        getView().setSelected(model.isPlaying());
        ImageButton imageButton = this.dismiss;
        if (!model.isDismissible()) {
            i = 8;
        }
        imageButton.setVisibility(i);
        LibraryRowBindingsKt.renderDescription(this.binding, model.getDescription());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DefaultAlbumRowLibrary(Activity activity, Picasso picasso) {
        this((Context) activity, picasso);
        h.e(activity, "activity");
        h.e(picasso, "picasso");
    }
}
