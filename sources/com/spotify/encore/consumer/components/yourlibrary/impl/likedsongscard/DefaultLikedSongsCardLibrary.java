package com.spotify.encore.consumer.components.yourlibrary.impl.likedsongscard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.yourlibrary.api.likedsongscard.LikedSongsCardLibrary;
import com.spotify.encore.consumer.components.yourlibrary.impl.databinding.LibraryCardLayoutBinding;
import com.spotify.encore.consumer.components.yourlibrary.impl.viewbindings.cards.LibraryCardBindingsKt;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import com.squareup.picasso.Picasso;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultLikedSongsCardLibrary implements LikedSongsCardLibrary {
    private final LibraryCardLayoutBinding binding;

    public DefaultLikedSongsCardLibrary(Context context, Picasso picasso) {
        h.e(context, "context");
        h.e(picasso, "picasso");
        LibraryCardLayoutBinding inflate = LibraryCardLayoutBinding.inflate(LayoutInflater.from(context));
        h.d(inflate, "it");
        LibraryCardBindingsKt.init(inflate, picasso);
        h.d(inflate, "LibraryCardLayoutBinding…   it.init(picasso)\n    }");
        this.binding = inflate;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        ConstraintLayout root = this.binding.getRoot();
        h.d(root, "binding.root");
        return root;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super LikedSongsCardLibrary.Events, f> nmf) {
        h.e(nmf, "event");
        getView().setOnClickListener(new DefaultLikedSongsCardLibrary$onEvent$1(nmf));
    }

    public void render(LikedSongsCardLibrary.Model model) {
        h.e(model, "model");
        TextView textView = this.binding.title;
        h.d(textView, "binding.title");
        textView.setText(model.getName());
        LibraryCardBindingsKt.renderDescription(this.binding, model.getDescription());
        LibraryCardLayoutBinding libraryCardLayoutBinding = this.binding;
        ArtworkView artworkView = libraryCardLayoutBinding.artwork;
        ConstraintLayout root = libraryCardLayoutBinding.getRoot();
        h.d(root, "binding.root");
        Context context = root.getContext();
        h.d(context, "binding.root.context");
        artworkView.setImageDrawable(oi0.c(context));
        this.binding.downloadBadge.render(model.getDownloadState());
        ImageView imageView = this.binding.pinBadge;
        h.d(imageView, "binding.pinBadge");
        imageView.setVisibility(model.isPinned() ? 0 : 8);
        getView().setActivated(model.isPlaying());
        getView().setSelected(model.isPlaying());
    }
}
