package com.spotify.music.features.languagepicker;

import android.content.Context;
import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;

public class b implements blb {
    private final Context a;

    public b(Context context) {
        this.a = context;
    }

    public Intent a(Intent intent, c cVar) {
        if (cVar.j2(s9c.c)) {
            Context context = this.a;
            s52 a2 = t52.a(LinkType.TASTE_ONBOARDING);
            a2.getClass();
            String str = a2.b().get(0);
            int i = LanguageOnboardingActivity.H;
            Intent intent2 = new Intent(context, LanguageOnboardingActivity.class);
            if (str == null) {
                return intent2;
            }
            intent2.putExtra("chained_uri", str);
            return intent2;
        }
        Assertion.g("This user shouldn't get language-aware onboarding");
        return null;
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        ((xkb) glb).h(LinkType.LANGUAGE_AWARE_ONBOARDING, "Redirect to language oboarding page", new a(this));
    }
}
