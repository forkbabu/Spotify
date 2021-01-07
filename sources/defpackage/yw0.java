package defpackage;

import com.google.common.collect.Collections2;
import java.util.HashSet;
import java.util.Set;

/* renamed from: yw0  reason: default package */
public final class yw0 {
    public static Set<String> a(String str) {
        if (str.isEmpty()) {
            return new HashSet();
        }
        return Collections2.newHashSet(str.split(":"));
    }
}
