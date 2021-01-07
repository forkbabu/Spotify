package defpackage;

import com.adjust.sdk.Constants;
import defpackage.cpf;
import java.util.Hashtable;
import java.util.StringTokenizer;
import org.mp4parser.aspectj.lang.a;
import org.mp4parser.aspectj.lang.b;

/* renamed from: bpf  reason: default package */
public final class bpf {
    static Hashtable e;
    private static Object[] f = new Object[0];
    static /* synthetic */ Class g;
    Class a;
    ClassLoader b;
    String c;
    int d = 0;

    static {
        Hashtable hashtable = new Hashtable();
        e = hashtable;
        hashtable.put("void", Void.TYPE);
        e.put("boolean", Boolean.TYPE);
        e.put("byte", Byte.TYPE);
        e.put("char", Character.TYPE);
        e.put("short", Short.TYPE);
        e.put("int", Integer.TYPE);
        e.put(Constants.LONG, Long.TYPE);
        e.put("float", Float.TYPE);
        e.put("double", Double.TYPE);
    }

    public bpf(String str, Class cls) {
        this.c = str;
        this.a = cls;
        this.b = cls.getClassLoader();
    }

    static Class a(String str, ClassLoader classLoader) {
        if (str.equals("*")) {
            return null;
        }
        Class cls = (Class) e.get(str);
        if (cls != null) {
            return cls;
        }
        if (classLoader != null) {
            return Class.forName(str, false, classLoader);
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            Class<?> cls2 = g;
            if (cls2 == null) {
                try {
                    cls2 = Class.forName("java.lang.ClassNotFoundException");
                    g = cls2;
                } catch (ClassNotFoundException e2) {
                    throw new NoClassDefFoundError(e2.getMessage());
                }
            }
            return cls2;
        }
    }

    public static a b(a.AbstractC0662a aVar, Object obj, Object obj2) {
        return new cpf(aVar, obj, obj2, f);
    }

    public static a c(a.AbstractC0662a aVar, Object obj, Object obj2, Object obj3) {
        return new cpf(aVar, obj, obj2, new Object[]{obj3});
    }

    public static a d(a.AbstractC0662a aVar, Object obj, Object obj2, Object obj3, Object obj4) {
        return new cpf(aVar, obj, obj2, new Object[]{obj3, obj4});
    }

    public static a e(a.AbstractC0662a aVar, Object obj, Object obj2, Object[] objArr) {
        return new cpf(aVar, obj, obj2, objArr);
    }

    public org.mp4parser.aspectj.lang.reflect.a f(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int parseInt = Integer.parseInt(str, 16);
        Class a2 = a(str3, this.b);
        StringTokenizer stringTokenizer = new StringTokenizer(str4, ":");
        int countTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[countTokens];
        for (int i = 0; i < countTokens; i++) {
            clsArr[i] = a(stringTokenizer.nextToken(), this.b);
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(str5, ":");
        int countTokens2 = stringTokenizer2.countTokens();
        String[] strArr = new String[countTokens2];
        for (int i2 = 0; i2 < countTokens2; i2++) {
            strArr[i2] = stringTokenizer2.nextToken();
        }
        StringTokenizer stringTokenizer3 = new StringTokenizer(str6, ":");
        int countTokens3 = stringTokenizer3.countTokens();
        Class[] clsArr2 = new Class[countTokens3];
        for (int i3 = 0; i3 < countTokens3; i3++) {
            clsArr2[i3] = a(stringTokenizer3.nextToken(), this.b);
        }
        return new dpf(parseInt, str2, a2, clsArr, strArr, clsArr2, a(str7, this.b));
    }

    public a.AbstractC0662a g(String str, b bVar, int i) {
        int i2 = this.d;
        this.d = i2 + 1;
        return new cpf.a(i2, str, bVar, new fpf(this.a, this.c, i));
    }
}
