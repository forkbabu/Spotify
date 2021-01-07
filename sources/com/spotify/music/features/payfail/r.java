package com.spotify.music.features.payfail;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.ui.view.anchorbar.AnchorBar;
import com.spotify.mobile.android.ui.view.anchorbar.f;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconView;

public class r extends f {
    private a f;
    private TextView n;
    private TextView o;
    private Button p;

    public interface a {
    }

    public r(AnchorBar anchorBar) {
        super(anchorBar, C0707R.layout.payment_failure_banner, r.class.getSimpleName());
    }

    @Override // com.spotify.mobile.android.ui.view.anchorbar.AnchorItem
    public void a(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        ViewGroup viewGroup2 = (ViewGroup) je.G(viewGroup, C0707R.layout.payment_failure_banner, viewGroup, false);
        this.n = (TextView) viewGroup2.findViewById(C0707R.id.tvTitle_paymentFailureBanner);
        this.o = (TextView) viewGroup2.findViewById(C0707R.id.tvDescription_paymentFailureBanner);
        this.p = (Button) viewGroup2.findViewById(C0707R.id.btnCta_paymentFailureBanner);
        SpotifyIconView spotifyIconView = (SpotifyIconView) viewGroup2.findViewById(C0707R.id.ivClose_paymentFailureBanner);
        if (com.spotify.android.goldenpath.a.g(context)) {
            viewGroup2.setPadding(viewGroup2.getPaddingLeft(), viewGroup2.getPaddingTop() + com.spotify.android.goldenpath.a.d(context), viewGroup2.getPaddingRight(), viewGroup2.getPaddingBottom());
        }
        this.p.setOnClickListener(new b(this));
        spotifyIconView.setOnClickListener(new a(this));
        viewGroup.addView(viewGroup2);
    }

    public void e(View view) {
        a aVar = this.f;
        if (aVar != null) {
            x xVar = (x) aVar;
            Logger.b("Payment failure banner CTA click", new Object[0]);
            xa1 a2 = y.a(xVar.a);
            if (a2 != null) {
                y.c(xVar.a).a("cta-click", (long) y.b(xVar.a).f(y.p, 1));
                if (y.d(xVar.a) != null) {
                    y.d(xVar.a).setVisible(false);
                }
                y.f(xVar.a);
                y.e(xVar.a, null);
                y.g(xVar.a, a2);
            }
        }
    }

    public void f(View view) {
        a aVar = this.f;
        if (aVar != null) {
            x xVar = (x) aVar;
            Logger.b("Payment failure banner dismissed", new Object[0]);
            if (y.a(xVar.a) != null) {
                y.c(xVar.a).a("dismiss-click", (long) y.b(xVar.a).f(y.p, 1));
                if (y.d(xVar.a) != null) {
                    y.d(xVar.a).setVisible(false);
                }
                y.f(xVar.a);
                y.e(xVar.a, null);
            }
        }
    }

    public void g(int i) {
        Button button = this.p;
        if (button != null) {
            button.setText(i);
        }
    }

    public void h(int i) {
        TextView textView = this.o;
        if (textView != null) {
            textView.setText(i);
        }
    }

    public void i(a aVar) {
        this.f = aVar;
    }

    public void j(int i) {
        TextView textView = this.n;
        if (textView != null) {
            textView.setText(i);
        }
    }

    public void k(String str) {
        TextView textView = this.n;
        if (textView != null) {
            textView.setText(str);
        }
    }
}
