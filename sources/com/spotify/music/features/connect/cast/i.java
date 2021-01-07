package com.spotify.music.features.connect.cast;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class i {
    @JsonProperty("id")
    String mId = "";
    @JsonProperty("name")
    String mName = "";

    @JsonCreator
    public i() {
    }

    @JsonIgnore
    public String a() {
        return this.mId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!rw.equal(this.mId, iVar.mId) || !rw.equal(this.mName, iVar.mName)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.mId + this.mName).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.mId);
        sb.append(" (");
        return je.H0(sb, this.mName, ')');
    }

    @JsonIgnore
    public i(String str, String str2) {
        this.mId = str;
        this.mName = str2;
    }
}
