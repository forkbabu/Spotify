package defpackage;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.music.C0707R;
import com.spotify.music.sociallistening.models.b;
import io.reactivex.functions.g;
import io.reactivex.s;
import kotlin.jvm.internal.h;

/* renamed from: l4d  reason: default package */
public final class l4d implements k4d {
    private final Context b;
    private final f4d c;
    private final cfd d;

    /* renamed from: l4d$a */
    static final class a<T> implements g<Throwable> {
        public static final a a = new a();

        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            Logger.e(th, "Social listening: Failed observing social listening state", new Object[0]);
        }
    }

    public l4d(Context context, f4d f4d, cfd cfd) {
        h.e(context, "context");
        h.e(f4d, "socialListening");
        h.e(cfd, "socialListeningProperties");
        this.b = context;
        this.c = f4d;
        this.d = cfd;
    }

    @Override // defpackage.k4d
    public s<b> a() {
        if (this.d.c()) {
            s<b> s0 = this.c.a().L(a.a).s0(b.n);
            h.d(s0, "socialListening\n        …alListeningState.DEFAULT)");
            return s0;
        }
        s<b> i0 = s.i0(b.n);
        h.d(i0, "Observable.just(SocialListeningState.DEFAULT)");
        return i0;
    }

    @Override // defpackage.k4d
    public String b(GaiaDevice gaiaDevice, b bVar) {
        h.e(bVar, "socialListeningState");
        Context context = this.b;
        h.e(context, "context");
        h.e(bVar, "socialListeningState");
        StringBuilder sb = new StringBuilder();
        if (gaiaDevice != null && !gaiaDevice.isSelf()) {
            sb.append(gaiaDevice.getName());
        }
        int size = bVar.d().size();
        if (size >= 2) {
            if (sb.length() > 0) {
                sb.append(" • ");
            }
            sb.append(context.getResources().getQuantityString(C0707R.plurals.social_listening_participants_listening, size, Integer.valueOf(size)));
        }
        String sb2 = sb.toString();
        h.d(sb2, "nameStringBuilder.toString()");
        return sb2;
    }
}
