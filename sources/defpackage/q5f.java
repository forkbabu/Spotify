package defpackage;

import android.util.Base64;
import com.adjust.sdk.Constants;
import com.spotify.music.preview.v;
import defpackage.p2f;
import io.reactivex.functions.a;

/* renamed from: q5f  reason: default package */
public final /* synthetic */ class q5f implements a {
    public final /* synthetic */ p2f.o a;
    public final /* synthetic */ v b;

    public /* synthetic */ q5f(p2f.o oVar, v vVar) {
        this.a = oVar;
        this.b = vVar;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        p2f.o oVar = this.a;
        v vVar = this.b;
        String a2 = lg0.a(Base64.decode(oVar.a().getAudioFiles().get(0).fileId(), 0));
        int seconds = oVar.a().seconds();
        if (seconds <= 0) {
            vVar.k(a2);
        } else {
            vVar.d(a2, (long) (seconds * Constants.ONE_SECOND));
        }
    }
}
