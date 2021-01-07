package com.spotify.encore.consumer.components.promo.impl.promocard;

import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.encore.consumer.components.promo.api.promocard.PromoCardHome;
import com.squareup.picasso.g;
import kotlin.jvm.internal.h;

public final class DefaultPromoCardHome$render$1 implements g {
    final /* synthetic */ PromoCardHome.Headline $headline;
    final /* synthetic */ DefaultPromoCardHome this$0;

    DefaultPromoCardHome$render$1(DefaultPromoCardHome defaultPromoCardHome, PromoCardHome.Headline headline) {
        this.this$0 = defaultPromoCardHome;
        this.$headline = headline;
    }

    @Override // com.squareup.picasso.g
    public void onError(Exception exc) {
        ImageView imageView = this.this$0.binding.logo;
        h.d(imageView, "binding.logo");
        imageView.setVisibility(8);
        ImageView imageView2 = this.this$0.binding.logo;
        h.d(imageView2, "binding.logo");
        imageView2.setContentDescription("");
        TextView textView = this.this$0.binding.title;
        h.d(textView, "binding.title");
        textView.setVisibility(0);
        TextView textView2 = this.this$0.binding.title;
        h.d(textView2, "binding.title");
        textView2.setText(((PromoCardHome.Headline.Logo) this.$headline).getTitle());
    }

    @Override // com.squareup.picasso.g
    public void onSuccess() {
        ImageView imageView = this.this$0.binding.logo;
        h.d(imageView, "binding.logo");
        imageView.setContentDescription(((PromoCardHome.Headline.Logo) this.$headline).getTitle());
        ImageView imageView2 = this.this$0.binding.logo;
        h.d(imageView2, "binding.logo");
        imageView2.setVisibility(0);
        TextView textView = this.this$0.binding.title;
        h.d(textView, "binding.title");
        textView.setVisibility(8);
    }
}
