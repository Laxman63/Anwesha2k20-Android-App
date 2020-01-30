package info.anwesha.iitp.livefeed;

import retrofit2.Call;
import retrofit2.http.GET;

public interface LiveFeedApi {
    @GET("gallery/newsfeed1.json")
    Call<LiveFeedResponse> getLiveFeed();
}
