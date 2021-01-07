package defpackage;

import com.spotify.music.limitedofflineendpoints.api.UserMixDataSource;
import com.spotify.rxjava2.p;
import io.reactivex.internal.operators.observable.z;
import io.reactivex.s;
import java.util.List;

/* renamed from: t1a  reason: default package */
public class t1a implements x1a {
    private final UserMixDataSource a;
    private final p b = new p();

    public t1a(UserMixDataSource userMixDataSource) {
        this.a = userMixDataSource;
    }

    @Override // defpackage.x1a
    public void a(List<String> list) {
        p pVar = this.b;
        s d0 = s.d0(list);
        UserMixDataSource userMixDataSource = this.a;
        userMixDataSource.getClass();
        pVar.b(new z(d0.L0(new s1a(userMixDataSource))).subscribe());
    }

    @Override // defpackage.x1a
    public void stop() {
        this.b.a();
    }
}
