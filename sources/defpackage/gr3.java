package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.content.a;
import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.music.ads.voice.VoiceAdService;
import com.spotify.music.productstate.c;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.p;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;

/* renamed from: gr3  reason: default package */
public class gr3 implements d {
    private final Context a;
    private final g<PlayerState> b;
    private final c c;
    private final xr3 f;
    private final ov3 n;
    private final p o = new p();
    private final y p;
    private final y q;

    public gr3(Context context, g<PlayerState> gVar, c cVar, xr3 xr3, ov3 ov3, y yVar, y yVar2) {
        this.a = context;
        this.b = gVar;
        this.c = cVar;
        this.f = xr3;
        this.n = ov3;
        this.p = yVar;
        this.q = yVar2;
    }

    public v a(String str) {
        if (this.n.a()) {
            return s.n(this.f.a().Q(yq3.a).j0(nq3.a).E().Q(tq3.a), new io.reactivex.internal.operators.observable.v(this.b.C(xq3.a).O(wq3.a).s()), ar3.a);
        }
        return o.a;
    }

    public void b(u3 u3Var) {
        F f2 = u3Var.a;
        if (f2 == null || u3Var.b == null || !TextUtils.equals(f2.uri(), u3Var.b)) {
            VoiceAdService.g(this.a);
            return;
        }
        Context context = this.a;
        VoiceAdService.g(context);
        Intent intent = new Intent(context, VoiceAdService.class);
        intent.putExtra("voice_ad", (Parcelable) u3Var.a);
        int i = a.b;
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.o.b(this.c.b().W(new uq3(this), false, Integer.MAX_VALUE).I0(this.p).o0(this.q).subscribe(new vq3(this)));
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.o.a();
        VoiceAdService.g(this.a);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "VoiceAdPlugin";
    }
}
