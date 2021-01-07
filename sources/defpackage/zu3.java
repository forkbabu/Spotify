package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import io.reactivex.functions.g;

/* renamed from: zu3  reason: default package */
public final /* synthetic */ class zu3 implements g {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    public /* synthetic */ zu3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        String str = this.a;
        String str2 = this.b;
        Response response = (Response) obj;
        if (response.getStatus() == 202) {
            Logger.b("Flashpoint - %s reported successfully with data (%s)", str, str2);
        } else {
            Logger.b("Flashpoint - Failed to report %s event with data (%s). Error code: %s", str, str2, Integer.valueOf(response.getStatus()));
        }
    }
}
