package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.c;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import com.spotify.music.C0707R;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import com.squareup.picasso.z;

/* renamed from: fp8  reason: default package */
public class fp8 extends ep8 {
    private final ImageView C;
    private final TextView D;
    private final e.a<TasteOnboardingItem> E;
    private final zvd F;
    private final int G = this.a.getResources().getDimensionPixelSize(C0707R.dimen.free_tier_taste_onboarding_artist_search_image_size);

    public fp8(u90 u90, e.a<TasteOnboardingItem> aVar, zvd zvd) {
        super(u90.getView());
        this.E = aVar;
        zvd.getClass();
        this.F = zvd;
        ImageView imageView = u90.getImageView();
        imageView.getClass();
        this.C = imageView;
        TextView Z = u90.Z();
        Z.getClass();
        this.D = Z;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e
    public void h0(TasteOnboardingItem tasteOnboardingItem, int i) {
        TasteOnboardingItem tasteOnboardingItem2 = tasteOnboardingItem;
        this.D.setText(tasteOnboardingItem2.name());
        c.n(this.D, R.style.TextAppearance_Encore_Ballad);
        this.a.setOnClickListener(new ap8(this, tasteOnboardingItem2));
        z e = this.F.e(tasteOnboardingItem2.findSuitableImage(this.G));
        e.t(yc0.a(this.a.getContext()));
        int i2 = this.G;
        e.u(i2, i2);
        e.a();
        e.r();
        e.o(rwd.c(this.C));
    }

    public /* synthetic */ void u0(TasteOnboardingItem tasteOnboardingItem, View view) {
        this.E.c(w(), view, tasteOnboardingItem);
    }
}
