package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import com.spotify.glue.dialogs.f;
import com.spotify.glue.dialogs.g;
import com.spotify.music.C0707R;
import defpackage.ce0;
import defpackage.ge0;
import defpackage.ie0;
import defpackage.je0;

/* renamed from: xd0  reason: default package */
public class xd0 {
    private final g a;
    private final Context b;
    private final ae0 c;

    public xd0(g gVar, Context context, ae0 ae0) {
        this.a = gVar;
        this.b = context;
        this.c = ae0;
    }

    private void a(int i, String str, int i2, int i3, DialogInterface.OnClickListener onClickListener) {
        f fVar;
        if (str != null) {
            fVar = this.a.c(this.b.getString(i), str);
            fVar.f(this.b.getString(i2), onClickListener);
            fVar.a(false);
        } else {
            fVar = this.a.b(this.b.getString(i));
            fVar.f(this.b.getString(i2), onClickListener);
            fVar.a(false);
        }
        if (i3 != 0) {
            fVar.e(this.b.getString(i3), onClickListener);
        }
        fVar.b().a();
    }

    public void b(DialogInterface.OnClickListener onClickListener, he0 he0) {
        a(C0707R.string.facebook_error_email_exists_title, this.b.getString(C0707R.string.facebook_error_email_exists_body), C0707R.string.facebook_error_email_exists_login, C0707R.string.facebook_error_email_exists_close, onClickListener);
        this.c.a(new ce0.f(je0.c.b, he0, ie0.f.b, ""));
    }

    public void c(DialogInterface.OnClickListener onClickListener) {
        a(C0707R.string.google_error_dialog_email_already_exist_title, this.b.getString(C0707R.string.google_error_dialog_email_already_exist_body), C0707R.string.google_error_dialog_email_already_exist_login, C0707R.string.google_error_dialog_email_already_exist_dismiss, onClickListener);
        this.c.a(new ce0.e(je0.d.b, ge0.d.b));
    }

    public void d(DialogInterface.OnClickListener onClickListener) {
        a(C0707R.string.facebook_error_dialog_title, this.b.getString(C0707R.string.facebook_error_dialog_body), 17039370, 0, onClickListener);
        this.c.a(new ce0.e(je0.o.b, ge0.b.b));
    }

    public void e(DialogInterface.OnClickListener onClickListener) {
        a(C0707R.string.facebook_error_registration_disabled_title, this.b.getString(C0707R.string.facebook_error_registration_disabled_body), C0707R.string.facebook_error_registration_positive_button, C0707R.string.facebook_error_registration_negative_button, onClickListener);
        this.c.a(new ce0.e(je0.c.b, ge0.c.b));
    }

    public void f(DialogInterface.OnClickListener onClickListener) {
        a(C0707R.string.facebook_error_dialog_title, this.b.getString(C0707R.string.facebook_error_dialog_body), C0707R.string.google_error_dialog_positive_button, C0707R.string.google_error_dialog_negative_button, onClickListener);
        this.c.a(new ce0.e(je0.c.b, ge0.b.b));
    }

    public void g(je0 je0) {
        a(C0707R.string.error_dialog_no_network_title, this.b.getString(C0707R.string.error_dialog_no_network_body), 17039370, 0, null);
        this.c.a(new ce0.e(je0, ge0.f.b));
    }

    public void h() {
        a(C0707R.string.google_error_generic_title, null, 17039370, 0, null);
        this.c.a(new ce0.e(je0.o.b, ge0.d.b));
    }

    public void i(DialogInterface.OnClickListener onClickListener) {
        a(C0707R.string.google_error_dialog_title, this.b.getString(C0707R.string.google_error_dialog_body), C0707R.string.google_error_dialog_positive_button, C0707R.string.google_error_dialog_negative_button, onClickListener);
        this.c.a(new ce0.e(je0.d.b, ge0.e.b));
    }

    public void j(je0 je0) {
        a(C0707R.string.choose_username_alert_no_internet_connection_title, this.b.getString(C0707R.string.choose_username_alert_no_internet_connection_message), C0707R.string.choose_username_alert_close, 0, null);
        this.c.a(new ce0.e(je0, ge0.f.b));
    }

    public void k(DialogInterface.OnClickListener onClickListener, je0 je0) {
        a(C0707R.string.error_dialog_no_network_title, this.b.getString(C0707R.string.error_dialog_no_network_body), C0707R.string.choose_username_alert_retry, C0707R.string.choose_username_alert_close, onClickListener);
        this.c.a(new ce0.e(je0, ge0.f.b));
    }

    public void l() {
        a(C0707R.string.choose_username_alert_title, this.b.getString(C0707R.string.choose_username_alert_unknown), C0707R.string.choose_username_alert_close, 0, null);
    }
}
