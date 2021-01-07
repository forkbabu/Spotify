package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;

/* renamed from: eq9  reason: default package */
public class eq9 implements fq9 {
    private final Picasso a;
    private final HubsGlueImageDelegate b;
    private final View c;
    private final TextView f;
    private final TextView n;
    private final TextView o;
    private final ImageView p;
    private final Context q;

    public eq9(Context context, Picasso picasso, HubsGlueImageDelegate hubsGlueImageDelegate, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.home_premium_promo_v1_card, viewGroup, false);
        this.c = inflate;
        picasso.getClass();
        this.a = picasso;
        hubsGlueImageDelegate.getClass();
        this.b = hubsGlueImageDelegate;
        this.f = (TextView) inflate.findViewById(C0707R.id.title);
        this.n = (TextView) inflate.findViewById(C0707R.id.subtitle);
        this.o = (TextView) inflate.findViewById(C0707R.id.accessoryText);
        this.p = (ImageView) inflate.findViewById(C0707R.id.image);
        this.q = inflate.getContext();
        q4.J(inflate, true);
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.c;
    }

    @Override // defpackage.fq9
    public void j2(String str, String str2) {
        Context context = this.q;
        Drawable d = yc0.d(context, n71.a(str2).or((Optional<SpotifyIconV2>) SpotifyIconV2.PLAYLIST), (float) nud.g(64.0f, context.getResources()));
        z l = this.a.l(this.b.b(str));
        l.t(d);
        l.g(d);
        l.m(this.p);
    }

    @Override // defpackage.fq9
    public void m1(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.o.setText(charSequence);
            this.o.setVisibility(0);
            return;
        }
        this.o.setText("");
        this.o.setVisibility(8);
    }

    @Override // defpackage.fq9
    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.n.setText(charSequence);
            this.n.setVisibility(0);
            return;
        }
        this.n.setText("");
        this.n.setVisibility(8);
    }

    @Override // defpackage.fq9
    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.f.setText(charSequence);
            this.f.setVisibility(0);
            return;
        }
        this.f.setText("");
        this.f.setVisibility(8);
    }
}
