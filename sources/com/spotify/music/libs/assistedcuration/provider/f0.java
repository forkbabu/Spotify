package com.spotify.music.libs.assistedcuration.provider;

import com.spotify.music.C0707R;
import com.spotify.music.libs.assistedcuration.model.e;
import com.spotify.music.libs.assistedcuration.model.h;
import java.util.List;

class f0 implements h {
    final /* synthetic */ List a;
    final /* synthetic */ boolean b;
    final /* synthetic */ g0 c;

    f0(g0 g0Var, List list, boolean z) {
        this.c = g0Var;
        this.a = list;
        this.b = z;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.h
    public String c() {
        return "liked_songs";
    }

    @Override // com.spotify.music.libs.assistedcuration.model.h
    public String d() {
        return "liked_songs";
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
        return this.c.a.a.getString(C0707R.string.assisted_curation_card_title_songs_you_liked);
    }
}
