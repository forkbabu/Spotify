package defpackage;

import java.util.List;

/* renamed from: awb  reason: default package */
public class awb {
    private final List<a> a;
    private final String b;
    private final String c;
    private final boolean d;

    /* renamed from: awb$a */
    public static abstract class a {

        /* renamed from: awb$a$a  reason: collision with other inner class name */
        public interface AbstractC0056a {
        }

        public abstract String a();

        public abstract String b();

        public abstract String c();

        public abstract String d();
    }

    public awb(List<a> list, String str, String str2, boolean z) {
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return this.c != null;
    }

    public boolean b() {
        List<a> list = this.a;
        if (list != null) {
            return !list.isEmpty();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return this.d;
    }

    public List<a> d() {
        return this.a;
    }

    public String e() {
        return this.b;
    }
}
