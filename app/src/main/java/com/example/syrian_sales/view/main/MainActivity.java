package com.example.syrian_sales.view.main;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.example.syrian_sales.R;
import com.example.syrian_sales.databinding.ActivityMainBinding;
import com.example.syrian_sales.view.delegates.DelegatesFragment;
import com.example.syrian_sales.view.home.HomeFragment;
import com.example.syrian_sales.view.sales.SalesFragment;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        replaceFragment(new HomeFragment());
        binding.bottomNavigationView.setSelectedItemId(R.id.home);
        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            String resourceName = getResources().getResourceEntryName(item.getItemId());
            switch (resourceName) {
                case "home":
                    replaceFragment(new HomeFragment());
                    break;
                case "delegates":
                    replaceFragment(new DelegatesFragment());
                    break;
                case "sales":
                    replaceFragment(new SalesFragment());
                    break;
            }
            return true;
        });
    }



    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }
}