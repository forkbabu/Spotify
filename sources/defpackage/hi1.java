package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: hi1  reason: default package */
public class hi1 {
    private final Map<String, Set<String>> a = new HashMap(10);

    public List<String> a(String str) {
        Set<String> set = this.a.get(str);
        if (set == null) {
            return ImmutableList.of();
        }
        return ImmutableList.copyOf((Collection) set);
    }

    public String b(String str) {
        Set<String> set = this.a.get(str);
        if (set == null) {
            return "";
        }
        if (set.size() <= 1) {
            return set.iterator().next();
        }
        throw new IllegalArgumentException(String.format("The key '%s' has more than one value", str));
    }

    public void c(String str, String str2) {
        Set<String> set = this.a.get(str);
        if (set != null) {
            HashSet hashSet = new HashSet(set);
            hashSet.add(str2);
            this.a.put(str, ImmutableSet.copyOf((Collection) hashSet));
            return;
        }
        this.a.put(str, ImmutableSet.of(str2));
    }
}
