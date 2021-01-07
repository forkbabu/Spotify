package com.spotify.encore.consumer.components.yourlibrary.impl.folderrow;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.consumer.components.yourlibrary.api.folderrow.FolderRowLibrary;
import com.spotify.encore.consumer.components.yourlibrary.impl.R;
import com.spotify.encore.consumer.components.yourlibrary.impl.databinding.LibraryRowLayoutBinding;
import com.spotify.encore.consumer.components.yourlibrary.impl.viewbindings.rows.LibraryRowBindingsKt;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import com.squareup.picasso.Picasso;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultFolderRowLibrary implements FolderRowLibrary {
    private final ImageButton accessory;
    private final LibraryRowLayoutBinding binding;
    private boolean dismissible;

    public DefaultFolderRowLibrary(Context context, Picasso picasso) {
        h.e(context, "context");
        h.e(picasso, "picasso");
        LibraryRowLayoutBinding inflate = LibraryRowLayoutBinding.inflate(LayoutInflater.from(context));
        h.d(inflate, "LibraryRowLayoutBinding.…utInflater.from(context))");
        this.binding = inflate;
        ImageButton inflateAccessory = LibraryRowBindingsKt.inflateAccessory(inflate, SpotifyIconV2.CHEVRON_RIGHT);
        inflateAccessory.setClickable(false);
        this.accessory = inflateAccessory;
        LibraryRowBindingsKt.init(inflate, picasso);
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        ConstraintLayout root = this.binding.getRoot();
        h.d(root, "binding.root");
        return root;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super FolderRowLibrary.Events, f> nmf) {
        h.e(nmf, "event");
        getView().setOnClickListener(new DefaultFolderRowLibrary$onEvent$1(nmf));
        getView().setOnLongClickListener(new DefaultFolderRowLibrary$onEvent$2(nmf));
        this.accessory.setClickable(this.dismissible);
        if (this.dismissible) {
            this.accessory.setOnClickListener(new DefaultFolderRowLibrary$onEvent$3(nmf));
        } else {
            this.accessory.setOnClickListener(null);
        }
    }

    public void render(FolderRowLibrary.Model model) {
        h.e(model, "model");
        TextView textView = this.binding.title;
        h.d(textView, "binding.title");
        textView.setText(model.getName());
        this.binding.artwork.render((Artwork.Model) Artwork.Model.PlaylistFolder.INSTANCE);
        if (this.dismissible != model.isDismissible()) {
            if (model.isDismissible()) {
                LibraryRowBindingsKt.setAccessoryIcon(this.accessory, SpotifyIconV2.X);
                this.accessory.setContentDescription(getView().getResources().getString(R.string.library_row_dismiss_content_description));
            } else {
                LibraryRowBindingsKt.setAccessoryIcon(this.accessory, SpotifyIconV2.CHEVRON_RIGHT);
                this.accessory.setContentDescription(null);
            }
            this.dismissible = model.isDismissible();
        }
        ImageView imageView = this.binding.pinBadge;
        h.d(imageView, "binding.pinBadge");
        imageView.setVisibility(model.isPinned() ? 0 : 8);
        LibraryRowBindingsKt.renderDescription(this.binding, model.getDescription());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DefaultFolderRowLibrary(Activity activity, Picasso picasso) {
        this((Context) activity, picasso);
        h.e(activity, "activity");
        h.e(picasso, "picasso");
    }
}
