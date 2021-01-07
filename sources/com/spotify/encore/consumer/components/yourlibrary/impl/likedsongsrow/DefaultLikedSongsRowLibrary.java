package com.spotify.encore.consumer.components.yourlibrary.impl.likedsongsrow;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.yourlibrary.api.likedsongsrow.LikedSongsRowLibrary;
import com.spotify.encore.consumer.components.yourlibrary.impl.databinding.LibraryRowLayoutBinding;
import com.spotify.encore.consumer.components.yourlibrary.impl.viewbindings.rows.LibraryRowBindingsKt;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import com.squareup.picasso.Picasso;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultLikedSongsRowLibrary implements LikedSongsRowLibrary {
    private final LibraryRowLayoutBinding binding;
    private final ImageButton dismiss;

    public DefaultLikedSongsRowLibrary(Context context, Picasso picasso) {
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
    public void onEvent(nmf<? super LikedSongsRowLibrary.Events, f> nmf) {
        h.e(nmf, "event");
        getView().setOnClickListener(new DefaultLikedSongsRowLibrary$onEvent$1(nmf));
        getView().setOnLongClickListener(new DefaultLikedSongsRowLibrary$onEvent$2(nmf));
        this.dismiss.setOnClickListener(new DefaultLikedSongsRowLibrary$onEvent$3(nmf));
    }

    public void render(LikedSongsRowLibrary.Model model) {
        h.e(model, "model");
        TextView textView = this.binding.title;
        h.d(textView, "binding.title");
        textView.setText(model.getName());
        ArtworkView artworkView = this.binding.artwork;
        Context context = getView().getContext();
        h.d(context, "view.context");
        artworkView.setImageDrawable(oi0.c(context));
        this.binding.downloadBadge.render(model.getDownloadState());
        ImageView imageView = this.binding.pinBadge;
        h.d(imageView, "binding.pinBadge");
        int i = 0;
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
    public DefaultLikedSongsRowLibrary(Activity activity, Picasso picasso) {
        this((Context) activity, picasso);
        h.e(activity, "activity");
        h.e(picasso, "picasso");
    }
}
