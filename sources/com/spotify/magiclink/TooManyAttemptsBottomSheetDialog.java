package com.spotify.magiclink;

import android.app.Dialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.bottomsheet.c;
import com.spotify.libs.signup.validators.LocalEmailValidator;
import com.spotify.music.C0707R;

public class TooManyAttemptsBottomSheetDialog extends BottomSheetDialogFragment {
    private final LocalEmailValidator v0 = new LocalEmailValidator();

    @Override // androidx.fragment.app.DialogFragment
    public int Q4() {
        return C0707R.style.MagicLinkBottomSheetDialogTheme;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog R4(Bundle bundle) {
        c cVar = new c(l4(), C0707R.style.MagicLinkBottomSheetDialogTheme);
        View inflate = LayoutInflater.from(l4()).inflate(C0707R.layout.too_may_attempts_dialog, (ViewGroup) null);
        String string = k4().getString("arg_email");
        string.getClass();
        if (this.v0.a(string) != LocalEmailValidator.EmailValidation.VALID) {
            ((TextView) inflate.findViewById(C0707R.id.textView_description)).setText(z42.m(l4().getString(C0707R.string.magiclink_too_many_attempts_dialog_subtitle_no_email)));
        } else {
            ((TextView) inflate.findViewById(C0707R.id.textView_description)).setText(z42.m(l4().getString(C0707R.string.magiclink_too_many_attempts_dialog_subtitle, string)));
        }
        inflate.findViewById(C0707R.id.button_positive).setOnClickListener(new k(this));
        PackageManager packageManager = l4().getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.APP_EMAIL");
        intent.setFlags(268435456);
        if (!(!packageManager.queryIntentActivities(intent, 0).isEmpty())) {
            inflate.findViewById(C0707R.id.button_positive).setVisibility(8);
            inflate.findViewById(C0707R.id.textView_or).setVisibility(8);
            inflate.findViewById(C0707R.id.left_divider_line).setVisibility(8);
            inflate.findViewById(C0707R.id.right_divider_line).setVisibility(8);
        }
        inflate.findViewById(C0707R.id.button_negative).setOnClickListener(new l(this));
        cVar.setContentView(inflate);
        return cVar;
    }
}
