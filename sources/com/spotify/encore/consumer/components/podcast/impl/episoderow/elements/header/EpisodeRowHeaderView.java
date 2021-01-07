package com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.header;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.podcast.impl.databinding.EpisodeRowHeaderBinding;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.header.EpisodeRowHeader;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import com.squareup.picasso.Picasso;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.text.e;

public final class EpisodeRowHeaderView extends ConstraintLayout implements EpisodeRowHeader {
    private final EpisodeRowHeaderBinding binding;

    public static final class ViewContext {
        private final Picasso picasso;

        public ViewContext(Picasso picasso2) {
            h.e(picasso2, "picasso");
            this.picasso = picasso2;
        }

        public final Picasso getPicasso() {
            return this.picasso;
        }
    }

    public EpisodeRowHeaderView(Context context) {
        this(context, null, 0, 6, null);
    }

    public EpisodeRowHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EpisodeRowHeaderView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void init(EpisodeRowHeaderBinding episodeRowHeaderBinding) {
        bvd c = dvd.c(episodeRowHeaderBinding.getRoot());
        c.g(episodeRowHeaderBinding.title, episodeRowHeaderBinding.publisher);
        c.f(episodeRowHeaderBinding.artwork);
        c.a();
    }

    private final void setUpTitleOnly() {
        TextView textView = this.binding.publisher;
        h.d(textView, "binding.publisher");
        textView.setVisibility(8);
    }

    private final void setUpWithSubtitle(String str) {
        TextView textView = this.binding.publisher;
        h.d(textView, "binding.publisher");
        textView.setText(str);
        TextView textView2 = this.binding.publisher;
        h.d(textView2, "binding.publisher");
        textView2.setVisibility(0);
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<?, kotlin.f> nmf) {
        h.e(nmf, "event");
        EpisodeRowHeader.DefaultImpls.onEvent(this, nmf);
    }

    public final void setPublisherAllCaps(boolean z) {
        TextView textView = this.binding.publisher;
        h.d(textView, "binding.publisher");
        textView.setAllCaps(z);
    }

    public final void setViewContext(ViewContext viewContext) {
        h.e(viewContext, "viewContext");
        this.binding.artwork.setViewContext(new ArtworkView.ViewContext(viewContext.getPicasso()));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EpisodeRowHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        EpisodeRowHeaderBinding inflate = EpisodeRowHeaderBinding.inflate(LayoutInflater.from(context), this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        h.d(inflate, "it");
        init(inflate);
        h.d(inflate, "EpisodeRowHeaderBinding.…)\n        it.init()\n    }");
        this.binding = inflate;
    }

    public void render(EpisodeRowHeader.Model model) {
        h.e(model, "model");
        TextView textView = this.binding.title;
        h.d(textView, "binding.title");
        textView.setText(model.getTitle());
        boolean z = false;
        this.binding.artwork.render((Artwork.Model) new Artwork.Model.Episode(new Artwork.ImageData(model.getArtworkUri()), false, 2, null));
        String subtitle = model.getSubtitle();
        if (subtitle == null || e.n(subtitle)) {
            z = true;
        }
        if (z) {
            setUpTitleOnly();
        } else {
            setUpWithSubtitle(model.getSubtitle());
        }
        this.binding.restrictionBadge.render(model.getContentRestriction());
    }
}
