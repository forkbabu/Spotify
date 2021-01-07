package defpackage;

import com.coremedia.iso.boxes.a;
import com.coremedia.iso.boxes.b;
import com.googlecode.mp4parser.AbstractContainerBox;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: l50  reason: default package */
public class l50 {
    static Pattern a = Pattern.compile("(....|\\.\\.)(\\[(.*)\\])?");

    public static String a(a aVar) {
        return b(aVar, "");
    }

    private static String b(a aVar, String str) {
        b parent = aVar.getParent();
        int i = 0;
        for (a aVar2 : parent.getBoxes()) {
            if (aVar2.getType().equals(aVar.getType())) {
                if (aVar2 == aVar) {
                    break;
                }
                i++;
            }
        }
        String str2 = String.valueOf(String.format("/%s[%d]", aVar.getType(), Integer.valueOf(i))) + str;
        return parent instanceof a ? b((a) parent, str2) : str2;
    }

    public static <T extends a> T c(AbstractContainerBox abstractContainerBox, String str) {
        List f = f(abstractContainerBox, str, true);
        if (f.isEmpty()) {
            return null;
        }
        return (T) ((a) f.get(0));
    }

    public static <T extends a> List<T> d(a aVar, String str) {
        return f(aVar, str, false);
    }

    public static <T extends a> List<T> e(b bVar, String str) {
        return f(bVar, str, false);
    }

    private static <T extends a> List<T> f(Object obj, String str, boolean z) {
        String str2;
        if (str.startsWith("/")) {
            String substring = str.substring(1);
            while (obj instanceof a) {
                obj = ((a) obj).getParent();
            }
            str = substring;
        }
        if (str.length() != 0) {
            int i = 0;
            if (str.contains("/")) {
                str2 = str.substring(str.indexOf(47) + 1);
                str = str.substring(0, str.indexOf(47));
            } else {
                str2 = "";
            }
            Matcher matcher = a.matcher(str);
            if (matcher.matches()) {
                String group = matcher.group(1);
                if ("..".equals(group)) {
                    if (obj instanceof a) {
                        return f(((a) obj).getParent(), str2, z);
                    }
                    return Collections.emptyList();
                } else if (!(obj instanceof b)) {
                    return Collections.emptyList();
                } else {
                    int parseInt = matcher.group(2) != null ? Integer.parseInt(matcher.group(3)) : -1;
                    LinkedList linkedList = new LinkedList();
                    for (a aVar : ((b) obj).getBoxes()) {
                        if (aVar.getType().matches(group)) {
                            if (parseInt == -1 || parseInt == i) {
                                linkedList.addAll(f(aVar, str2, z));
                            }
                            i++;
                        }
                        if ((z || parseInt >= 0) && !linkedList.isEmpty()) {
                            return linkedList;
                        }
                    }
                    return linkedList;
                }
            } else {
                throw new RuntimeException(String.valueOf(str) + " is invalid path.");
            }
        } else if (obj instanceof a) {
            return Collections.singletonList((a) obj);
        } else {
            throw new RuntimeException("Result of path expression seems to be the root container. This is not allowed!");
        }
    }
}
