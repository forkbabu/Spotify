package com.spotify.music.libs.search.transition;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.a;
import com.spotify.android.paste.app.c;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.libs.search.view.k;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public class FindSearchFieldViewOldImpl extends FrameLayout implements f {
    private float a;
    private final TextView b;
    private final k c;
    private final nvd f;

    public FindSearchFieldViewOldImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        int b2 = a.b(context, R.color.white);
        this.f = ovd.d(b2, s2.e(a.b(context, C0707R.color.cat_grayscale_55_40), a.b(context, R.color.gray_15)));
        setLayoutParams(new LinearLayout.LayoutParams(-1, nud.g(56.0f, resources), 1.0f));
        int f2 = nud.f(4.0f, resources);
        k kVar = new k(f2, f2, f2, b2);
        this.c = kVar;
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        setBackground(kVar);
        vc0.b(this);
        TextView f3 = c.f(context);
        this.b = f3;
        f3.setId(C0707R.id.find_search_field_text);
        nud.p(context, f3, C0707R.attr.pasteTextAppearanceArticleLead);
        f3.setTextColor(a.b(context, R.color.gray_25));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        int i3 = f2 * 2;
        layoutParams.setMargins(i3, 0, i3, 0);
        f3.setLayoutParams(layoutParams);
        f3.setGravity(17);
        f3.setEllipsize(TextUtils.TruncateAt.END);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.SEARCH, resources.getDimension(C0707R.dimen.actionbar_search_drawables_size));
        spotifyIconDrawable.r(a.b(context, R.color.black_90));
        f3.setCompoundDrawablesWithIntrinsicBounds(spotifyIconDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
        f3.setCompoundDrawablePadding(resources.getDimensionPixelSize(C0707R.dimen.actionbar_search_drawables_padding));
        f3.setMaxLines(1);
        addView(f3);
        setId(C0707R.id.find_search_field);
    }

    @Override // com.spotify.music.libs.search.transition.f
    public String getAccessibilityText() {
        if (this.b.getContentDescription() != null) {
            return this.b.getContentDescription().toString();
        }
        return getText();
    }

    @Override // com.spotify.music.libs.search.transition.f
    public float getFraction() {
        return this.a;
    }

    @Override // com.spotify.music.libs.search.transition.f
    public String getText() {
        return this.b.getText().toString();
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this;
    }

    @Override // com.spotify.music.libs.search.transition.f
    public void setAccessibilityText(String str) {
        this.b.setContentDescription(str);
    }

    @Override // com.spotify.music.libs.search.transition.f
    public void setFraction(float f2) {
        float b2 = nud.b(f2);
        this.a = b2;
        this.c.setLevel((int) (b2 * 255.0f));
        this.b.setAlpha(1.0f - f2);
        this.c.a(this.f.a(f2));
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        postInvalidateOnAnimation();
    }

    @Override // com.spotify.music.libs.search.transition.f
    public void setSecondaryButton(View view) {
    }

    @Override // com.spotify.music.libs.search.transition.f
    public void setText(String str) {
        this.b.setText(str);
    }
}
