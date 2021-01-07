package com.airbnb.lottie.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class d {
    private final List<String> a;
    private e b;

    public d(String... strArr) {
        this.a = Arrays.asList(strArr);
    }

    private boolean b() {
        List<String> list = this.a;
        return list.get(list.size() - 1).equals("**");
    }

    public d a(String str) {
        d dVar = new d(this);
        dVar.a.add(str);
        return dVar;
    }

    public boolean c(String str, int i) {
        if (i >= this.a.size()) {
            return false;
        }
        boolean z = i == this.a.size() - 1;
        String str2 = this.a.get(i);
        if (!str2.equals("**")) {
            boolean z2 = str2.equals(str) || str2.equals("*");
            if ((z || (i == this.a.size() - 2 && b())) && z2) {
                return true;
            }
            return false;
        }
        if (!z && this.a.get(i + 1).equals(str)) {
            if (i == this.a.size() - 2 || (i == this.a.size() - 3 && b())) {
                return true;
            }
            return false;
        } else if (z) {
            return true;
        } else {
            int i2 = i + 1;
            if (i2 < this.a.size() - 1) {
                return false;
            }
            return this.a.get(i2).equals(str);
        }
    }

    public e d() {
        return this.b;
    }

    public int e(String str, int i) {
        if ("__container".equals(str)) {
            return 0;
        }
        if (!this.a.get(i).equals("**")) {
            return 1;
        }
        if (i != this.a.size() - 1 && this.a.get(i + 1).equals(str)) {
            return 2;
        }
        return 0;
    }

    public boolean f(String str, int i) {
        if ("__container".equals(str)) {
            return true;
        }
        if (i >= this.a.size()) {
            return false;
        }
        if (this.a.get(i).equals(str) || this.a.get(i).equals("**") || this.a.get(i).equals("*")) {
            return true;
        }
        return false;
    }

    public boolean g(String str, int i) {
        if (!"__container".equals(str) && i >= this.a.size() - 1 && !this.a.get(i).equals("**")) {
            return false;
        }
        return true;
    }

    public d h(e eVar) {
        d dVar = new d(this);
        dVar.b = eVar;
        return dVar;
    }

    public String toString() {
        StringBuilder V0 = je.V0("KeyPath{keys=");
        V0.append(this.a);
        V0.append(",resolved=");
        return je.O0(V0, this.b != null, '}');
    }

    private d(d dVar) {
        this.a = new ArrayList(dVar.a);
        this.b = dVar.b;
    }
}
