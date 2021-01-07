package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.s;
import io.reactivex.subjects.ReplaySubject;

/* renamed from: iy7  reason: default package */
public class iy7 implements jy7 {
    private String a = "";
    private final ReplaySubject<ly7> b = ReplaySubject.i1(1);
    private final xs2 c = new fy7(this);

    @Override // defpackage.jy7
    public void a(String str) {
        if (str.equals(ViewUris.d.toString()) || str.equals("spotify:internal:home")) {
            str = "spotify:home";
        }
        if (!this.a.equals(str)) {
            this.b.onNext(new gy7(this.a, str));
            this.a = str;
        }
    }

    public s<ly7> b() {
        return this.b;
    }

    public xs2 c() {
        return this.c;
    }
}
