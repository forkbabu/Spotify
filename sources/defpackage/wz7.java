package defpackage;

import com.spotify.inappmessaging.j;
import com.spotify.music.features.addtoplaylist.d;
import java.util.Collections;

/* renamed from: wz7  reason: default package */
public final /* synthetic */ class wz7 implements j {
    public final /* synthetic */ d a;

    public /* synthetic */ wz7(d dVar) {
        this.a = dVar;
    }

    @Override // com.spotify.inappmessaging.j
    public final void a(String str, String str2) {
        this.a.a(Collections.singletonList(str2), "InAppMessaging", "InAppMessaging");
    }
}
