package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.homemix.header.mixtuning.n;
import com.spotify.music.features.playlistentity.homemix.header.mixtuning.o;
import com.spotify.music.features.playlistentity.homemix.header.mixtuning.q;
import com.spotify.music.features.playlistentity.homemix.models.HomeMixPlanType;
import com.spotify.music.features.playlistentity.homemix.models.HomeMixTuning;
import com.spotify.music.features.playlistentity.t;

/* renamed from: id6  reason: default package */
public final class id6 {
    private final SnackbarManager a;
    private final Context b;
    private final o c;
    private n d;
    private q e;
    private xc6 f;
    private xc6 g;

    public id6(Context context, o oVar, SnackbarManager snackbarManager, ViewGroup viewGroup) {
        this.b = context;
        this.c = oVar;
        this.a = snackbarManager;
        n nVar = new n(context);
        this.d = nVar;
        nVar.setOnClickListener(new tc6(this));
        viewGroup.addView(this.d);
        q qVar = new q(context);
        this.e = qVar;
        qVar.setOnClickListener(new uc6(this));
        viewGroup.addView(this.e);
        n nVar2 = this.d;
        HomeMixPlanType homeMixPlanType = HomeMixPlanType.OTHER;
        xc6 z = xc6.z(context, nVar2, context.getString(C0707R.string.home_mix_chill_style_suggestion, homeMixPlanType.h(context)));
        this.f = z;
        viewGroup.addView(z);
        xc6 z2 = xc6.z(context, this.e, context.getString(C0707R.string.home_mix_upbeat_style_suggestion, homeMixPlanType.h(context)));
        this.g = z2;
        viewGroup.addView(z2);
        b();
        oVar.l(this);
    }

    public void a() {
        q qVar = this.e;
        if (qVar != null) {
            qVar.setVisibility(8);
        }
        n nVar = this.d;
        if (nVar != null) {
            nVar.setVisibility(8);
        }
    }

    public void b() {
        this.f.setVisibility(8);
        this.g.setVisibility(8);
    }

    public /* synthetic */ void c(View view) {
        this.c.k(view, HomeMixTuning.Style.CHILL, this.e);
    }

    public /* synthetic */ void d(View view) {
        this.c.k(view, HomeMixTuning.Style.UPBEAT, this.d);
    }

    public void e(float f2) {
        float f3 = 1.0f - f2;
        this.d.a(f3);
        this.e.a(f3);
    }

    public void f(t.b bVar) {
        this.c.m(bVar);
    }

    public void g() {
        this.c.n();
    }

    public void h(HomeMixTuning.Style style) {
        int ordinal = style.ordinal();
        if (ordinal == 0) {
            q qVar = this.e;
            if (qVar != null) {
                qVar.setSelected(false);
            }
            n nVar = this.d;
            if (nVar != null) {
                nVar.setSelected(false);
            }
        } else if (ordinal == 1) {
            q qVar2 = this.e;
            if (qVar2 != null) {
                qVar2.setSelected(false);
            }
            n nVar2 = this.d;
            if (nVar2 != null) {
                nVar2.setSelected(true);
            }
        } else if (ordinal == 2) {
            q qVar3 = this.e;
            if (qVar3 != null) {
                qVar3.setSelected(true);
            }
            n nVar3 = this.d;
            if (nVar3 != null) {
                nVar3.setSelected(false);
            }
        }
    }

    public void i(HomeMixPlanType homeMixPlanType) {
        xc6 xc6 = this.f;
        Context context = this.b;
        xc6.setText(context.getString(C0707R.string.home_mix_chill_style_suggestion, homeMixPlanType.h(context)));
        xc6 xc62 = this.g;
        Context context2 = this.b;
        xc62.setText(context2.getString(C0707R.string.home_mix_upbeat_style_suggestion, homeMixPlanType.h(context2)));
    }

    public void j(boolean z) {
        int i = 0;
        this.d.setVisibility(z ? 0 : 8);
        q qVar = this.e;
        if (!z) {
            i = 8;
        }
        qVar.setVisibility(i);
    }

    public void k() {
        this.a.show(SnackbarConfiguration.builder(this.b.getString(C0707R.string.home_mix_unknown_error_title)).build());
    }

    public void l() {
        this.a.show(SnackbarConfiguration.builder(this.b.getString(C0707R.string.home_mix_no_internet_connection)).build());
    }

    public void m(HomeMixTuning homeMixTuning) {
        if (this.f.getVisibility() == 0 || this.g.getVisibility() == 0) {
            b();
            return;
        }
        int ordinal = HomeMixTuning.Style.fromValue(homeMixTuning.style()).ordinal();
        if (ordinal == 1) {
            this.f.setVisibility(0);
        } else if (ordinal == 2) {
            this.g.setVisibility(0);
        }
    }
}
