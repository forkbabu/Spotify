package androidx.core.os;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

public final class b {
    public static final /* synthetic */ int b = 0;
    private d a;

    static {
        a(new Locale[0]);
    }

    private b(d dVar) {
        this.a = dVar;
    }

    public static b a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new b(new e(new LocaleList(localeArr)));
        }
        return new b(new c(localeArr));
    }

    public static b e(LocaleList localeList) {
        return new b(new e(localeList));
    }

    public Locale b(int i) {
        return this.a.get(i);
    }

    public int c() {
        return this.a.size();
    }

    public String d() {
        return this.a.a();
    }

    public boolean equals(Object obj) {
        return (obj instanceof b) && this.a.equals(((b) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}
