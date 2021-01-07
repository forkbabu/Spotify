package com.spotify.effortlesslogin;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.bottomsheet.c;
import com.google.common.base.Optional;
import com.spotify.music.C0707R;
import defpackage.ce0;
import defpackage.fe0;
import defpackage.ge0;
import defpackage.je0;

public class EffortlessLoginBottomSheetDialog extends BottomSheetDialogFragment {
    ae0 v0;
    boolean w0;
    private Optional<a> x0 = Optional.absent();

    public interface a {
        void a();
    }

    public static void b5(o oVar, a aVar) {
        Fragment U = oVar.U("EffortlessLoginBottomSheetDialog");
        if (U != null) {
            ((EffortlessLoginBottomSheetDialog) U).x0 = Optional.of(aVar);
        }
    }

    public static void c5(o oVar, String str, a aVar) {
        EffortlessLoginBottomSheetDialog effortlessLoginBottomSheetDialog = new EffortlessLoginBottomSheetDialog();
        Bundle bundle = new Bundle();
        bundle.putString("username", str);
        effortlessLoginBottomSheetDialog.r4(bundle);
        effortlessLoginBottomSheetDialog.Y4(oVar, "EffortlessLoginBottomSheetDialog");
        effortlessLoginBottomSheetDialog.x0 = Optional.of(aVar);
    }

    @Override // androidx.fragment.app.DialogFragment
    public int Q4() {
        return C0707R.style.EffortlessLoginBottomSheetDialogTheme;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog R4(Bundle bundle) {
        this.v0.a(new ce0.k(je0.k.b));
        String string = D2() != null ? D2().getString("username") : null;
        c cVar = new c(l4(), C0707R.style.EffortlessLoginBottomSheetDialogTheme);
        View inflate = LayoutInflater.from(l4()).inflate(C0707R.layout.effortless_login_dialog, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C0707R.id.textview_username);
        if (string != null) {
            textView.setText(Html.fromHtml(String.format(R2().getString(C0707R.string.effortlesslogin_username), string)));
        } else {
            textView.setVisibility(8);
        }
        ((Button) inflate.findViewById(C0707R.id.button_positive)).setOnClickListener(new c(this, string));
        ((Button) inflate.findViewById(C0707R.id.button_negative)).setOnClickListener(new d(this));
        cVar.setContentView(inflate);
        return cVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void n3(int i, int i2, Intent intent) {
        if (i == 11533 && i2 == -1 && this.x0.isPresent()) {
            this.x0.get().a();
        }
        M4();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        this.v0.a(new ce0.c(je0.k.b, fe0.t.b, ge0.k.b));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }
}
