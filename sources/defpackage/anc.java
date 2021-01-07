package defpackage;

import io.reactivex.functions.c;
import kotlin.jvm.internal.h;

/* renamed from: anc  reason: default package */
final class anc<T1, T2, R> implements c<String, String, Boolean> {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    anc(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // io.reactivex.functions.c
    public Boolean a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        h.e(str3, "currentEpisode");
        h.e(str4, "currentContextUri");
        return Boolean.valueOf(h.a(this.a, str3) && h.a(str4, this.b));
    }
}
