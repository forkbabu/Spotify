package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: esc  reason: default package */
public class esc {
    private List<csc> a;
    private List<dsc> b;
    private List<csc> c;

    public void a(csc csc) {
        c().add(csc);
    }

    public void b(csc csc) {
        e().add(csc);
    }

    public List<csc> c() {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        return this.c;
    }

    public List<dsc> d() {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        return this.b;
    }

    public List<csc> e() {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        return this.a;
    }

    public esc f(List<csc> list) {
        this.c = list;
        return this;
    }

    public esc g(List<dsc> list) {
        this.b = list;
        return this;
    }

    public esc h(List<csc> list) {
        this.a = list;
        return this;
    }
}
