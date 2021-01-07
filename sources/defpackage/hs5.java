package defpackage;

import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.android.glue.components.common.SpotifyIconSpan;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* access modifiers changed from: package-private */
/* renamed from: hs5  reason: default package */
public class hs5 implements ia0 {
    private final View a;
    private final TextView b;
    private CharSequence c;
    private final SpotifyIconDrawable f;
    private boolean n;

    hs5(View view) {
        this.a = view;
        TextView textView = (TextView) view.findViewById(16908308);
        this.b = textView;
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(textView.getContext(), SpotifyIcon.CHEVRON_RIGHT_16, textView.getTextSize() / 2.0f);
        this.f = spotifyIconDrawable;
        spotifyIconDrawable.m(nud.g(6.0f, textView.getResources()), 0, 0, 0);
        spotifyIconDrawable.setBounds(0, 0, spotifyIconDrawable.getIntrinsicWidth(), spotifyIconDrawable.getIntrinsicHeight());
    }

    private void b() {
        if (this.n) {
            CharSequence charSequence = this.c;
            SpannableString spannableString = new SpannableString(((Object) charSequence) + SpotifyIcon.CHEVRON_RIGHT_16.toString());
            spannableString.setSpan(new SpotifyIconSpan(this.f, SpotifyIconSpan.Alignment.SMALL_LETTER_MIDDLE), charSequence.length(), charSequence.length() + 1, 18);
            this.b.setText(spannableString);
            return;
        }
        this.b.setText(this.c);
    }

    @Override // defpackage.ia0
    public View B2() {
        return getView();
    }

    @Override // defpackage.ia0
    public void S(boolean z) {
        this.n = z;
        getView().setClickable(z);
        b();
    }

    @Override // defpackage.ia0
    public void V1(boolean z) {
        ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).topMargin = nud.f(z ? 16.0f : 48.0f, this.a.getResources());
    }

    @Override // defpackage.ia0
    public void c1(String str) {
        this.a.setContentDescription(str);
    }

    @Override // defpackage.ia0
    public TextView getTitleView() {
        return this.b;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    @Override // defpackage.ia0
    public void i1(boolean z) {
    }

    @Override // defpackage.ia0
    public void q1(CharSequence charSequence) {
    }

    @Override // defpackage.ia0
    public void setTitle(CharSequence charSequence) {
        this.c = charSequence;
        b();
    }
}
