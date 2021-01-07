package defpackage;

import org.mp4parser.aspectj.lang.reflect.b;

/* access modifiers changed from: package-private */
/* renamed from: fpf  reason: default package */
public class fpf implements b {
    String a;
    int b;

    fpf(Class cls, String str, int i) {
        this.a = str;
        this.b = i;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(":");
        stringBuffer.append(this.b);
        return stringBuffer.toString();
    }
}
