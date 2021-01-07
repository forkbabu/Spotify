package defpackage;

import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.DELETE;
import com.spotify.cosmos.android.cosmonaut.annotations.Headers;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryPinProto$PinRequest;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryPinProto$PinResponse;
import io.reactivex.s;
import io.reactivex.z;

/* renamed from: di0  reason: default package */
public interface di0 {
    @Headers({"content-type: application/protobuf", "accept: application/protobuf"})
    @DELETE("sp://your_library/{username}/pin")
    z<YourLibraryPinProto$PinResponse> a(@Path("username") String str, @Body YourLibraryPinProto$PinRequest yourLibraryPinProto$PinRequest);

    @Headers({"content-type: application/protobuf", "accept: application/protobuf"})
    @POST("sp://your_library/{username}/pin")
    z<YourLibraryPinProto$PinResponse> b(@Path("username") String str, @Body YourLibraryPinProto$PinRequest yourLibraryPinProto$PinRequest);

    @SUB("sp://your_library/{username}/pin")
    @Headers({"content-type: application/protobuf", "accept: application/protobuf"})
    s<YourLibraryPinProto$PinResponse> c(@Path("username") String str, @Body YourLibraryPinProto$PinRequest yourLibraryPinProto$PinRequest);
}
