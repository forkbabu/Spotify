package defpackage;

import java.io.File;
import java.util.Comparator;

/* renamed from: c00  reason: default package */
final /* synthetic */ class c00 implements Comparator {
    private static final c00 a = new c00();

    private c00() {
    }

    public static Comparator a() {
        return a;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int i = e00.l;
        return ((File) obj2).getName().compareTo(((File) obj).getName());
    }
}
