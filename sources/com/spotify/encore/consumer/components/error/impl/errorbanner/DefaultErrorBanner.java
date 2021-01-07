package com.spotify.encore.consumer.components.error.impl.errorbanner;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.consumer.components.error.api.errorbanner.ErrorBanner;
import com.spotify.encore.consumer.components.error.impl.R;
import com.spotify.encore.consumer.components.error.impl.databinding.ErrorBannerLayoutBinding;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultErrorBanner implements ErrorBanner {
    private final ErrorBannerLayoutBinding binding;
    private final SpotifyIconDrawable drawable;

    public DefaultErrorBanner(Activity activity) {
        h.e(activity, "activity");
        ErrorBannerLayoutBinding inflate = ErrorBannerLayoutBinding.inflate(LayoutInflater.from(activity));
        h.d(inflate, "it");
        ConstraintLayout root = inflate.getRoot();
        h.d(root, "it.root");
        root.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        h.d(inflate, "ErrorBannerLayoutBinding…P_CONTENT\n        )\n    }");
        this.binding = inflate;
        this.drawable = createCloseIcon(activity);
        bvd a = dvd.a(inflate.btnClose);
        a.f(inflate.btnClose);
        a.a();
    }

    private final SpotifyIconDrawable createCloseIcon(Activity activity) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(activity, SpotifyIconV2.X, activity.getResources().getDimension(R.dimen.close_icon_size));
        spotifyIconDrawable.r(a.b(activity, com.spotify.encore.foundation.R.color.gray_10));
        return spotifyIconDrawable;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        ConstraintLayout root = this.binding.getRoot();
        h.d(root, "binding.root");
        return root;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super ErrorBanner.Events, f> nmf) {
        h.e(nmf, "event");
        this.binding.btnAction.setOnClickListener(new DefaultErrorBanner$onEvent$1(nmf));
        this.binding.btnClose.setOnClickListener(new DefaultErrorBanner$onEvent$2(nmf));
    }

    public void render(ErrorBanner.Model model) {
        h.e(model, "model");
        TextView textView = this.binding.txtTitle;
        h.d(textView, "binding.txtTitle");
        textView.setText(model.getTitle());
        TextView textView2 = this.binding.txtContent;
        h.d(textView2, "binding.txtContent");
        textView2.setText(model.getContent());
        if (model.getButtonTitle().length() > 0) {
            Button button = this.binding.btnAction;
            h.d(button, "binding.btnAction");
            button.setText(model.getButtonTitle());
            Button button2 = this.binding.btnAction;
            h.d(button2, "binding.btnAction");
            button2.setVisibility(0);
        }
        if (model.isCloseable()) {
            ImageButton imageButton = this.binding.btnClose;
            h.d(imageButton, "binding.btnClose");
            imageButton.setVisibility(0);
            this.binding.btnClose.setImageDrawable(this.drawable);
        }
    }
}
