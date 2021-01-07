package androidx.work;

import java.util.List;

public abstract class g {
    private static final String a = j.f("InputMerger");

    public static g a(String str) {
        try {
            return (g) Class.forName(str).newInstance();
        } catch (Exception e) {
            j.c().b(a, je.x0("Trouble instantiating + ", str), e);
            return null;
        }
    }

    public abstract d b(List<d> list);
}
