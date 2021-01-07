package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: kne  reason: default package */
public final /* synthetic */ class kne implements FilenameFilter {
    public final /* synthetic */ String a;

    public /* synthetic */ kne(String str) {
        this.a = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(String.format("%s_", this.a));
    }
}
