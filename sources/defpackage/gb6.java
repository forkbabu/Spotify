package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.google.common.base.MoreObjects;
import com.spotify.android.glue.patterns.header.transformations.TransformationSet;
import com.spotify.android.paste.app.c;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
/* renamed from: gb6  reason: default package */
public class gb6 extends nc0 {
    private final FrameLayout c;
    private final ImageView f;
    private final TextView n;
    private final TextView o;
    private final TextView p;
    private final TextView q;
    private final ToggleButton r;
    private final TransformationSet s;

    gb6(Context context, ViewGroup viewGroup) {
        super(LayoutInflater.from(context).inflate(C0707R.layout.refresh_header_content_view, viewGroup, false));
        View findViewById = getView().findViewById(C0707R.id.full_bleed_title);
        findViewById.getClass();
        this.n = (TextView) findViewById;
        View findViewById2 = getView().findViewById(C0707R.id.title);
        findViewById2.getClass();
        this.o = (TextView) findViewById2;
        View findViewById3 = getView().findViewById(C0707R.id.metadata_section);
        findViewById3.getClass();
        this.p = (TextView) findViewById3;
        View findViewById4 = getView().findViewById(C0707R.id.description);
        findViewById4.getClass();
        TextView textView = (TextView) findViewById4;
        this.q = textView;
        ImageView imageView = (ImageView) getView().findViewById(C0707R.id.cover_art_image);
        this.f = imageView;
        View findViewById5 = getView().findViewById(C0707R.id.cover_container);
        findViewById5.getClass();
        this.c = (FrameLayout) findViewById5;
        this.s = l70.d(imageView);
        View findViewById6 = getView().findViewById(C0707R.id.follow_container);
        findViewById6.getClass();
        ToggleButton e = c.e(context);
        this.r = e;
        e.setId(C0707R.id.follow_button);
        e.setTextOn(context.getString(C0707R.string.header_playlist_following));
        e.setTextOff(context.getString(C0707R.string.header_playlist_follow));
        e.setEllipsize(TextUtils.TruncateAt.END);
        e.setVisibility(8);
        ((LinearLayout) findViewById6).addView(e, 0, new LinearLayout.LayoutParams(-2, -2));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void B0(CharSequence charSequence) {
        this.q.setText(charSequence);
        this.q.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
    }

    public View E2() {
        return this.c;
    }

    public ToggleButton F2() {
        return this.r;
    }

    public TextView G2() {
        return this.p;
    }

    public ImageView H2() {
        return this.f;
    }

    public void I2(String str) {
        this.n.setText(str);
        this.n.setVisibility(MoreObjects.isNullOrEmpty(str) ? 8 : 0);
    }

    public void J2(String str) {
        this.p.setText(str);
        this.p.setVisibility(MoreObjects.isNullOrEmpty(str) ? 8 : 0);
    }

    @Override // defpackage.nc0, defpackage.tc0
    public void e0(int i, float f2) {
        this.s.a(f2);
    }

    public void setTitle(String str) {
        this.o.setText(str);
        this.o.setVisibility(MoreObjects.isNullOrEmpty(str) ? 8 : 0);
    }
}
