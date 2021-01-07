package defpackage;

import com.airbnb.lottie.i;
import java.util.HashSet;
import java.util.Set;

/* renamed from: zd  reason: default package */
public class zd implements i {
    private static final Set<String> a = new HashSet();

    public void a(String str) {
        Set<String> set = a;
        if (!set.contains(str)) {
            set.add(str);
        }
    }

    public void b(String str, Throwable th) {
        Set<String> set = a;
        if (!set.contains(str)) {
            set.add(str);
        }
    }
}
