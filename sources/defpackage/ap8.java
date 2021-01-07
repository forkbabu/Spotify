package defpackage;

import android.view.View;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;

/* renamed from: ap8  reason: default package */
public final /* synthetic */ class ap8 implements View.OnClickListener {
    public final /* synthetic */ fp8 a;
    public final /* synthetic */ TasteOnboardingItem b;

    public /* synthetic */ ap8(fp8 fp8, TasteOnboardingItem tasteOnboardingItem) {
        this.a = fp8;
        this.b = tasteOnboardingItem;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.u0(this.b, view);
    }
}
