package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: gpf  reason: default package */
public class gpf {
    static gpf f;
    static gpf g;
    static gpf h;
    boolean a = true;
    boolean b = true;
    boolean c = false;
    boolean d = false;
    int e;

    static {
        gpf gpf = new gpf();
        f = gpf;
        gpf.a = true;
        gpf.b = false;
        gpf.c = false;
        gpf.d = true;
        gpf.e = 0;
        gpf gpf2 = new gpf();
        g = gpf2;
        gpf2.a = true;
        gpf2.b = true;
        gpf2.c = false;
        gpf2.d = false;
        gpf.e = 1;
        gpf gpf3 = new gpf();
        h = gpf3;
        gpf3.a = false;
        gpf3.b = true;
        gpf3.c = true;
        gpf3.d = false;
        gpf3.e = 2;
    }

    gpf() {
    }

    public void a(StringBuffer stringBuffer, Class[] clsArr) {
        for (int i = 0; i < clsArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(", ");
            }
            Class cls = clsArr[i];
            stringBuffer.append(b(cls, cls.getName(), this.a));
        }
    }

    /* access modifiers changed from: package-private */
    public String b(Class cls, String str, boolean z) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(b(componentType, componentType.getName(), z));
            stringBuffer.append("[]");
            return stringBuffer.toString();
        } else if (!z) {
            return str.replace('$', '.');
        } else {
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf != -1) {
                str = str.substring(lastIndexOf + 1);
            }
            return str.replace('$', '.');
        }
    }
}
