package com.spotify.encore.consumer.components.impl.searchintentcard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.c;
import com.spotify.encore.consumer.components.api.searchintentcard.SearchIntentCard;
import com.spotify.encore.consumer.components.viewbindings.cards.CardViewBindingsExtensions;
import com.spotify.encore.consumer.components.viewbindings.cards.databinding.CardLayoutBinding;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import com.spotify.encore.foundation.R;
import com.squareup.picasso.Picasso;
import kotlin.TypeCastException;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class DefaultSearchIntentCard implements SearchIntentCard {
    private static final float ARTWORK_HEIGHT = 72.0f;
    private static final float ARTWORK_WIDTH = 72.0f;
    public static final Companion Companion = new Companion(null);
    private final CardLayoutBinding binding;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public DefaultSearchIntentCard(Context context, Picasso picasso) {
        h.e(context, "context");
        h.e(picasso, "picasso");
        CardLayoutBinding inflate = CardLayoutBinding.inflate(LayoutInflater.from(context));
        h.d(inflate, "it");
        CardViewBindingsExtensions.init(inflate, picasso);
        ArtworkView artworkView = inflate.artwork;
        h.d(artworkView, "it.artwork");
        ViewGroup.LayoutParams layoutParams = artworkView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = nud.g(72.0f, context.getResources());
            layoutParams.height = nud.g(72.0f, context.getResources());
            artworkView.setLayoutParams(layoutParams);
            c.n(inflate.title, R.style.TextAppearance_Encore_Mesto);
            h.d(inflate, "CardLayoutBinding.inflat…ore_Mesto\n        )\n    }");
            this.binding = inflate;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        ConstraintLayout root = this.binding.getRoot();
        h.d(root, "binding.root");
        return root;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super SearchIntentCard.Events, kotlin.f> nmf) {
        h.e(nmf, "event");
        getView().setOnClickListener(new DefaultSearchIntentCard$onEvent$1(nmf));
    }

    public void render(SearchIntentCard.Model model) {
        h.e(model, "model");
        TextView textView = this.binding.title;
        h.d(textView, "binding.title");
        textView.setText(model.getText());
        this.binding.artwork.render((Artwork.Model) Artwork.Model.ArtistSearch.INSTANCE);
    }
}
