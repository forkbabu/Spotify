package com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.description;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.podcast.impl.databinding.EpisodeRowDescriptionBinding;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.description.EpisodeRowDescription;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class EpisodeRowDescriptionView extends ConstraintLayout implements EpisodeRowDescription {
    private final EpisodeRowDescriptionBinding binding;

    public EpisodeRowDescriptionView(Context context) {
        this(context, null, 0, 6, null);
    }

    public EpisodeRowDescriptionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EpisodeRowDescriptionView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void init(EpisodeRowDescriptionBinding episodeRowDescriptionBinding) {
        bvd c = dvd.c(episodeRowDescriptionBinding.getRoot());
        c.g(episodeRowDescriptionBinding.tagLine, episodeRowDescriptionBinding.description);
        c.f(episodeRowDescriptionBinding.icon);
        c.a();
    }

    private final void setUpDescriptionOnly() {
        EpisodeRowDescriptionBinding episodeRowDescriptionBinding = this.binding;
        TextView textView = episodeRowDescriptionBinding.tagLine;
        h.d(textView, "tagLine");
        textView.setVisibility(8);
        ImageView imageView = episodeRowDescriptionBinding.icon;
        h.d(imageView, "icon");
        imageView.setVisibility(8);
    }

    private final void setUpTagLineIcon(EpisodeRowDescription.TagLineType tagLineType) {
        EpisodeRowDescriptionBinding episodeRowDescriptionBinding = this.binding;
        DescriptionTagLineIconFactory descriptionTagLineIconFactory = DescriptionTagLineIconFactory.INSTANCE;
        Context context = getContext();
        h.d(context, "context");
        Drawable createIconDrawable = descriptionTagLineIconFactory.createIconDrawable(context, tagLineType);
        if (createIconDrawable == null) {
            ImageView imageView = episodeRowDescriptionBinding.icon;
            h.d(imageView, "icon");
            imageView.setVisibility(8);
            return;
        }
        episodeRowDescriptionBinding.icon.setImageDrawable(createIconDrawable);
        ImageView imageView2 = episodeRowDescriptionBinding.icon;
        h.d(imageView2, "icon");
        imageView2.setVisibility(0);
    }

    private final void setUpWithTagLine(EpisodeRowDescription.Model model) {
        EpisodeRowDescriptionBinding episodeRowDescriptionBinding = this.binding;
        TextView textView = episodeRowDescriptionBinding.tagLine;
        h.d(textView, "tagLine");
        textView.setText(model.getTagLineLabel());
        TextView textView2 = episodeRowDescriptionBinding.tagLine;
        h.d(textView2, "tagLine");
        textView2.setVisibility(0);
        setUpTagLineIcon(model.getTagLineType());
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super EpisodeRowDescription.Events, kotlin.f> nmf) {
        h.e(nmf, "event");
        this.binding.tagLine.setOnClickListener(new EpisodeRowDescriptionView$onEvent$1(nmf));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EpisodeRowDescriptionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        EpisodeRowDescriptionBinding inflate = EpisodeRowDescriptionBinding.inflate(LayoutInflater.from(context), this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        h.d(inflate, "it");
        init(inflate);
        h.d(inflate, "EpisodeRowDescriptionBin…      it.init()\n        }");
        this.binding = inflate;
    }

    public void render(EpisodeRowDescription.Model model) {
        h.e(model, "model");
        TextView textView = this.binding.description;
        h.d(textView, "description");
        textView.setText(model.getDescription());
        String tagLineLabel = model.getTagLineLabel();
        if (tagLineLabel == null || tagLineLabel.length() == 0) {
            setUpDescriptionOnly();
        } else {
            setUpWithTagLine(model);
        }
    }
}
