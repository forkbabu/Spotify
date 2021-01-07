package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.spotify.music.slate.model.u;

/* renamed from: yy9  reason: default package */
public final /* synthetic */ class yy9 implements b3d {
    public final /* synthetic */ bz9 a;

    public /* synthetic */ yy9(bz9 bz9) {
        this.a = bz9;
    }

    @Override // defpackage.b3d
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        bz9 bz9 = this.a;
        bz9.getClass();
        View inflate = layoutInflater.inflate(C0707R.layout.slate_modal_dismiss, viewGroup, false);
        u.b(C0707R.string.age_verification_dialog_cancel_button).a((TextView) inflate.findViewById(C0707R.id.negative_action));
        inflate.setOnClickListener(new wy9(bz9));
        return inflate;
    }
}
