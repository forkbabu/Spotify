package defpackage;

/* renamed from: y40  reason: default package */
public class y40 {
    public static y40 d = new y40(0, 0, 0);
    public static y40 e = new y40(1, 2, 2);
    public static y40 f = new y40(2, 2, 1);
    public static y40 g = new y40(3, 1, 1);
    private int a;
    private int b;
    private int c;

    public y40(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChromaFormat{\nid=");
        sb.append(this.a);
        sb.append(",\n");
        sb.append(" subWidth=");
        sb.append(this.b);
        sb.append(",\n");
        sb.append(" subHeight=");
        return je.A0(sb, this.c, '}');
    }
}
