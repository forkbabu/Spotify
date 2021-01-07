package com.spotify.voice.api.model;

import com.spotify.voice.api.model.d;

public abstract class j {

    public interface a {
        a a(String str);

        a b(String str);

        j build();
    }

    public static a a() {
        d.b bVar = new d.b();
        bVar.b("speech-recognition.spotify.com");
        d.b bVar2 = bVar;
        bVar2.a("/v2/android/");
        d.b bVar3 = bVar2;
        bVar3.c(443);
        return bVar3;
    }

    public abstract String b();

    public boolean c() {
        return "speech-recognition-test.spotify.com".equals(b()) || "speech-recognition-vim.spotify.com".equals(b());
    }

    public abstract String d();

    public abstract int e();
}
