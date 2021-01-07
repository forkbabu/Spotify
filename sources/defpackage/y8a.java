package defpackage;

import defpackage.s8a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: y8a  reason: default package */
public interface y8a {

    /* renamed from: y8a$a */
    public static abstract class a {

        /* renamed from: y8a$a$a  reason: collision with other inner class name */
        public interface AbstractC0703a {
        }

        public static AbstractC0703a a() {
            s8a.b bVar = new s8a.b();
            bVar.c(new ArrayList());
            s8a.b bVar2 = bVar;
            bVar2.b("");
            s8a.b bVar3 = bVar2;
            bVar3.d("");
            s8a.b bVar4 = bVar3;
            bVar4.e(false);
            return bVar4;
        }

        public abstract String b();

        public abstract List<String> c();

        public abstract String d();

        public abstract boolean e();
    }

    void a(a aVar);
}
