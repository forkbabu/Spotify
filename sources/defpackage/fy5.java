package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.SpannableString;
import androidx.core.app.h;
import androidx.core.app.k;
import androidx.core.content.a;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.primitives.Ints;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.o;
import com.spotify.music.C0707R;
import com.spotify.music.libs.mediasession.m0;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fy5  reason: default package */
public class fy5 implements ey5 {
    private final Context a;
    private final pz5 b;
    private final o c;
    private final m0 d;
    private final String e;

    public fy5(Context context, pz5 pz5, o oVar, m0 m0Var, String str) {
        context.getClass();
        this.a = context;
        this.b = pz5;
        this.c = oVar;
        this.d = m0Var;
        this.e = str;
    }

    @Override // defpackage.ey5
    public Notification a(PlayerState playerState, Optional<String> optional, c cVar, Bitmap bitmap, String str) {
        SpannableString spannableString;
        uy5 a2 = this.b.a(playerState, cVar);
        Context context = this.a;
        SpannableString b2 = a2.b(playerState);
        SpannableString d2 = a2.d(playerState);
        if (optional.isPresent()) {
            spannableString = new SpannableString(z42.m(context.getResources().getString(C0707R.string.connect_bar_listening_on, optional.get())));
        } else {
            spannableString = a2.a(playerState);
        }
        boolean z = !optional.isPresent() && !playerState.isPaused();
        String str2 = playerState.track().get().metadata().get("title");
        if (str2 == null) {
            str2 = "";
        }
        StringBuilder sb = new StringBuilder(str2);
        String a3 = kxd.a(playerState.track().get());
        if (!MoreObjects.isNullOrEmpty(a3)) {
            sb.append(" — ");
            sb.append(a3);
        }
        vx5 vx5 = new vx5(b2, d2, spannableString, z, sb.toString());
        k kVar = new k(this.a, str);
        Intent intent = new Intent("com.spotify.mobile.android.ui.action.player.SHOW");
        intent.setFlags(805306368);
        intent.setClassName(this.a, this.e);
        kVar.h(PendingIntent.getActivity(this.a, 0, intent, 134217728));
        kVar.z(C0707R.drawable.icn_notification);
        kVar.q(bitmap);
        kVar.j(vx5.b());
        kVar.i(vx5.a());
        kVar.C(vx5.d());
        Context context2 = this.a;
        kVar.n(PendingIntent.getService(context2, 0, this.c.c(context2, "com.spotify.mobile.android.service.action.player.NOTIFICATION_SHUTDOWN"), 134217728));
        kVar.u(vx5.c());
        kVar.G(0);
        kVar.g(a.b(this.a, C0707R.color.notification_bg_color));
        kVar.F(1);
        kVar.v(true);
        kVar.D(vx5.e());
        ArrayList arrayList = new ArrayList(3);
        List<cy5> e2 = a2.e(playerState);
        for (int i = 0; i < e2.size(); i++) {
            cy5 cy5 = e2.get(i);
            kVar.b.add(new h(cy5.d().b(), this.a.getResources().getString(cy5.d().c()), cy5.b()));
            if (cy5.c()) {
                if (arrayList.size() != 3) {
                    arrayList.add(Integer.valueOf(i));
                } else {
                    throw new IllegalStateException("Can't have more than 3 compact actions!");
                }
            }
        }
        f6 f6Var = new f6();
        f6Var.l(this.d.getToken());
        f6Var.n(true);
        Context context3 = this.a;
        f6Var.k(PendingIntent.getService(context3, 0, this.c.c(context3, "com.spotify.mobile.android.service.action.player.NOTIFICATION_SHUTDOWN"), 134217728));
        f6Var.m(Ints.toArray(arrayList));
        kVar.B(f6Var);
        return kVar.a();
    }
}
