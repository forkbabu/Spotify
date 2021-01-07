package defpackage;

import com.spotify.mobile.android.waze.model.WazeBannerModel;
import com.spotify.mobile.android.waze.model.b;
import com.spotify.music.nowplaying.drivingmode.view.waze.a;
import com.spotify.rxjava2.p;

/* renamed from: dvb  reason: default package */
public class dvb implements w82 {
    private final evb a;
    private final b b;
    private final p c = new p();
    private a d;

    public dvb(evb evb, b bVar) {
        this.a = evb;
        this.b = bVar;
    }

    public static void c(dvb dvb, WazeBannerModel wazeBannerModel) {
        a aVar = dvb.d;
        if (aVar != null) {
            aVar.b(wazeBannerModel);
            if (dvb.a.c()) {
                dvb.d.a();
            } else {
                dvb.d.c();
            }
        }
    }

    @Override // defpackage.w82
    public void a(v82 v82) {
    }

    @Override // defpackage.w82
    public void b() {
        this.a.b();
    }

    @Override // defpackage.w82
    public void close() {
        this.a.a();
    }

    public void d(a aVar) {
        aVar.getClass();
        this.d = aVar;
        aVar.setPresenter(this);
        if (this.a.c()) {
            this.d.a();
        } else {
            this.d.c();
        }
        this.c.b(this.b.b().E().subscribe(new tub(this), sub.a));
    }

    public void e() {
        this.c.a();
    }

    @Override // defpackage.w82
    public void onStop() {
    }
}
