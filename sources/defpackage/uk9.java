package defpackage;

import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.ubi.interactions.InteractionAction;
import com.spotify.music.ubi.interactions.a;

/* renamed from: uk9  reason: default package */
public class uk9 {
    private final jz1 a;
    private final String b;
    private final cqe c;

    public uk9(jz1 jz1, String str, cqe cqe) {
        this.a = jz1;
        this.b = str;
        this.c = cqe;
    }

    private void c(String str, InteractionAction interactionAction, String str2, String str3, int i, String str4) {
        m91 m91;
        if (interactionAction != null) {
            m91 = new ga1(null, this.b, str3, str4, (long) i, str2, "hit", str, (double) this.c.d(), interactionAction.d());
        } else {
            m91 = new fa1(null, this.b, str3, str4, (long) i, str2, "hit", str, (double) this.c.d());
        }
        this.a.a(m91);
    }

    public void a(boolean z, String str, String str2) {
        c(z ? "ban-disable" : "ban-enable", null, str, str2, 0, "ban-button");
    }

    public void b(boolean z, String str, String str2) {
        InteractionAction interactionAction;
        String str3;
        if (z) {
            interactionAction = a.b(str);
            str3 = "like-disable";
        } else {
            interactionAction = a.a(str);
            str3 = "like-enable";
        }
        c(str3, interactionAction, str, str2, 0, "like-button");
    }

    public void d(boolean z, String str, String str2) {
        c(z ? "remove-all-tracks-album-from-collection" : "add-all-tracks-album-to-collection", null, str, str2, -1, "context-menu");
    }

    public void e(String str) {
        c("navigate-forward", null, str, str, -1, l0.z(str).q() == LinkType.ARTIST ? "open_artist_from_track" : "open_album_from_track");
    }

    public void f(String str) {
        c("lets-go", null, str, str, -1, "pre-curation-dialog");
    }

    public void g(String str) {
        c("not-now", null, str, str, -1, "pre-curation-dialog");
    }

    public void h(String str, String str2) {
        c("share", null, str, null, -1, "share-button");
    }
}
