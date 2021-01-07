package defpackage;

import com.spotify.inappmessaging.j;
import com.spotify.music.features.createplaylist.d;
import java.util.Collections;

/* renamed from: b08  reason: default package */
public final /* synthetic */ class b08 implements j {
    public final /* synthetic */ d a;
    public final /* synthetic */ d28 b;

    public /* synthetic */ b08(d dVar, d28 d28) {
        this.a = dVar;
        this.b = d28;
    }

    @Override // com.spotify.inappmessaging.j
    public final void a(String str, String str2) {
        d dVar = this.a;
        d28 d28 = this.b;
        dVar.a(Collections.emptyList(), "InAppMessaging", str2);
        d28.b(str, str2);
    }
}
