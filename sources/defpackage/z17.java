package defpackage;

import android.text.TextUtils;
import com.spotify.music.features.ads.i0;
import com.spotify.music.navigation.t;

/* renamed from: z17  reason: default package */
public class z17 implements a71 {
    private final i0 a;
    private final t b;

    public z17(i0 i0Var, t tVar) {
        this.a = i0Var;
        this.b = tVar;
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        p81 metadata = n61.d().metadata();
        String string = o81.data().string("uri");
        if (!TextUtils.isEmpty(string)) {
            this.b.d(string);
            String[] stringArray = metadata.stringArray("clicked");
            if (stringArray != null) {
                for (String str : stringArray) {
                    this.a.a(str);
                }
            }
        }
    }
}
