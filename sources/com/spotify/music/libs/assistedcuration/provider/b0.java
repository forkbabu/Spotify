package com.spotify.music.libs.assistedcuration.provider;

import com.spotify.music.libs.assistedcuration.model.e;
import com.spotify.music.libs.assistedcuration.model.h;
import io.reactivex.a;
import io.reactivex.s;
import java.util.List;
import java.util.Set;

public interface b0 {
    List<byte[]> a();

    void b(Set<String> set);

    void c(h hVar, e eVar, Set<String> set);

    s<List<h>> d(Set<String> set, String str);

    void e(h hVar, Set<String> set);

    void f(List<byte[]> list);

    a g(String str, Set<String> set, String str2);
}
