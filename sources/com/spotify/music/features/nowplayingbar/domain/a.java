package com.spotify.music.features.nowplayingbar.domain;

import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.picker.view.d;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;

public final class a {
    private final d a;
    private final List<GaiaDevice> b;

    public a() {
        this(null, null, 3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.spotify.libs.connect.model.GaiaDevice> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(d dVar, List<? extends GaiaDevice> list) {
        h.e(dVar, "buttonState");
        h.e(list, "devices");
        this.a = dVar;
        this.b = list;
    }

    public final d a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.a(this.a, aVar.a) && h.a(this.b, aVar.b);
    }

    public int hashCode() {
        d dVar = this.a;
        int i = 0;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        List<GaiaDevice> list = this.b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ConnectState(buttonState=");
        V0.append(this.a);
        V0.append(", devices=");
        return je.L0(V0, this.b, ")");
    }

    public a(d dVar, List list, int i) {
        d dVar2;
        EmptyList emptyList = null;
        if ((i & 1) != 0) {
            dVar2 = d.a;
            h.d(dVar2, "ConnectButtonState.UNKNOWN");
        } else {
            dVar2 = null;
        }
        emptyList = (i & 2) != 0 ? EmptyList.a : emptyList;
        h.e(dVar2, "buttonState");
        h.e(emptyList, "devices");
        this.a = dVar2;
        this.b = emptyList;
    }
}
