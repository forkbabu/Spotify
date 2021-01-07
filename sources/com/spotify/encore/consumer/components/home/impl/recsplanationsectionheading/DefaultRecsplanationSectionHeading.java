package com.spotify.encore.consumer.components.home.impl.recsplanationsectionheading;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.home.api.recsplanationsectionheading.RecsplanationSectionHeading;
import com.spotify.encore.consumer.components.home.impl.databinding.RecsplanationSectionheadingLayoutBinding;
import com.squareup.picasso.Picasso;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultRecsplanationSectionHeading implements RecsplanationSectionHeading {
    private RecsplanationSectionheadingLayoutBinding binding;

    public DefaultRecsplanationSectionHeading(Context context, Picasso picasso) {
        h.e(context, "context");
        h.e(picasso, "picasso");
        RecsplanationSectionheadingLayoutBinding inflate = RecsplanationSectionheadingLayoutBinding.inflate(LayoutInflater.from(context));
        h.d(inflate, "RecsplanationSectionhead…utInflater.from(context))");
        RecsplanationSectionHeadingViewBindingsKt.init(inflate, picasso);
        this.binding = inflate;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        ConstraintLayout root = this.binding.getRoot();
        h.d(root, "binding.root");
        return root;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super RecsplanationSectionHeading.Events, f> nmf) {
        h.e(nmf, "event");
        getView().setOnClickListener(new DefaultRecsplanationSectionHeading$onEvent$1(nmf));
    }

    public void render(RecsplanationSectionHeading.Model model) {
        h.e(model, "model");
        TextView textView = this.binding.title;
        h.d(textView, "binding.title");
        textView.setText(model.getTitle());
        TextView textView2 = this.binding.subtitle;
        h.d(textView2, "binding.subtitle");
        textView2.setText(model.getSubTitle());
        this.binding.image.render(model.getArtwork());
    }
}
