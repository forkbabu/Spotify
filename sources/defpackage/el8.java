package defpackage;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import com.spotify.music.C0707R;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;

/* renamed from: el8  reason: default package */
public class el8 extends e<TasteOnboardingItem> {
    private final e.a<TasteOnboardingItem> C;
    private final ImageView D;
    private final ImageView E;
    private final TextView F;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    el8(int r1, android.view.ViewGroup r2, com.spotify.mobile.android.spotlets.common.recyclerview.e.a<com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem> r3) {
        /*
            r0 = this;
            android.view.View r1 = com.spotify.mobile.android.spotlets.common.recyclerview.e.j0(r1, r2)
            r0.<init>(r1)
            r0.C = r3
            r2 = 2131430090(0x7f0b0aca, float:1.8481871E38)
            android.view.View r1 = r1.findViewById(r2)
            r1.getClass()
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.D = r1
            android.view.View r1 = r0.a
            r2 = 2131430563(0x7f0b0ca3, float:1.848283E38)
            android.view.View r1 = r1.findViewById(r2)
            r1.getClass()
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.F = r1
            android.view.View r1 = r0.a
            r2 = 2131428519(0x7f0b04a7, float:1.8478685E38)
            android.view.View r1 = r1.findViewById(r2)
            r1.getClass()
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.E = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.el8.<init>(int, android.view.ViewGroup, com.spotify.mobile.android.spotlets.common.recyclerview.e$a):void");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e
    public void h0(TasteOnboardingItem tasteOnboardingItem, int i) {
        int i2;
        TasteOnboardingItem tasteOnboardingItem2 = tasteOnboardingItem;
        Drawable drawable = this.a.getContext().getResources().getDrawable(C0707R.drawable.taste_onboarding_genre_background);
        String color = tasteOnboardingItem2.color();
        if (!TextUtils.isEmpty(color)) {
            try {
                i2 = Color.parseColor(color);
            } catch (IllegalArgumentException e) {
                Logger.e(e, "Failed to parse the genre color. Falling back to the default color", new Object[0]);
            }
            drawable.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
            this.E.setVisibility(0);
            this.E.setImageDrawable(drawable);
            this.D.setVisibility(8);
            this.F.setText(this.a.getResources().getString(C0707R.string.free_tier_taste_onboarding_artist_picker_genre_more_sthlm_blk, tasteOnboardingItem2.name()));
            this.a.setOnClickListener(new bl8(this, tasteOnboardingItem2));
        }
        i2 = this.a.getResources().getColor(C0707R.color.genre_default_color);
        drawable.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
        this.E.setVisibility(0);
        this.E.setImageDrawable(drawable);
        this.D.setVisibility(8);
        this.F.setText(this.a.getResources().getString(C0707R.string.free_tier_taste_onboarding_artist_picker_genre_more_sthlm_blk, tasteOnboardingItem2.name()));
        this.a.setOnClickListener(new bl8(this, tasteOnboardingItem2));
    }

    public /* synthetic */ void u0(TasteOnboardingItem tasteOnboardingItem, View view) {
        int w = w();
        e.a<TasteOnboardingItem> aVar = this.C;
        if (aVar != null && w != -1) {
            aVar.c(w, this.a, tasteOnboardingItem);
        }
    }
}
