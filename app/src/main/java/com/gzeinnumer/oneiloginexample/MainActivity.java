package com.gzeinnumer.oneiloginexample;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.gzeinnumer.oneiloginexample.data.OneRetroServer;
import com.gzeinnumer.oneiloginexample.model.LoginResponse;
import com.gzeinnumer.oneiloginexample.databinding.ActivityMainBinding;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnLogin.setOnClickListener(view -> {
            loginAction();
        });
    }

    private static final String TAG = "asaasfsafas";
    private void loginAction() {
        binding.edUsername.setText("demo@demo.com");
        binding.edPassword.setText("admin123");
        String username = binding.edUsername.getText().toString();
        String password= binding.edPassword.getText().toString();
        OneRetroServer
                .getInstance(getApplicationContext())
                .login(username, password)
                .enqueue(new Callback<LoginResponse>() {
                    @Override
                    public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                        Log.d(TAG, "onResponse: "+response.body().getMessage());
//                        if (response.body().isStatus()) {
//                            Toast.makeText(getApplicationContext(), "true", Toast.LENGTH_LONG).show();
//                        } else {
//                            Toast.makeText(getApplicationContext(), "false", Toast.LENGTH_LONG).show();
//                        }
                    }

                    @Override
                    public void onFailure(Call<LoginResponse> call, Throwable t) {

                    }
                });
    }
}