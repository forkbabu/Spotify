package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.google.common.base.MoreObjects;
import com.spotify.android.paste.app.c;
import com.spotify.music.C0707R;

/* renamed from: aa6  reason: default package */
final class aa6 extends nc0 {
    private final TextView c;
    private final TextView f;
    private final TextView n;
    private final TextView o;
    private final ToggleButton p;
    private final ImageView q = ((ImageView) getView().findViewById(C0707R.id.cover_art_image));

    public aa6(Context context, ViewGroup viewGroup) {
        super(LayoutInflater.from(context).inflate(C0707R.layout.p2s_header_content_view, viewGroup, false));
        View findViewById = getView().findViewById(16908308);
        findViewById.getClass();
        this.o = (TextView) findViewById;
        View findViewById2 = getView().findViewById(16908309);
        findViewById2.getClass();
        TextView textView = (TextView) findViewById2;
        this.n = textView;
        View findViewById3 = getView().findViewById(C0707R.id.header_description);
        findViewById3.getClass();
        TextView textView2 = (TextView) findViewById3;
        this.f = textView2;
        View findViewById4 = getView().findViewById(C0707R.id.follow_container);
        findViewById4.getClass();
        LinearLayout linearLayout = (LinearLayout) findViewById4;
        this.c = (TextView) linearLayout.findViewById(C0707R.id.followers_count);
        ToggleButton e = c.e(context);
        this.p = e;
        e.setId(C0707R.id.follow_button);
        e.setTextOn(context.getString(C0707R.string.header_playlist_following));
        e.setTextOff(context.getString(C0707R.string.header_playlist_follow));
        e.setEllipsize(TextUtils.TruncateAt.END);
        e.setVisibility(8);
        linearLayout.addView(e, 0, new LinearLayout.LayoutParams(-2, -2));
        textView.setVisibility(8);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void B0(CharSequence charSequence) {
        this.f.setText(charSequence);
    }

    public ToggleButton E2() {
        return this.p;
    }

    public void F2(int i) {
        this.o.setTextColor(i);
    }

    public void G2(String str) {
        this.c.setVisibility(0);
        this.c.setText(str);
    }

    /* access modifiers changed from: package-private */
    public ImageView getImageView() {
        return this.q;
    }

    public void setSubtitle(String str) {
        this.n.setText(str);
        this.n.setVisibility(MoreObjects.isNullOrEmpty(str) ? 8 : 0);
    }

    public void setTitle(String str) {
        this.o.setText(str);
    }
}
