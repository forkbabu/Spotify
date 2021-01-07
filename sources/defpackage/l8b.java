package defpackage;

/* renamed from: l8b  reason: default package */
public final class l8b implements k8b {
    private j8b a;

    @Override // defpackage.k8b
    public void a(j8b j8b) {
        this.a = j8b;
    }

    @Override // defpackage.j8b
    public void b(String str) {
        j8b j8b = this.a;
        if (j8b != null) {
            j8b.b(str);
        }
    }
}
