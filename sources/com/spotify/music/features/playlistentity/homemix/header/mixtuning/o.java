package com.spotify.music.features.playlistentity.homemix.header.mixtuning;

import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.connection.l;
import com.spotify.music.features.playlistentity.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.playlistentity.homemix.models.HomeMix;
import com.spotify.music.features.playlistentity.homemix.models.HomeMixTuning;
import com.spotify.music.features.playlistentity.t;
import com.spotify.playlist.endpoints.i;
import com.spotify.playlist.models.j;
import io.reactivex.d0;
import io.reactivex.disposables.a;
import io.reactivex.s;
import io.reactivex.y;
import io.reactivex.z;
import retrofit2.v;

public class o {
    private final y a;
    private final i b;
    private final wb6 c;
    private final me6 d;
    private final com.spotify.music.features.playlistentity.homemix.o e;
    private final String f;
    private final a g = new a();
    private final HomeMixFormatListAttributesHelper h;
    private final ye6<v<Void>> i;
    private id6 j;
    private HomeMix k;

    public o(y yVar, i iVar, wb6 wb6, me6 me6, com.spotify.music.features.playlistentity.homemix.o oVar, String str, HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper, l lVar) {
        this.a = yVar;
        this.b = iVar;
        this.c = wb6;
        this.d = me6;
        this.e = oVar;
        this.f = str;
        this.h = homeMixFormatListAttributesHelper;
        this.i = new ye6<>(lVar, c.a);
    }

    public static s a(o oVar, HomeMixTuning homeMixTuning) {
        return oVar.c.a(oVar.f, homeMixTuning).f(oVar.i).s(new k(oVar, homeMixTuning)).P();
    }

    public /* synthetic */ void b(HomeMixTuning.Style style, Boolean bool) {
        int ordinal = style.ordinal();
        if (ordinal == 1) {
            this.d.a(bool);
        } else if (ordinal == 2) {
            this.d.g(bool);
        }
    }

    public /* synthetic */ HomeMixTuning c(HomeMixTuning.Style style, Boolean bool) {
        if (!bool.booleanValue()) {
            style = HomeMixTuning.Style.DEFAULT;
        }
        return HomeMixTuning.create(style, this.k.excludedUserIds());
    }

    public /* synthetic */ d0 d(HomeMixTuning homeMixTuning, xe6 xe6) {
        if (xe6.i()) {
            return this.b.d(this.f).h(z.z(xe6.k(homeMixTuning)));
        }
        return z.z(xe6.b(xe6.e()));
    }

    public xe6 e(xe6 xe6) {
        if (xe6.i()) {
            HomeMixTuning homeMixTuning = (HomeMixTuning) xe6.d();
            this.j.b();
            if (!this.e.a()) {
                this.j.m(homeMixTuning);
                this.e.b();
            }
        }
        return xe6;
    }

    public /* synthetic */ void f(View view, xe6 xe6) {
        view.setEnabled(true);
        if (xe6.f() || xe6.h()) {
            view.setSelected(true ^ view.isSelected());
            if (xe6.f()) {
                this.j.k();
            } else if (xe6.h()) {
                this.j.l();
            }
            Logger.d(xe6.toString(), new Object[0]);
        }
    }

    public /* synthetic */ void g(View view, Throwable th) {
        view.setEnabled(true);
        view.setSelected(true ^ view.isSelected());
        this.j.k();
        Logger.d(th.getMessage(), new Object[0]);
    }

    public /* synthetic */ HomeMix h(j jVar) {
        HomeMix c2 = this.h.c(jVar);
        this.k = c2;
        if (c2 != null) {
            return c2;
        }
        throw new IllegalStateException("Could not parse format list attribute from metadata");
    }

    public /* synthetic */ void i(HomeMix homeMix) {
        this.j.h(homeMix.style());
        this.j.i(homeMix.planType());
    }

    public /* synthetic */ void j(Throwable th) {
        Logger.b(th.getMessage(), new Object[0]);
        this.j.a();
    }

    public void k(View view, HomeMixTuning.Style style, View view2) {
        this.g.b(z.z(Boolean.valueOf(view.isSelected())).A(new i(view2, view)).p(new d(this, style)).A(new a(this, style)).v(new g(this)).o0(this.a).j0(new j(this)).subscribe(new b(this, view), new e(this, view)));
    }

    public void l(id6 id6) {
        this.j = id6;
    }

    public void m(t.b bVar) {
        this.g.f();
        this.g.b(bVar.a().b().j0(m.a).j0(new h(this)).o0(io.reactivex.android.schedulers.a.b()).subscribe(new l(this), new f(this)));
    }

    public void n() {
        this.g.f();
    }
}
