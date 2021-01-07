package com.spotify.collection.endpoints.yourlibrary.all;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.Headers;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.cosmos.android.cosmonaut.annotations.QueryMap;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryRequestProto$YourLibraryRequest;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryResponse;
import io.reactivex.s;
import java.util.Map;

@CosmosService
public interface a {
    @SUB("sp://your_library/{username}/all")
    @Headers({"content-type: application/protobuf", "accept: application/protobuf"})
    s<YourLibraryResponseProto$YourLibraryResponse> a(@Path("username") String str, @QueryMap Map<String, String> map, @Body YourLibraryRequestProto$YourLibraryRequest yourLibraryRequestProto$YourLibraryRequest);
}
