package com.spotify.music.libs.assistedcuration.provider;

import com.spotify.music.C0707R;
import com.spotify.music.libs.assistedcuration.model.e;
import com.spotify.music.libs.assistedcuration.model.h;
import java.util.List;

class r0 implements h {
    final /* synthetic */ List a;
    final /* synthetic */ boolean b;
    final /* synthetic */ s0 c;

    r0(s0 s0Var, boolean z, List list, boolean z2) {
        this.c = s0Var;
        this.a = list;
        this.b = z2;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.h
    public String c() {
        return "suggested_songs";
    }

    @Override // com.spotify.music.libs.assistedcuration.model.h
    public String d() {
        return "suggested_songs";
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
        return this.c.a.a.getString(C0707R.string.assisted_curation_card_title_suggested_songs);
    }
}
