package defpackage;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.s;
import java.util.List;

/* renamed from: wt4  reason: default package */
public interface wt4 {

    /* renamed from: wt4$a */
    public interface a {
        void a();
    }

    s<Boolean> a();

    s<Boolean> b();

    void c(s<List<GaiaDevice>> sVar);

    s<List<GaiaDevice>> d();

    s<GaiaDevice> e();

    void f(a aVar);

    List<GaiaDevice> getItems();

    void start();

    void stop();
}
