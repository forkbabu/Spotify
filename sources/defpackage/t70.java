package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.spotify.glue.dialogs.f;
import com.spotify.glue.dialogs.m;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
/* renamed from: t70  reason: default package */
public class t70 {
    private final Activity a;
    private final w70 b;
    private final u70 c;

    public t70(Activity activity, w70 w70, u70 u70) {
        this.a = activity;
        this.b = w70;
        this.c = u70;
    }

    public void a(DialogInterface dialogInterface, int i) {
        ((dk2) this.c).c();
    }

    public void b(DialogInterface dialogInterface, int i) {
        ((dk2) this.c).a();
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", this.a.getPackageName(), null));
        this.a.startActivity(intent);
    }

    public void c() {
        ((ek2) this.b).a();
    }

    public void d() {
        if (((ek2) this.b).c()) {
            ((ek2) this.b).b();
            Activity activity = this.a;
            f c2 = m.c(activity, activity.getString(C0707R.string.background_restriction_dialog_title), this.a.getString(C0707R.string.background_restriction_dialog_body));
            c2.e(this.a.getString(C0707R.string.background_restriction_button_not_now), new p70(this));
            c2.f(this.a.getString(C0707R.string.background_restriction_button_go_to_settings), new q70(this));
            c2.b().a();
            ((dk2) this.c).d();
            ((dk2) this.c).b();
        }
    }
}
