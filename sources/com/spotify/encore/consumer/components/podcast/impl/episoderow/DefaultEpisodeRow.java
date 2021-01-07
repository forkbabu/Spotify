package com.spotify.encore.consumer.components.podcast.impl.episoderow;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodePlayState;
import com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRow;
import com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRowQuickAction;
import com.spotify.encore.consumer.components.podcast.impl.databinding.DefaultEpisodeRowBinding;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.header.EpisodeRowHeader;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.play.PlayElement;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.quickaction.section.EpisodeRowQuickActionSection;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.quickaction.section.EpisodeRowQuickActionSectionView;
import com.spotify.encore.consumer.elements.downloadbutton.LottieIconStateMachine;
import com.squareup.picasso.Picasso;
import kotlin.collections.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class DefaultEpisodeRow implements EpisodeRow {
    public static final Companion Companion = new Companion(null);
    private static final int MAX_PLAY_PROGRESS = 100;
    private final DefaultEpisodeRowBinding binding;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public DefaultEpisodeRow(Context context, Picasso picasso, LottieIconStateMachine lottieIconStateMachine) {
        h.e(context, "context");
        h.e(picasso, "picasso");
        h.e(lottieIconStateMachine, "lottieIconStateMachine");
        DefaultEpisodeRowBinding inflate = DefaultEpisodeRowBinding.inflate(LayoutInflater.from(context));
        h.d(inflate, "it");
        EpisodeRowViewBindingsExtensions.init(inflate, picasso);
        h.d(inflate, "DefaultEpisodeRowBinding…   it.init(picasso)\n    }");
        this.binding = inflate;
        inflate.checkPlayIcon.setImageDrawable(IconUtilsKt.createCheckFillIcon(context));
        ProgressBar progressBar = inflate.playProgress;
        h.d(progressBar, "binding.playProgress");
        progressBar.setMax(100);
        inflate.quickActionSection.setViewContext(new EpisodeRowQuickActionSectionView.ViewContext(lottieIconStateMachine));
    }

    private final boolean hasProgress(EpisodeRow.Model model) {
        return model.getProgress() > ((float) 0);
    }

    private final boolean isActivated(EpisodeRow.Model model) {
        return model.getPlayState() == EpisodePlayState.PausedInActivePlayerContext || model.getPlayState() == EpisodePlayState.PlayingInActivePlayerContext;
    }

    private final boolean isCurrentlyPlaying(EpisodeRow.Model model) {
        return model.getPlayState() == EpisodePlayState.PlayingInActivePlayerContext || model.getPlayState() == EpisodePlayState.Playing;
    }

    private final int proportionalProgress(EpisodeRow.Model model) {
        return anf.b(model.getProgress() * ((float) 100));
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        ConstraintLayout root = this.binding.getRoot();
        h.d(root, "binding.root");
        return root;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super EpisodeRow.Events, kotlin.f> nmf) {
        h.e(nmf, "event");
        this.binding.playElement.onEvent(new DefaultEpisodeRow$onEvent$1(nmf));
        getView().setOnClickListener(new DefaultEpisodeRow$onEvent$2(nmf));
        getView().setOnLongClickListener(new DefaultEpisodeRow$onEvent$3(nmf));
        this.binding.quickActionSection.onEvent(new DefaultEpisodeRow$onEvent$4(nmf));
    }

    public void render(EpisodeRow.Model model) {
        h.e(model, "model");
        this.binding.header.render(new EpisodeRowHeader.Model(model.getTitle(), model.getPublisher(), model.getArtworkUri(), null, 8, null));
        TextView textView = this.binding.description;
        h.d(textView, "binding.description");
        textView.setText(model.getDescription());
        this.binding.playElement.render(new PlayElement.Model(model.getTitle(), isCurrentlyPlaying(model)));
        this.binding.bodyRestrictionBadge.render(model.getContentRestriction());
        TextView textView2 = this.binding.publishedLabel;
        h.d(textView2, "binding.publishedLabel");
        textView2.setText(model.getPublishDateLabel());
        View view = this.binding.bottomDivider;
        h.d(view, "binding.bottomDivider");
        view.setVisibility(model.getShowBottomDivider() ? 0 : 4);
        ImageView imageView = this.binding.checkPlayIcon;
        h.d(imageView, "binding.checkPlayIcon");
        int i = 8;
        imageView.setVisibility(model.isPlayed() ? 0 : 8);
        ProgressBar progressBar = this.binding.playProgress;
        h.d(progressBar, "binding.playProgress");
        if (hasProgress(model)) {
            i = 0;
        }
        progressBar.setVisibility(i);
        ProgressBar progressBar2 = this.binding.playProgress;
        h.d(progressBar2, "binding.playProgress");
        progressBar2.setProgress(proportionalProgress(model));
        ConstraintLayout root = this.binding.getRoot();
        h.d(root, "binding.root");
        root.setActivated(isActivated(model));
        EpisodeRowViewBindingsExtensions.setEnabled(this.binding, model.isPlayable());
        this.binding.quickActionSection.render(new EpisodeRowQuickActionSection.Model(model.getTitle(), d.u(model.getStartQuickAction(), model.getMiddleQuickAction(), model.getEndQuickAction(), new EpisodeRowQuickAction.ContextMenu(model.getTitle(), false, 2, null))));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DefaultEpisodeRow(Activity activity, Picasso picasso, LottieIconStateMachine lottieIconStateMachine) {
        this((Context) activity, picasso, lottieIconStateMachine);
        h.e(activity, "activity");
        h.e(picasso, "picasso");
        h.e(lottieIconStateMachine, "lottieIconStateMachine");
    }
}
