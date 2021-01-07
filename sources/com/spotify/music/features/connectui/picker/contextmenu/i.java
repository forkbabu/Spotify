package com.spotify.music.features.connectui.picker.contextmenu;

import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.libs.connect.instrumentation.e;
import com.spotify.music.libs.viewuri.ViewUris;

/* access modifiers changed from: package-private */
public class i {
    private final oba a;
    private final e b;
    private int c;
    private String d;

    i(oba oba, e eVar) {
        this.a = oba;
        this.b = eVar;
    }

    /* access modifiers changed from: package-private */
    public void a(String str, int i) {
        this.d = str;
        this.c = i;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.a.a(je.B0(je.V0("connect-context-menu/"), this.c, "/item/"), InteractionIntent.FORGET_DEVICE, PageIdentifiers.CONNECT_CONTEXTMENU, ViewUris.A1);
        ((zt0) this.b.a()).b(this.d, this.c);
    }

    /* access modifiers changed from: package-private */
    public void c(boolean z) {
        InteractionIntent interactionIntent;
        if (z) {
            interactionIntent = InteractionIntent.DEFAULT_CAST;
            ((zt0) this.b.a()).l(this.d, this.c);
        } else {
            interactionIntent = InteractionIntent.DEFAULT_CONNECT;
            ((zt0) this.b.a()).m(this.d, this.c);
        }
        this.a.a(je.B0(je.V0("connect-context-menu/"), this.c, "/item/"), interactionIntent, PageIdentifiers.CONNECT_CONTEXTMENU, ViewUris.A1);
    }

    /* access modifiers changed from: package-private */
    public void d(String str, String str2, boolean z) {
        this.a.a(je.B0(je.V0("connect-context-menu/"), this.c, "/item/"), InteractionIntent.GROUP_ROOMS, PageIdentifiers.CONNECT_CONTEXTMENU, ViewUris.A1);
        if (z) {
            ((zt0) this.b.a()).c(this.d, str, this.c);
            return;
        }
        ((zt0) this.b.a()).c(this.d, str2, this.c);
    }
}
