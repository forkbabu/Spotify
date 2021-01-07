package com.spotify.music.features.home.common.cache;

import com.google.common.base.MoreObjects;
import defpackage.p81;
import io.reactivex.functions.l;
import java.util.ArrayList;
import java.util.List;

public class b implements l<b91, b91> {
    private final String a;

    public b(String str) {
        this.a = str;
    }

    private p81 a(p81 p81, String str) {
        p81 bundle;
        p81 bundle2 = p81.bundle("recentlyPlayed");
        if (bundle2 == null || (bundle = bundle2.bundle("logging")) == null) {
            return p81;
        }
        String string = bundle.string(str, "");
        if (MoreObjects.isNullOrEmpty(string) || string.contains(this.a)) {
            return p81;
        }
        p81.a builder = bundle.toBuilder();
        StringBuilder V0 = je.V0(string);
        V0.append(this.a);
        return p81.toBuilder().e("recentlyPlayed", bundle2.toBuilder().e("logging", builder.p(str, V0.toString()).d()).d()).d();
    }

    private s81 b(s81 s81) {
        if (s81.children().isEmpty()) {
            return !s81.logging().keySet().isEmpty() ? s81.toBuilder().v(c(s81)).l() : s81;
        }
        ArrayList arrayList = new ArrayList(s81.children().size());
        for (s81 s812 : s81.children()) {
            arrayList.add(b(s812));
        }
        return s81.toBuilder().m(arrayList).v(c(s81)).l();
    }

    private p81 c(s81 s81) {
        p81.a builder = s81.logging().toBuilder();
        String string = s81.logging().string("ui:source");
        if (!MoreObjects.isNullOrEmpty(string) && !string.contains(this.a)) {
            StringBuilder V0 = je.V0(string);
            V0.append(this.a);
            builder = builder.p("ui:source", V0.toString());
        }
        String string2 = s81.logging().string("ubi:pageReason");
        if (!MoreObjects.isNullOrEmpty(string2) && !string2.contains(this.a)) {
            StringBuilder V02 = je.V0(string2);
            V02.append(this.a);
            builder = builder.p("ubi:pageReason", V02.toString());
        }
        return builder.d();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public b91 apply(b91 b91) {
        b91 b912 = b91;
        List<? extends s81> body = b912.body();
        ArrayList arrayList = new ArrayList(body.size());
        for (s81 s81 : body) {
            arrayList.add(b(s81));
        }
        return b912.toBuilder().e(arrayList).h(a(a(b912.custom(), "ui:source"), "ubi:pageReason")).g();
    }
}
