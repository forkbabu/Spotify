package com.spotify.magiclink;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.bottomsheet.c;
import com.spotify.music.C0707R;
import com.spotify.music.features.accountrecovery.setpassword.dialog.SetPasswordHeadlessFragment;

public class MagiclinkBottomSheetDialog extends BottomSheetDialogFragment {
    o11 v0;
    private a w0;

    public interface a {
    }

    public static void b5(o oVar, a aVar) {
        Fragment U = oVar.U("magiclink_bottom_sheet_dialog");
        if (U != null) {
            ((MagiclinkBottomSheetDialog) U).w0 = aVar;
        }
    }

    public static void c5(o oVar, String str, a aVar) {
        MagiclinkBottomSheetDialog magiclinkBottomSheetDialog = new MagiclinkBottomSheetDialog();
        Bundle bundle = new Bundle();
        bundle.putString("arg_oneTimeToken", str);
        magiclinkBottomSheetDialog.r4(bundle);
        magiclinkBottomSheetDialog.Y4(oVar, "magiclink_bottom_sheet_dialog");
        magiclinkBottomSheetDialog.w0 = aVar;
    }

    @Override // androidx.fragment.app.DialogFragment
    public int Q4() {
        return C0707R.style.MagicLinkBottomSheetDialogTheme;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog R4(Bundle bundle) {
        c cVar = new c(l4(), C0707R.style.MagicLinkBottomSheetDialogTheme);
        View inflate = LayoutInflater.from(l4()).inflate(C0707R.layout.magic_link_welcome_dialog, (ViewGroup) null);
        String string = k4().getString("arg_oneTimeToken", null);
        this.v0.a(i11.g(p11.e()));
        inflate.findViewById(C0707R.id.button_set_password).setOnClickListener(new i(this, string));
        inflate.findViewById(C0707R.id.button_not_now).setOnClickListener(new j(this));
        cVar.setContentView(inflate);
        return cVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void n3(int i, int i2, Intent intent) {
        if (i == 567) {
            a aVar = this.w0;
            if (aVar != null) {
                if (i2 == -1) {
                    ((SetPasswordHeadlessFragment) aVar).M4(1);
                } else if (intent != null && "REASON_TOKEN_EXPIRED".equals(intent.getStringExtra("REASON"))) {
                    ((SetPasswordHeadlessFragment) this.w0).M4(2);
                }
            }
            M4();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }
}
