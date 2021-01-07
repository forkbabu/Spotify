package com.spotify.music.libs.assistedcuration.provider;

import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;
import com.spotify.music.libs.assistedcuration.model.e;
import com.spotify.music.libs.assistedcuration.model.h;
import java.util.List;

class n0 implements h {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ List c;
    final /* synthetic */ boolean d;
    final /* synthetic */ o0 e;

    n0(o0 o0Var, String str, String str2, List list, boolean z) {
        this.e = o0Var;
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = z;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.h
    public String c() {
        return "similar_to";
    }

    @Override // com.spotify.music.libs.assistedcuration.model.h
    public String d() {
        return p0.m(this.a);
    }

    @Override // com.spotify.music.libs.assistedcuration.model.h
    public boolean e() {
        return this.d;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.h
    public List<e> f() {
        return this.c;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.h
    public String getTitle() {
        int ordinal = l0.z(this.a).q().ordinal();
        if (ordinal == 6 || ordinal == 14) {
            return this.e.a.a.getString(C0707R.string.assisted_curation_card_title_similar_to_artist_or_album, this.b);
        }
        if (ordinal != 273) {
            return this.b;
        }
        return this.e.a.a.getString(C0707R.string.assisted_curation_card_title_similar_to, this.b);
    }
}
