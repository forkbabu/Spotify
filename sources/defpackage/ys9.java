package defpackage;

/* renamed from: ys9  reason: default package */
public class ys9 implements qs9 {
    private final ws9 a;

    public ys9(ws9 ws9) {
        this.a = ws9;
    }

    @Override // defpackage.qs9
    public void a(String str) {
        str.hashCode();
        if (str.equals("com.spotify.music.features.homething.ADD_DEVICE")) {
            this.a.f();
        } else if (!str.equals("com.spotify.music.features.homething.OPEN_SETTINGS")) {
            throw new IllegalArgumentException("Invalid action passsed to Homething.");
        } else {
            this.a.d();
        }
    }

    @Override // defpackage.qs9
    public void b() {
        this.a.h();
    }
}
