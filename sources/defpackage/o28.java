package defpackage;

import android.app.Activity;
import android.net.Uri;
import com.google.common.base.MoreObjects;
import com.spotify.android.flags.c;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.x;
import com.spotify.music.navigation.t;
import com.spotify.music.spotlets.radio.model.RadioStationModel;

/* renamed from: o28  reason: default package */
public class o28 {
    private final Activity a;
    private final c b;
    private final t c;
    private final jz1 d;
    private final cqe e;
    private final b4<RadioStationModel> f = new a();

    /* renamed from: o28$a */
    class a implements b4<RadioStationModel> {
        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.spotify.mobile.android.ui.contextmenu.b4
        public r3 p0(RadioStationModel radioStationModel) {
            RadioStationModel radioStationModel2 = radioStationModel;
            ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
            o28.this.f(contextMenuViewModel, radioStationModel2, new c38(o28.this.a, o28.b(o28.this), radioStationModel2.stationUri, contextMenuViewModel, o28.this.c, o28.this.d, o28.this.e));
            return cx1.b(contextMenuViewModel);
        }
    }

    public o28(Activity activity, ifd ifd, c cVar, t tVar, jz1 jz1, boolean z, cqe cqe) {
        this.a = activity;
        this.b = cVar;
        this.c = tVar;
        this.d = jz1;
        this.e = cqe;
    }

    static /* synthetic */ ifd b(o28 o28) {
        o28.getClass();
        return kfd.A;
    }

    /* access modifiers changed from: package-private */
    public void f(ContextMenuViewModel contextMenuViewModel, RadioStationModel radioStationModel, c38 c38) {
        String d2 = agd.d(radioStationModel.uri);
        int ordinal = l0.z(d2).q().ordinal();
        if (ordinal == 6) {
            c38.b(d2, radioStationModel.title);
        } else if (ordinal == 14) {
            c38.c(d2, radioStationModel.title);
        } else if (ordinal == 185 || ordinal == 210) {
            c38.d(d2, radioStationModel.title);
        } else if (ordinal == 273 && !MoreObjects.isNullOrEmpty(radioStationModel.subtitleUri) && !MoreObjects.isNullOrEmpty(radioStationModel.subtitle)) {
            c38.c(radioStationModel.subtitleUri, radioStationModel.subtitle);
        }
        String b2 = com.spotify.music.spotlets.scannables.c.b(radioStationModel.uri);
        contextMenuViewModel.y(ContextMenuViewModel.HeaderViewType.LARGE_IMAGE);
        contextMenuViewModel.x(Uri.parse((String) x.n(b2, "")));
        contextMenuViewModel.i().n(radioStationModel.title);
        contextMenuViewModel.i().m(agd.e(this.a, l0.z(agd.d(radioStationModel.uri))));
    }

    public b4<RadioStationModel> g() {
        return this.f;
    }
}
