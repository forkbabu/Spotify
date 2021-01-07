package com.spotify.mobile.android.spotlets.appprotocol;

import com.google.common.base.Predicate;
import java.util.Map;

public final /* synthetic */ class g3 implements Predicate {
    public final /* synthetic */ String a;

    public /* synthetic */ g3(String str) {
        this.a = str;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        String str = this.a;
        String str2 = (String) ((Map.Entry) obj).getKey();
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append('.');
        return str.startsWith(sb.toString()) || str.equals(str2);
    }
}
