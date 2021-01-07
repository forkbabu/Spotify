package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* access modifiers changed from: package-private */
public final class e implements d {
    private final LocaleList a;

    e(LocaleList localeList) {
        this.a = localeList;
    }

    @Override // androidx.core.os.d
    public String a() {
        return this.a.toLanguageTags();
    }

    @Override // androidx.core.os.d
    public Object b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return this.a.equals(((d) obj).b());
    }

    @Override // androidx.core.os.d
    public Locale get(int i) {
        return this.a.get(i);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // androidx.core.os.d
    public int size() {
        return this.a.size();
    }

    public String toString() {
        return this.a.toString();
    }
}
