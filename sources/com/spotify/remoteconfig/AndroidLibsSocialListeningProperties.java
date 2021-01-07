package com.spotify.remoteconfig;

public abstract class AndroidLibsSocialListeningProperties implements n0e {

    public enum PlayActionMode implements m0e {
        PLAY("play"),
        SHOW_PLAY_OR_QUEUE_DIALOG("show_play_or_queue_dialog");
        
        final String value;

        private PlayActionMode(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public static abstract class a {
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract int f();

    public abstract boolean g();

    public abstract PlayActionMode h();
}
