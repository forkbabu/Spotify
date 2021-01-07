package defpackage;

import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;
import com.spotify.music.onboarding.freetier.education.SkipLimitEducationPolicy;
import com.spotify.music.onboarding.freetier.education.a;
import kotlin.jvm.internal.h;

/* renamed from: o9c  reason: default package */
public final class o9c implements a {
    private final SnackbarManager a;
    private final SkipLimitEducationPolicy b;

    public o9c(SnackbarManager snackbarManager, SkipLimitEducationPolicy skipLimitEducationPolicy) {
        h.e(snackbarManager, "snackbarManager");
        h.e(skipLimitEducationPolicy, "skipLimitEducationPolicy");
        this.a = snackbarManager;
        this.b = skipLimitEducationPolicy;
    }

    @Override // com.spotify.music.onboarding.freetier.education.a
    public void a() {
        Integer num;
        int ordinal = this.b.a().ordinal();
        if (ordinal == 1) {
            num = Integer.valueOf((int) C0707R.string.freetier_education_toastie_skip_first);
        } else if (ordinal != 2) {
            num = null;
        } else {
            num = Integer.valueOf((int) C0707R.string.freetier_education_toastie_skip_too_fast);
        }
        if (num != null) {
            int intValue = num.intValue();
            SnackbarManager snackbarManager = this.a;
            SnackbarConfiguration build = SnackbarConfiguration.builder(intValue).build();
            h.d(build, "SnackbarConfiguration.builder(message).build()");
            snackbarManager.show(build);
        }
    }
}
