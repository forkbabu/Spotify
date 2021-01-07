package defpackage;

import android.content.Context;
import com.google.common.base.MoreObjects;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.service.g0;

/* renamed from: mz1  reason: default package */
public final class mz1 implements nfd {
    private final Context a;

    public mz1(Context context) {
        context.getClass();
        this.a = context;
    }

    @Override // defpackage.nfd
    public void a(RadioStationModel radioStationModel, c cVar, ifd ifd, yn0 yn0) {
        radioStationModel.getClass();
        cVar.getClass();
        ifd.getClass();
        yn0.getClass();
        g0 g0Var = new g0();
        g0Var.i(radioStationModel);
        g0Var.k(cVar);
        g0Var.c(ifd);
        g0Var.e(yn0);
        this.a.startService(g0Var.a(this.a));
    }

    @Override // defpackage.nfd
    public void b(String[] strArr, c cVar, boolean z, boolean z2, int i, long j, ifd ifd, yn0 yn0, String[] strArr2) {
        MoreObjects.checkArgument(strArr.length > 0);
        cVar.getClass();
        g0 g0Var = new g0();
        g0Var.f(strArr);
        g0Var.k(cVar);
        g0Var.d(z);
        g0Var.b(z2);
        g0Var.h(i);
        g0Var.g(j);
        g0Var.c(ifd);
        g0Var.e(yn0);
        g0Var.j(null);
        this.a.startService(g0Var.a(this.a));
    }

    @Override // defpackage.nfd
    public void c(String[] strArr, c cVar, boolean z, boolean z2, int i, ifd ifd, yn0 yn0, String[] strArr2) {
        MoreObjects.checkArgument(strArr.length > 0);
        cVar.getClass();
        yn0.getClass();
        g0 g0Var = new g0();
        g0Var.f(strArr);
        g0Var.k(cVar);
        g0Var.d(z);
        g0Var.b(z2);
        g0Var.h(i);
        g0Var.c(ifd);
        g0Var.e(yn0);
        g0Var.j(strArr2);
        this.a.startService(g0Var.a(this.a));
    }

    @Override // defpackage.nfd
    public void d(RadioStationModel radioStationModel, c cVar, ifd ifd, yn0 yn0, int i) {
        g0 g0Var = new g0();
        g0Var.i(radioStationModel);
        g0Var.k(cVar);
        g0Var.h(i);
        g0Var.c(ifd);
        g0Var.e(yn0);
        this.a.startService(g0Var.a(this.a));
    }
}
