package com.spotify.encore.consumer.components.yourlibrary.impl.searchheader;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.yourlibrary.api.searchheader.SearchHeaderLibrary;
import com.spotify.encore.consumer.components.yourlibrary.impl.databinding.LibrarySearchHeaderLayoutBinding;
import com.spotify.paste.spotifyicon.SpotifyIconView;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultSearchHeaderLibrary implements SearchHeaderLibrary {
    private final LibrarySearchHeaderLayoutBinding binding;

    public DefaultSearchHeaderLibrary(Context context) {
        h.e(context, "context");
        LibrarySearchHeaderLayoutBinding inflate = LibrarySearchHeaderLayoutBinding.inflate(LayoutInflater.from(context));
        h.d(inflate, "LibrarySearchHeaderLayou…utInflater.from(context))");
        this.binding = inflate;
        bvd a = dvd.a(inflate.iconBack);
        a.f(inflate.iconBack);
        a.a();
        bvd a2 = dvd.a(inflate.iconClearSearch);
        a2.f(inflate.iconClearSearch);
        a2.a();
    }

    /* access modifiers changed from: private */
    public final void updateClearIconVisibility(CharSequence charSequence) {
        SpotifyIconView spotifyIconView = this.binding.iconClearSearch;
        h.d(spotifyIconView, "binding.iconClearSearch");
        int i = 0;
        if (charSequence == null || charSequence.length() == 0) {
            i = 8;
        }
        spotifyIconView.setVisibility(i);
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        ConstraintLayout root = this.binding.getRoot();
        h.d(root, "binding.root");
        return root;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super SearchHeaderLibrary.Events, f> nmf) {
        h.e(nmf, "event");
        this.binding.editText.addTextChangedListener(new DefaultSearchHeaderLibrary$onEvent$1(this, nmf));
        this.binding.iconBack.setOnClickListener(new DefaultSearchHeaderLibrary$onEvent$2(nmf));
        this.binding.iconClearSearch.setOnClickListener(new DefaultSearchHeaderLibrary$onEvent$3(this, nmf));
    }

    public void render(SearchHeaderLibrary.Model model) {
        h.e(model, "model");
        this.binding.editText.setText(model.getSearchText());
        updateClearIconVisibility(model.getSearchText());
    }
}
