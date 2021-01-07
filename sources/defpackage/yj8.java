package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.glue.dialogs.f;
import com.spotify.glue.dialogs.m;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;

/* access modifiers changed from: package-private */
/* renamed from: yj8  reason: default package */
public class yj8 {
    private final Context a;
    private final jz1 b;
    private final cqe c;
    private final nsb d;

    yj8(Context context, jz1 jz1, cqe cqe, nsb nsb) {
        this.a = context;
        this.b = jz1;
        this.c = cqe;
        this.d = nsb;
    }

    private void c(String str) {
        this.b.a(new fa1(null, kfd.R.getName(), ViewUris.c0.toString(), null, 0, null, "hit", str, (double) this.c.d()));
    }

    public /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        c("car-view-always-on-not-now");
    }

    public /* synthetic */ void b(DialogInterface dialogInterface, int i) {
        c("car-view-always-on-launch-car-view");
        this.d.a();
    }

    /* access modifiers changed from: package-private */
    public void d() {
        Context context = this.a;
        f a2 = m.a(context, "", context.getString(C0707R.string.settings_driving_mode_always_on_popup_title), SpotifyIconV2.DEVICE_CAR);
        a2.e(this.a.getString(C0707R.string.settings_driving_mode_always_on_popup_negative_button), new uj8(this));
        a2.f(this.a.getString(C0707R.string.settings_driving_mode_always_on_popup_positive_button), new vj8(this));
        a2.b().a();
    }
}
