package defpackage;

import com.spotify.music.features.profile.editprofile.p;
import com.spotify.music.features.profile.editprofile.utils.a;
import defpackage.km7;
import io.reactivex.functions.g;

/* renamed from: sm7  reason: default package */
public final /* synthetic */ class sm7 implements g {
    public final /* synthetic */ p a;
    public final /* synthetic */ a b;
    public final /* synthetic */ ro7 c;

    public /* synthetic */ sm7(p pVar, a aVar, ro7 ro7) {
        this.a = pVar;
        this.b = aVar;
        this.c = ro7;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        p pVar = this.a;
        a aVar = this.b;
        ro7 ro7 = this.c;
        km7.d dVar = (km7.d) obj;
        pVar.e();
        aVar.f();
        ((so7) ro7).e();
    }
}
