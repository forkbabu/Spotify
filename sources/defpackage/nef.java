package defpackage;

import java.io.File;
import java.util.Comparator;

/* renamed from: nef  reason: default package */
public final /* synthetic */ class nef implements Comparator {
    public static final /* synthetic */ nef a = new nef();

    private /* synthetic */ nef() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return (int) (((File) obj2).lastModified() - ((File) obj).lastModified());
    }
}
