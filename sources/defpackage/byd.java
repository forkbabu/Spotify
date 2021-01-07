package defpackage;

import com.google.common.base.Optional;
import java.util.ArrayList;
import java.util.List;

/* renamed from: byd  reason: default package */
public final class byd {
    private final List<String> a = new ArrayList();

    private static <T> void c(String str, List<String> list, String str2, Optional<T> optional) {
        if (optional.isPresent()) {
            list.add(str2 + ' ' + str + ' ' + ((Object) optional.get()));
        }
    }

    public <T> byd a(String str, Optional<T> optional) {
        c("contains", this.a, str, optional);
        return this;
    }

    public <T> byd b(String str, Optional<T> optional) {
        c("eq", this.a, str, optional);
        return this;
    }

    public <T> byd d(String str, Optional<T> optional) {
        c("gt", this.a, str, optional);
        return this;
    }

    public <T> byd e(String str, Optional<T> optional) {
        c("lt", this.a, str, optional);
        return this;
    }

    public <T> byd f(String str, Optional<T> optional) {
        c("ne", this.a, str, optional);
        return this;
    }

    public List<String> g() {
        return this.a;
    }
}
