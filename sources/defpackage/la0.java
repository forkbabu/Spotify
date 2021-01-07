package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: la0  reason: default package */
public class la0 extends ja0 implements ka0 {
    private final TextView o;
    private final ImageButton p;

    public la0(View view) {
        super(view);
        view.findViewById(C0707R.id.extender_header_gradient);
        TextView textView = (TextView) view.findViewById(16908309);
        this.o = textView;
        this.p = (ImageButton) view.findViewById(C0707R.id.icon);
        TextView[] textViewArr = {textView};
        vc0.i(textViewArr);
        vc0.h(textViewArr);
        vc0.g(view);
    }

    public void B0(CharSequence charSequence) {
        this.o.setText(charSequence);
    }

    @Override // defpackage.ja0, defpackage.ia0
    public View B2() {
        return getView();
    }

    public void Q0(SpotifyIcon spotifyIcon) {
        ColorStateList i = nud.i(super.getView().getContext(), C0707R.attr.pasteColorAccessory);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(super.getView().getContext(), spotifyIcon);
        float g = (float) nud.g(24.0f, super.getView().getResources());
        spotifyIconDrawable.w(g);
        spotifyIconDrawable.s(i);
        this.p.setBaseline((int) ((Math.abs(super.getTitleView().getPaint().getFontMetrics().ascent) + g) / 2.0f));
        this.p.setImageDrawable(spotifyIconDrawable);
    }

    @Override // defpackage.ja0, defpackage.ia0
    public void V1(boolean z) {
    }

    public TextView c() {
        return this.o;
    }

    public View d() {
        return this.p;
    }

    @Override // defpackage.ja0, defpackage.ia0
    public void i1(boolean z) {
    }

    @Override // defpackage.ja0, defpackage.ia0
    public void q1(CharSequence charSequence) {
    }

    public void u2(View.OnClickListener onClickListener) {
        this.p.setOnClickListener(onClickListener);
    }
}
