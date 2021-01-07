package defpackage;

import android.view.View;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;

/* renamed from: bl8  reason: default package */
public final /* synthetic */ class bl8 implements View.OnClickListener {
    public final /* synthetic */ el8 a;
    public final /* synthetic */ TasteOnboardingItem b;

    public /* synthetic */ bl8(el8 el8, TasteOnboardingItem tasteOnboardingItem) {
        this.a = el8;
        this.b = tasteOnboardingItem;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.u0(this.b, view);
    }
}
