package defpackage;

import com.spotify.mobile.android.util.connectivity.ConnectionType;
import io.reactivex.functions.g;
import java.util.List;

/* renamed from: mne  reason: default package */
public final /* synthetic */ class mne implements g {
    public final /* synthetic */ vne a;
    public final /* synthetic */ List b;
    public final /* synthetic */ String c;

    public /* synthetic */ mne(vne vne, List list, String str) {
        this.a = vne;
        this.b = list;
        this.c = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        vne vne = this.a;
        List<com.spotify.superbird.ota.model.g> list = this.b;
        String str = this.c;
        ConnectionType connectionType = (ConnectionType) obj;
        vne.getClass();
        for (com.spotify.superbird.ota.model.g gVar : list) {
            vne.c(str, gVar, true);
        }
    }
}
