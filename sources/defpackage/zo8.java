package defpackage;

import android.view.View;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;

/* renamed from: zo8  reason: default package */
public final /* synthetic */ class zo8 implements View.OnClickListener {
    public final /* synthetic */ dp8 a;
    public final /* synthetic */ TasteOnboardingItem b;

    public /* synthetic */ zo8(dp8 dp8, TasteOnboardingItem tasteOnboardingItem) {
        this.a = dp8;
        this.b = tasteOnboardingItem;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.u0(this.b, view);
    }
}
