package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.a;
import com.google.common.base.Optional;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.playlistentity.homemix.l;
import com.spotify.music.features.playlistentity.homemix.models.HomeMix;
import com.spotify.music.features.playlistentity.homemix.models.HomeMixPlanType;
import com.spotify.music.features.playlistentity.homemix.models.HomeMixTuning;
import com.spotify.music.features.playlistentity.homemix.models.i;
import com.spotify.music.features.playlistentity.homemix.q;
import com.spotify.music.features.playlistentity.t;
import com.spotify.music.features.playlistentity.w;
import com.spotify.music.playlist.ui.ItemConfiguration;
import com.spotify.playlist.models.Covers;
import defpackage.be6;
import defpackage.ve6;
import java.util.EnumMap;
import java.util.List;

/* renamed from: ee6  reason: default package */
public class ee6 implements uh6, wh6 {
    private static final int A = (ee6.class.hashCode() + 3);
    private static final int x = ee6.class.hashCode();
    private static final int y = (ee6.class.hashCode() + 1);
    private static final int z = (ee6.class.hashCode() + 2);
    private final he6 a;
    private final be6 b;
    private final w c;
    private final Context f;
    private final EnumMap<HomeMixTuning.Style, String> n;
    private final l o;
    private final af6 p;
    private final q q;
    private final HomeMixFormatListAttributesHelper r;
    private twd s;
    private TextView t;
    private jc6 u;
    private kc6 v;
    private final me6 w;

    public ee6(ce6 ce6, w wVar, Context context, EnumMap<HomeMixTuning.Style, String> enumMap, me6 me6, l lVar, ie6 ie6, af6 af6, q qVar, HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper, ItemListConfiguration itemListConfiguration) {
        be6 b2 = ce6.b(itemListConfiguration);
        this.b = b2;
        this.a = ie6.b(b2, new rd6(this));
        this.c = wVar;
        this.f = context;
        this.n = enumMap;
        this.o = lVar;
        this.p = af6;
        this.q = qVar;
        this.r = homeMixFormatListAttributesHelper;
        this.w = me6;
    }

    @Override // defpackage.uh6
    public void a(LayoutInflater layoutInflater, ViewGroup viewGroup, twd twd) {
        this.s = twd;
        this.t = (TextView) layoutInflater.inflate(C0707R.layout.playlist_entity_home_mix_empty_tracks_view, viewGroup, false);
        this.u = new jc6(layoutInflater.getContext());
        this.v = new kc6(layoutInflater.getContext());
        twd.Z(this.a, x);
        twd twd2 = this.s;
        v02 v02 = new v02(this.t, false);
        int i = y;
        twd2.Z(v02, i);
        twd twd3 = this.s;
        jc6 jc6 = this.u;
        View inflate = LayoutInflater.from(jc6.getContext()).inflate(C0707R.layout.playlist_entity_home_mix_empty_state, jc6);
        jc6.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        jc6.setGravity(15);
        jc6.setBackgroundColor(a.b(jc6.getContext(), C0707R.color.gray_background));
        v02 v022 = new v02(inflate, false);
        int i2 = z;
        twd3.Z(v022, i2);
        twd twd4 = this.s;
        kc6 kc6 = this.v;
        View inflate2 = LayoutInflater.from(kc6.getContext()).inflate(C0707R.layout.playlist_entity_home_mix_empty_state, kc6);
        kc6.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        kc6.setGravity(15);
        kc6.setBackgroundColor(a.b(kc6.getContext(), C0707R.color.gray_background));
        v02 v023 = new v02(inflate2, false);
        int i3 = A;
        twd4.Z(v023, i3);
        twd.i0(i, i2, i3);
    }

