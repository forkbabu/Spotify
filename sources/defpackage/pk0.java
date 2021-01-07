package defpackage;

import com.adjust.sdk.Constants;
import com.google.common.base.Optional;
import com.google.common.hash.Hasher;
import com.google.common.hash.Hashing;
import com.spotify.eventsender.t;
import java.nio.charset.Charset;

/* renamed from: pk0  reason: default package */
public class pk0 {
    static final Charset d = Charset.forName(Constants.ENCODING);
    private t a;
    private ik0 b;
    private tk0 c;

    public pk0(t tVar, ik0 ik0, tk0 tk0) {
        this.a = tVar;
        this.b = ik0;
        this.c = tk0;
    }

    public synchronized byte[] a(Optional<String> optional) {
        Hasher newHasher;
        String a2;
        Charset charset;
        newHasher = Hashing.sha1().newHasher();
        a2 = this.a.a();
        charset = d;
        return newHasher.putString(a2, charset).putString(this.b.a(), charset).putString(this.c.a(), charset).putString(optional.or((Optional<String>) ""), charset).hash().asBytes();
    }
}
