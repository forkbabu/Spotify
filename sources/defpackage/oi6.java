package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.playlist.ui.e0;
import com.spotify.paste.widgets.internal.b;
import defpackage.pi6;
import java.util.List;

/* renamed from: oi6  reason: default package */
class oi6 implements pi6.a {
    final /* synthetic */ e0 a;
    final /* synthetic */ View b;
    final /* synthetic */ ImageView c;
    final /* synthetic */ TextView f;
    final /* synthetic */ TextView n;
    final /* synthetic */ View o;

    oi6(pi6 pi6, e0 e0Var, View view, ImageView imageView, TextView textView, TextView textView2, View view2) {
        this.a = e0Var;
        this.b = view;
        this.c = imageView;
        this.f = textView;
        this.n = textView2;
        this.o = view2;
    }

    @Override // defpackage.p90
    public View W1() {
        return this.a.a();
    }

    @Override // defpackage.x90
    public void e(CharSequence charSequence) {
        this.n.setText(charSequence);
    }

    @Override // defpackage.fa0
    public ImageView getImageView() {
        return this.c;
    }

    @Override // defpackage.x90
    public TextView getSubtitleView() {
        return this.n;
    }

    @Override // defpackage.x90
    public TextView getTitleView() {
        return this.f;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.o;
    }

    @Override // defpackage.f90
    public void setActive(boolean z) {
        View view = this.b;
        if (view instanceof b) {
            ((b) view).setActive(z);
        }
    }

    @Override // com.spotify.paste.widgets.internal.c
    public void setAppearsDisabled(boolean z) {
    }

    @Override // defpackage.x90
    public void setSubtitle(CharSequence charSequence) {
        this.n.setText(charSequence);
    }

    @Override // defpackage.x90
    public void setTitle(CharSequence charSequence) {
        this.f.setText(charSequence);
    }

    @Override // com.spotify.music.playlist.ui.row.a
    public void z(List<View> list) {
        this.a.d(list);
        this.a.e();
    }

    @Override // defpackage.p90
    public void z0(View view) {
        this.a.c(view);
    }
}
