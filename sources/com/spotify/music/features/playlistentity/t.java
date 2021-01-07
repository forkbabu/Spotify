package com.spotify.music.features.playlistentity;

import android.os.Bundle;
import kotlin.jvm.internal.h;

public interface t {

    public static class a implements t {
        private final io.reactivex.a a;

        public a() {
            io.reactivex.a aVar = io.reactivex.internal.operators.completable.b.a;
            h.d(aVar, "Completable.complete()");
            this.a = aVar;
        }

        @Override // com.spotify.music.features.playlistentity.t
        public void c(Bundle bundle) {
            h.e(bundle, "outState");
        }

        @Override // com.spotify.music.features.playlistentity.t
        public void d(Bundle bundle) {
        }

        @Override // com.spotify.music.features.playlistentity.t
        public void f() {
        }

        @Override // com.spotify.music.features.playlistentity.t
        public io.reactivex.a g() {
            return this.a;
        }

        @Override // com.spotify.music.features.playlistentity.t
        public void h() {
        }

        @Override // com.spotify.music.features.playlistentity.t
        public void l(b bVar) {
            h.e(bVar, "dependencies");
        }

        @Override // com.spotify.music.features.playlistentity.t
        public void onStop() {
        }
    }

    public interface b {
        c76 a();

        oo6 b();
    }

    void c(Bundle bundle);

    void d(Bundle bundle);

    void f();

    io.reactivex.a g();

    void h();

    void l(b bVar);

    void onStop();
}
