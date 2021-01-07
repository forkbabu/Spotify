package defpackage;

import com.google.common.base.Optional;
import com.spotify.searchview.proto.MainViewResponse;

/* renamed from: jua  reason: default package */
public abstract class jua {
    public static jua a(String str, String str2, Optional<Integer> optional, MainViewResponse mainViewResponse) {
        return new vta(str, str2, optional, mainViewResponse);
    }

    public abstract Optional<Integer> b();

    public abstract String c();

    public abstract String d();

    public abstract MainViewResponse e();
}
