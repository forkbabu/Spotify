package defpackage;

/* renamed from: f7  reason: default package */
public final class f7 {
    public static final f7 d;
    public static final f7 e;
    public static final f7 f;
    public static final f7 g;
    public static final f7 h;
    public static final f7 i;
    final float[] a;
    final float[] b;
    final float[] c;

    static {
        f7 f7Var = new f7();
        d = f7Var;
        float[] fArr = f7Var.b;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
        c(f7Var);
        f7 f7Var2 = new f7();
        e = f7Var2;
        b(f7Var2);
        c(f7Var2);
        f7 f7Var3 = new f7();
        f = f7Var3;
        float[] fArr2 = f7Var3.b;
        fArr2[1] = 0.26f;
        fArr2[2] = 0.45f;
        c(f7Var3);
        f7 f7Var4 = new f7();
        g = f7Var4;
        float[] fArr3 = f7Var4.b;
        fArr3[0] = 0.55f;
        fArr3[1] = 0.74f;
        a(f7Var4);
        f7 f7Var5 = new f7();
        h = f7Var5;
        b(f7Var5);
        a(f7Var5);
        f7 f7Var6 = new f7();
        i = f7Var6;
        float[] fArr4 = f7Var6.b;
        fArr4[1] = 0.26f;
        fArr4[2] = 0.45f;
        a(f7Var6);
    }

    f7() {
        float[] fArr = new float[3];
        this.a = fArr;
        float[] fArr2 = new float[3];
        this.b = fArr2;
        float[] fArr3 = new float[3];
        this.c = fArr3;
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.5f;
        fArr2[2] = 1.0f;
        fArr3[0] = 0.24f;
        fArr3[1] = 0.52f;
        fArr3[2] = 0.24f;
    }

    private static void a(f7 f7Var) {
        float[] fArr = f7Var.a;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    private static void b(f7 f7Var) {
        float[] fArr = f7Var.b;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    private static void c(f7 f7Var) {
        float[] fArr = f7Var.a;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }
}
