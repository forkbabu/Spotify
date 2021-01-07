package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
/* renamed from: q1a  reason: default package */
public abstract class q1a {
    public static final q1a a = parse(true, true, true, true, true, true, true);

    @JsonCreator
    public static q1a parse(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        return new p1a(z, z2, z3, z4, z5, z6, z7);
    }

    @JsonProperty("artist")
    public abstract boolean artist();

    @JsonProperty("covers")
    public abstract boolean covers();

    @JsonProperty("is19PlusOnly")
    public abstract boolean is19PlusOnly();

    @JsonProperty("link")
    public abstract boolean link();

    @JsonProperty("name")
    public abstract boolean name();

    @JsonProperty("playabilityRestriction")
    public abstract boolean playabilityRestriction();

    @JsonProperty("playable")
    public abstract boolean playable();
}
