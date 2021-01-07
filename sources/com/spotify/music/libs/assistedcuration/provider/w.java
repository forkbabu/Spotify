package com.spotify.music.libs.assistedcuration.provider;

import com.spotify.music.libs.assistedcuration.model.e;
import com.spotify.music.libs.assistedcuration.model.h;
import io.reactivex.s;
import java.util.List;
import java.util.Set;

public interface w {
    byte[] a();

    void b(Set<String> set);

    String c();

    s<List<h>> d(Set<String> set, String str);

    void e(byte[] bArr);

    void f(String str, e eVar, Set<String> set);

    void g(String str, Set<String> set);
}
