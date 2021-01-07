package defpackage;

import java.io.File;
import java.util.Comparator;

/* access modifiers changed from: package-private */
/* renamed from: b00  reason: default package */
public final /* synthetic */ class b00 implements Comparator {
    private static final b00 a = new b00();

    private b00() {
    }

    public static Comparator a() {
        return a;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return e00.a((File) obj, (File) obj2);
    }
}
