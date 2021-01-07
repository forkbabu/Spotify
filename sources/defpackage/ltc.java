package defpackage;

import com.spotify.music.podcastinteractivity.proto.PollOption;
import com.spotify.ubi.specification.factories.v2;

/* renamed from: ltc  reason: default package */
public class ltc {
    private final ere a;
    private final v2 b;
    private final String c;

    public ltc(ere ere, v2 v2Var, String str) {
        this.a = ere;
        this.b = v2Var;
        this.c = str;
    }

    public void a(int i, boolean z) {
        mqe mqe;
        if (z) {
            mqe = this.b.e(String.valueOf(i), this.c).b();
        } else {
            mqe = this.b.c(String.valueOf(i), this.c).b();
        }
        this.a.a(mqe);
    }

    public void b(int i, boolean z) {
        mqe mqe;
        if (z) {
            mqe = this.b.f(String.valueOf(i), this.c).a();
        } else {
            mqe = this.b.d(String.valueOf(i), this.c).a();
        }
        this.a.a(mqe);
    }

    public void c(int i, PollOption pollOption, int i2) {
        this.a.a(this.b.c(String.valueOf(i), this.c).c(String.valueOf(pollOption.i()), Integer.valueOf(i2)).a());
    }

    public void d(int i) {
        this.a.a(this.b.c(String.valueOf(i), this.c).d().a(String.valueOf(i), 0));
    }

    public void e(int i) {
        this.a.a(this.b.b(String.valueOf(i), this.c).a());
    }

    public void f(int i, PollOption pollOption, int i2) {
        this.a.a(this.b.e(String.valueOf(i), this.c).c(String.valueOf(pollOption.i()), Integer.valueOf(i2)).a(String.valueOf(i), 0));
    }
}
