package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.ui.activity.upsell.TrialActivationService;

/* renamed from: zz1  reason: default package */
public class zz1 {
    private final Context a;

    public zz1(Context context) {
        this.a = context;
    }

    public void a() {
        Context context = this.a;
        int i = TrialActivationService.t;
        context.startService(new Intent(context, TrialActivationService.class));
    }
}