    public /* synthetic */ b4 b() {
        return this.b;
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void c(Bundle bundle) {
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void d(Bundle bundle) {
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void f() {
        this.b.j(null);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public io.reactivex.a g() {
        return this.b.k();
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void h() {
        this.b.j(this);
    }

    @Override // defpackage.wh6
    public void i(ItemConfiguration itemConfiguration) {
        this.a.i(itemConfiguration);
    }

    @Override // defpackage.wh6
    public void j(String str, boolean z2) {
        this.a.X(str);
    }

    public void k(HomeMix homeMix, View view) {
        this.o.a(false);
        this.w.getClass();
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void l(t.b bVar) {
        this.b.q(bVar);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void onStop() {
        this.b.r();
    }

    public /* synthetic */ void u(i iVar, HomeMixPlanType homeMixPlanType, String str) {
        this.q.d(iVar, homeMixPlanType);
    }

    public /* synthetic */ void w(View view) {
        this.b.p();
    }

    /* access modifiers changed from: package-private */
    public void y(int i) {
        this.c.c(x, i);
    }

    /* access modifiers changed from: package-private */
    public void z(be6.a aVar) {
        twd twd = this.s;
        int i = x;
        int i2 = y;
        int i3 = z;
        int i4 = A;
        twd.i0(i, i2, i3, i4);
        HomeMix a2 = aVar.a();
        List<com.spotify.playlist.models.l> b2 = aVar.b();
        com.spotify.playlist.models.q.c(aVar.c().c(), Covers.Size.LARGE);
        ve6 d = aVar.d();
        i a3 = this.r.a(aVar.c());
        d.getClass();
        if (!(d instanceof ve6.a) || a2 == null) {
            ve6 d2 = aVar.d();
            d2.getClass();
            if (((d2 instanceof ve6.e) || (d2 instanceof ve6.f) || (d2 instanceof ve6.i) || (d2 instanceof ve6.g) || (d2 instanceof ve6.h)) || a2 == null) {
                if (!b2.isEmpty()) {
                    this.a.Y(a2, b2);
                    this.s.l0(i);
                } else if (a2 != null) {
                    Optional fromNullable = Optional.fromNullable(this.n.get(a2.style()));
                    if (fromNullable.isPresent()) {
                        this.s.l0(i2);
                        this.t.setText((CharSequence) fromNullable.get());
                    } else {
                        this.s.i0(i2);
                    }
                }
                this.p.a();
                if (a2 != null && (d instanceof ve6.f) && a3 != null && !a3.d()) {
                    HomeMixPlanType planType = a2.planType();
                    this.p.e(planType.i(), new ud6(this, a3, planType));
                }
            } else if ((d instanceof ve6.c) || (d instanceof ve6.d)) {
                jc6 jc6 = this.u;
                String string = this.f.getString(C0707R.string.home_mix_join_title, a2.planType().h(this.f));
                this.f.getString(C0707R.string.home_mix_join_text);
                td6 td6 = new td6(this);
                ((TextView) jc6.findViewById(C0707R.id.home_mix_empty_state_title)).setText(string);
                Button button = (Button) jc6.findViewById(C0707R.id.action_button);
                button.setText(C0707R.string.home_mix_join_text);
                button.setOnClickListener(td6);
                this.s.l0(i3);
            } else if (d instanceof ve6.b) {
                Optional fromNullable2 = Optional.fromNullable(this.n.get(a2.style()));
                if (fromNullable2.isPresent()) {
                    this.s.l0(i2);
                    this.t.setText((CharSequence) fromNullable2.get());
                    return;
                }
                this.s.i0(i2);
            }
        } else {
            kc6 kc6 = this.v;
            String string2 = this.f.getString(C0707R.string.home_mix_taste_onboarding_cta_header, a2.planType().h(this.f));
            String string3 = this.f.getString(C0707R.string.home_mix_start_text);
            sd6 sd6 = new sd6(this, a2);
            ((TextView) kc6.findViewById(C0707R.id.home_mix_empty_state_title)).setText(string2);
            ((TextView) kc6.findViewById(C0707R.id.action_button)).setText(string3);
            kc6.findViewById(C0707R.id.action_button).setOnClickListener(sd6);
            this.s.l0(i4);
        }
    }
}
