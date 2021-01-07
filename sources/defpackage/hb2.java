package defpackage;

import android.os.Bundle;
import androidx.lifecycle.e0;

/* renamed from: hb2  reason: default package */
public class hb2 extends e0 {
    private String c;

    public String g() {
        return this.c;
    }

    public void h(Bundle bundle) {
        this.c = bundle.getString("com.spotify.music.BANNER_DESTINATION_PACKAGE");
    }

    public void i(Bundle bundle) {
        bundle.putString("com.spotify.music.BANNER_DESTINATION_PACKAGE", this.c);
    }

    public void j(String str) {
        this.c = str;
    }
}
