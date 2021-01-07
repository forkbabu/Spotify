package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.spotify.libs.onboarding.allboarding.AllBoardingActivity;
import com.spotify.libs.onboarding.allboarding.EntryPoint;
import com.spotify.music.features.tasteonboarding.TasteOnboardingActivity;
import com.spotify.remoteconfig.AndroidFeatureAllboardingProperties;
import kotlin.jvm.internal.h;

/* renamed from: kv5  reason: default package */
public final class kv5 {
    private final AndroidFeatureAllboardingProperties a;

    public kv5(AndroidFeatureAllboardingProperties androidFeatureAllboardingProperties) {
        h.e(androidFeatureAllboardingProperties, "allboardingProperties");
        this.a = androidFeatureAllboardingProperties;
    }

    public final Intent a(Activity activity, boolean z) {
        h.e(activity, "act");
        AndroidFeatureAllboardingProperties.EnableAllboarding a2 = this.a.a();
        if (a2 != null && a2.ordinal() == 0) {
            return AllBoardingActivity.C.a(activity, EntryPoint.b);
        }
        Intent U0 = TasteOnboardingActivity.U0(activity, z);
        h.d(U0, "TasteOnboardingActivity.…Intent(act, isUpdateMode)");
        return U0;
    }

    public final Intent b(Activity activity) {
        h.e(activity, "act");
        AndroidFeatureAllboardingProperties.EnableAllboarding a2 = this.a.a();
        if (a2 != null && a2.ordinal() == 0) {
            return AllBoardingActivity.C.a(activity, EntryPoint.c);
        }
        Intent U0 = TasteOnboardingActivity.U0(activity, true);
        h.d(U0, "TasteOnboardingActivity.createIntent(act, true)");
        return U0;
    }
}
