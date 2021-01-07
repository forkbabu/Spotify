package com.spotify.encore.consumer.components.genrehub.impl.genrehubheader;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.encore.consumer.components.genrehub.api.genrehubheader.GenreHubHeader;
import com.spotify.encore.consumer.components.genrehub.impl.R;
import com.spotify.encore.consumer.components.genrehub.impl.databinding.GenreHubHeaderLayoutBinding;
import com.spotify.encore.consumer.components.viewbindings.headers.HeaderViewBindingsExtensions;
import com.spotify.encore.consumer.components.viewbindings.headers.databinding.HeaderLayoutBinding;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultGenreHubHeader implements GenreHubHeader {
    private final HeaderLayoutBinding binding;
    private final GenreHubHeaderLayoutBinding content;

    public DefaultGenreHubHeader(Context context) {
        h.e(context, "context");
        HeaderLayoutBinding inflate = HeaderLayoutBinding.inflate(LayoutInflater.from(context));
        h.d(inflate, "it");
        HeaderViewBindingsExtensions.init(inflate);
        h.d(inflate, "HeaderLayoutBinding.infl…text)).also { it.init() }");
        this.binding = inflate;
        GenreHubHeaderLayoutBinding bind = GenreHubHeaderLayoutBinding.bind(HeaderViewBindingsExtensions.inflateContent(inflate, R.layout.genre_hub_header_layout));
        h.d(bind, "bind(binding.inflateCont…genre_hub_header_layout))");
        this.content = bind;
        HeaderViewBindingsExtensions.requestWindowInsets$default(inflate, null, 1, null);
        inflate.getRoot().a(new AppBarLayout.c(this) {
            /* class com.spotify.encore.consumer.components.genrehub.impl.genrehubheader.DefaultGenreHubHeader.AnonymousClass1 */
            final /* synthetic */ DefaultGenreHubHeader this$0;

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
    public void onEvent(nmf<? super GenreHubHeader.Events, f> nmf) {
        h.e(nmf, "event");
        this.binding.backButton.onEvent(new DefaultGenreHubHeader$onEvent$1(nmf));
    }

    public void render(GenreHubHeader.Model model) {
        h.e(model, "model");
        HeaderViewBindingsExtensions.setHeaderColor(this.binding, model.getSampleTint());
        Toolbar toolbar = this.binding.toolbar;
        h.d(toolbar, "binding.toolbar");
        toolbar.setTitle(model.getTitle());
        TextView textView = this.content.title;
        h.d(textView, "content.title");
        textView.setText(model.getTitle());
    }
}
