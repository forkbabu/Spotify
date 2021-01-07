package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public final class t {
    private final String[] a;

    public static final class a {
        final List<String> a = new ArrayList(20);

        public a a(String str, String str2) {
            t.a(str);
            t.b(str2, str);
            this.a.add(str);
            this.a.add(str2.trim());
            return this;
        }

        public a b(t tVar) {
            int g = tVar.g();
            for (int i = 0; i < g; i++) {
                d(tVar.d(i), tVar.i(i));
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        public a c(String str) {
            int indexOf = str.indexOf(":", 1);
            if (indexOf != -1) {
                d(str.substring(0, indexOf), str.substring(indexOf + 1));
                return this;
            } else if (str.startsWith(":")) {
                String substring = str.substring(1);
                this.a.add("");
                this.a.add(substring.trim());
                return this;
            } else {
                this.a.add("");
                this.a.add(str.trim());
                return this;
            }
        }

        /* access modifiers changed from: package-private */
        public a d(String str, String str2) {
            this.a.add(str);
            this.a.add(str2.trim());
            return this;
        }

        public t e() {
            return new t(this);
        }

        public String f(String str) {
            for (int size = this.a.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase(this.a.get(size))) {
                    return this.a.get(size + 1);
                }
            }
            return null;
        }

        public a g(String str) {
            int i = 0;
            while (i < this.a.size()) {
                if (str.equalsIgnoreCase(this.a.get(i))) {
                    this.a.remove(i);
                    this.a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }
    }

    t(a aVar) {
        List<String> list = aVar.a;
        this.a = (String[]) list.toArray(new String[list.size()]);
    }

    static void a(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (!str.isEmpty()) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= ' ' || charAt >= 127) {
                    throw new IllegalArgumentException(rnf.o("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                }
            }
        } else {
            throw new IllegalArgumentException("name is empty");
        }
    }

    static void b(String str, String str2) {
        if (str != null) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                    throw new IllegalArgumentException(rnf.o("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
                }
            }
            return;
        }
        throw new NullPointerException(je.y0("value for name ", str2, " == null"));
    }

    public static t f(String... strArr) {
        if (strArr.length % 2 == 0) {
            String[] strArr2 = (String[]) strArr.clone();
            for (int i = 0; i < strArr2.length; i++) {
                if (strArr2[i] != null) {
                    strArr2[i] = strArr2[i].trim();
                } else {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
            }
            for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
                String str = strArr2[i2];
                String str2 = strArr2[i2 + 1];
                a(str);
                b(str2, str);
            }
            return new t(strArr2);
        }
        throw new IllegalArgumentException("Expected alternating header names and values");
    }

    public String c(String str) {
        String[] strArr = this.a;
        int length = strArr.length;
        do {
            length -= 2;
            if (length < 0) {
                return null;
            }
        } while (!str.equalsIgnoreCase(strArr[length]));
        return strArr[length + 1];
    }

    public String d(int i) {
        return this.a[i * 2];
    }

    public a e() {
        a aVar = new a();
        Collections.addAll(aVar.a, this.a);
        return aVar;
    }

    public boolean equals(Object obj) {
        return (obj instanceof t) && Arrays.equals(((t) obj).a, this.a);
    }

    public int g() {
        return this.a.length / 2;
    }

    public Map<String, List<String>> h() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int g = g();
        for (int i = 0; i < g; i++) {
            String lowerCase = d(i).toLowerCase(Locale.US);
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(i(i));
        }
        return treeMap;
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public String i(int i) {
        return this.a[(i * 2) + 1];
    }

    public List<String> j(String str) {
        int g = g();
        ArrayList arrayList = null;
        for (int i = 0; i < g; i++) {
            if (str.equalsIgnoreCase(d(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(i(i));
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int g = g();
        for (int i = 0; i < g; i++) {
            sb.append(d(i));
            sb.append(": ");
            sb.append(i(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    private t(String[] strArr) {
        this.a = strArr;
    }
}
