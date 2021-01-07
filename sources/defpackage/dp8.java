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

/* renamed from: dp8  reason: default package */
public class dp8 extends ep8 {
    private final ImageView C;
    private final TextView D;
    private final TextView E;
    private final e.a<TasteOnboardingItem> F;
    private final zvd G;
    private final int H = this.a.getResources().getDimensionPixelSize(C0707R.dimen.free_tier_taste_onboarding_artist_search_image_size);

    public dp8(y90 y90, e.a<TasteOnboardingItem> aVar, zvd zvd) {
        super(y90.getView());
        this.F = aVar;
        zvd.getClass();
        this.G = zvd;
        ImageView imageView = y90.getImageView();
        imageView.getClass();
        this.C = imageView;
        TextView titleView = y90.getTitleView();
        titleView.getClass();
        this.D = titleView;
        TextView subtitleView = y90.getSubtitleView();
        subtitleView.getClass();
        this.E = subtitleView;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e
    public void h0(TasteOnboardingItem tasteOnboardingItem, int i) {
        TasteOnboardingItem tasteOnboardingItem2 = tasteOnboardingItem;
        this.D.setText(tasteOnboardingItem2.name());
        c.n(this.D, R.style.TextAppearance_Encore_Ballad);
        this.E.setText(tasteOnboardingItem2.relatedMedia());
        this.a.setOnClickListener(new zo8(this, tasteOnboardingItem2));
        z e = this.G.e(tasteOnboardingItem2.findSuitableImage(this.H));
        e.t(yc0.a(this.a.getContext()));
        int i2 = this.H;
        e.u(i2, i2);
        e.a();
        e.r();
        e.o(rwd.c(this.C));
    }

    public /* synthetic */ void u0(TasteOnboardingItem tasteOnboardingItem, View view) {
        this.F.c(w(), view, tasteOnboardingItem);
    }
}
