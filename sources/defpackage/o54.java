package defpackage;

import android.app.Activity;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.voice.VoiceSourceElement;
import com.spotify.music.libs.voice.b;
import com.spotify.ubi.specification.factories.a1;

/* renamed from: o54  reason: default package */
public class o54 implements a71 {
    private final b a;
    private final Activity b;
    private final zab c;
    private final a1 f;
    private final ere n;

    public o54(Activity activity, b bVar, zab zab, a1 a1Var, ere ere) {
        this.b = activity;
        this.a = bVar;
        this.c = zab;
        this.f = a1Var;
        this.n = ere;
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        this.c.f();
        this.n.a(this.f.c().a(ViewUris.f2.toString()));
        this.a.b(this.b, VoiceSourceElement.BROWSE_MIC_BUTTON, kfd.o);
    }
}
