package com.spotify.encore.consumer.components.promo.impl.promocard;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.encore.consumer.components.promo.api.promocard.PromoCardHome;
import com.spotify.encore.consumer.components.promo.impl.R;
import com.spotify.encore.consumer.components.promo.impl.databinding.PromoCardHomeLayoutBinding;
import com.spotify.encore.consumer.components.promo.impl.promocard.drawables.BitmapGradientDrawable;
import com.spotify.encore.consumer.components.promo.impl.promocard.drawables.PlayButtonDrawable;
import com.spotify.encore.consumer.components.promo.impl.promocard.elements.PlayButtonView;
import com.spotify.encore.mobile.utils.roundedcorner.RoundedCornerTreatment;
import com.squareup.picasso.Picasso;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultPromoCardHome implements PromoCardHome {
    private final BitmapGradientDrawable backgroundDrawable;
    private final PromoCardHomeLayoutBinding binding;
    private final Context context;
    private final DefaultPromoCardHome$imageLoadTarget$1 imageLoadTarget = new DefaultPromoCardHome$imageLoadTarget$1(this);
    private final Picasso picasso;

    public DefaultPromoCardHome(Context context2, Picasso picasso2) {
        h.e(context2, "context");
        h.e(picasso2, "picasso");
        this.context = context2;
        this.picasso = picasso2;
        PromoCardHomeLayoutBinding inflate = PromoCardHomeLayoutBinding.inflate(LayoutInflater.from(context2));
        h.d(inflate, "it");
        PromoCardHomeViewBindingsKt.init(inflate);
        h.d(inflate, "PromoCardHomeLayoutBindi…{\n        it.init()\n    }");
        this.binding = inflate;
        this.backgroundDrawable = new BitmapGradientDrawable(context2);
    }

    private final void loadBackgroundImage(String str) {
        Picasso picasso2 = this.picasso;
        Uri parse = Uri.parse(str);
        h.b(parse, "Uri.parse(this)");
        picasso2.l(parse).o(this.imageLoadTarget);
    }

    /* access modifiers changed from: private */
    public final void setBackgroundImage(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        if (!bitmap.isRecycled()) {
            this.backgroundDrawable.setImage(bitmap, loadedFrom != Picasso.LoadedFrom.MEMORY);
            if (!bitmap.isRecycled()) {
                this.binding.backgroundImage.setImageDrawable(this.backgroundDrawable);
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final void setColorOfTitleAndPlayButton(int i) {
        this.binding.title.setTextColor(i);
        PlayButtonDrawable playButtonDrawable = new PlayButtonDrawable(this.context, i);
        PlayButtonView playButtonView = this.binding.playButton;
        int i2 = q4.g;
        int i3 = Build.VERSION.SDK_INT;
        playButtonView.setBackground(playButtonDrawable);
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        FrameLayout root = this.binding.getRoot();
        h.d(root, "binding.root");
        return root;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super PromoCardHome.Events, f> nmf) {
        h.e(nmf, "event");
        getView().setOnClickListener(new DefaultPromoCardHome$onEvent$1(nmf));
        this.binding.playButton.onEvent(new DefaultPromoCardHome$onEvent$2(nmf));
    }

    public void render(PromoCardHome.Model model) {
        h.e(model, "model");
        RoundedCornerTreatment.Companion companion = RoundedCornerTreatment.Companion;
        ImageView imageView = this.binding.backgroundImage;
        h.d(imageView, "binding.backgroundImage");
        companion.create(imageView, (float) this.context.getResources().getDimensionPixelSize(R.dimen.home_promotion_background_corner_radius));
        TextView textView = this.binding.label;
        h.d(textView, "binding.label");
        textView.setText(model.getLabel());
        TextView textView2 = this.binding.title;
        h.d(textView2, "binding.title");
        int i = 8;
        textView2.setVisibility(8);
        ImageView imageView2 = this.binding.logo;
        h.d(imageView2, "binding.logo");
        imageView2.setVisibility(8);
        PromoCardHome.Headline headline = model.getHeadline();
        if (headline instanceof PromoCardHome.Headline.Logo) {
            Picasso picasso2 = this.picasso;
            Uri parse = Uri.parse(((PromoCardHome.Headline.Logo) headline).getLogoImageUri());
            h.b(parse, "Uri.parse(this)");
            picasso2.l(parse).n(this.binding.logo, new DefaultPromoCardHome$render$1(this, headline));
        } else if (headline instanceof PromoCardHome.Headline.Text) {
            ImageView imageView3 = this.binding.logo;
            h.d(imageView3, "binding.logo");
            imageView3.setVisibility(8);
            TextView textView3 = this.binding.title;
            h.d(textView3, "binding.title");
            textView3.setVisibility(0);
            TextView textView4 = this.binding.title;
            h.d(textView4, "binding.title");
            textView4.setText(((PromoCardHome.Headline.Text) headline).getTitle());
        }
        TextView textView5 = this.binding.subtitle;
        h.d(textView5, "binding.subtitle");
        textView5.setText(model.getSubTitle());
        this.binding.backgroundImage.setImageDrawable(this.backgroundDrawable);
        PlayButtonView playButtonView = this.binding.playButton;
        h.d(playButtonView, "binding.playButton");
        if (model.isPlayable()) {
            i = 0;
        }
        playButtonView.setVisibility(i);
        this.binding.playButton.render(model.isPlaying());
        setColorOfTitleAndPlayButton(model.getAccentColor());
        loadBackgroundImage(model.getBackgroundImageUri());
    }
}
