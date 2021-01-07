package com.spotify.music.sociallistening.dialogs.impl;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.spotify.glue.dialogs.m;
import com.spotify.music.C0707R;

public final class SocialListeningDialogsImpl implements u7d {
    private final Activity a;
    private final cfd b;
    private final x9d c;

    /* compiled from: java-style lambda group */
    static final class a implements DialogInterface.OnClickListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        public a(int i, Object obj) {
            this.a = i;
            this.b = obj;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            int i2 = this.a;
            if (i2 == 0) {
                ((cmf) this.b).invoke();
            } else if (i2 == 1) {
                ((cmf) this.b).invoke();
            } else {
                throw null;
            }
        }
    }

    /* compiled from: java-style lambda group */
    static final class b implements DialogInterface.OnClickListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        public b(int i, Object obj) {
            this.a = i;
            this.b = obj;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            int i2 = this.a;
            if (i2 == 0) {
                ((cmf) this.b).invoke();
            } else if (i2 == 1) {
                ((cmf) this.b).invoke();
            } else {
                throw null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements DialogInterface.OnClickListener {
        final /* synthetic */ cmf a;

        c(cmf cmf) {
            this.a = cmf;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            this.a.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements DialogInterface.OnDismissListener {
        final /* synthetic */ cmf a;

        d(cmf cmf) {
            this.a = cmf;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            this.a.invoke();
        }
    }

    static final class e implements DialogInterface.OnClickListener {
        public static final e a = new e();

        e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    static final class f implements DialogInterface.OnDismissListener {
        final /* synthetic */ SocialListeningDialogsImpl a;
        final /* synthetic */ String b;

        f(SocialListeningDialogsImpl socialListeningDialogsImpl, String str) {
            this.a = socialListeningDialogsImpl;
            this.b = str;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            this.a.c.g(this.b);
        }
    }

    static final class g implements RadioGroup.OnCheckedChangeListener {
        final /* synthetic */ SocialListeningDialogsImpl a;
        final /* synthetic */ String b;
        final /* synthetic */ Button c;

        g(SocialListeningDialogsImpl socialListeningDialogsImpl, String str, Button button) {
            this.a = socialListeningDialogsImpl;
            this.b = str;
            this.c = button;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public final void onCheckedChanged(RadioGroup radioGroup, int i) {
            if (i == C0707R.id.control_radio_button) {
                this.a.c.w(this.b);
            } else if (i == C0707R.id.listen_and_control_radio_button) {
                this.a.c.b(this.b);
            }
            Button button = this.c;
            kotlin.jvm.internal.h.d(button, "continueButton");
            button.setEnabled(true);
        }
    }

    static final class h implements View.OnClickListener {
        final /* synthetic */ RadioGroup a;
        final /* synthetic */ cmf b;
        final /* synthetic */ cmf c;
        final /* synthetic */ Dialog f;

        h(RadioGroup radioGroup, cmf cmf, cmf cmf2, Dialog dialog) {
            this.a = radioGroup;
            this.b = cmf;
            this.c = cmf2;
            this.f = dialog;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            RadioGroup radioGroup = this.a;
            kotlin.jvm.internal.h.d(radioGroup, "radioGroup");
            int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
            if (checkedRadioButtonId == C0707R.id.control_radio_button) {
                this.b.invoke();
            } else if (checkedRadioButtonId == C0707R.id.listen_and_control_radio_button) {
                this.c.invoke();
            }
            this.f.dismiss();
        }
    }

    public SocialListeningDialogsImpl(Activity activity, cfd cfd, x9d x9d) {
        kotlin.jvm.internal.h.e(activity, "activity");
        kotlin.jvm.internal.h.e(cfd, "properties");
        kotlin.jvm.internal.h.e(x9d, "socialListeningLogger");
        this.a = activity;
        this.b = cfd;
        this.c = x9d;
    }

    private final void k(String str, boolean z, cmf<kotlin.f> cmf) {
        Activity activity = this.a;
        com.spotify.glue.dialogs.f c2 = m.c(activity, str, activity.getString(z ? C0707R.string.social_listening_error_dialog_body_offline : C0707R.string.social_listening_error_dialog_body));
        c2.f(this.a.getString(C0707R.string.social_listening_error_dialog_dismiss_button), new c(cmf));
        c2.g(new d(cmf));
        c2.b().a();
    }

    @Override // defpackage.u7d
    public void a(boolean z) {
        i(z, SocialListeningDialogsImpl$showFailedToJoinSessionDialog$1.a);
    }

    @Override // defpackage.u7d
    public void b(String str, cmf<kotlin.f> cmf, cmf<kotlin.f> cmf2, String str2) {
        kotlin.jvm.internal.h.e(str, "hostDisplayName");
        kotlin.jvm.internal.h.e(cmf, "onControlSelected");
        kotlin.jvm.internal.h.e(cmf2, "onListenAndControlSelected");
        kotlin.jvm.internal.h.e(str2, "sessionToken");
        Dialog dialog = new Dialog(this.a);
        dialog.setContentView(C0707R.layout.mode_selection_dialog);
        RadioGroup radioGroup = (RadioGroup) dialog.findViewById(C0707R.id.mode_selection_radio_group);
        RadioButton radioButton = (RadioButton) dialog.findViewById(C0707R.id.control_radio_button);
        Button button = (Button) dialog.findViewById(C0707R.id.continue_button);
        dialog.setOnDismissListener(new f(this, str2));
        radioGroup.setOnCheckedChangeListener(new g(this, str2, button));
        kotlin.jvm.internal.h.d(radioButton, "controlRadioButton");
        radioButton.setText(this.a.getString(C0707R.string.social_listening_mode_selection_dialog_control_button, new Object[]{str}));
        button.setOnClickListener(new h(radioGroup, cmf, cmf2, dialog));
        dialog.show();
    }

    @Override // defpackage.u7d
    public void c(cmf<kotlin.f> cmf, cmf<kotlin.f> cmf2) {
        kotlin.jvm.internal.h.e(cmf, "onConfirm");
        kotlin.jvm.internal.h.e(cmf2, "onCancel");
        Activity activity = this.a;
        com.spotify.glue.dialogs.f c2 = m.c(activity, activity.getString(C0707R.string.social_listening_end_session_confirmation_dialog_title_multi_output_design), this.a.getString(C0707R.string.social_listening_end_session_confirmation_dialog_subtitle_multi_output_design));
        c2.f(this.a.getString(C0707R.string.social_listening_end_session_confirmation_dialog_confirm_button), new a(0, cmf));
        c2.e(this.a.getString(17039360), new a(1, cmf2));
        c2.b().a();
    }

    @Override // defpackage.u7d
    public void d(boolean z) {
        String string = this.a.getString(C0707R.string.social_listening_failed_to_end_session_dialog_title);
        kotlin.jvm.internal.h.d(string, "activity.getString(R.str…end_session_dialog_title)");
        k(string, z, SocialListeningDialogsImpl$showFailedToEndSessionDialog$1.a);
    }

    @Override // defpackage.u7d
    public void e(cmf<kotlin.f> cmf, cmf<kotlin.f> cmf2, String str) {
        String str2;
        kotlin.jvm.internal.h.e(cmf, "onConfirm");
        kotlin.jvm.internal.h.e(cmf2, "onCancel");
        Activity activity = this.a;
        String string = activity.getString(C0707R.string.social_listening_leave_session_confirmation_dialog_title);
        if (str != null) {
            str2 = this.a.getString(C0707R.string.social_listening_leave_session_confirmation_dialog_subtitle_containing_host_name, new Object[]{str});
        } else {
            str2 = this.a.getString(C0707R.string.social_listening_leave_session_confirmation_dialog_subtitle);
        }
        com.spotify.glue.dialogs.f c2 = m.c(activity, string, str2);
        c2.f(this.a.getString(C0707R.string.social_listening_leave_session_confirmation_dialog_confirm_button), new b(0, cmf));
        c2.e(this.a.getString(17039360), new b(1, cmf2));
        c2.b().a();
    }

    @Override // defpackage.u7d
    public void f() {
        int f2 = this.b.f();
        Activity activity = this.a;
        com.spotify.glue.dialogs.f c2 = m.c(activity, activity.getString(C0707R.string.social_listening_join_failed_session_full_title), this.a.getResources().getQuantityString(C0707R.plurals.social_listening_join_failed_session_full_body, f2, Integer.valueOf(f2)));
        c2.f(this.a.getString(C0707R.string.social_listening_join_failed_session_got_it_button), e.a);
        c2.b().a();
    }

    @Override // defpackage.u7d
    public void g(boolean z) {
        String string = this.a.getString(C0707R.string.social_listening_failed_to_start_session_dialog_title);
        kotlin.jvm.internal.h.d(string, "activity.getString(R.str…art_session_dialog_title)");
        k(string, z, SocialListeningDialogsImpl$showFailedToStartSessionDialog$1.a);
    }

    @Override // defpackage.u7d
    public void h(boolean z) {
        String string = this.a.getString(C0707R.string.social_listening_failed_to_leave_session_dialog_title);
        kotlin.jvm.internal.h.d(string, "activity.getString(R.str…ave_session_dialog_title)");
        k(string, z, SocialListeningDialogsImpl$showFailedToLeaveSessionDialog$1.a);
    }

    @Override // defpackage.u7d
    public void i(boolean z, cmf<kotlin.f> cmf) {
        kotlin.jvm.internal.h.e(cmf, "onDismiss");
        String string = this.a.getString(C0707R.string.social_listening_failed_to_join_session_dialog_title);
        kotlin.jvm.internal.h.d(string, "activity.getString(R.str…oin_session_dialog_title)");
        k(string, z, cmf);
    }
}
