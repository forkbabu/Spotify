package com.spotify.encore.consumer.components.podcast.impl.episoderow;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRowYourLibrary;
import com.spotify.encore.consumer.components.viewbindings.rows.R;
import com.spotify.encore.consumer.components.viewbindings.rows.RowViewBindingsExtensions;
import com.spotify.encore.consumer.components.viewbindings.rows.databinding.RowLayoutBinding;
import com.spotify.encore.consumer.elements.contextmenu.ContextMenu;
import com.spotify.encore.consumer.elements.contextmenu.ContextMenuButton;
import com.spotify.encore.consumer.elements.contextmenu.ContextMenuType;
import com.squareup.picasso.Picasso;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultEpisodeRowYourLibrary implements EpisodeRowYourLibrary {
    private final RowLayoutBinding binding;
    private final ContextMenuButton contextMenuButton;

    public DefaultEpisodeRowYourLibrary(Context context, Picasso picasso) {
        h.e(context, "context");
        h.e(picasso, "picasso");
        RowLayoutBinding inflate = RowLayoutBinding.inflate(LayoutInflater.from(context));
        h.d(inflate, "it");
        RowViewBindingsExtensions.init(inflate, picasso);
        h.d(inflate, "RowLayoutBinding.inflate…   it.init(picasso)\n    }");
        this.binding = inflate;
        this.contextMenuButton = (ContextMenuButton) RowViewBindingsExtensions.inflateAccessoryEnd(inflate, R.layout.context_menu_button);
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        ConstraintLayout root = this.binding.getRoot();
        h.d(root, "binding.root");
        return root;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super EpisodeRowYourLibrary.Events, f> nmf) {
        h.e(nmf, "event");
        getView().setOnClickListener(new DefaultEpisodeRowYourLibrary$onEvent$1(nmf));
        getView().setOnLongClickListener(new DefaultEpisodeRowYourLibrary$onEvent$2(nmf));
        this.contextMenuButton.onEvent(new DefaultEpisodeRowYourLibrary$onEvent$3(nmf));
    }

    public void render(EpisodeRowYourLibrary.Model model) {
        h.e(model, "model");
        TextView textView = this.binding.title;
        h.d(textView, "binding.title");
        textView.setText(model.getTitle());
        TextView textView2 = this.binding.subtitle;
        h.d(textView2, "binding.subtitle");
        textView2.setText(model.getDescription());
        this.contextMenuButton.render(new ContextMenu.Model(ContextMenuType.EPISODE, model.getTitle(), true));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DefaultEpisodeRowYourLibrary(Activity activity, Picasso picasso) {
        this((Context) activity, picasso);
        h.e(activity, "activity");
        h.e(picasso, "picasso");
    }
}
