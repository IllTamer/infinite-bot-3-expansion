import com.github.plexpt.chatgpt.OpenAIAuth;

import java.net.Socket;

public class Test {

    private static final String TOKEN = "";
    private static final String SESSION_TOKEN = "eyJhbGciOiJkaXIiLCJlbmMiOiJBMjU2R0NNIn0..t6uv8xlJeOgzGVEU.fL2oD5DQy-2qJ37RqyJAlB_eqeBiHy_G-IM6chFsAnfeJaR2CRPjtSMBkK8WP6dwOvNHpXMYdAO2MYfB9bNI8UcGuOqjv-Dwo0g_9xUhGVJBSoPLxP68j3Dr5QTv3OUNFShpdFW9E-AkQ2IsH3S6WCERfZ4n817tu7zOq-yhHk2hc2aFxkcMvqHEIaVEB80xUAAgAX-o0dqi-YCzqfbcneL1jbtPEseP_ta0gSYzGJE-lq7-uQXXkg9kboTwzl2fLoOzGG0-OTy01GRJ700shaMC7T7R5cZDTDBshBcS6bZ6orP8GGSg8zFiq80BPc0cXhCAZ-5YPswy9Owku92Qe6hMJhhT-hL9eHTwcGwT4OjGyrO8ag--9ghKmuT7Ei2Z5BLF9j5jx64LOD5v_Y0oAmsPkLSALg6aJt0ymkkZFdRqQz05wi_ZkSUOgBvoxFBjkS9-bFbfndm54I6bVNrHmkXai-gDC5vALhXxXsq2GnZgbadyawAD9Gb78zAuOQWEo__TeyYCoNC6k6fffr-X97y-8YhtRtcbEXs1jFLKyenV0bRgCxn3mEi1lVEqwMNtB72vT3d942NY5MeP9c8I9RbOnaJg5plFLw7k_9Ye45q2A3R8y9l2uMojXyWXMoN6nCQOvPLwANZwMSUbmbJX5pSOCdnDi9LR6Lcis7VBkue8XBP6aGLUROg35B2-N1KeOzE1LiduYO01p9Vp9RJUzKsPsQwzIZZLDtj_sOA0wTvHL_YLxb1gzZ-Rf85vH1HywvYiO26dwSpsy2EKTsdutXeCN8hnsAO57fNPWgySEyvCnXzj9TWh_nC0cw_TvR5LU0Enr3i1whwNuHRTPnzzumMxE5IyPT4HHvV5LNfpb-LFQ7y0prsvsWNTSprELjaL6WSeon5WBbuv8c1osHOOsKJNfkPpfFunMywz6mWElX-qtkfOxvELYtI-5lHLBH7K1MbAK93iTxFoNrTPFlK50JOY2bEut3GqPxnxQuzhBz4LnJvxkO8-RhLj_3ofQzI7RmPYmWG_9Hsf39CKes6AQR3g5AOBaOACgLDes85gQrvc9ghvcHmDtGku1A1dQoTYhjM865erMdjm_aTjr7xJPKuVfx5ihMuCuxOwmO0FjGOPSP9gUWfeUkiuv7ZorEitAyQTZw8ebO246SOsQxz4cR-pwGYR1RU2whVtQdorsvYPOmHYXPOfzkP9b29d5jm1jMEmm7UUwWkTX-kFdcymucLeBKpbENARZ1NnqEQOLgVXXRB9GBm7kvdC4RXNyfs30DuAzChxLpJV2iBnbPNWB-7yT-ywtK2bh3iWiS84_J7Qx2ODctEv_o52xhwi82lNoU1IR7XV4S5VD_Ez0C9TznBDkuVP9NkW9NVlvOVOOMws4Yxf6o5f5HXQCiFwgYcJ9CjuVwQptvY1_owTXT7tEMzUCoga77rS-g0031izn_pNqOCkfYgg41PXYWTcGhmXrNNbSISXc53On7WhChLa1mBgBXFDliLUntBtrrBFriWMxP2NSTJf82OHrq4wm9oGDYm5pCnrHb0b_kYBtbGHRHZhCddD2QYjOuJDQ9xeTA9J7qfA97IPiV1z-WJhUvpvBbbYDmb05cYhI96yGAkrRwJDtL39eTrMAOXt5AM7Qbo3pToo1R8clYxAu9IMH5mt1OcmFr0dcyDw_qQ2USh_b8Qaj2igb9PubA9AuiIMG210sY9BpabWYZB1L4bRI3yIQdhqxfInLN-J_-rZpyt9TFCuI5uSsXOMRHXDTxRf6OVodDFJ4kr5XUrbfv6wf15fhrhUSgleBQxQOPN0fKpv_IMF7wUe8qNNGK6OKZMMykKgJfhRF_tcUIuz30lC_pLPT73DWPyqAJLWy6Q11AQi75whFn4jJ2Z_iyDDwKuwFmNYGAT5XACZSy0mcvEPs_sGyrEIplhQHcjNjbP6K8Q9hhEwQWfIdTEqrK4InEgoz7E515rowHeoL-72kGp5iF1eF-nfQnsztbuPCX06CIqArScP-aD8dG2FXeyVaz9SFjUclFiLUOV7zJYIZBudSSUskyk7OB6JwXIgFjbmERxa4TNHhZtKU15GmBWLLQ3xN70m7rJdZcjdbzAtG3gMfs54knqGHf6iaTOVR7qczu0Khanh06jqTOxzuoPfnIHmj-NVy903ba7BMs3Kw5V2HxhA9hyvPH6QrCZNJfb-P-HTz4Fn227PedeHHsau2eQe_YkTbX0B8RUu9bACo30tMlgBTPBn56kbf24yI5fykdBnsGuMVLtw78wpTYiUtmI001cXVCW3bdctOLJ9w1Ea3TPkPlaqZ02ry2jTc5zRFxhg_IKdydAR.cwpdNdDAZx3_PGerowsCaQ";

    public static void main(String[] args) {
//        OpenAIAuth auth = new OpenAIAuth("765743073@qq.com", "Aa123456", true, "127.0.0.1:7890");
//        auth.begin();
//        System.out.println(auth.getSessionToken());

    }

}
