package com.spotify.music.libs.assistedcuration.provider;

import com.spotify.music.C0707R;
import com.spotify.music.libs.assistedcuration.model.e;
import com.spotify.music.libs.assistedcuration.model.h;
import java.util.List;

class j0 implements h {
    final /* synthetic */ List a;
    final /* synthetic */ boolean b;
    final /* synthetic */ k0 c;

    j0(k0 k0Var, List list, boolean z) {
        this.c = k0Var;
        this.a = list;
        this.b = z;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.h
    public String c() {
        return "recently_played";
    }

    @Override // com.spotify.music.libs.assistedcuration.model.h
    public String d() {
        return "recently_played";
    }

    @Override // com.spotify.music.libs.assistedcuration.model.h
    public boolean e() {
        return this.b;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.h
    public List<e> f() {
        return this.a;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.h
    public String getTitle() {
        return this.c.a.a.getString(C0707R.string.assisted_curation_card_title_recently_played);
    }
}
