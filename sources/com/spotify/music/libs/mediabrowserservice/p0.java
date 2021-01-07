package com.spotify.music.libs.mediabrowserservice;

import io.reactivex.functions.l;

public final /* synthetic */ class p0 implements l {
    public final /* synthetic */ Long a;
    public final /* synthetic */ String b;

    public /* synthetic */ p0(Long l, String str) {
        this.a = l;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Long l = this.a;
        String str = this.b;
        n2 n2Var = (n2) obj;
        if (n2Var.d().contains(l)) {
            return n2Var.e();
        }
        throw new RuntimeException(String.format("Callback handler for the package %s does not support an expected action %s", str, l));
    }
}
