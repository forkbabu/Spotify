package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.android.goldenpath.a;
import com.spotify.mobile.android.ui.view.anchorbar.AnchorBar;
import com.spotify.mobile.android.ui.view.anchorbar.f;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
/* renamed from: qh3  reason: default package */
public final class qh3 extends f {
    private final uh3 f;
    private final th3 n;

    qh3(AnchorBar anchorBar, uh3 uh3, th3 th3) {
        super(anchorBar, C0707R.layout.layout_voiceassistant_banner, qh3.class.getSimpleName());
        this.f = uh3;
        this.n = th3;
    }

    @Override // com.spotify.mobile.android.ui.view.anchorbar.AnchorItem
    public void a(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        int i = 0;
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.layout_voiceassistant_banner, viewGroup, false);
        if (a.g(context)) {
            i = a.e(context.getResources());
        }
        if (i != 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) inflate.getLayoutParams();
            marginLayoutParams.topMargin += i;
            inflate.setLayoutParams(marginLayoutParams);
        }
        ((Button) inflate.findViewById(C0707R.id.close_button)).setOnClickListener(new kh3(this));
        viewGroup.addView(inflate);
    }

    public void e(View view) {
        setVisible(false);
        this.f.a();
        this.n.b();
    }
}
