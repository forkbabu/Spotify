package com.spotify.mobile.android.video.exo.model;

import android.text.TextUtils;
import com.spotify.mobile.android.video.i0;
import java.util.List;

public class a {
    private final String a;
    private final List<i0> b;

    public a(String str, List<i0> list) {
        if (list.isEmpty() || !TextUtils.isEmpty(str)) {
            this.a = str;
            this.b = list;
            return;
        }
        throw new IllegalArgumentException("URL template cannot be null if list of subtitles is non-empty");
    }

    public List<i0> a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.a;
        if (str == null ? aVar.a == null : str.equals(aVar.a)) {
            return this.b.equals(aVar.b);
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }
}
