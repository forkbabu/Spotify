package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.a;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconView;

/* renamed from: yi5  reason: default package */
public class yi5 extends tu1 {
    private final int d;
    private final int e;
    private final int f;
    private final Context g;
    private final View.OnClickListener h;

    public yi5(int i, int i2, int i3, Context context, View.OnClickListener onClickListener) {
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = context;
        this.h = onClickListener;
    }

    @Override // defpackage.tu1, defpackage.uu1
    public boolean a() {
        return false;
    }

    @Override // defpackage.uu1
    public Integer b() {
        return Integer.valueOf(a.b(this.g, C0707R.color.tooltip_arrow_color));
    }

    @Override // defpackage.tu1, defpackage.uu1
    public Integer c() {
        return Integer.valueOf(nud.g(4.0f, this.g.getResources()));
    }

    @Override // defpackage.tu1, defpackage.uu1
    public boolean e() {
        return true;
    }

    @Override // defpackage.tu1, defpackage.uu1
    public Integer g() {
        return Integer.valueOf(nud.g(4.0f, this.g.getResources()));
    }

    @Override // defpackage.tu1, defpackage.uu1
    public boolean h() {
        return false;
    }

    @Override // defpackage.tu1, defpackage.uu1
    public boolean k() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.tu1
    public int l() {
        return C0707R.layout.home_tooltip_configuration;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.tu1
    public void n(View view) {
        TextView textView = (TextView) view.findViewById(C0707R.id.home_tooltip_title);
        TextView textView2 = (TextView) view.findViewById(C0707R.id.home_tooltip_description);
        ImageView imageView = (ImageView) view.findViewById(C0707R.id.home_tooltip_image);
        ((SpotifyIconView) view.findViewById(C0707R.id.btn_close)).setOnClickListener(new ti5(this));
        View.OnClickListener onClickListener = this.h;
        if (onClickListener != null) {
            view.setOnClickListener(onClickListener);
        }
        int i = this.e;
        if (i > 0) {
            textView.setText(i);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        int i2 = this.f;
        if (i2 > 0) {
            textView2.setText(i2);
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        int i3 = this.d;
        if (i3 > 0) {
            imageView.setImageResource(i3);
        }
    }

    public /* synthetic */ void o(View view) {
        m();
    }
}
