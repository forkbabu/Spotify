package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.follow.j;
import com.spotify.music.follow.m;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.n;
import com.spotify.music.navigation.o;
import com.spotify.music.ubi.interactions.InteractionAction;

@Deprecated
/* renamed from: l71  reason: default package */
public class l71 implements d81 {
    private final Context b;
    private final c.a c;
    private final p71 d;
    private final m e;
    private final String f;

    public l71(Context context, c.a aVar, p71 p71, m mVar, String str) {
        context.getClass();
        this.b = context;
        aVar.getClass();
        this.c = aVar;
        p71.getClass();
        this.d = p71;
        mVar.getClass();
        this.e = mVar;
        str.getClass();
        this.f = str;
    }

    @Override // defpackage.d81
    public void a(a91 a91, s81 s81) {
        boolean z;
        String uri;
        for (String str : a91.actions()) {
            if (!"toggle-follow".equals(str) || (uri = a91.uri()) == null) {
                z = false;
                continue;
            } else {
                j c2 = this.e.c(uri);
                z = true;
                if (c2 != null) {
                    boolean z2 = !c2.g();
                    this.e.e(uri, z2);
                    this.d.a(uri, s81, z2 ? "follow" : "unfollow", z2 ? InteractionAction.FOLLOW : InteractionAction.UNFOLLOW);
                    continue;
                } else {
                    StringBuilder a1 = je.a1("Follow Data missing for URI: ", uri, ", owner: ");
                    a1.append(this.c.getViewUri());
                    Assertion.g(a1.toString());
                    continue;
                }
            }
            if (z) {
                return;
            }
        }
        String uri2 = a91.uri();
        if (uri2 != null) {
            this.b.startActivity(new o(this.b.getApplicationContext(), this.f).b(n.a(uri2).a()));
            this.d.a(uri2, s81, "navigate-forward", null);
        }
    }
}
