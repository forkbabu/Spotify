package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.util.ui.TextLabelUtil;
import com.spotify.music.C0707R;
import com.spotify.paste.widgets.internal.a;
import com.spotify.paste.widgets.internal.b;
import com.spotify.paste.widgets.internal.c;

/* renamed from: asa  reason: default package */
public abstract class asa implements zra {
    protected final View a;
    protected final ImageView b;
    protected final TextView c;
    protected final TextView f;
    private final a n;

    public asa(View view, ura ura) {
        this.a = view;
        this.n = new a((ViewGroup) view.findViewById(C0707R.id.accessory));
        TextView textView = (TextView) view.findViewById(C0707R.id.text1);
        this.c = textView;
        textView.setMaxLines(ura.a());
        TextView textView2 = (TextView) view.findViewById(C0707R.id.text2);
        this.f = textView2;
        ImageView imageView = (ImageView) view.findViewById(C0707R.id.image_view);
        this.b = imageView;
        vc0.e(textView, nud.g(20.0f, textView.getResources()));
        vc0.h(textView);
        vc0.i(textView2);
        vc0.g(view);
        bvd c2 = dvd.c(view.findViewById(C0707R.id.row_view));
        c2.g(textView, textView2);
        c2.f(imageView);
        c2.a();
    }

    @Override // defpackage.p90
    public View W1() {
        return this.n.d();
    }

    public void b(boolean z) {
        TextLabelUtil.a(this.f.getContext(), this.f, z);
    }

    public void c0(boolean z) {
        TextLabelUtil.b(this.f.getContext(), this.f, z);
    }

    @Override // defpackage.fa0
    public ImageView getImageView() {
        return this.b;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    @Override // defpackage.f90
    public void setActive(boolean z) {
        View view = this.a;
        if (view instanceof b) {
            ((b) view).setActive(z);
        }
    }

    @Override // com.spotify.paste.widgets.internal.c
    public void setAppearsDisabled(boolean z) {
        View view = this.a;
        if (view instanceof c) {
            ((c) view).setAppearsDisabled(z);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    @Override // defpackage.p90
    public void z0(View view) {
        this.n.f(view);
        this.n.g();
    }
}
