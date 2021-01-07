package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.libs.voice.e;

/* renamed from: xab  reason: default package */
public class xab {
    private final jz1 a;
    private final e b;
    private final cqe c;

    public xab(jz1 jz1, e eVar, cqe cqe) {
        this.a = jz1;
        this.b = eVar;
        this.c = cqe;
    }

    public void a(View view, ViewGroup viewGroup, c.a aVar, boolean z) {
        Handler handler;
        if (viewGroup != null && (handler = viewGroup.getHandler()) != null) {
            handler.postDelayed(new rab(view, z, viewGroup), 5000);
            this.b.i(true);
            this.a.a(new da1(null, kfd.f1.getName(), aVar.getViewUri().toString(), "search-page-voice-tooltip-1", 0, null, "page", null, (double) this.c.d()));
        }
    }
}
