package defpackage;

import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.InteractionType;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.music.libs.viewuri.c;

/* renamed from: oba  reason: default package */
public class oba {
    private final jz1 a;

    public oba(jz1 jz1) {
        this.a = jz1;
    }

    public void a(String str, InteractionIntent interactionIntent, a aVar, c cVar) {
        String d = interactionIntent.d();
        this.a.a(new y91(d, str, InteractionType.TAP.d(), d, ((PageIdentifiers) aVar).path(), cVar.toString()));
    }

    public void b(String str, String str2, InteractionIntent interactionIntent, a aVar, c cVar) {
        this.a.a(new y91(str, str2, InteractionType.TAP.d(), interactionIntent.d(), ((PageIdentifiers) aVar).path(), cVar.toString()));
    }
}
