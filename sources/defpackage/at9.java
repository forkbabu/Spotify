package defpackage;

import io.reactivex.a;
import io.reactivex.z;
import java.util.List;

/* renamed from: at9  reason: default package */
public interface at9 {
    @jrf("carthing-proxy/setthings/v1/settings/homething/{serial}")
    z<Integer> a(@mrf("serial") String str, @uqf List<ft9> list);

    @jrf("carthing-proxy/device/v1/delete/homething/{serial}")
    a b(@mrf("serial") String str);

    @zqf("carthing-proxy/setthings/v1/settings/homething/{serial}")
    z<List<ft9>> c(@mrf("serial") String str);
}
