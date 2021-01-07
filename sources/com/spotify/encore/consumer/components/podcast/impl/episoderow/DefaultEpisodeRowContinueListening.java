package com.spotify.encore.consumer.components.podcast.impl.episoderow;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.podcast.api.episoderow.continuelistening.EpisodeRowContinueListening;
import com.spotify.encore.consumer.components.podcast.impl.databinding.ContinueListeningEpisodeRowBinding;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.header.EpisodeRowHeader;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.header.EpisodeRowHeaderView;
import com.squareup.picasso.Picasso;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultEpisodeRowContinueListening implements EpisodeRowContinueListening {
    private final ContinueListeningEpisodeRowBinding binding;
    private final ConstraintLayout view;

    public DefaultEpisodeRowContinueListening(Context context, Picasso picasso) {
        h.e(context, "context");
        h.e(picasso, "picasso");
        ContinueListeningEpisodeRowBinding inflate = ContinueListeningEpisodeRowBinding.inflate(LayoutInflater.from(context));
        ConstraintLayout root = inflate.getRoot();
        h.d(root, "root");
        root.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        if (Build.VERSION.SDK_INT >= 21) {
            ConstraintLayout root2 = inflate.getRoot();
            h.d(root2, "root");
            root2.setClipToOutline(true);
        }
        bvd a = dvd.a(inflate.primaryActionButton);
        a.f(inflate.primaryActionButton);
        a.a();
        bvd c = dvd.c(inflate.rowRoot);
        c.f(inflate.rowRoot);
        c.a();
        inflate.header.setViewContext(new EpisodeRowHeaderView.ViewContext(picasso));
        inflate.header.setPublisherAllCaps(true);
        h.d(inflate, "ContinueListeningEpisode…erAllCaps(true)\n        }");
        this.binding = inflate;
        ConstraintLayout root3 = inflate.getRoot();
        h.d(root3, "binding.root");
        this.view = root3;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super EpisodeRowContinueListening.Events, f> nmf) {
        h.e(nmf, "event");
        getView().setOnClickListener(new DefaultEpisodeRowContinueListening$onEvent$1(nmf));
        this.binding.primaryActionButton.setOnClickListener(new DefaultEpisodeRowContinueListening$onEvent$2(nmf));
    }

    @Override // com.spotify.encore.ViewProvider
    public ConstraintLayout getView() {
        return this.view;
    }

    public void render(EpisodeRowContinueListening.Model model) {
        h.e(model, "model");
        ContinueListeningEpisodeRowBinding continueListeningEpisodeRowBinding = this.binding;
        continueListeningEpisodeRowBinding.header.render(new EpisodeRowHeader.Model(model.getEpisodeName(), model.getShowName(), model.getThumbnailImage(), model.getContentRestriction()));
        ProgressBar progressBar = continueListeningEpisodeRowBinding.progress;
        h.d(progressBar, "progress");
        ViewUtilsKt.isInvisibleIf(progressBar, new DefaultEpisodeRowContinueListening$render$$inlined$with$lambda$1(model));
        ProgressBar progressBar2 = continueListeningEpisodeRowBinding.progress;
        h.d(progressBar2, "progress");
        progressBar2.setMax(100);
        ProgressBar progressBar3 = continueListeningEpisodeRowBinding.progress;
        h.d(progressBar3, "progress");
        progressBar3.setProgress(anf.b(model.getProgress() * ((float) 100)));
    }
}
