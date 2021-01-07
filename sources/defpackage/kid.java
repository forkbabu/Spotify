package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.common.base.Optional;
import com.spotify.music.C0707R;

/* renamed from: kid  reason: default package */
public class kid implements mhd {
    private final mhd a;
    private final jwc b;
    private final jhd c;
    private final oq0 d;
    private final Context e;

    public kid(Context context, mhd mhd, jwc jwc, jhd jhd, oq0 oq0) {
        this.e = context;
        this.a = mhd;
        this.b = jwc;
        this.c = jhd;
        this.d = oq0;
    }

    @Override // defpackage.mhd
    public void a(Intent intent) {
        this.a.a(intent);
    }

    @Override // defpackage.mhd
    public void b(Uri uri, Uri uri2) {
        boolean z;
        Optional<String> optional;
        if (this.b.a()) {
            boolean z2 = true;
            if (uri2 != null) {
                String uri3 = uri2.toString();
                String[] stringArray = this.e.getResources().getStringArray(C0707R.array.attribution_blacklist);
                int length = stringArray.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (uri3.contains(stringArray[i])) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
            }
            z = false;
            if (!z) {
                oq0 oq0 = this.d;
                if (uri2 != null) {
                    String uri4 = uri2.toString();
                    String[] stringArray2 = this.e.getResources().getStringArray(C0707R.array.pme_attributions);
                    int length2 = stringArray2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            z2 = false;
                            break;
                        } else if (uri4.contains(stringArray2[i2])) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (z2) {
                        optional = Optional.of("7d00plv");
                        ((hid) this.c).a(oq0.a(uri, uri2, optional));
                    }
                }
                optional = Optional.absent();
                ((hid) this.c).a(oq0.a(uri, uri2, optional));
            }
        }
    }

    @Override // defpackage.mhd
    public String c() {
        return this.a.c();
    }
}
