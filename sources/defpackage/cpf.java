package defpackage;

import org.mp4parser.aspectj.lang.a;
import org.mp4parser.aspectj.lang.b;

/* access modifiers changed from: package-private */
/* renamed from: cpf  reason: default package */
public class cpf implements org.mp4parser.aspectj.lang.a {
    Object a;
    Object b;
    Object[] c;
    a.AbstractC0662a d;

    /* access modifiers changed from: package-private */
    /* renamed from: cpf$a */
    public static class a implements a.AbstractC0662a {
        String a;
        b b;

        public a(int i, String str, b bVar, org.mp4parser.aspectj.lang.reflect.b bVar2) {
            this.a = str;
            this.b = bVar;
        }

        public final String toString() {
            gpf gpf = gpf.g;
            StringBuffer stringBuffer = new StringBuffer();
            String str = this.a;
            int lastIndexOf = str.lastIndexOf(45);
            if (lastIndexOf != -1) {
                str = str.substring(lastIndexOf + 1);
            }
            stringBuffer.append(str);
            stringBuffer.append("(");
            stringBuffer.append(((epf) this.b).b(gpf));
            stringBuffer.append(")");
            return stringBuffer.toString();
        }
    }

    public cpf(a.AbstractC0662a aVar, Object obj, Object obj2, Object[] objArr) {
        this.d = aVar;
        this.a = obj;
        this.b = obj2;
        this.c = objArr;
    }

    @Override // org.mp4parser.aspectj.lang.a
    public Object a() {
        return this.b;
    }

    public final String toString() {
        return ((a) this.d).toString();
    }
}
