package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.ui.view.anchorbar.AnchorBar;
import com.spotify.mobile.android.ui.view.anchorbar.f;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconView;

/* renamed from: ei8  reason: default package */
public class ei8 extends f implements g<yi8, xi8> {
    private ji8 f;
    private ts3 n;

    /* renamed from: ei8$a */
    class a implements h<yi8> {
        a() {
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            yi8 yi8 = (yi8) obj;
            if (yi8 != null) {
                if (yi8.d() || yi8.b()) {
                    ei8.this.setVisible(true);
                    if (ei8.this.n != null) {
                        ((us3) ei8.this.n).e(yi8.e());
                        ((us3) ei8.this.n).g(false);
                    }
                }
                if (ei8.this.n != null) {
                    ((us3) ei8.this.n).f(yi8.c());
                    ((us3) ei8.this.n).h(yi8.f());
                }
            }
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
        }
    }

    public ei8(AnchorBar anchorBar) {
        super(anchorBar, C0707R.layout.reminder_banner_saved_ads, ei8.class.getSimpleName());
    }

    @Override // com.spotify.mobile.android.ui.view.anchorbar.AnchorItem
    public void a(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(C0707R.layout.reminder_banner_saved_ads, viewGroup, false);
        ((Button) viewGroup2.findViewById(C0707R.id.btnCta_reminderBanner)).setOnClickListener(new wh8(this));
        ((SpotifyIconView) viewGroup2.findViewById(C0707R.id.ivClose_reminderBanner)).setOnClickListener(new vh8(this));
        viewGroup.setPadding(0, viewGroup.getPaddingTop() + (com.spotify.android.goldenpath.a.g(context) ? com.spotify.android.goldenpath.a.f(context) : 0), 0, 0);
        viewGroup.addView(viewGroup2);
    }

    public void f(View view) {
        Logger.b("[bookmark reminder] - set anchor to invisible", new Object[0]);
        setVisible(false);
        this.f.a(xi8.f());
    }

    public void g(View view) {
        this.f.a(xi8.d());
        Logger.b("[bookmark reminder] - set anchor to invisible", new Object[0]);
        setVisible(false);
    }

    /* access modifiers changed from: protected */
    public void h(ji8 ji8) {
        this.f = ji8;
    }

    /* access modifiers changed from: protected */
    public void i(ts3 ts3) {
        this.n = ts3;
    }

    @Override // com.spotify.mobius.g
    public h<yi8> t(da2<xi8> da2) {
        return new a();
    }
}
