package com.spotify.voice.experiments.experience.view;

import android.content.Context;
import android.widget.ImageView;
import com.google.common.base.MoreObjects;
import com.spotify.remoteconfig.AndroidLibsVoiceExperimentsProperties;
import com.spotify.voice.experiments.experience.view.ExperimentsViewFactory;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;

public final class f1 implements fjf<ExperimentsViewFactory> {
    static void a(String str, ImageView imageView, Picasso picasso) {
        Context context = imageView.getContext();
        if (MoreObjects.isNullOrEmpty(str)) {
            imageView.setImageDrawable(yc0.a(context));
            return;
        }
        z m = picasso.m(str);
        m.t(yc0.a(context));
        m.o(rwd.c(imageView));
    }

    public static ExperimentsViewFactory b(ExperimentsViewFactory.Experiment experiment, x7f x7f, y7f y7f, z7f z7f, Picasso picasso, AndroidLibsVoiceExperimentsProperties androidLibsVoiceExperimentsProperties) {
        return new ExperimentsViewFactory(experiment, x7f, y7f, z7f, picasso, androidLibsVoiceExperimentsProperties);
    }
}
