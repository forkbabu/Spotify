package defpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.connect.model.Message;
import com.spotify.libs.connect.model.UserData;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.features.connect.cast.discovery.DiscoveredDevice;
import com.spotify.music.json.e;
import com.spotify.music.json.g;
import java.io.IOException;

/* renamed from: yl4  reason: default package */
public final class yl4 {
    private final ObjectMapper a;

    public yl4(g gVar) {
        e b = gVar.b();
        b.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        b.e(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        this.a = b.build();
    }

    private String c(Message.Type type, JacksonModel jacksonModel) {
        try {
            return this.a.writeValueAsString(new Message(type, (JsonNode) this.a.convertValue(jacksonModel, JsonNode.class)));
        } catch (JsonProcessingException | IllegalArgumentException e) {
            Logger.e(e, "Couldn't generate message", new Object[0]);
            return null;
        }
    }

    public String a(String str, String str2, String str3, String str4) {
        UserData userData = new UserData();
        userData.userName = str;
        userData.blob = str2;
        userData.clientKey = str3;
        userData.tokenType = str4;
        return c(Message.Type.ADD_USER, userData);
    }

    public String b(DiscoveredDevice discoveredDevice) {
        return c(Message.Type.GET_INFO, discoveredDevice);
    }

    public Message d(String str) {
        try {
            return (Message) this.a.readValue(str, Message.class);
        } catch (IOException e) {
            Logger.e(e, "Couldn't parse message", new Object[0]);
            return new Message(Message.Type.UNKNOWN, null);
        }
    }

    public <T> T e(JsonNode jsonNode, Class<T> cls) {
        try {
            return (T) this.a.convertValue(jsonNode, cls);
        } catch (IllegalArgumentException e) {
            Logger.e(e, "Couldn't parse payload", new Object[0]);
            return null;
        }
    }
}
