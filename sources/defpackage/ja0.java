package defpackage;

import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import com.spotify.android.glue.components.common.SpotifyIconSpan;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* access modifiers changed from: package-private */
/* renamed from: ja0  reason: default package */
public class ja0 implements ia0 {
    private final View a;
    private final TextView b;
    private CharSequence c;
    private final SpotifyIconDrawable f;
    private boolean n;

    ja0(View view) {
        this.a = view;
        TextView textView = (TextView) view.findViewById(16908308);
        this.b = textView;
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(textView.getContext(), SpotifyIconV2.CHEVRON_RIGHT, textView.getTextSize() / 2.0f);
        this.f = spotifyIconDrawable;
        spotifyIconDrawable.m(nud.g(6.0f, textView.getResources()), 0, 0, 0);
        spotifyIconDrawable.setBounds(0, 0, spotifyIconDrawable.getIntrinsicWidth(), spotifyIconDrawable.getIntrinsicHeight());
        TextView[] textViewArr = {textView};
        vc0.i(textViewArr);
        vc0.h(textViewArr);
        vc0.g(view);
        if (textView.isDuplicateParentStateEnabled()) {
            vc0.c(view);
        } else {
            vc0.c(textView);
        }
    }

    private void b() {
        SpannableString spannableString;
        SpotifyIconSpan.Alignment alignment = SpotifyIconSpan.Alignment.SMALL_LETTER_MIDDLE;
        if (this.n) {
            CharSequence charSequence = this.c;
            String n2 = this.f.n();
            int g = nud.g(6.0f, this.b.getResources());
            if (nud.m(this.a.getContext())) {
                this.f.m(0, 0, g, 0);
                spannableString = new SpannableString(n2 + ((Object) charSequence));
                spannableString.setSpan(new SpotifyIconSpan(this.f, alignment), 0, 1, 18);
            } else {
                this.f.m(g, 0, 0, 0);
                spannableString = new SpannableString(((Object) charSequence) + n2);
                spannableString.setSpan(new SpotifyIconSpan(this.f, alignment), charSequence.length(), charSequence.length() + 1, 18);
            }
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
