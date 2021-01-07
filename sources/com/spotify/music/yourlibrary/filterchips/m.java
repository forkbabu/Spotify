package com.spotify.music.yourlibrary.filterchips;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.yourlibrary.filterchips.q;
import com.spotify.paste.graphics.drawable.c;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* access modifiers changed from: package-private */
public class m {
    private final CheckBox a;
    private final AppCompatImageButton b;
    private final LinearLayout c;
    private q.a d;

    m(Context context) {
        LinearLayout a2 = j.a(context);
        this.c = a2;
        AppCompatImageButton appCompatImageButton = new AppCompatImageButton(context);
        ColorStateList c2 = a.c(context, R.color.white);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.X, (float) nud.g(16.0f, context.getResources()));
        spotifyIconDrawable.s(c2);
        c cVar = new c(spotifyIconDrawable, 0.5714286f);
        cVar.f((float) nud.g(1.0f, context.getResources()));
        cVar.e(a.c(context, R.color.gray_50));
        appCompatImageButton.setBackgroundResource(0);
        appCompatImageButton.setImageDrawable(new u(cVar, a.b(context, R.color.black_30)));
        appCompatImageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int g = nud.g(10.0f, context.getResources());
        appCompatImageButton.setPadding(g, g, g, g);
        int g2 = nud.g(48.0f, context.getResources());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(g2, g2);
        layoutParams.setMargins(nud.g(6.0f, context.getResources()), 0, nud.g(2.0f, context.getResources()), 0);
        appCompatImageButton.setLayoutParams(layoutParams);
        this.b = appCompatImageButton;
        a2.addView(appCompatImageButton);
        CheckBox b2 = j.b(a2, "", "");
        this.a = b2;
        a2.addView(b2);
    }

    /* access modifiers changed from: package-private */
    public ViewGroup a() {
        return this.c;
    }

    public void b(int i, CompoundButton compoundButton, boolean z) {
        if (this.d != null && !compoundButton.isChecked()) {
            q.a aVar = this.d;
            ((FilterChipsView) ((f) aVar).a).d(compoundButton.getTag().toString(), compoundButton.getText().toString(), false, i);
        }
    }

    /* access modifiers changed from: package-private */
    public void c(q.a aVar) {
        this.d = aVar;
    }

    /* access modifiers changed from: package-private */
    public void d(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }

    /* access modifiers changed from: package-private */
    public void e(int i) {
        this.b.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    public void f(l lVar, int i) {
        String b2 = lVar.b();
        this.a.setText(lVar.d());
        this.a.setTag(b2);
        this.a.setChecked(true);
        j.c(this.a, b2);
        this.a.setOnCheckedChangeListener(new a(this, i));
        this.b.setVisibility(0);
    }
}
