package defpackage;

import android.app.Activity;
import android.os.Build;
import androidx.fragment.app.Fragment;
import com.google.common.collect.Collections2;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;
import com.spotify.music.features.ads.api.SlotApi;
import com.spotify.music.features.ads.model.AdSlot;
import com.spotify.rxjava2.q;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: bv3  reason: default package */
public class bv3 {
    private final SlotApi a;
    private final w52 b;
    private final SnackbarManager c;
    private final q d = new q();

    public bv3(SlotApi slotApi, w52 w52, SnackbarManager snackbarManager) {
        this.a = slotApi;
        this.b = w52;
        this.c = snackbarManager;
    }

    public void a(AdSlot adSlot) {
        this.d.a(this.a.a(adSlot.toString(), SlotApi.Intent.CLEAR).subscribe(new su3(adSlot), new tu3(adSlot)));
    }

    public void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 23 && !this.b.f(activity, "android.permission.RECORD_AUDIO")) {
            this.b.c(activity, "android.permission.RECORD_AUDIO");
        }
    }

    public void c(Fragment fragment) {
        if (Build.VERSION.SDK_INT >= 23 && !this.b.f(fragment.F2(), "android.permission.RECORD_AUDIO")) {
            w52 w52 = this.b;
            HashSet newHashSetWithExpectedSize = Collections2.newHashSetWithExpectedSize(1);
            Collections.addAll(newHashSetWithExpectedSize, "android.permission.RECORD_AUDIO");
            w52.d(1, fragment, newHashSetWithExpectedSize);
        }
    }

    public void d(Fragment fragment, boolean z) {
        if (fragment.F2() != null) {
            SnackbarConfiguration.Builder builder = SnackbarConfiguration.builder(z ? C0707R.string.voice_permission_accepted_snackbar : C0707R.string.voice_permission_denied_snackbar);
            if (!z) {
                builder.actionTextRes(C0707R.string.settings_title).onClickListener(new ru3(fragment));
            }
            this.c.showOnNextAttach(builder.build());
        }
    }
}
