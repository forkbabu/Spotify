package defpackage;

import defpackage.iq6;
import kotlin.f;
import kotlin.jvm.internal.h;

/* renamed from: kq6  reason: default package */
public class kq6 implements nmf<iq6, f> {
    private final wec a;
    private final String b;

    public kq6(wec wec, String str) {
        h.e(wec, "assistedCurationNavigator");
        h.e(str, "playlistUri");
        this.a = wec;
        this.b = str;
    }

    public void a(iq6 iq6) {
        h.e(iq6, "addRemoveMode");
        if (iq6 instanceof iq6.a) {
            this.a.b(this.b, 30, "PremiumMiniDownloadedPlaylistTrackHandler", null, null, new String[0]);
        } else {
            h.a(iq6, iq6.b.a);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public /* bridge */ /* synthetic */ f invoke(iq6 iq6) {
        a(iq6);
        return f.a;
    }
}
