package defpackage;

import android.view.View;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;

/* renamed from: al8  reason: default package */
public final /* synthetic */ class al8 implements View.OnClickListener {
    public final /* synthetic */ dl8 a;
    public final /* synthetic */ TasteOnboardingItem b;

    public /* synthetic */ al8(dl8 dl8, TasteOnboardingItem tasteOnboardingItem) {
        this.a = dl8;
        this.b = tasteOnboardingItem;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.u0(this.b, view);
    }
}
