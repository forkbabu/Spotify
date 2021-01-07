package com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.playbackprogress;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.podcast.impl.databinding.PlaybackProgressViewBinding;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.IconUtilsKt;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.playbackprogress.PlaybackProgress;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class PlaybackProgressView extends ConstraintLayout implements PlaybackProgress {
    public static final Companion Companion = new Companion(null);
    private static final int MAX_PLAY_PROGRESS = 100;
    private final PlaybackProgressViewBinding binding;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public PlaybackProgressView(Context context) {
        this(context, null, 0, 6, null);
    }

    public PlaybackProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PlaybackProgressView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final boolean hasProgress(PlaybackProgress.Model model) {
        return model.getProgress() > ((float) 0);
    }

    private final int proportionalProgress(PlaybackProgress.Model model) {
        return anf.b(model.getProgress() * ((float) 100));
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<?, kotlin.f> nmf) {
        h.e(nmf, "event");
        PlaybackProgress.DefaultImpls.onEvent(this, nmf);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlaybackProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        PlaybackProgressViewBinding inflate = PlaybackProgressViewBinding.inflate(LayoutInflater.from(context), this);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        ProgressBar progressBar = inflate.playProgress;
        h.d(progressBar, "it.playProgress");
        progressBar.setMax(100);
        inflate.checkPlayIcon.setImageDrawable(IconUtilsKt.createCheckFillIcon(context));
        h.d(inflate, "PlaybackProgressViewBind…lIcon(context))\n        }");
        this.binding = inflate;
    }

    public void render(PlaybackProgress.Model model) {
        h.e(model, "model");
        PlaybackProgressViewBinding playbackProgressViewBinding = this.binding;
        ProgressBar progressBar = playbackProgressViewBinding.playProgress;
        h.d(progressBar, "playProgress");
        int i = 0;
        progressBar.setVisibility(hasProgress(model) ? 0 : 8);
        ProgressBar progressBar2 = playbackProgressViewBinding.playProgress;
        h.d(progressBar2, "playProgress");
        progressBar2.setProgress(proportionalProgress(model));
        ImageView imageView = playbackProgressViewBinding.checkPlayIcon;
        h.d(imageView, "checkPlayIcon");
        if (!model.isPlayed()) {
            i = 8;
        }
        imageView.setVisibility(i);
    }
}
