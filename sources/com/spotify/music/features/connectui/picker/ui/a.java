package com.spotify.music.features.connectui.picker.ui;

import android.view.View;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.model.Tech;
import com.spotify.music.features.connectui.picker.legacy.util.b;
import com.spotify.music.features.connectui.picker.legacy.util.f;
import com.spotify.music.features.connectui.picker.ui.e;
import com.spotify.music.sociallistening.models.Participant;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class a implements e {
    private ListeningOnView a;
    private e.a b;
    private String c = "";
    private String d = "";
    private e.b e = new e.b.C0226b(false, 1);
    private e.b.C0226b f;
    private final com.spotify.music.features.connectui.picker.frictionlessjoin.ui.facepile.a g;
    private final f h;
    private final c i;
    private final b j;

    /* renamed from: com.spotify.music.features.connectui.picker.ui.a$a  reason: collision with other inner class name */
    static final class View$OnClickListenerC0225a implements View.OnClickListener {
        final /* synthetic */ a a;
        final /* synthetic */ GaiaDevice b;

        View$OnClickListenerC0225a(a aVar, GaiaDevice gaiaDevice) {
            this.a = aVar;
            this.b = gaiaDevice;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            e.a aVar = this.a.b;
            if (aVar != null) {
                ((ps4) aVar).a.o(this.b);
            }
        }
    }

    public a(f fVar, c cVar, b bVar, com.spotify.music.features.connectui.picker.frictionlessjoin.ui.facepile.b bVar2) {
        h.e(fVar, "connectStringBuilder");
        h.e(cVar, "iconProvider");
        h.e(bVar, "connectDeviceEvaluator");
        h.e(bVar2, "facePileAdapterFactory");
        this.h = fVar;
        this.i = cVar;
        this.j = bVar;
        com.spotify.music.features.connectui.picker.frictionlessjoin.ui.facepile.a b2 = bVar2.b();
        h.d(b2, "facePileAdapterFactory.create()");
        this.g = b2;
    }

    private final void l(ListeningOnView listeningOnView) {
        String g2 = this.h.g(this.d, this.c);
        boolean z = false;
        if (this.d.length() > 0) {
            if (this.c.length() > 0) {
                z = true;
            }
            if (z) {
                listeningOnView.setContentDescription(g2);
            }
        }
    }

    @Override // com.spotify.music.features.connectui.picker.ui.e
    public void a() {
        ListeningOnView listeningOnView = this.a;
        if (listeningOnView != null && (this.e instanceof e.b.C0226b)) {
            listeningOnView.J();
        }
    }

    @Override // com.spotify.music.features.connectui.picker.ui.e
    public void b(e.a aVar) {
        this.b = aVar;
    }

    @Override // com.spotify.music.features.connectui.picker.ui.e
    public void c() {
        ListeningOnView listeningOnView = this.a;
        if (listeningOnView == null) {
            return;
        }
        if (this.e instanceof e.b.C0226b) {
            String b2 = this.h.b(false);
            h.d(b2, "connectStringBuilder.buildListeningOnString(false)");
            this.d = b2;
            listeningOnView.U();
            l(listeningOnView);
            return;
        }
        this.f = new e.b.C0226b(false, 1);
    }

    @Override // com.spotify.music.features.connectui.picker.ui.e
    public void d(GaiaDevice gaiaDevice) {
        String str;
        h.e(gaiaDevice, "activeDevice");
        ListeningOnView listeningOnView = this.a;
        if (listeningOnView != null) {
            if (gaiaDevice.isSelf()) {
                str = this.h.h();
                h.d(str, "connectStringBuilder.localDeviceName");
            } else {
                str = gaiaDevice.getName();
                h.d(str, "activeDevice.name");
            }
            listeningOnView.setDeviceName(str);
            String d2 = this.h.d(gaiaDevice);
            h.d(d2, "connectStringBuilder.get…criptionFor(activeDevice)");
            this.c = d2;
            l(listeningOnView);
        }
    }

    @Override // com.spotify.music.features.connectui.picker.ui.e
    public void e() {
        ListeningOnView listeningOnView = this.a;
        if (listeningOnView == null) {
            return;
        }
        if (this.e instanceof e.b.C0226b) {
            String b2 = this.h.b(true);
            h.d(b2, "connectStringBuilder.buildListeningOnString(true)");
            this.d = b2;
            listeningOnView.V();
            l(listeningOnView);
            return;
        }
        this.f = new e.b.C0226b(true);
    }

    @Override // com.spotify.music.features.connectui.picker.ui.e
    public void f(GaiaDevice gaiaDevice) {
        h.e(gaiaDevice, "activeDevice");
        ListeningOnView listeningOnView = this.a;
        if (listeningOnView != null) {
            listeningOnView.setDeviceTypeIcon(this.i.c(gaiaDevice.getType(), gaiaDevice.isGrouped()));
            if (Tech.isCast(gaiaDevice)) {
                listeningOnView.Y();
                listeningOnView.setActiveDeviceIconForSubtitle(this.i.b());
            } else {
                listeningOnView.E();
            }
            listeningOnView.setActiveContextMenuIcon(this.i.d());
        }
    }

    @Override // com.spotify.music.features.connectui.picker.ui.e
    public void g(GaiaDevice gaiaDevice) {
        h.e(gaiaDevice, "activeDevice");
        ListeningOnView listeningOnView = this.a;
        if (listeningOnView != null) {
            if (this.j.b(gaiaDevice)) {
                listeningOnView.W();
            } else {
                listeningOnView.D();
            }
            listeningOnView.setContextMenuClickListener(new View$OnClickListenerC0225a(this, gaiaDevice));
        }
    }

    @Override // com.spotify.music.features.connectui.picker.ui.e
    public void h() {
        ListeningOnView listeningOnView = this.a;
        if (listeningOnView != null && (this.e instanceof e.b.C0226b)) {
            listeningOnView.b0();
        }
    }

    @Override // com.spotify.music.features.connectui.picker.ui.e
    public void i(e.b bVar) {
        h.e(bVar, "newState");
        this.e = bVar;
        if (bVar instanceof e.b.a) {
            String a2 = this.h.a();
            h.d(a2, "connectStringBuilder.buildGroupSessionOnString()");
            this.d = a2;
            ListeningOnView listeningOnView = this.a;
            if (listeningOnView != null) {
                listeningOnView.P();
                l(listeningOnView);
                com.spotify.music.features.connectui.picker.frictionlessjoin.ui.facepile.a aVar = this.g;
                List<Participant> a3 = ((e.b.a) bVar).a();
                ArrayList arrayList = new ArrayList(d.e(a3, 10));
                for (T t : a3) {
                    h.e(t, "participant");
                    arrayList.add(new com.spotify.music.features.connectui.picker.frictionlessjoin.model.d(t.getId(), t.getDisplayName(), t.getImageUrl(), t.isHost(), t.getUsername()));
                }
                aVar.Y(arrayList);
                listeningOnView.a0();
            }
        } else if (bVar instanceof e.b.C0226b) {
            e.b.C0226b bVar2 = this.f;
            if (bVar2 == null) {
                c();
            } else if (bVar2.a()) {
                e();
            } else {
                c();
            }
            ListeningOnView listeningOnView2 = this.a;
            if (listeningOnView2 != null) {
                listeningOnView2.G();
            }
            this.f = null;
        }
    }

    @Override // com.spotify.music.features.connectui.picker.ui.e
    public void j(ListeningOnView listeningOnView) {
        h.e(listeningOnView, "listeningOnView");
        this.a = listeningOnView;
        listeningOnView.setActiveContextMenuIcon(this.i.d());
        listeningOnView.setParticipantsFacePileAdapter(this.g);
    }
}
