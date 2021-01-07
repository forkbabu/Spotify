package com.google.android.play.core.assetpacks;

public final class m0 {
    private w2 a;

    /* synthetic */ m0() {
    }

    public final n0 a() {
        w2 w2Var = this.a;
        if (w2Var != null) {
            return new n0(w2Var);
        }
        throw new IllegalStateException(String.valueOf(w2.class.getCanonicalName()).concat(" must be set"));
    }

    public final void b(w2 w2Var) {
        this.a = w2Var;
    }
}
