package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.music.C0707R;
import com.spotify.music.features.connectui.picker.frictionlessjoin.ui.facepile.FacePile;
import defpackage.d5;
import defpackage.wt4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: dr4  reason: default package */
public class dr4 implements qu0 {
    private final wt4 a;
    private final com.spotify.music.features.connectui.picker.legacy.util.d b;
    private final com.spotify.music.features.connectui.picker.legacy.util.f c;
    private final com.spotify.music.features.connectui.picker.legacy.util.b d;
    private final com.spotify.libs.connect.instrumentation.e e;
    private final com.spotify.music.features.connectui.picker.frictionlessjoin.ui.facepile.b f;
    private final Map<String, List<com.spotify.music.features.connectui.picker.frictionlessjoin.model.d>> g = new HashMap();
    private b h;
    private g i;
    private f j;
    private wt4.a k;
    private boolean l;

    /* renamed from: dr4$b */
    public interface b {
    }

    /* renamed from: dr4$c */
    public static class c extends RecyclerView.b0 {
        public static final /* synthetic */ int H = 0;
        final TextView C;
        final TextView D;
        final ImageView E;
        final ImageView F;
        final ImageView G;

        public c(View view) {
            super(view);
            this.C = (TextView) view.findViewById(C0707R.id.picker_device_name);
            this.D = (TextView) view.findViewById(C0707R.id.picker_device_subtitle);
            this.E = (ImageView) view.findViewById(C0707R.id.picker_device_icon);
            this.F = (ImageView) view.findViewById(C0707R.id.picker_device_subtitle_icon);
            this.G = (ImageView) view.findViewById(C0707R.id.picker_device_context_menu);
        }
    }

    /* renamed from: dr4$d */
    public static class d extends c {
        public static final /* synthetic */ int K = 0;
        final Button I;
        final FacePile J;

        public d(View view) {
            super(view);
            this.I = (Button) view.findViewById(C0707R.id.picker_device_join_button);
            this.J = (FacePile) view.findViewById(C0707R.id.face_pile);
            view.post(new xq4(this, view));
        }
    }

    /* renamed from: dr4$e */
    private static class e extends z3 {
        private final Map<Integer, cr4> a = new LinkedHashMap(2);

        e(a aVar) {
        }

        public void a(cr4 cr4) {
            this.a.put(Integer.valueOf(cr4.a()), cr4);
        }

        public boolean b() {
            return !this.a.isEmpty();
        }

        @Override // defpackage.z3
        public void onInitializeAccessibilityNodeInfo(View view, d5 d5Var) {
            super.onInitializeAccessibilityNodeInfo(view, d5Var);
            for (cr4 cr4 : this.a.values()) {
                d5Var.b(new d5.a(cr4.a(), cr4.b()));
            }
        }

        @Override // defpackage.z3
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            cr4 cr4 = this.a.get(Integer.valueOf(i));
            if (cr4 == null) {
                return super.performAccessibilityAction(view, i, bundle);
            }
            cr4.c().performClick();
            return true;
        }
    }

    /* renamed from: dr4$f */
    public interface f {
    }

    /* renamed from: dr4$g */
    public interface g {
    }

    public dr4(wt4 wt4, com.spotify.music.features.connectui.picker.legacy.util.d dVar, com.spotify.music.features.connectui.picker.legacy.util.f fVar, com.spotify.music.features.connectui.picker.legacy.util.b bVar, com.spotify.libs.connect.instrumentation.e eVar, com.spotify.music.features.connectui.picker.frictionlessjoin.ui.facepile.b bVar2) {
        this.a = wt4;
        this.b = dVar;
        this.c = fVar;
        this.d = bVar;
        this.e = eVar;
        this.f = bVar2;
    }

    private static List<com.spotify.music.features.connectui.picker.frictionlessjoin.model.d> g(List<com.spotify.libs.connect.model.d> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (com.spotify.libs.connect.model.d dVar : list) {
            Logger.b("Participant entry %s", dVar.a());
            arrayList.add(new com.spotify.music.features.connectui.picker.frictionlessjoin.model.d(dVar.b(), dVar.a(), dVar.c(), dVar.f(), dVar.e()));
        }
        return arrayList;
    }

    @Override // defpackage.qu0
    public RecyclerView.b0 b(ViewGroup viewGroup, int i2) {
        d dVar;
        if (31 == i2) {
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            int i3 = c.H;
            dVar = new c(from.inflate(C0707R.layout.picker_device_row, viewGroup, false));
        } else {
            LayoutInflater from2 = LayoutInflater.from(viewGroup.getContext());
            int i4 = d.K;
            d dVar2 = new d(from2.inflate(C0707R.layout.picker_device_row_with_join, viewGroup, false));
            dVar2.J.setAdapter(this.f.b());
            dVar = dVar2;
        }
        dVar.G.setImageDrawable(this.b.c());
        dVar.F.setImageDrawable(this.b.a());
        dVar.C.setSelected(true);
        return dVar;
    }

    @Override // defpackage.qu0
    public int c() {
        return this.a.getItems().size();
    }

    @Override // defpackage.qu0
    public int[] e() {
        return new int[]{31, 32};
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01f8  */
    @Override // defpackage.qu0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(androidx.recyclerview.widget.RecyclerView.b0 r13, int r14) {
        /*
        // Method dump skipped, instructions count: 510
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr4.f(androidx.recyclerview.widget.RecyclerView$b0, int):void");
    }

    @Override // defpackage.qu0
    public long getItemId(int i2) {
        return (long) this.a.getItems().get(i2).hashCode();
    }

    @Override // defpackage.qu0
    public int getItemViewType(int i2) {
        return this.a.getItems().get(i2).isAvailableForJoin() ? 32 : 31;
    }

    public void h(boolean z, GaiaDevice gaiaDevice, int i2, View view) {
        f fVar;
        if (z && (fVar = this.j) != null) {
            ((ds4) fVar).a.r(gaiaDevice, i2);
        }
    }

    public void i(boolean z, GaiaDevice gaiaDevice, int i2, View view) {
        b bVar;
        if (z && (bVar = this.h) != null) {
            ((fs4) bVar).a.s(gaiaDevice, i2);
        }
    }

    public void j(GaiaDevice gaiaDevice, int i2, View view) {
        f fVar = this.j;
        if (fVar != null) {
            ((ds4) fVar).a.r(gaiaDevice, i2);
        }
    }

    public void k(GaiaDevice gaiaDevice, int i2, View view) {
        g gVar = this.i;
        if (gVar != null) {
            ((hs4) gVar).a.q(gaiaDevice, i2);
        }
    }

    public void l() {
        synchronized (this) {
            this.g.clear();
            for (GaiaDevice gaiaDevice : this.a.getItems()) {
                if (gaiaDevice.isAvailableForJoin()) {
                    Logger.b("Participants list preprocessed for %s", gaiaDevice.getName());
                    this.g.put(gaiaDevice.getCosmosIdentifier(), g(gaiaDevice.getFrictionlessJoinData().b()));
                }
            }
        }
        wt4.a aVar = this.k;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void m(b bVar) {
        this.h = bVar;
    }

    public void n(boolean z) {
        this.l = z;
    }

    public void o(f fVar) {
        this.j = fVar;
    }

    public void p(g gVar) {
        this.i = gVar;
    }

    public void q(wt4.a aVar) {
        this.k = aVar;
    }

    public void start() {
        this.a.start();
        this.a.f(new wq4(this));
    }

    public void stop() {
        this.a.stop();
    }
}
