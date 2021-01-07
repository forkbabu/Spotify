package com.spotify.music.libs.assistedcuration.provider;

import com.spotify.mobile.android.util.d0;
import com.spotify.music.C0707R;
import com.spotify.music.libs.assistedcuration.model.e;
import com.spotify.music.libs.assistedcuration.model.h;
import java.util.List;
import java.util.Locale;

class v0 implements h {
    final /* synthetic */ i1a a;
    final /* synthetic */ List b;
    final /* synthetic */ boolean c;
    final /* synthetic */ w0 d;

    v0(w0 w0Var, i1a i1a, List list, boolean z) {
        this.d = w0Var;
        this.a = i1a;
        this.b = list;
        this.c = z;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.h
    public String c() {
        return "top_genres";
    }

    @Override // com.spotify.music.libs.assistedcuration.model.h
    public String d() {
        i1a i1a = this.a;
        StringBuilder V0 = je.V0("top_genres/");
        V0.append(i1a.getName());
        return V0.toString();
    }

    @Override // com.spotify.music.libs.assistedcuration.model.h
    public boolean e() {
        return this.c;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.h
    public List<e> f() {
        return this.b;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.h
    public String getTitle() {
        return this.d.a.a.getString(C0707R.string.assisted_curation_card_title_genre, d0.a(this.a.getName(), Locale.getDefault()));
    }
}
