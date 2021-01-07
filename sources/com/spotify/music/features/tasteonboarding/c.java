package com.spotify.music.features.tasteonboarding;

import android.os.Bundle;
import com.google.common.collect.Collections2;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class c {
    private Set<String> a = Collections2.newHashSetWithExpectedSize(5);

    public void a(String str) {
        this.a.add(str);
    }

    public int b() {
        return this.a.size();
    }

    public boolean c(String str) {
        return this.a.contains(str);
    }

    public void d(Bundle bundle) {
        String[] stringArray = bundle.getStringArray("key_liked_uris");
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        if (stringArray != null) {
            hashSet.addAll(Arrays.asList(stringArray));
        }
    }

    public void e(Bundle bundle) {
        bundle.putStringArray("key_liked_uris", (String[]) this.a.toArray(new String[0]));
    }

    public void f(String str) {
        this.a.remove(str);
    }
}
