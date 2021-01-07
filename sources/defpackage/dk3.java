package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import io.reactivex.functions.l;
import io.reactivex.z;

/* renamed from: dk3  reason: default package */
public final /* synthetic */ class dk3 implements l {
    public final /* synthetic */ double a;

    public /* synthetic */ dk3(double d) {
        this.a = d;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        double d = this.a;
        Response response = (Response) obj;
        if (response.getStatus() == 202) {
            Logger.b("Successfully updated device volume, %f", Double.valueOf(d));
            return z.z(response);
        }
        StringBuilder V0 = je.V0("Failed to update device volume: ");
        V0.append(response.getStatus());
        return z.q(new Exception(V0.toString()));
    }
}
