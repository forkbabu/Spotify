package com.spotify.music.carmodehome.shortcuts;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.spotify.paste.widgets.layouts.PasteConstraintLayout;
import kotlin.jvm.internal.h;

public final class HomeShortcutsGridItemCardView extends PasteConstraintLayout {
    private final ImageView o;
    private final TextView p;

    public HomeShortcutsGridItemCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final ImageView getImageView$apps_music_features_car_mode_home() {
        return this.o;
    }

    public final TextView getTitleView$apps_music_features_car_mode_home() {
        return this.p;
    }

    public final void setTitle(CharSequence charSequence) {
        h.e(charSequence, "titleText");
        this.p.setText(charSequence);
    }

    public final void setTitleActive(boolean z) {
        setActivated(z);
    }

    public final void setTitleCentered(boolean z) {
        this.p.setGravity(z ? 17 : 8388611);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeShortcutsGridItemCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        LayoutInflater.from(context).inflate(C0707R.layout.home_shortcuts_grid_item_card, this);
        View findViewById = findViewById(C0707R.id.shortcuts_item_image);
        h.d(findViewById, "findViewById(R.id.shortcuts_item_image)");
        ImageView imageView = (ImageView) findViewById;
        this.o = imageView;
        View findViewById2 = findViewById(C0707R.id.shortcuts_item_title);
        h.d(findViewById2, "findViewById(R.id.shortcuts_item_title)");
        TextView textView = (TextView) findViewById2;
        this.p = textView;
        setClickable(true);
        bvd c = dvd.c(this);
        c.g(textView);
        c.f(imageView);
        c.a();
    }
}
