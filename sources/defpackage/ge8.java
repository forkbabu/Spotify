package defpackage;

/* renamed from: ge8  reason: default package */
public class ge8 implements a71 {
    private final u58 a;

    public ge8(u58 u58) {
        this.a = u58;
    }

    public static o81 a(String str) {
        return z81.b().e("freeTierPlayTrack").b("uri", str).c();
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        n61.getClass();
        o81.getClass();
        String string = o81.data().string("uri");
        if (string != null) {
            this.a.a(string, n61);
        }
    }
}
