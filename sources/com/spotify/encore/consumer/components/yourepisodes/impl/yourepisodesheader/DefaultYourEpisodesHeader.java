package com.spotify.encore.consumer.components.yourepisodes.impl.yourepisodesheader;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.encore.consumer.components.viewbindings.headers.HeaderViewBindingsExtensions;
import com.spotify.encore.consumer.components.viewbindings.headers.databinding.HeaderLayoutBinding;
import com.spotify.encore.consumer.components.yourepisodes.api.yourepisodesheader.YourEpisodesHeader;
import com.spotify.encore.consumer.components.yourepisodes.impl.R;
import com.spotify.encore.consumer.components.yourepisodes.impl.databinding.YourEpisodesHeaderContentBinding;
import com.spotify.encore.consumer.elements.playbutton.PlayButtonView;
import com.spotify.player.model.ContextTrack;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultYourEpisodesHeader implements YourEpisodesHeader {
    private final HeaderLayoutBinding binding;
    private final YourEpisodesHeaderContentBinding content;
    private final PlayButtonView playButton;

    public DefaultYourEpisodesHeader(Activity activity) {
        h.e(activity, "activity");
        HeaderLayoutBinding inflate = HeaderLayoutBinding.inflate(LayoutInflater.from(activity));
        h.d(inflate, "it");
        HeaderViewBindingsExtensions.init(inflate);
        h.d(inflate, "HeaderLayoutBinding.infl…vity)).also { it.init() }");
        this.binding = inflate;
        YourEpisodesHeaderContentBinding bind = YourEpisodesHeaderContentBinding.bind(HeaderViewBindingsExtensions.inflateContent(inflate, R.layout.your_episodes_header_content));
        h.d(bind, "YourEpisodesHeaderConten…episodes_header_content))");
        this.content = bind;
        this.playButton = HeaderViewBindingsExtensions.inflatePlayButton(inflate);
        HeaderViewBindingsExtensions.requestWindowInsets$default(inflate, null, 1, null);
        inflate.getRoot().a(new AppBarLayout.c(this) {
            /* class com.spotify.encore.consumer.components.yourepisodes.impl.yourepisodesheader.DefaultYourEpisodesHeader.AnonymousClass1 */
            final /* synthetic */ DefaultYourEpisodesHeader this$0;

            {
                this.this$0 = r1;
            }

            @Override // com.google.android.material.appbar.AppBarLayout.b
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                HeaderLayoutBinding headerLayoutBinding = this.this$0.binding;
                TextView textView = this.this$0.content.title;
                h.d(textView, "content.title");
                HeaderViewBindingsExtensions.updateToolbarWithOffset(headerLayoutBinding, i, textView);
            }
        });
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        AppBarLayout root = this.binding.getRoot();
        h.d(root, "binding.root");
        return root;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super YourEpisodesHeader.Events, f> nmf) {
        h.e(nmf, "event");
        this.binding.backButton.onEvent(new DefaultYourEpisodesHeader$onEvent$1(nmf));
        this.playButton.onEvent(new DefaultYourEpisodesHeader$onEvent$2(nmf));
        this.content.downloadButton.onEvent(new DefaultYourEpisodesHeader$onEvent$3(nmf));
    }

    public void render(YourEpisodesHeader.Model model) {
        h.e(model, "model");
        HeaderViewBindingsExtensions.setHeaderColor(this.binding, model.getBackgroundColor());
        Toolbar toolbar = this.binding.toolbar;
        h.d(toolbar, "binding.toolbar");
        toolbar.setTitle(model.getTitle());
        TextView textView = this.content.title;
        h.d(textView, "content.title");
        textView.setText(model.getTitle());
        this.playButton.render(model.getPlayState());
        YourEpisodesHeaderContentBinding yourEpisodesHeaderContentBinding = this.content;
        TextView textView2 = yourEpisodesHeaderContentBinding.subtitle;
        h.d(textView2, ContextTrack.Metadata.KEY_SUBTITLE);
        textView2.setText(model.getSubtitle());
        yourEpisodesHeaderContentBinding.downloadButton.render(model.getDownloadButtonModel());
    }
}
