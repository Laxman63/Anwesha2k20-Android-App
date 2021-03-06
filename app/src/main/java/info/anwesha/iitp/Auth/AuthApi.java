package info.anwesha.iitp.Auth;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface AuthApi {

    @POST("backend/user/functions/mob_functions.php")
    Call<LoginResponse> login(@Body RequestBody body);

    @POST("backend/user/functions/mob_functions.php")
    Call<LogoutResponse> logout(@Body RequestBody body);

    @POST("backend/user/functions/mob_functions.php")
    Call<RegisterResponse> register(@Body RequestBody body);

    @POST("backend/user/functions/mob_functions.php")
    Call<ResendActivationResponse> resend_activation(@Body RequestBody body);

    @POST("backend/user/functions/mob_functions.php")
    Call<ProfileResponse> getProfile(@Body RequestBody body);
}
