package defpackage;

import android.net.Uri;
import com.google.common.base.Optional;
import com.spotify.music.libs.web.RxWebToken;
import com.spotify.rxjava2.p;
import io.reactivex.disposables.c;
import io.reactivex.v;
import io.reactivex.y;

/* renamed from: ly6  reason: default package */
public class ly6 implements ky6 {
    private final p a = new p();
    private final txc b;
    private final RxWebToken c;
    private final y d;
    private final String e;
    private String f;

    public ly6(String str, txc txc, RxWebToken rxWebToken, y yVar) {
        this.e = str;
        this.b = txc;
        this.c = rxWebToken;
        this.d = yVar;
    }

    @Override // defpackage.ky6
    public Optional<String> a() {
        String str = this.f;
        if (str == null) {
            return Optional.absent();
        }
        return Optional.of(str);
    }

    public /* synthetic */ v b(String str) {
        String replace = str.replace("{uri}", this.e);
        return this.c.a(Uri.parse(replace)).j0(gy6.a).q0(new dy6(replace));
    }

    public /* synthetic */ void c(String str) {
        this.f = str;
    }

    @Override // defpackage.ky6
    public void start() {
        this.a.b(this.b.a("ugc-abuse-report-url").J0(new cy6(this)).o0(this.d).subscribe(new ey6(this), fy6.a));
    }

    @Override // defpackage.ky6
    public void stop() {
        this.a.b(c.a());
    }
}
