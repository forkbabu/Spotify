package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import com.spotify.glue.dialogs.f;
import com.spotify.glue.dialogs.m;
import com.spotify.music.C0707R;
import com.spotify.music.features.profile.editprofile.p;
import defpackage.kn7;
import defpackage.lm7;
import java.util.ArrayList;

/* renamed from: po7  reason: default package */
public class po7 {
    private final Context a;
    private final hn7 b;
    private final p c;

    public po7(Context context, hn7 hn7, p pVar) {
        this.a = context;
        this.b = hn7;
        this.c = pVar;
    }

    public /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        this.c.b();
        this.b.accept(lm7.b.a);
    }

    public /* synthetic */ void b(DialogInterface dialogInterface, int i) {
        this.c.a();
        this.b.accept(lm7.a.a);
    }

    public /* synthetic */ void c(kl7 kl7, DialogInterface dialogInterface, int i) {
        int c2 = kl7.a(i).c();
        if (c2 == C0707R.id.edit_profile_change_photo_dialog_choose_photo_item) {
            this.b.accept(lm7.g.a);
            this.c.d();
        } else if (c2 == C0707R.id.edit_profile_change_photo_dialog_take_photo_item) {
            this.b.accept(lm7.w.a);
            this.c.w();
        } else if (c2 == C0707R.id.edit_profile_change_photo_dialog_remove_current_photo_item) {
            this.b.accept(lm7.s.a);
            this.c.s();
        }
    }

    public /* synthetic */ void d(DialogInterface dialogInterface, int i) {
        this.c.r();
        this.b.accept(lm7.h.a);
    }

    public /* synthetic */ void e(DialogInterface dialogInterface, int i) {
        this.c.g();
        this.b.accept(lm7.j.a);
    }

    public /* synthetic */ void f(DialogInterface dialogInterface, int i) {
        this.c.j();
        this.b.accept(lm7.p.a);
    }

    public /* synthetic */ void g(DialogInterface dialogInterface, int i) {
        this.c.i();
        this.b.accept(lm7.o.a);
    }

    public void h() {
        new AlertDialog.Builder(this.a, 5).setTitle(C0707R.string.edit_profile_camera_access_denied_dialog_title).setMessage(C0707R.string.edit_profile_camera_access_denied_dialog_subtitle).setPositiveButton(C0707R.string.edit_profile_access_denied_dialog_settings_button, new rn7(this)).setNegativeButton(C0707R.string.edit_profile_access_denied_dialog_cancel_button, new vn7(this)).show();
    }

    public void i(boolean z) {
        kn7.a a2 = kn7.a();
        boolean z2 = false;
        ArrayList arrayList = new ArrayList(0);
        a2.d(this.a.getString(C0707R.string.edit_profile_change_photo_dialog_option_choose_photo));
        a2.b(true);
        a2.c(C0707R.id.edit_profile_change_photo_dialog_choose_photo_item);
        arrayList.add(a2.a());
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (Build.VERSION.SDK_INT >= 23 && intent.resolveActivity(this.a.getPackageManager()) != null) {
            z2 = true;
        }
        if (z2) {
            a2.d(this.a.getString(C0707R.string.edit_profile_change_photo_dialog_option_take_photo));
            a2.b(true);
            a2.c(C0707R.id.edit_profile_change_photo_dialog_take_photo_item);
            arrayList.add(a2.a());
        }
        a2.d(this.a.getString(C0707R.string.edit_profile_change_photo_dialog_option_remove_current_photo));
        a2.b(z);
        a2.c(C0707R.id.edit_profile_change_photo_dialog_remove_current_photo_item);
        arrayList.add(a2.a());
        AlertDialog.Builder builder = new AlertDialog.Builder(this.a, 5);
        builder.setTitle(this.a.getString(C0707R.string.edit_profile_change_photo_dialog_title));
        kl7 kl7 = new kl7(arrayList, this.a);
        builder.setAdapter(kl7, new wn7(this, kl7));
        builder.show();
    }

    public void j() {
        Context context = this.a;
        f c2 = m.c(context, context.getString(C0707R.string.edit_profile_close_confirmation_dialog_title), this.a.getString(C0707R.string.edit_profile_close_confirmation_dialog_subtitle));
        c2.f(this.a.getString(C0707R.string.edit_profile_close_confirmation_dialog_keep_editing_button), new un7(this));
        c2.e(this.a.getString(C0707R.string.edit_profile_close_confirmation_dialog_discard_button), new tn7(this));
        c2.b().a();
    }

    public void k() {
        new AlertDialog.Builder(this.a, 5).setTitle(C0707R.string.edit_profile_photos_access_denied_dialog_title).setMessage(C0707R.string.edit_profile_photos_access_denied_dialog_subtitle).setPositiveButton(C0707R.string.edit_profile_access_denied_dialog_settings_button, new sn7(this)).setNegativeButton(C0707R.string.edit_profile_access_denied_dialog_cancel_button, new qn7(this)).show();
    }
}
