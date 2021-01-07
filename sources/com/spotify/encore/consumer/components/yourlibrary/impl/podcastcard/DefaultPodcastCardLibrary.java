package com.spotify.encore.consumer.components.yourlibrary.impl.podcastcard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.yourlibrary.api.elements.LibraryItemDescription;
import com.spotify.encore.consumer.components.yourlibrary.api.podcastcard.PodcastCardLibrary;
import com.spotify.encore.consumer.components.yourlibrary.impl.databinding.LibraryCardLayoutBinding;
import com.spotify.encore.consumer.components.yourlibrary.impl.viewbindings.cards.LibraryCardBindingsKt;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import com.squareup.picasso.Picasso;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultPodcastCardLibrary implements PodcastCardLibrary {
    private final LibraryCardLayoutBinding binding;

    public DefaultPodcastCardLibrary(Context context, Picasso picasso) {
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
    public void onEvent(nmf<? super PodcastCardLibrary.Events, f> nmf) {
        h.e(nmf, "event");
        getView().setOnClickListener(new DefaultPodcastCardLibrary$onEvent$1(nmf));
        getView().setOnLongClickListener(new DefaultPodcastCardLibrary$onEvent$2(nmf));
    }

    public void render(PodcastCardLibrary.Model model) {
        h.e(model, "model");
        TextView textView = this.binding.title;
        h.d(textView, "binding.title");
        textView.setText(model.getName());
        this.binding.subtitle.render((LibraryItemDescription.Model) model.getDescription());
        int i = 0;
        this.binding.artwork.render((Artwork.Model) new Artwork.Model.Show(model.getArtwork(), false, 2, null));
        ImageView imageView = this.binding.pinBadge;
        h.d(imageView, "binding.pinBadge");
        if (!model.isPinned()) {
            i = 8;
        }
        imageView.setVisibility(i);
        getView().setActivated(model.isPlaying());
        getView().setSelected(model.isPlaying());
    }
}
