package com.spotify.music.libs.search.transition;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.libs.search.view.k;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public class j implements f {
    private final View a;
    private final TextView b;
    private final ViewGroup c;
    private final k f;
    private final nvd n;
    private float o;

    public j(Context context) {
        Resources resources = context.getResources();
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.find_search_field_button, (ViewGroup) null);
        this.a = inflate;
        inflate.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        int g = nud.g(4.0f, resources);
        int g2 = nud.g(12.0f, resources);
        inflate.setPadding(g2, g, g2, g);
        TextView textView = (TextView) q4.G(inflate, C0707R.id.find_search_field_text);
        this.b = textView;
        ViewGroup viewGroup = (ViewGroup) q4.G(inflate, C0707R.id.secondary_button_container);
        this.c = viewGroup;
        int b2 = a.b(context, R.color.white);
        this.n = ovd.d(b2, s2.e(a.b(context, C0707R.color.cat_grayscale_55_40), a.b(context, R.color.gray_15)));
        int i = (int) (resources.getDisplayMetrics().density * 4.0f);
        k kVar = new k(i, i, i, b2);
        this.f = kVar;
        View G = q4.G(inflate, C0707R.id.background);
        int i2 = Build.VERSION.SDK_INT;
        G.setBackground(kVar);
        Resources resources2 = context.getResources();
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.SEARCH, resources2.getDimension(C0707R.dimen.search_icon_size));
        spotifyIconDrawable.r(a.b(context, R.color.black_90));
        textView.setCompoundDrawablesWithIntrinsicBounds(spotifyIconDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(resources2.getDimensionPixelSize(C0707R.dimen.search_drawables_padding));
        bvd c2 = dvd.c(inflate);
        c2.g(textView);
        c2.f(viewGroup);
        c2.a();
    }

    @Override // com.spotify.music.libs.search.transition.f
    public String getAccessibilityText() {
        if (this.b.getContentDescription() != null) {
            return this.b.getContentDescription().toString();
        }
        return this.b.getText().toString();
    }

    @Override // com.spotify.music.libs.search.transition.f
    public float getFraction() {
        return this.o;
    }

    @Override // com.spotify.music.libs.search.transition.f
    public String getText() {
        return this.b.getText().toString();
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    @Override // com.spotify.music.libs.search.transition.f
    public void setAccessibilityText(String str) {
        this.b.setContentDescription(str);
    }

    @Override // com.spotify.music.libs.search.transition.f
    public void setFraction(float f2) {
        float b2 = nud.b(f2);
        this.o = b2;
        this.f.setLevel((int) (b2 * 255.0f));
        this.b.setAlpha(1.0f - f2);
        this.f.a(this.n.a(f2));
        View view = this.a;
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        view.postInvalidateOnAnimation();
    }

    @Override // com.spotify.music.libs.search.transition.f
    public void setSecondaryButton(View view) {
        this.c.removeAllViews();
        this.c.addView(view);
        this.c.setVisibility(0);
    }

    @Override // com.spotify.music.libs.search.transition.f
    public void setText(String str) {
        this.b.setText(str);
    }
}
