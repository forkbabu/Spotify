package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;

/* renamed from: ty7  reason: default package */
public final /* synthetic */ class ty7 implements b3d {
    public final /* synthetic */ v08 a;

    public /* synthetic */ ty7(v08 v08) {
        this.a = v08;
    }

    @Override // defpackage.b3d
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        v08 v08 = this.a;
        v08.getClass();
        View inflate = layoutInflater.inflate(C0707R.layout.slate_iam_dismiss_footer, viewGroup, false);
        inflate.setOnClickListener(new yy7(v08));
        return inflate;
    }
}
