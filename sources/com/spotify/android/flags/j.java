package com.spotify.android.flags;

@Deprecated
public final class j extends b<String> {
    private final String h = "Enabled";

    public j(String str, i iVar, Overridable overridable) {
        super(String.class, str, iVar, overridable, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.io.Serializable] */
    @Override // com.spotify.android.flags.b
    public boolean g(String str) {
        return this.h.equalsIgnoreCase(str);
    }

    /* Return type fixed from 'java.io.Serializable' to match base method */
    @Override // com.spotify.android.flags.b
    public String h(String str) {
        return str;
    }
}
