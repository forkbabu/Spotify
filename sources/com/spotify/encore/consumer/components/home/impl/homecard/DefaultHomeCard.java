package com.spotify.encore.consumer.components.home.impl.homecard;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import com.spotify.encore.consumer.components.home.api.homecard.HomeCard;
import com.spotify.encore.consumer.components.home.impl.databinding.HomeCardLayoutBinding;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import com.spotify.encore.foundation.R;
import com.squareup.picasso.Picasso;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultHomeCard implements HomeCard {
    private final TextView accessory;
    private final int accessoryInitialColor;
    private final ArtworkView artwork;
    private final HomeCardLayoutBinding binding;
    private final Drawable heartIcon;
    private final int highlightColor;
    private final TextView subTitle;
    private final TextView title;
    private final int whiteColor;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            HomeCard.Accessory.values();
            int[] iArr = new int[4];
            $EnumSwitchMapping$0 = iArr;
            HomeCard.Accessory accessory = HomeCard.Accessory.DOWNLOAD_ICON;
            iArr[0] = 1;
            HomeCard.Accessory accessory2 = HomeCard.Accessory.HEART_ICON;
            iArr[1] = 2;
            HomeCard.Accessory accessory3 = HomeCard.Accessory.HIGHLIGHT_TEXT;
            iArr[2] = 3;
            HomeCard.Accessory accessory4 = HomeCard.Accessory.WHITE_TEXT;
            iArr[3] = 4;
        }
    }

    public DefaultHomeCard(Context context, Picasso picasso) {
        h.e(context, "context");
        h.e(picasso, "picasso");
        HomeCardLayoutBinding inflate = HomeCardLayoutBinding.inflate(LayoutInflater.from(context));
        h.d(inflate, "HomeCardLayoutBinding.in…utInflater.from(context))");
        this.binding = inflate;
        TextView textView = inflate.title;
        h.d(textView, "binding.title");
        this.title = textView;
        TextView textView2 = inflate.subTitle;
        h.d(textView2, "binding.subTitle");
        this.subTitle = textView2;
        TextView textView3 = inflate.accessory;
        h.d(textView3, "binding.accessory");
        this.accessory = textView3;
        ArtworkView artworkView = inflate.image;
        artworkView.setViewContext(new ArtworkView.ViewContext(picasso));
        h.d(artworkView, "binding.image.also {\n   …ewContext(picasso))\n    }");
        this.artwork = artworkView;
        this.heartIcon = l70.e(context, 10);
        this.accessoryInitialColor = textView3.getCurrentTextColor();
        this.whiteColor = a.b(context, R.color.white);
        this.highlightColor = a.b(context, R.color.green);
        bvd b = dvd.b(getView());
        b.g(textView);
        b.g(textView2);
        b.g(textView3);
        b.f(artworkView);
        b.a();
    }

    private final void addDownloadIcon(TextView textView) {
        textView.setText(l70.n(textView.getText(), l70.b(textView.getContext())));
    }

    private static /* synthetic */ void getHeartIcon$annotations() {
    }

    private final void resetAccessory() {
        this.accessory.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        this.accessory.setTextColor(this.accessoryInitialColor);
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        ConstraintLayout root = this.binding.getRoot();
        h.d(root, "binding.root");
        return root;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super HomeCard.Events, f> nmf) {
        h.e(nmf, "event");
        getView().setOnClickListener(new DefaultHomeCard$onEvent$1(nmf));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void render(com.spotify.encore.consumer.components.home.api.homecard.HomeCard.Model r8) {
        /*
        // Method dump skipped, instructions count: 336
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.encore.consumer.components.home.impl.homecard.DefaultHomeCard.render(com.spotify.encore.consumer.components.home.api.homecard.HomeCard$Model):void");
    }
}
